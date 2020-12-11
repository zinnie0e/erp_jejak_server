package com.guru.erpserver.web.dbjejak;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.dbjejak.YongjiService;
import com.guru.erpserver.vo.dbjejak.YongjiVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class YongjiController {
	@Resource
	private YongjiService yongjiSVC;

	//TODO 용지구입, 거래처별 구매
	@RequestMapping(value="/yongji/select_cust_yj_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjCustYjList() throws Exception {
		return yongjiSVC.selYjCustYjList();
	}
	
	//TODO 용지구입, 용지장부
	@RequestMapping(value="/yongji/select_cust_wcname_yj_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjCustWcnameYjList() throws Exception {
		return yongjiSVC.selYjCustWcnameYjList();
	}
	
	//TODO 용지전표, 용지등록
	//입력 : jicode
	@RequestMapping(value="/yongji/select_yj_io_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjJiinoutList(@RequestBody YongjiVO params) throws Exception {
		//return yongjiSVC.selYjJiinoutList(params);
		
		List<YongjiVO> result_params = new ArrayList<YongjiVO>();
		
		List<YongjiVO> list_params = yongjiSVC.selYjJiinoutList(params);
		
		for(YongjiVO get_param : list_params) {
			YongjiVO temp_cust = new YongjiVO();
			temp_cust.setWccode(String.valueOf(get_param.getComid()));
			
			get_param.setWcname(yongjiSVC.selYjCustWcname(temp_cust));
			
			result_params.add(get_param);
		}
		return result_params;
	}
	
		
	//TODO 용지구입
	@RequestMapping(value="/yongji/select_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjList() throws Exception {
		return yongjiSVC.selYjList();
	}
	
	@RequestMapping(value="/yongji/select_buy_order_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjBuyOrderList() throws Exception {
		return yongjiSVC.selYjBuyOrderList();
	}
	
	@RequestMapping(value="/yongji/check_order", method=RequestMethod.POST)
	public boolean checkYjOrder() throws Exception {
		return yongjiSVC.selYjOrderCount1() && yongjiSVC.selYjOrderCount2();
	}
	
	@RequestMapping(value="/yongji/in_buy_order", method=RequestMethod.POST)
	public long inYjBuyOrder() throws Exception {
		long result = 0;
		
		yongjiSVC.delYjOrderYojijumn();
		
		long arr_count = 0;
		ArrayList<String[]> arr_in_str = new ArrayList<>();
		ArrayList<Long> arr_in_yjamount = new ArrayList<>();
		
		List<YongjiVO> list_params1 = yongjiSVC.selYjOrderInCheck1();
		for(YongjiVO get_param : list_params1) {
			int arr_count_num = -1;
			long yjamount = get_param.getJm() + get_param.getYb();
			
			for(int n = 0; n < arr_count; n++) {
				if(arr_in_str.get(n)[0].equals(get_param.getJcode())) {
					arr_count_num = n;
					break;
				}
			}
			
			String[] temp_cal = new String[3];
			temp_cal[0] = get_param.getJcode();
			temp_cal[1] = get_param.getJname();
			
			if(arr_count_num > -1) {
				yjamount += arr_in_yjamount.get(arr_count_num);
				arr_in_yjamount.set(arr_count_num, yjamount);

				temp_cal[2] = arr_in_str.get(arr_count_num)[2] + "*" + get_param.getUid();
				arr_in_str.set(arr_count_num, temp_cal);
			} else {
				arr_in_yjamount.add(yjamount);
				
				temp_cal[2] = String.valueOf(get_param.getUid());
				arr_in_str.add(temp_cal);
				
				arr_count++;
			}
		}
		
		List<YongjiVO> list_params2 = yongjiSVC.selYjOrderInCheck2();
		for(YongjiVO get_param : list_params2) {			
			if (get_param.getJbcode().equals("U12115")) {
				continue;
			}
			
			int arr_count_num = -1;
			long yjamount = get_param.getJm() + get_param.getYb();
			
			for(int n = 0; n < arr_count; n++) {
				if(arr_in_str.get(n)[0].equals(get_param.getYjcode())) {
					arr_count_num = n;
					break;
				}
			}
			
			String[] temp_cal = new String[3];
			temp_cal[0] = get_param.getYjcode();
			temp_cal[1] = get_param.getYjname();
			
			if(arr_count_num > -1) {
				yjamount += arr_in_yjamount.get(arr_count_num);
				arr_in_yjamount.set(arr_count_num, yjamount);

				temp_cal[2] = arr_in_str.get(arr_count_num)[2] + "*J" + get_param.getUid();
				arr_in_str.set(arr_count_num, temp_cal);
			} else {
				arr_in_yjamount.add(yjamount);
				
				temp_cal[2] = "J" + get_param.getUid();
				arr_in_str.add(temp_cal);
				
				arr_count++;
			}
		}
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = sdf.parse(sdf.format(new Date()));
		Date date = new Date();
		long set_date = date.getTime() / 1000;	

		for(int i = 0; i < arr_count; i++) {
			YongjiVO temp_YongjiVO = new YongjiVO();
			temp_YongjiVO.setJdate(set_date);
			temp_YongjiVO.setYjcode(arr_in_str.get(i)[0]);
			temp_YongjiVO.setYjname(arr_in_str.get(i)[1]);
			temp_YongjiVO.setYjamount(arr_in_yjamount.get(i));
			temp_YongjiVO.setCnumlist(arr_in_str.get(i)[2]);
			
			if(yongjiSVC.inYjOrderYojijumn(temp_YongjiVO)) {
				result++;
			}
		}
		return result;
	}
	
	@RequestMapping(value="/yongji/up_buy_order", method=RequestMethod.POST)
	public long upYjBuyOrder() throws Exception {
		long result = 0;
		
		List<YongjiVO> list_params = yongjiSVC.selYjBuyOrderList();
		
		for(YongjiVO get_param : list_params) {
			long amount = 0l;
			YongjiVO curno_YongjiVO = yongjiSVC.selYjOrderUpCheck();
			if(curno_YongjiVO != null ) {
				amount = curno_YongjiVO.getCurno();
			}
			
			long needs = amount - get_param.getYjamount();
			if(needs >= 0) {
				needs = 0;
			} else {
				needs *= -1;
			}
			
			long fixnum = 0;
			long ib = get_param.getIb();
			long check_num = (long)needs % 500;
			if(ib == 0 && check_num > 0) {
				fixnum = 500 - check_num;
			} else if(ib == 1) {
				fixnum = check_num > 250 ? (500 - check_num) : (250 - check_num);
			} else if(ib == 2) {
				if(check_num > 400) {
					fixnum = 500 - check_num;
				} else if(check_num > 300) {
					fixnum = 400 - check_num;
				} else if(check_num > 200) {
					fixnum = 300 - check_num;
				} else if(check_num > 100) {
					fixnum = 200 - check_num;
				} else if(check_num > 0) {
					fixnum = 100 - check_num;
				}
			}
			
			long fxamount = needs + fixnum;
			
			YongjiVO set_YongjiVO = new YongjiVO();
			set_YongjiVO.setUid(get_param.getUid());
			set_YongjiVO.setFixnum(fixnum);
			set_YongjiVO.setFxamount(fxamount);
			
			if(yongjiSVC.upYjOrderYojijumn(set_YongjiVO)) {
				result++;
			}
		}
		
		return result;
	}
	
	//입력 : date1, date2
	@RequestMapping(value="/yongji/select_order_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjOrderList(@RequestBody YongjiVO params) throws Exception {
		List<YongjiVO> result_params = new ArrayList<YongjiVO>();
		
		List<YongjiVO> list_params = yongjiSVC.selYjOrderListCheckDate1(params);
		
		for(YongjiVO get_param : list_params) {
			YongjiVO temp_cust = new YongjiVO();
			temp_cust.setWccode(String.valueOf(get_param.getComid()));
			
			get_param.setWcname(yongjiSVC.selYjCustWcname(temp_cust));
			
			result_params.add(get_param);
		}
		return result_params;
	}
	
	//입력 : date1, date2
	@RequestMapping(value="/yongji/select_order_list_input", method=RequestMethod.POST)
	public List<YongjiVO> selYjOrderListInput(@RequestBody YongjiVO params) throws Exception {
		List<YongjiVO> result_params = new ArrayList<YongjiVO>();
		
		List<YongjiVO> list_params = yongjiSVC.selYjOrderListCheckDate2(params);
		
		for(YongjiVO get_param : list_params) {
			YongjiVO temp_cust = new YongjiVO();
			temp_cust.setWccode(String.valueOf(get_param.getComid()));
			
			get_param.setWcname(yongjiSVC.selYjCustWcname(temp_cust));
			
			result_params.add(get_param);
		}
		return result_params;
	}
	
	//입력 : uid, wjcode, tprice, num
	@RequestMapping(value="/yongji/up_order_input", method=RequestMethod.POST)
	public boolean upYjOrderInput(@RequestBody YongjiVO params) throws Exception {
		long get_facdanga = yongjiSVC.selYjOrderFacdanga(params);
		
		double set_halin = 0d;
		if(get_facdanga > 0) {
			long temp_halin = Math.round(get_facdanga * 1.1 * params.getNum() / 500);
			set_halin = (1 - (Math.round((params.getTprice() / temp_halin)*100)/100)) * 100;
		}
		params.setTprice(params.getTprice());
		params.setHalin(set_halin);
		params.setCdate((long)(System.currentTimeMillis() / 1000));
		
		return yongjiSVC.upYjOrderJiinout(params);
	}
	
	//입력 : uid, wjcode, halin
	@RequestMapping(value="/yongji/up_buy_halin", method=RequestMethod.POST)
	public boolean upYjBuyHalin(@RequestBody YongjiVO params) throws Exception {
		YongjiVO get_param = yongjiSVC.selYjBuyHalin1(params);
		boolean up1 = false;
		boolean up2 = false;
		if(get_param != null) {
			long fac = get_param.getFacdanga();
			double danga = Math.round(fac * (100 - params.getHalin()) / 100);
			
			YongjiVO set_param = new YongjiVO();
			set_param.setHalin(params.getHalin());
			set_param.setUid(get_param.getUid());
			
			up1 = yongjiSVC.upYjBuyHalin2(set_param);
			
			YongjiVO get_param2 = yongjiSVC.selYjBuyHalin3(params);
			
			if(get_param2 != null) {
				long cost1 = Math.round(danga * get_param2.getNum() / 500);
				long tax1 = Math.round(cost1 * 0.1);
				long sum = cost1 + tax1;
				
				YongjiVO set_param2 = new YongjiVO();
				set_param2.setTprice(sum);
				set_param2.setN_halin(params.getHalin());
				set_param2.setN_fac(fac);
				set_param2.setUid(params.getUid());
				
				up2 = yongjiSVC.upYjBuyHalin4(set_param2);
			}
		}
		
		return up1 && up2;
	}
	
	//입력 : uid
	@RequestMapping(value="/yongji/sel_order_detail_date", method=RequestMethod.POST)
	public long selYjOrderDetailDate(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjOrderDetailDate(params);
	}
	
	//입력 : uid, date
	@RequestMapping(value="/yongji/up_order_detail_date", method=RequestMethod.POST)
	public long upYjOrderDetailDate(@RequestBody YongjiVO params) throws Exception {
		long result = 0;
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = sdf.parse(sdf.format(new Date()));
		Date date = new Date();
		long set_date = date.getTime() / 1000;
		params.setDate(set_date);
		
		if(yongjiSVC.upYjOrderDetailDate1(params)) {
			params.setJeon(yongjiSVC.selYjOrderDetailDate2(params));
			params.setValue(setYear("yy", new Date()));
			
			if(yongjiSVC.upYjOrderDetailDate3(params)) {
				result++;
			}
		}
		
		return result;
	}
	
	//입력 : uid
	@RequestMapping(value="/yongji/sel_order_detail_cust", method=RequestMethod.POST)
	public YongjiVO selYjOrderDetailCust(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjOrderDetailCust(params);
	}
		
	//입력 : uid, wccode
	@RequestMapping(value="/yongji/up_order_detail_cust", method=RequestMethod.POST)
	public long upYjOrderDetailCust(@RequestBody YongjiVO params) throws Exception {
		long result = 0;
		
		YongjiVO temp_jiinout = new YongjiVO();
		temp_jiinout.setUid(params.getUid());
		temp_jiinout.setComid(Integer.valueOf(params.getWccode()));
		
		if(yongjiSVC.upYjOrderDetailCust1(temp_jiinout)) {
			YongjiVO get_cust = yongjiSVC.selYjOrderDetailCust2(temp_jiinout);
			
			YongjiVO temp_jeonpyo = new YongjiVO();
			temp_jeonpyo.setUid(get_cust.getJeon());
			temp_jeonpyo.setBuycom(params.getWccode());
			temp_jeonpyo.setValue(setYear("yy", new Date((long)get_cust.getDate() * 1000)));
			
			if(yongjiSVC.upYjOrderDetailCust3(temp_jeonpyo)) {
				result++;
			}
		}
		
		return result;
	}
	
	//입력 : uid
	@RequestMapping(value="/yongji/sel_order_detail_code", method=RequestMethod.POST)
	public YongjiVO selYjOrderDetailCode(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjOrderDetailCode(params);
	}
	
	@RequestMapping(value="/yongji/sel_order_detail_code_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjOrderDetailCodeList() throws Exception {
		return yongjiSVC.selYjOrderDetailCodeList();
	}
	
	//입력 : uid, wjcode, wjname
	@RequestMapping(value="/yongji/up_order_detail_code", method=RequestMethod.POST)
	public long upYjOrderDetailCode(@RequestBody YongjiVO params) throws Exception {
		long result = 0;
		
		if(yongjiSVC.upYjOrderDetailCode1(params)) {			
			YongjiVO get_code = yongjiSVC.selYjOrderDetailCode2(params);
			params.setUid(get_code.getJeon());
			params.setValue(setYear("yy", new Date((long)get_code.getDate() * 1000)));
			
			if(yongjiSVC.upYjOrderDetailCode3(params)) {
				result++;
			}
		}
		
		return result;
	}
	
	//입력 : jicode, comid, jsum, bigo
	@RequestMapping(value="/yongji/in_order_check_input", method=RequestMethod.POST)
	public int inYjOrderCheckInputList(@RequestBody YongjiVO params) throws Exception {
		int result = 0;
		
		YongjiVO temp_jeonpyo = new YongjiVO();
		temp_jeonpyo.setValue(setYear("yy", new Date()));
		
		long max_jeonpyo_uid = yongjiSVC.selYjOrderJeonpyoMaxUid(temp_jeonpyo);
		max_jeonpyo_uid = max_jeonpyo_uid > 0 ? max_jeonpyo_uid++ : 1;
		
		Date date = new Date();
		long set_date = (int)(date.getTime() / 1000);
		
		long set_jsum = params.getJsum() + 500;
		
		
		temp_jeonpyo.setUid(max_jeonpyo_uid);
		temp_jeonpyo.setBdate(set_date);
		temp_jeonpyo.setBuycom(String.valueOf(params.getComid()));
		temp_jeonpyo.setJiname(yongjiSVC.selYjOrderBuyKswjijl0(params).getWjname());
		temp_jeonpyo.setJicode(params.getJicode());
		temp_jeonpyo.setJsum(set_jsum);
		
		if(!yongjiSVC.inYjOrderCheckOrder1(temp_jeonpyo)) {
			return 1;
		}
		
		
		long max_jiinout_uid = yongjiSVC.selYjOrderJiinoutMaxUid();
		max_jiinout_uid = max_jiinout_uid > 0 ? max_jiinout_uid++ : 1;
		
		YongjiVO temp_jiinout = new YongjiVO();
		temp_jiinout.setUid(max_jiinout_uid);
		temp_jiinout.setJicode(params.getJicode());
		temp_jiinout.setDate(set_date);
		temp_jiinout.setNum(set_jsum);
		temp_jiinout.setComid(params.getComid());
		temp_jiinout.setCurno(yongjiSVC.selYjOrderBuyJiinout(params).getCurno() + set_jsum);
		temp_jiinout.setJeon(max_jeonpyo_uid);
		temp_jiinout.setBigo(params.getBigo());
		
		if(yongjiSVC.inYjOrderCheckOrder3(temp_jiinout)) {
			return 2;
		}
		
		return 0;
	}
	
	//입력 : uid, fxamount, comid, bigo, ib
	@RequestMapping(value="/yongji/in_order_check_input_list", method=RequestMethod.POST)
	public HashMap<String, String> inYjOrderCheckInput(@RequestBody YongjiVO params) throws Exception {
		int[] result = {0, 0, 0, 0, 0};
		
		YongjiVO get_yojijymn = yongjiSVC.selYjOrderCheckOI(params);
		
		if(params.getFxamount() > 0) {
			YongjiVO temp_jeonpyo = new YongjiVO();
			temp_jeonpyo.setValue(setYear("yy", new Date()));
			
			long max_jeonpyo_uid = yongjiSVC.selYjOrderJeonpyoMaxUid(temp_jeonpyo);
			max_jeonpyo_uid = max_jeonpyo_uid > 0 ? max_jeonpyo_uid++ : 1;

			temp_jeonpyo.setUid(max_jeonpyo_uid);
			temp_jeonpyo.setBdate(get_yojijymn.getJdate());
			temp_jeonpyo.setBuycom(String.valueOf(params.getComid()));
			temp_jeonpyo.setJiname(get_yojijymn.getYjname());
			temp_jeonpyo.setJicode(get_yojijymn.getYjcode());
			temp_jeonpyo.setJsum((long)get_yojijymn.getFxamount());
			
			if(yongjiSVC.inYjOrderCheckOrder1(temp_jeonpyo)) result[0]++;
			
			
			long max_jiinout_uid = yongjiSVC.selYjOrderJiinoutMaxUid();
			max_jiinout_uid = max_jiinout_uid > 0 ? max_jiinout_uid++ : 1;
			
			long set_curno = (long)(yongjiSVC.selYjOrderCheckOrder2(get_yojijymn) + get_yojijymn.getFxamount());
			
			YongjiVO temp_jiinout = new YongjiVO();
			temp_jiinout.setUid(max_jiinout_uid);
			temp_jiinout.setJicode(get_yojijymn.getYjcode());
			temp_jiinout.setDate(get_yojijymn.getJdate());
			temp_jiinout.setNum((long)get_yojijymn.getFxamount());
			temp_jiinout.setComid(params.getComid());
			temp_jiinout.setCurno(set_curno);
			temp_jiinout.setJeon(max_jeonpyo_uid);
			temp_jiinout.setBigo(params.getBigo());
			
			if(yongjiSVC.inYjOrderCheckOrder3(temp_jiinout)) result[0] += 10;
		}
		
		String[] get_cnumlist = get_yojijymn.getCnumlist().split("*");
		long count_cnum = get_cnumlist.length;
		long cnum_value = 0;
		long cnum_rem = 0;
		
		if(params.getIb() > 0) {
			cnum_value = (long)Math.floor(get_yojijymn.getFixnum() / count_cnum);
			cnum_rem = get_yojijymn.getFixnum() % count_cnum;
		}
		
		for(int i = 0; i < count_cnum; i++) {
			if(get_cnumlist[i].substring(0, 1).equals("J")) {
				long set_uid = Integer.valueOf(get_cnumlist[i].substring(1));
				
				YongjiVO set_tmpjab3_uid = new YongjiVO();
				set_tmpjab3_uid.setUid(set_uid);
				
				YongjiVO get_tmpjab3 = yongjiSVC.selYjOrderCheckInputJ2(set_tmpjab3_uid);
				
				long get_tmpjab3_jm = get_tmpjab3.getJm();
				long get_tmpjab3_yb = get_tmpjab3.getYb();
				
				if(!(get_tmpjab3_jm > 0 || get_tmpjab3_yb > 0)) {
					continue;
				}
				
				if(params.getIb() > 0) {
					long next_yb = i < cnum_rem ? cnum_value++ : cnum_value;
					long set_tmpjab4_yb = get_tmpjab3_yb + next_yb;
					
					get_tmpjab3_yb = set_tmpjab4_yb;
					
					YongjiVO temp_tmpjab3 = new YongjiVO();
					temp_tmpjab3.setUid(get_tmpjab3.getUid());
					temp_tmpjab3.setYb(set_tmpjab4_yb);
					
					if(!yongjiSVC.upYjOrderCheckInputJ3(temp_tmpjab3)) {
						//입사용지 여분 조절 오류
						result[4] = 999;
						return resultInYjOrderCheckInput(result);
					} else {
						YongjiVO temp_tmpjab4 = new YongjiVO();
						temp_tmpjab4.setListid(get_tmpjab3.getJbid());
						
						List<YongjiVO> list_tmpjab4 = yongjiSVC.selYjOrderCheckInputJ11(temp_tmpjab4);
						
						long yb_value = (long)Math.floor(next_yb / list_tmpjab4.size());
						long yb_rem = next_yb % list_tmpjab4.size();
						
						for(int n = 0; n < list_tmpjab4.size(); n++) {
							long set_tmplist4_yb = list_tmpjab4.get(n).getYb() + yb_value;
							set_tmplist4_yb += n < yb_rem ? 1 : 0;
							
							YongjiVO temp_tmplist4 = new YongjiVO();
							temp_tmplist4.setUid(list_tmpjab4.get(n).getUid());
							temp_tmplist4.setYb(set_tmplist4_yb);
							
							if(!yongjiSVC.upYjOrderCheckInputJ12(temp_tmplist4)) {
								//입사용지 여분 조절 오류2
								result[4] = 998;
								return resultInYjOrderCheckInput(result);
							}
						}
					}
				} else {
					if(!yongjiSVC.upYjOrderCheckInputJ1(set_tmpjab3_uid)) {
						//잡물 기록 오류
						result[4] = 997;
						return resultInYjOrderCheckInput(result);
					}
				}
				
				if(!yongjiSVC.upYjOrderCheckInputJ1(set_tmpjab3_uid)) {
					//잡물 기록 오류
					result[4] = 997;
					return resultInYjOrderCheckInput(result);
				} else {
					YongjiVO temp_jeonpyo = new YongjiVO();
					temp_jeonpyo.setValue(setYear("yy", new Date()));
					
					long max_jeonpyo_uid = yongjiSVC.selYjOrderJeonpyoMaxUid(temp_jeonpyo);
					max_jeonpyo_uid = max_jeonpyo_uid > 0 ? max_jeonpyo_uid++ : 1;
					
					YongjiVO get_tmpjab = yongjiSVC.selYjOrderCheckInputJ21(get_tmpjab3);
					
					long sum_jm_yb = get_tmpjab3_jm + get_tmpjab3_yb;
					
					temp_jeonpyo.setSpcom(get_tmpjab.getM1());
					temp_jeonpyo.setBname(get_tmpjab.getJbname());
					temp_jeonpyo.setBcode(get_tmpjab.getJbcode());
					temp_jeonpyo.setBusu(get_tmpjab.getJbamnt());
					temp_jeonpyo.setPanh(get_tmpjab.getJbpanh());
					temp_jeonpyo.setMyun(get_tmpjab.getJbpage());
					temp_jeonpyo.setJnum1(get_tmpjab3_jm);
					temp_jeonpyo.setJnum2(get_tmpjab3_yb);
					temp_jeonpyo.setBdate(get_yojijymn.getJdate());
					temp_jeonpyo.setBuycom(String.valueOf(params.getComid()));
					temp_jeonpyo.setJiname(get_yojijymn.getYjname());
					temp_jeonpyo.setJicode(get_yojijymn.getYjcode());
					temp_jeonpyo.setJsum(sum_jm_yb);
					temp_jeonpyo.setComment(get_tmpjab3.getGubn());
					temp_jeonpyo.setJejanum(get_tmpjab.getUid());
					temp_jeonpyo.setUid(max_jeonpyo_uid);
					
					if(!yongjiSVC.inYjOrderJeonpyo(params)) {
						//전표 기록 오류 2
						result[4] = 996;
						return resultInYjOrderCheckInput(result);
					}
					
					long max_jiinout_uid = yongjiSVC.selYjOrderJiinoutMaxUid();
					max_jiinout_uid = max_jiinout_uid > 0 ? max_jiinout_uid++ : 1;
					
					YongjiVO get_jiinout = yongjiSVC.selYjOrderJiinout(get_yojijymn);
					long set_curno = get_jiinout.getCurno() - sum_jm_yb;

					sum_jm_yb *= -1;
					
					YongjiVO temp_jiinout = new YongjiVO();
					temp_jiinout.setUid(max_jiinout_uid);
					temp_jiinout.setJicode(get_yojijymn.getYjcode());
					temp_jiinout.setDate(get_yojijymn.getJdate());
					temp_jiinout.setNum(sum_jm_yb);
					temp_jiinout.setComment(get_tmpjab.getJbname());
					temp_jiinout.setCurno(set_curno);
					temp_jiinout.setJeon(max_jeonpyo_uid);
					temp_jiinout.setJeuid(get_tmpjab.getUid());
					
					if(yongjiSVC.inYjOrderJiinout(temp_jiinout)) {
						result[1]++;
					}
				}
			} else {
				long set_uid = Integer.valueOf(get_cnumlist[i]);
				
				YongjiVO set_tmplist3_uid = new YongjiVO();
				set_tmplist3_uid.setUid(set_uid);
				
				YongjiVO get_tmplist3 = yongjiSVC.selYjOrderCheckInput(set_tmplist3_uid);
				
				long get_tmplist3_jm = get_tmplist3.getJm();
				long get_tmplist3_yb = get_tmplist3.getYb();
				
				if(!(get_tmplist3_jm > 0 || get_tmplist3_yb > 0)) {
					continue;
				}
				
				if(params.getIb() > 0) {
					long next_yb = i < cnum_rem ? cnum_value++ : cnum_value;
					long set_tmplist3_yb = get_tmplist3_yb + next_yb;

					get_tmplist3_yb = set_tmplist3_yb;
					
					YongjiVO temp_tmplist3 = new YongjiVO();
					temp_tmplist3.setUid(set_uid);
					temp_tmplist3.setYb(set_tmplist3_yb);
					
					if(yongjiSVC.upYjOrderCheckInput11(temp_tmplist3)) {
						YongjiVO temp_tmplist4 = new YongjiVO();
						temp_tmplist4.setListid(get_tmplist3.getJbid());
						temp_tmplist4.setYjcode(get_yojijymn.getYjcode());
						
						List<YongjiVO> list_tmplist4 = yongjiSVC.selYjOrderCheckInput12(temp_tmplist4);
						
						long yb_value = (long)Math.floor(next_yb / list_tmplist4.size());
						long yb_rem = next_yb % list_tmplist4.size();
						
						for(int n = 0; n < list_tmplist4.size(); n++) {
							long set_tmplist4_yb = list_tmplist4.get(n).getYb() + yb_value;
							set_tmplist4_yb += n < yb_rem ? 1 : 0;

							temp_tmplist4.setUid(list_tmplist4.get(n).getUid());
							temp_tmplist4.setYb(set_tmplist4_yb);
							
							if(yongjiSVC.upYjOrderCheckInput13(temp_tmplist4)) {
								result[2]++;
							}
						}
					}
				} else {
					if(yongjiSVC.upYjOrderCheckInput14(set_tmplist3_uid)) {
						result[2]++;
					}
				}
				
				YongjiVO temp_jeonpyo = new YongjiVO();
				temp_jeonpyo.setValue(setYear("yy", new Date()));
				
				long max_jeonpyo_uid = yongjiSVC.selYjOrderJeonpyoMaxUid(temp_jeonpyo);
				max_jeonpyo_uid = max_jeonpyo_uid > 0 ? max_jeonpyo_uid++ : 1;
				
				YongjiVO get_tmplists = yongjiSVC.selYjOrderCheckInpu21(get_tmplist3);
				
				long sum_jm_yb = get_tmplist3_jm + get_tmplist3_yb;
				
				String set_tmplist3_gubn = get_tmplist3.getGubn();
				if(get_tmplist3.getBucode() > 0) {
					set_tmplist3_gubn = "부록" + set_tmplist3_gubn;
				}
				
				temp_jeonpyo.setSpcom(get_tmplists.getM1());
				temp_jeonpyo.setBname(get_tmplists.getBname());
				temp_jeonpyo.setBcode(get_tmplists.getBcode());
				temp_jeonpyo.setBusu(get_tmplists.getBnum());
				temp_jeonpyo.setPanh(get_tmplists.getBpanh());
				temp_jeonpyo.setMyun(get_tmplists.getBmyun());
				temp_jeonpyo.setJnum1(get_tmplist3_jm);
				temp_jeonpyo.setJnum2(get_tmplist3_yb);
				temp_jeonpyo.setBdate(get_yojijymn.getJdate());
				temp_jeonpyo.setBuycom(String.valueOf(params.getComid()));
				temp_jeonpyo.setJiname(get_yojijymn.getYjname());
				temp_jeonpyo.setJicode(get_yojijymn.getYjcode());
				temp_jeonpyo.setJsum(sum_jm_yb);
				temp_jeonpyo.setComment(set_tmplist3_gubn);
				temp_jeonpyo.setJejanum(get_tmplists.getCrnum());
				temp_jeonpyo.setUid(max_jeonpyo_uid);
				
				if(!yongjiSVC.inYjOrderJeonpyo(params)) {
					//전표 기록 오류 2
					result[4] = 996;
					return resultInYjOrderCheckInput(result);
				}
				
				long max_jiinout_uid = yongjiSVC.selYjOrderJiinoutMaxUid();
				max_jiinout_uid = max_jiinout_uid > 0 ? max_jiinout_uid++ : 1;
				
				YongjiVO get_jiinout = yongjiSVC.selYjOrderJiinout(get_yojijymn);
				long set_curno = get_jiinout.getCurno() - sum_jm_yb;

				sum_jm_yb *= -1;
				
				YongjiVO temp_jiinout = new YongjiVO();
				temp_jiinout.setUid(max_jiinout_uid);
				temp_jiinout.setJicode(get_yojijymn.getYjcode());
				temp_jiinout.setDate(get_yojijymn.getJdate());
				temp_jiinout.setNum(sum_jm_yb);
				temp_jiinout.setComment(get_tmplists.getBname());
				temp_jiinout.setCurno(set_curno);
				temp_jiinout.setJeon(max_jeonpyo_uid);
				temp_jiinout.setJeuid(get_tmplists.getCrnum());
				
				if(yongjiSVC.inYjOrderJiinout(temp_jiinout)) {
					result[1]++;
				}
			}
		}
		
		if(yongjiSVC.upYjOrderYojijumnGmcheck(params)) {
			result[3]++;
		}
		
		return resultInYjOrderCheckInput(result);
	}
	
	private HashMap<String, String> resultInYjOrderCheckInput(int[] result) {
		HashMap<String, String> result_map = new HashMap<>();
		
		result_map.put("in_count", String.valueOf(result[0]));
		result_map.put("in_count_for", String.valueOf(result[1]));
		result_map.put("up_count_for", String.valueOf(result[2]));
		result_map.put("up_count_yojijumn", String.valueOf(result[3]));
		result_map.put("error", String.valueOf(result[4]));
		
		return result_map;
	}
	
	//TODO 거래처별 구매	
	//입력 : wccode, date1, date2
	@RequestMapping(value="/yongji/select_cust_buy_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjCustBuyList(@RequestBody YongjiVO params) throws Exception {
		List<YongjiVO> result_params = new ArrayList<YongjiVO>();
		
		List<YongjiVO> list_params = yongjiSVC.selYjCustJiinoutList(params);
		
		for(YongjiVO get_param : list_params) {
			get_param.setWjname(yongjiSVC.selYjCustKswjijl0Wjname(get_param));
			
			result_params.add(get_param);
		}
		return result_params;
	}
	
	//TODO 용지전표
	//입력 : value(년도 2자리), date1, date2
	@RequestMapping(value="/yongji/select_jp_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjJpList(@RequestBody YongjiVO params) throws Exception {
		List<YongjiVO> result_params = new ArrayList<YongjiVO>();
		
		List<YongjiVO> list_params = yongjiSVC.selYjJeonList(params);
		
		if(list_params == null) {
			yongjiSVC.createTableJeonpyo(params);
			
			list_params = yongjiSVC.selYjJeonList(params);
		}
		
		for(YongjiVO get_param : list_params) {
			String spcom = get_param.getSpcom();
			
			YongjiVO temp_cust = new YongjiVO();
			if(spcom == null || spcom.isEmpty()) {
				temp_cust.setWccode(get_param.getBuycom());
			} else {
				temp_cust.setWccode(spcom);
			}
			
			get_param.setWcname(yongjiSVC.selYjJeonKswcust0Wcname(temp_cust));
			
			result_params.add(get_param);
		}		
		return result_params;
	}
	
	//입력 : uid
	@RequestMapping(value="/yongji/select_jp_yj_check", method=RequestMethod.POST)
	public YongjiVO selYjJpJyCheck(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjJeonDetail(params);
	}
		
	//입력 : value(년도 2자리), date1, date2
	@RequestMapping(value="/yongji/select_jp_yj_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjJpJyList(@RequestBody YongjiVO params) throws Exception {
		List<YongjiVO> result_params = new ArrayList<YongjiVO>();
		
		List<YongjiVO> list_params = yongjiSVC.selYjJeonJiinoutList(params);
		
		for(YongjiVO get_param : list_params) {			
			YongjiVO temp_cust = new YongjiVO();
			temp_cust.setWccode(String.valueOf(get_param.getComid()));
			
			get_param.setWcname(yongjiSVC.selYjJeonKswcust0Wcname(temp_cust));
			
			result_params.add(get_param);
		}		
		return result_params;
	}

	//입력 : value(년도 2자리), uid
	@RequestMapping(value="/yongji/sel_yj_jeon_popup", method=RequestMethod.POST)
	public YongjiVO selYjJeonPopup1(@RequestBody YongjiVO params) throws Exception {
		YongjiVO result_params = yongjiSVC.selYjJeonPopup1(params);
		
		String[] set_params = new String[3];
		
		System.out.println(result_params.getBuycom());
		set_params[0] = yongjiSVC.selYjJeonPopup2(result_params);
		set_params[1] = result_params.getBuycom().isEmpty() ? "" : yongjiSVC.selYjJeonPopup3(result_params);
		set_params[2] = yongjiSVC.selYjJeonPopup4(params);
		
		result_params.setPopup_value(set_params);
		
		return result_params;
	}
		
	//TODO 용지등록하기
	
	@RequestMapping(value="/yongji/select_yg_regi_list1", method=RequestMethod.POST)
	public List<YongjiVO> selYjRegiList1( ) throws Exception {
		return yongjiSVC.selYjRegiList1();
	}
	//입력 : lm_s
	@RequestMapping(value="/yongji/select_yg_regi_list2", method=RequestMethod.POST)
	public List<YongjiVO> selYjRegiList2(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjRegiList2(params);
	}
	
	@RequestMapping(value="/yongji/select_reg_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjRegList() throws Exception {
		return yongjiSVC.selYjRegKswjijl0List();
	}
	
	//입력 : uid
	@RequestMapping(value="/yongji/select_reg_detail", method=RequestMethod.POST)
	public YongjiVO selYjRegDetail(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjRegDetail(params);
	}
		
	@RequestMapping(value="/yongji/insert_reg", method=RequestMethod.POST)
	public boolean inYjReg(@RequestBody YongjiVO params) throws Exception {
		boolean reg = yongjiSVC.inYjRegKswjijl0(params);
		boolean io = yongjiSVC.inYjRegJiinout(params);
		return reg && io;
	}
	
	@RequestMapping(value="/yongji/update_reg", method=RequestMethod.POST)
	public boolean upYjReg(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.upYjRegKswjijl0(params);
	}
	
	//입력 : uid
	@RequestMapping(value="/yongji/delete_reg", method=RequestMethod.POST)
	public boolean delYjReg(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.delYjRegKswjijl0(params);
	}
	
	//TODO 용지장부
	@RequestMapping(value="/yongji/select_jang_yj_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjJangYjList() throws Exception {
		return yongjiSVC.selYjJangYjList();
	}
	
	//입력 : jeon, value
	@RequestMapping(value="/yongji/select_jang_yj_bu_list", method=RequestMethod.POST)
	public YongjiVO selYjJangJp(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjJangJp(params);
	}

	//입력 : date1, date2
	@RequestMapping(value="/yongji/select_jang_yj_other1", method=RequestMethod.POST)
	public List<YongjiVO> selYjJangOther1(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjJangOther1(params);
	}
	
	//입력 : jicode
	@RequestMapping(value="/yongji/select_jang_yj_other2", method=RequestMethod.POST)
	public YongjiVO selYjJangOther2(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjJangOther2(params);
	}
	
	//입력 : wjcode, date1, date2
	@RequestMapping(value="/yongji/select_jang_yj_io_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjJangYjIOList(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjJangJiinoutList(params);
	}
	
	//입력 : wccode, date1, date2
		@RequestMapping(value="/yongji/select_jang_cust_io_list", method=RequestMethod.POST)
		public List<YongjiVO> selYjJangCustIOList(@RequestBody YongjiVO params) throws Exception {
			List<YongjiVO> result_params = new ArrayList<YongjiVO>();
			
			List<YongjiVO> list_params = yongjiSVC.selYjJangJiinoutCuList(params);
			
			for(YongjiVO get_param : list_params) {
				get_param.setWjname(yongjiSVC.selYjJangWjname(get_param));
				
				YongjiVO temp_cust = new YongjiVO();
				temp_cust.setWccode(String.valueOf(get_param.getComid()));
				
				get_param.setWcname(yongjiSVC.selYjCustWcname(temp_cust));
				
				result_params.add(get_param);
			}
			return result_params;
		}
	
	//TODO 월별 용지 재고 현황
	//입력 : msdate
	@RequestMapping(value="/yongji/check_mon", method=RequestMethod.POST)
	public int checkYjMon(@RequestBody YongjiVO params) throws Exception {
		int result = 0;
		List<YongjiVO> list_params1 = yongjiSVC.selYjMonCheckList(params);
		
		if(list_params1 == null || list_params1.size() == 0) {
			List<YongjiVO> list_params2 = yongjiSVC.selYjMonKswjijl0List();
			for(YongjiVO get_param : list_params2) {
				get_param.setMsdate(params.getMsdate());
				if(yongjiSVC.inYjMon(get_param)) {
					result++;
				}
			}
		}
		return result;
	}
	
	//입력 : msdate
	@RequestMapping(value="/yongji/select_mon_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjMonList(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjMonList(params);
	}
	
	//입력 : yjcode, date1, date2
	@RequestMapping(value="/yongji/select_mon_yj_list", method=RequestMethod.POST)
	public List<YongjiVO> selYjMonYjList(@RequestBody YongjiVO params) throws Exception {
		List<YongjiVO> result_params = new ArrayList<YongjiVO>();
		
		List<YongjiVO> list_params = yongjiSVC.selYjMonJiinoutList(params);
		
		for(YongjiVO get_param : list_params) {
			get_param.setWcname(yongjiSVC.selYjMonKswcust0Wcname(get_param));
			
			result_params.add(get_param);
		}
		return result_params;
	}
	
	//입력 : msdate
	@RequestMapping(value="/yongji/select_mon_check_input1", method=RequestMethod.POST)
	public HashMap<String, String> selYjMonCheckInput1(@RequestBody YongjiVO params) throws Exception {
		HashMap<String, String> result_map = new HashMap<>();
		int in_count = 0;
		int reset_qnty = 0;
		int up_count = 0;
		
		String get_year = params.getMsdate().substring(0, 4);
		String get_month = params.getMsdate().substring(4, 2);
		
		List<YongjiVO> list_params1 = yongjiSVC.selYjMonCheckIb();
		for(YongjiVO get_param : list_params1) {
			get_param.setMsdate(params.getMsdate());
			
			YongjiVO get_yongjims3 = yongjiSVC.selYjMonCheckInput1(get_param);
			if(get_yongjims3 == null) {
				if(yongjiSVC.inYjMon(get_param)) {
					in_count++;
				}
			}
		}
		if(yongjiSVC.upYjMonCheckInput2(params)) {
			reset_qnty++;
		}
		
		//기초재고
		String set_year = "";
		String set_month = "";
		
		if(get_month.equals("01")) {
			set_year = String.valueOf(Integer.valueOf(get_year) - 1);
			set_month = "12";
		} else {
			set_year = get_year;
			set_month = String.format("%02d", String.valueOf(Integer.valueOf(get_month) - 1));
		}
		
		YongjiVO set_yongjims3 = new YongjiVO();
		set_yongjims3.setMsdate(set_year + set_month);
		
		List<YongjiVO> list_params2 = yongjiSVC.selYjMonCheckList(set_yongjims3);
		for(YongjiVO get_param : list_params2) {
			get_param.setMsdate(set_year + set_month);

			if(yongjiSVC.upYjMonCheckInput11(get_param)) {
				up_count++;
			}
		}
		
		result_map.put("in_count", String.valueOf(in_count));
		result_map.put("reset_qnty", String.valueOf(reset_qnty));
		result_map.put("up_count", String.valueOf(up_count));
		return result_map;
	}
	
	//입력 : msdate
	@RequestMapping(value="/yongji/select_mon_check_input2", method=RequestMethod.POST)
	public HashMap<String, String> selYjMonCheckInput2(@RequestBody YongjiVO params) throws Exception {
		HashMap<String, String> result_map = new HashMap<>();
		int in_count = 0;
		int up_count = 0;
		
		//입고
		List<YongjiVO> list_params = yongjiSVC.selYjMonCheckInput21(params);
		for(YongjiVO get_param : list_params) {
//			HashMap<String, Object> temp_map = new HashMap<>();
//			temp_map.put("jicode", get_param.getJicode());
			
			get_param.setMsdate(params.getMsdate());
			
			YongjiVO get_yongjims3 = yongjiSVC.selYjMonCheckInput22(get_param);
			if(get_yongjims3 != null) {
				if(yongjiSVC.upYjMonCheckInput23(get_param)) {
					up_count++;
				}
			} else {
				if(yongjiSVC.inYjMonCheckInput24(get_param)) {
					in_count++;
				}
			}
		}
		
		result_map.put("in_count", String.valueOf(in_count));
		result_map.put("up_count", String.valueOf(up_count));
		return result_map;
	}
	
	//입력 : msdate
	@RequestMapping(value="/yongji/select_mon_check_input3", method=RequestMethod.POST)
	public HashMap<String, String> selYjMonCheckInput3(@RequestBody YongjiVO params) throws Exception {
		HashMap<String, String> result_map = new HashMap<>();
		int in_count = 0;
		int up_count = 0;
		
		//출고1
		List<YongjiVO> list_params1 = yongjiSVC.selYjMonCheckInput31(params);
		for(YongjiVO get_param1 : list_params1) {
			List<YongjiVO> list_params2 = yongjiSVC.selYjMonCheckInput32(get_param1);
			for(YongjiVO get_param2 : list_params2) {
//				HashMap<String, Object> temp_map = new HashMap<>();
//				
//				if(get_param2.getYjcode().equals("120001")){
//					temp_map.put("yjcode", get_param2.getYjcode());
//					temp_map.put("jm", get_param2.getJm());
//					temp_map.put("yb", get_param2.getYb());
//					temp_map.put("uid", get_param1.getUid());
//				}
//				
				get_param2.setMsdate(params.getMsdate());
				
				YongjiVO get_yongjims3 = yongjiSVC.selYjMonCheckInput33(get_param2);
				if(get_yongjims3 != null) {
					long set_qnty3 = get_param2.getJm() + get_param2.getYb() + get_yongjims3.getQnty3();
					get_yongjims3.setQnty3(set_qnty3);
					
					if(yongjiSVC.upYjMonCheckInput35(get_yongjims3)) {
						up_count++;
					}
				} else {
					long set_qnty3 = get_param2.getJm() + get_param2.getYb();
					get_param2.setQnty3(set_qnty3);
					
					if(yongjiSVC.inYjMonCheckInput34(get_param2)) {
						in_count++;
					}
				}
			}
		}
		
		result_map.put("in_count", String.valueOf(in_count));
		result_map.put("up_count", String.valueOf(up_count));
		return result_map;
	}
	
	//입력 : msdate
	@RequestMapping(value="/yongji/select_mon_check_input4", method=RequestMethod.POST)
	public HashMap<String, String> selYjMonCheckInput4(@RequestBody YongjiVO params) throws Exception {
		HashMap<String, String> result_map = new HashMap<>();
		int in_count = 0;
		int up_count = 0;
		
		//출고2
		List<YongjiVO> list_params1 = yongjiSVC.selYjMonCheckInput41(params);
		for(YongjiVO get_param1 : list_params1) {
			List<YongjiVO> list_params2 = yongjiSVC.selYjMonCheckInput42(get_param1);
			for(YongjiVO get_param2 : list_params2) {
//				HashMap<String, Object> temp_map = new HashMap<>();
//				
//				if(get_param2.getJcode().equals("120001")){
//					temp_map.put("jcode", get_param2.getJcode());
//					temp_map.put("jm", get_param2.getJm());
//					temp_map.put("yb", get_param2.getYb());
//					temp_map.put("uid", get_param1.getUid());
//				}
				
				get_param2.setMsdate(params.getMsdate());
				
				YongjiVO get_yongjims3 = yongjiSVC.selYjMonCheckInput43(get_param2);
				if(get_yongjims3 != null) {
					long set_qnty3 = get_param2.getJm() + get_param2.getYb() + get_yongjims3.getQnty3();
					
					get_yongjims3.setQnty3(set_qnty3);
					
					if(yongjiSVC.upYjMonCheckInput35(get_yongjims3)) {
						up_count++;
					}
				} else {
					long set_qnty3 = get_param2.getJm() + get_param2.getYb();
					get_param2.setQnty3(set_qnty3);
					
					if(yongjiSVC.inYjMonCheckInput44(get_param2)) {
						in_count++;
					}
				}
			}
		}
		
		result_map.put("in_count", String.valueOf(in_count));
		result_map.put("up_count", String.valueOf(up_count));
		return result_map;
	}
	
	//입력 : msdate
		@RequestMapping(value="/yongji/select_mon_check_input5", method=RequestMethod.POST)
		public int selYjMonCheckInput5(@RequestBody YongjiVO params) throws Exception {
			int result = 0;
			
			//기말재고
			List<YongjiVO> list_params = yongjiSVC.selYjMonCheckList(params);
			for(YongjiVO get_param : list_params) {
				long set_qnty4 = get_param.getQnty1() + get_param.getQnty2() - get_param.getQnty3();
				get_param.setQnty4(set_qnty4);
				
				if(yongjiSVC.upYjMonCheckInput51(get_param)) {
					result++;
				}
			}
			return result;
		}
		
	//입력 : msdate, yjcode
	@RequestMapping(value="/yongji/select_mon_popup1", method=RequestMethod.POST)
	public List<YongjiVO> selYjMonPopup1(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjMonPopup1(params);
	}
	//입력 : yjcode, date1, date2
	@RequestMapping(value="/yongji/select_mon_popup2", method=RequestMethod.POST)
	public List<YongjiVO> selYjMonPopup2(@RequestBody YongjiVO params) throws Exception {
		return yongjiSVC.selYjMonPopup2(params);
	}
		
	//TODO 공용 함수
	private String setYear(String set_year, Date set_date) {
		SimpleDateFormat sdf = new SimpleDateFormat(set_year);
		return sdf.format(set_date);
	}
}
