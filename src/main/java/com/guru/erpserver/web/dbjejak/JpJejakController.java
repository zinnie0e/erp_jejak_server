package com.guru.erpserver.web.dbjejak;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.dbjejak.JpJejakService;
import com.guru.erpserver.vo.dbjejak.JpJejakVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class JpJejakController {
	@Resource
	private JpJejakService jpJejakSVC;
	
	//TODO 공통
	//입력 : bdate
	@RequestMapping(value="/jpjejak/select_jp_date", method=RequestMethod.POST)
	public List<JpJejakVO> selJpDay(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpDay(params);
	}

	//TODO 발주예정제품리스트
	//입력 : date1(년), date2(월)
	@RequestMapping(value="/jpjejak/select_bjlist_date_list", method=RequestMethod.POST)
	public ArrayList<HashMap<String, Object>> selBjlistDateList(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistDateList(params);
	}
	
	//입력 : signdate
	@RequestMapping(value="/jpjejak/select_bjlist_page_count", method=RequestMethod.POST)
	public List<JpJejakVO> selBjlistPageCount(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistPageCount(params);
	}
	
	//입력 : signdate, lm_s, lm_t
	@RequestMapping(value="/jpjejak/select_bjlist_list", method=RequestMethod.POST)
	public List<JpJejakVO> selBjlistList(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistList(params);
	}
	
	//입력 : date1, date2
	@RequestMapping(value="/jpjejak/select_bjlist_list1", method=RequestMethod.POST)
	public List<JpJejakVO> selBjlistList1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistList1(params);
	}
	
	//입력 : uid
	@RequestMapping(value="/jpjejak/delete_bjlist_item", method=RequestMethod.POST)
	public boolean delBjlistItem(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.delBjlistItem(params);
	}
	
	//입력 : uid
	@RequestMapping(value="/jpjejak/select_bjlist_item", method=RequestMethod.POST)
	public JpJejakVO selBjlistItem(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistItem(params);
	}
	
	//입력 : bcode(5자리)
	@RequestMapping(value="/jpjejak/select_bjlist_balju1", method=RequestMethod.POST)
	public String selBjlistBalju1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju1(params);
	}
	
	//입력 : bcode
	@RequestMapping(value="/jpjejak/select_bjlist_balju2", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju2(params);
	}
	
	//입력 : bcode
	@RequestMapping(value="/jpjejak/select_bjlist_balju3", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju3(params);
	}
	
	//입력 : bcode(5자리)
	@RequestMapping(value="/jpjejak/select_bjlist_balju4", method=RequestMethod.POST)
	public List<JpJejakVO> selBjlistBalju4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju4(params);
	}
	
	//입력 : wyjijl
	@RequestMapping(value="/jpjejak/select_bjlist_balju41", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju41(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju41(params);
	}
	
	//입력 : bnum
	@RequestMapping(value="/jpjejak/select_bjlist_balju411", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju411(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju411(params);
	}
	
	//입력 : bnum, wycolo
	@RequestMapping(value="/jpjejak/select_bjlist_balju412", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju412(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju412(params);
	}
	
	//입력 : bcode(5자리), wyboo9
	@RequestMapping(value="/jpjejak/select_bjlist_balju413", method=RequestMethod.POST)
	public long selBjlistBalju413(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju413(params);
	}
	
	//입력 : bcode(5자리), wyboo9
	@RequestMapping(value="/jpjejak/select_bjlist_balju4131", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju4131(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju4131(params);
	}
	
	//TODO 제작계획표
	// 입력 : date1, date2
	@RequestMapping(value = "/jpjejak/select_jejakplan0", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan0(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan0(params);
	}
	// 입력 : date1, date2, lm_s, lm_t
	@RequestMapping(value = "/jpjejak/select_jejakplan1", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan1(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jpjejak/select_jejakplan2", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan2(params);
	}
	// 입력 : bcode, listid
	@RequestMapping(value = "/jpjejak/select_jejakplan3", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan3(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jpjejak/select_jejakplan4", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan4(params);
	}
	
	//TODO 중쇄예정제품
	// 입력 : date1, date2
	@RequestMapping(value = "/jpjejak/select_reprint1", method = RequestMethod.POST)
	public List<JpJejakVO> selJpReprint1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpReprint1(params);
	}
	// 입력 : bcode, jnum
	@RequestMapping(value = "/jpjejak/select_reprint2", method = RequestMethod.POST)
	public JpJejakVO selJpReprint2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpReprint2(params);
	}
	// 입력 : date1, date2
	@RequestMapping(value = "/jpjejak/select_reprint3", method = RequestMethod.POST)
	public List<JpJejakVO> selJpReprint3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpReprint3(params);
	}
	// 입력 : jbcode
	@RequestMapping(value = "/jpjejak/select_reprint4", method = RequestMethod.POST)
	public JpJejakVO selJpReprint4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpReprint4(params);
	}
	
	//TODO 발주서
	@RequestMapping(value="/jpjejak/select_bal_cust_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal1() throws Exception {
		return jpJejakSVC.selJpBal1();
	}
	//입력 : bdate1, bdate2
	@RequestMapping(value="/jpjejak/select_bal_count_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBal2(params);
	}
	//입력 : ccode
	@RequestMapping(value="/jpjejak/select_bal_list3", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBal3(params);
	}
	//입력 : bdate1, bdate2
	@RequestMapping(value="/jpjejak/select_bal_list4", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBal4(params);
	}
	//입력 : listid
	@RequestMapping(value="/jpjejak/select_bal_list5", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal5(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBal5(params);
	}
	//입력 : uid, pwan, iwan
	@RequestMapping(value="/jpjejak/update_bal_pwan", method=RequestMethod.POST)
	public boolean upJpBalPwan(@RequestBody JpJejakVO params) throws Exception {
		long get_listid = jpJejakSVC.selJpBalListid(params);
		params.setListid(get_listid);
		return jpJejakSVC.upJpBalPwan(params);
	}
	//입력 : uid, pwan, iwan
	@RequestMapping(value="/jpjejak/update_bal_iwan", method=RequestMethod.POST)
	public boolean upJpBalIwan(@RequestBody JpJejakVO params) throws Exception {
		long get_listid = jpJejakSVC.selJpBalListid(params);
		params.setListid(get_listid);
		return jpJejakSVC.upJpBalIwan(params);
	}
	
	//TODO 표지작업지시서
	//입력 : bdate1, bdate2
	@RequestMapping(value="/jpjejak/select_jppyo_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpPyo(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpPyo(params);
	}
	//입력 : bcode
	@RequestMapping(value="/jpjejak/select_selYakc", method=RequestMethod.POST)
	public JpJejakVO selYakc(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYakc(params);
	}
	//입력 : uid, colo
	@RequestMapping(value="/jpjejak/update_jppyo_colo", method=RequestMethod.POST)
	public boolean upJpPyoColo(@RequestBody JpJejakVO params) throws Exception {
		boolean result_up1 = false;
		boolean result_up2 = false;
		JpJejakVO get_param = jpJejakSVC.selJpPyoColo1(params);
		if(get_param == null) return false;
		
		long new_cost = get_param.getPcost() * (params.getColo()+1) / (get_param.getColo()+1);
		
		JpJejakVO set_param = new JpJejakVO();
		set_param.setUid(params.getUid());
		set_param.setColo(params.getColo());
		set_param.setPcost(new_cost);
		
		result_up1 = jpJejakSVC.upJpPyoColo2(set_param);
		
		JpJejakVO get_param2 = jpJejakSVC.selJpPyoColo3(get_param);
		if(get_param2 == null) return false;
		
		long new_sobu = params.getColo() * get_param2.getSobudan5();
		
		BigDecimal decimal1 = BigDecimal.valueOf((new_sobu + (get_param2.getFilmnum5() * get_param2.getFilmdan5()) + get_param2.getDaeji5()));
		BigDecimal decimal2 = BigDecimal.valueOf(1.1);
		
		long new_sum = decimal1.multiply(decimal2).longValue();
		
		JpJejakVO set_param2 = new JpJejakVO();
		set_param2.setUid(get_param2.getUid());
		set_param2.setPannum5(params.getColo());
		set_param2.setSobu5(new_sobu);
		set_param2.setSum5(new_sum);
		
		result_up2 = jpJejakSVC.upJpPyoColo4(set_param);
		
		return result_up1 && result_up2;
	}
	
	// TODO 본문작업지시서
	// 입력 : bdate1, bdate2
	@RequestMapping(value = "/jpjejak/select_jpbon", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon0(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon0(params);
	}
	// 입력 : bdate1, bdate2, lm_s, lm_t
	@RequestMapping(value = "/jpjejak/select_jpbon_list", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jpjejak/select_jpbon_list2", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon2(params);
	}
	// 입력 : uid, bucode
	@RequestMapping(value = "/jpjejak/select_jpbon_list3", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon3(params);
	}
	// 입력 : uid, bucode
	@RequestMapping(value = "/jpjejak/select_jpbon_list4", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon4(params);
	}
	@RequestMapping(value = "/jpjejak/select_jpbon_detail1", method = RequestMethod.POST)
	public JpJejakVO selJpBonDetail1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBonDetail1(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail2", method=RequestMethod.POST)
	public boolean upJpBonDetail2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail2(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail3", method=RequestMethod.POST)
	public boolean upJpBonDetail3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail3(params);
	}
	@RequestMapping(value = "/jpjejak/select_jpbon_detail4", method = RequestMethod.POST)
	public JpJejakVO selJpBonDetail4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBonDetail4(params);
	}
	@RequestMapping(value = "/jpjejak/select_jpbon_detail5", method = RequestMethod.POST)
	public JpJejakVO selJpBonDetail5(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBonDetail5(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail6", method=RequestMethod.POST)
	public boolean upJpBonDetail6(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail6(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail7", method=RequestMethod.POST)
	public boolean upJpBonDetail7(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail7(params);
	}
	@RequestMapping(value = "/jpjejak/select_jpbon_detail8", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBonDetail8(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBonDetail8(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail9", method=RequestMethod.POST)
	public boolean upJpBonDetail9(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail9(params);
	}
	
	//TODO 입고대장
	//입력 : bdate1, bdate2
	@RequestMapping(value="/jpjejak/select_selWarehousing", method=RequestMethod.POST)
	public List<JpJejakVO> selWarehousing(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selWarehousing(params);
	}
	
	//TODO 제작예정리스트 열람
	@RequestMapping(value="/jpjejak/select_yejung1", method=RequestMethod.POST)
	public String selYejung1() throws Exception {
		return jpJejakSVC.selYejung1();
	}
	//입력 : signdate
	@RequestMapping(value="/jpjejak/select_yejung2_count", method=RequestMethod.POST)
	public int selYejung2Count(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYejung2Count(params);
	}
	//입력 : signdate, lm_s, lm_t
	@RequestMapping(value="/jpjejak/select_yejung2", method=RequestMethod.POST)
	public List<JpJejakVO> selYejung2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYejung2(params);
	}
	
	//TODO 제작예정리스트 등록
	//입력 : keyfield, key
	@RequestMapping(value="/jpjejak/select_jp_yejung_regi1", method=RequestMethod.POST)
	public List<JpJejakVO> selYejungRegi1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYejungRegi1(params);
	}
	//입력 : keyfield, key, lm_s, lm_t
	@RequestMapping(value="/jpjejak/select_jp_yejung_regi2", method=RequestMethod.POST)
	public List<JpJejakVO> selYejungRegi2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYejungRegi2(params);
	}
	//입력 : uid
	@RequestMapping(value="/jpjejak/delete_jp_yejung", method=RequestMethod.POST)
	public boolean delYejung(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.delYejung(params);
	}
	
	//TODO 제품정가인상리스트
	@RequestMapping(value="/jpjejak/select_jp_priceup_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpPriceUpList() throws Exception {
		return jpJejakSVC.selJpPriceUpList();
	}
	
	//TODO 제품보류리스트
	@RequestMapping(value="/jpjejak/select_jp_hold_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpHoldList() throws Exception {
		return jpJejakSVC.selJpHoldList();
	}
	
	//TODO 제품폐간리스트
	@RequestMapping(value="/jpjejak/select_jp_close_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpCloseList() throws Exception {
		return jpJejakSVC.selJpCloseList();
	}
	
	//TODO 신간적정재고관리
	//입력 : bdate
	@RequestMapping(value="/jpjejak/select_jp_newstock_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpNewStockList(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpNewStockList(params);
	}
	//입력 : uid
	@RequestMapping(value="/jpjejak/delete_jp_newstock", method=RequestMethod.POST)
	public boolean delJpNewStock(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.delJpNewStock(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jp_newstock", method=RequestMethod.POST)
	public boolean upJpNewStock(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpNewStock(params);
	}
}
