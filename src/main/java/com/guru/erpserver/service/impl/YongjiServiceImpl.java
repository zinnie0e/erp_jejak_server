package com.guru.erpserver.service.impl;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.YongjiService;
import com.guru.erpserver.mapper.YongjiMapper;
import com.guru.erpserver.vo.Yongji.*;

@Service
public class YongjiServiceImpl implements YongjiService{
	@Resource
	private YongjiMapper YongjiDAO;
	
	@Override
	public List<YongjiVO> selYjCustYjList() throws Exception {
		return YongjiDAO.selYjCustYjList();
	}
	@Override
	public List<YongjiVO> selYjCustWcnameYjList() throws Exception {
		return YongjiDAO.selYjCustWcnameYjList();
	}
	@Override
	public String selYjCustWcname(YongjiVO params) throws Exception {
		YongjiVO get_param = YongjiDAO.selYjCustWcname(params);
		
		return get_param != null ? get_param.getWcname() : null;
	}
	@Override
	public String selYjWjname(YongjiVO params) throws Exception {
		return YongjiDAO.selYjWjname(params).getWjname();
	}
	@Override
	public List<YongjiVO> selYjJiinoutList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJiinoutList(params);
	}
	
	//TODO 용지구입
	@Override
	public List<YongjiVO> selYjList() throws Exception {
		return YongjiDAO.selYjList();
	}
	
	@Override
	public List<YongjiVO> selYjOrderOrderList() throws Exception {
		return YongjiDAO.selYjOrderOrderList();
	}
	
	@Override
	public boolean selYjOrderCount1() throws Exception {
		return (YongjiDAO.selYjOrderCount1() > 0) ? true : false;
	}
	@Override
	public boolean selYjOrderCount2() throws Exception {
		return (YongjiDAO.selYjOrderCount2() > 0) ? true : false;
	}
	
	@Override
	public boolean delYjOrderYojijumn() throws Exception {
		return (YongjiDAO.delYjOrderYojijumn() == 1) ? true : false;
	}
	@Override
	public List<YongjiVO> selYjOrderInCheck1() throws Exception {
		return YongjiDAO.selYjOrderInCheck1();
	}
	@Override
	public List<YongjiVO> selYjOrderInCheck2() throws Exception {
		return YongjiDAO.selYjOrderInCheck2();
	}
	@Override
	public boolean inYjOrderYojijumn(YongjiVO params) throws Exception {
		return (YongjiDAO.inYjOrderYojijumn(params) == 1) ? true : false;
	}
	
	@Override
	public YongjiVO selYjOrderUpCheck() throws Exception {
		return YongjiDAO.selYjOrderUpCheck();
	}
	@Override
	public boolean upYjOrderYojijumn(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderYojijumn(params) == 1) ? true : false;
	}
	
	@Override
	public List<YongjiVO> selYjOrderListCheckDate1(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderListCheckDate1(params);
	}
	@Override
	public List<YongjiVO> selYjOrderListCheckDate2(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderListCheckDate2(params);
	}
	
	@Override
	public long selYjOrderFacdanga(YongjiVO params) throws Exception {
		YongjiVO get_param = YongjiDAO.selYjOrderFacdanga(params);
		
		return get_param != null ? get_param.getFacdanga() : 0;
	}
	@Override
	public boolean upYjOrderJiinout(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderJiinout(params) == 1) ? true : false;
	}
	
	@Override
	public long selYjOrderDetailDate(YongjiVO params) throws Exception {
		YongjiVO get_param = YongjiDAO.selYjOrderDetailDate(params);
		
		return get_param != null ? get_param.getDate() : 0;
	}
	@Override
	public boolean upYjOrderDetailDate1(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderDetailDate1(params) == 1) ? true : false;
	}
	@Override
	public long selYjOrderDetailDate2(YongjiVO params) throws Exception {
		YongjiVO get_param = YongjiDAO.selYjOrderDetailDate2(params);
		
		return get_param != null ? get_param.getJeon() : 0;
	}
	@Override
	public boolean upYjOrderDetailDate3(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderDetailDate3(params) == 1) ? true : false;
	}
	
	@Override
	public YongjiVO selYjOrderDetailCust(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderDetailCust(params);
	}
	@Override
	public boolean upYjOrderDetailCust1(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderDetailCust1(params) == 1) ? true : false;
	}
	@Override
	public YongjiVO selYjOrderDetailCust2(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderDetailCust2(params);
	}
	@Override
	public boolean upYjOrderDetailCust3(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderDetailCust3(params) == 1) ? true : false;
	}
	
	@Override
	public YongjiVO selYjOrderDetailCode(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderDetailCode(params);
	}
	@Override
	public List<YongjiVO> selYjOrderDetailCodeList() throws Exception {
		return YongjiDAO.selYjOrderDetailCodeList();
	}
	@Override
	public boolean upYjOrderDetailCode1(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderDetailCode1(params) == 1) ? true : false;
	}
	@Override
	public YongjiVO selYjOrderDetailCode2(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderDetailCode2(params);
	}
	@Override
	public boolean upYjOrderDetailCode3(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderDetailCode3(params) == 1) ? true : false;
	}
	
	@Override
	public YongjiVO selYjOrderCheckOI(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderCheckOI(params);
	}
	@Override
	public long selYjOrderJeonpyoUidCount(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderJeonpyoUidCount(params);
	}
	@Override
	public long selYjOrderJiinoutUidCount() throws Exception {
		return YongjiDAO.selYjOrderJiinoutUidCount();
	}
	@Override
	public boolean inYjOrderJeonpyo(YongjiVO params) throws Exception {
		return (YongjiDAO.inYjOrderJeonpyo(params) == 1) ? true : false;
	}
	@Override
	public YongjiVO selYjOrderJiinout(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderJiinout(params);
	}
	@Override
	public boolean inYjOrderJiinout(YongjiVO params) throws Exception {
		return (YongjiDAO.inYjOrderJiinout(params) == 1) ? true : false;
	}
	@Override
	public boolean inYjOrderCheckOrder1(YongjiVO params) throws Exception {
		return (YongjiDAO.inYjOrderCheckOrder1(params) == 1) ? true : false;
	}
	@Override
	public long selYjOrderCheckOrder2(YongjiVO params) throws Exception {
		YongjiVO get_params = YongjiDAO.selYjOrderCheckOrder2(params);
		
		return get_params != null ? get_params.getCurno() : 0;
	}
	@Override
	public boolean inYjOrderCheckOrder3(YongjiVO params) throws Exception {
		return (YongjiDAO.inYjOrderCheckOrder3(params) == 1) ? true : false;
	}
	@Override
	public boolean upYjOrderCheckInputJ1(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderCheckInputJ1(params) == 1) ? true : false;
	}
	@Override
	public YongjiVO selYjOrderCheckInputJ2(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderCheckInputJ2(params);
	}
	@Override
	public boolean upYjOrderCheckInputJ3(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderCheckInputJ3(params) == 1) ? true : false;
	}
	@Override
	public List<YongjiVO> selYjOrderCheckInputJ11(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderCheckInputJ11(params);
	}
	@Override
	public boolean upYjOrderCheckInputJ12(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderCheckInputJ12(params) == 1) ? true : false;
	}
	@Override
	public YongjiVO selYjOrderCheckInputJ21(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderCheckInputJ21(params);
	}
	@Override
	public YongjiVO selYjOrderCheckInput(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderCheckInput(params);
	}
	@Override
	public boolean upYjOrderCheckInput11(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderCheckInput11(params) == 1) ? true : false;
	}
	@Override
	public List<YongjiVO> selYjOrderCheckInput12(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderCheckInput12(params);
	}
	@Override
	public boolean upYjOrderCheckInput13(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderCheckInput13(params) == 1) ? true : false;
	}
	@Override
	public boolean upYjOrderCheckInput14(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderCheckInput14(params) == 1) ? true : false;
	}
	@Override
	public YongjiVO selYjOrderCheckInpu21(YongjiVO params) throws Exception {
		return YongjiDAO.selYjOrderCheckInpu21(params);
	}
	@Override
	public boolean upYjOrderYojijumnGmcheck(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjOrderYojijumnGmcheck(params) == 1) ? true : false;
	}
	
	//TODO 거래처별 구매
	@Override
	public List<YongjiVO> selYjCustJiinoutList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjCustJiinoutList(params);
	}
	@Override
	public String selYjCustKswjijl0Wjname(YongjiVO params) throws Exception {
		return YongjiDAO.selYjCustKswjijl0Wjname(params).getWjname();
	}
	
	//TODO 용지전표
	@Override
	public List<YongjiVO> selYjJeonList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJeonList(params);
	}
	@Override
	public YongjiVO selYjJeonDetail(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJeonDetail(params);
	}
	@Override
	public List<YongjiVO> selYjJeonJiinoutList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJeonJiinoutList(params);
	}
	@Override
	public String selYjJeonKswcust0Wcname(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJeonKswcust0Wcname(params).getWcname();
	}
	
	//TODO 용지등록하기
	@Override
	public List<YongjiVO> selYjRegKswjijl0List() throws Exception {
		return YongjiDAO.selYjRegKswjijl0List();
	}
	@Override
	public YongjiVO selYjRegDetail(YongjiVO params) throws Exception {
		return YongjiDAO.selYjRegDetail(params);
	}
	@Override
	public long selYjRegJiinoutCurno(YongjiVO params) throws Exception {
		YongjiVO get_params = YongjiDAO.selYjRegJiinoutCurno(params);
		
		return get_params != null ? get_params.getCurno() : 0;
	}
	@Override
	public boolean inYjRegKswjijl0(YongjiVO params) throws Exception {
		long quert_result = YongjiDAO.inYjRegKswjijl0(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inYjRegJiinout(YongjiVO params) throws Exception {
		long quert_result = YongjiDAO.inYjRegJiinout(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upYjRegKswjijl0(YongjiVO params) throws Exception {
		long quert_result = YongjiDAO.upYjRegKswjijl0(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean delYjRegKswjijl0(YongjiVO params) throws Exception {
		long quert_result = YongjiDAO.delYjRegKswjijl0(params);
		return (quert_result == 1) ? true : false;
	}
	
	//TODO 용지장부
	@Override
	public List<YongjiVO> selYjJangJiinoutList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJangJiinoutList(params);
	}
	@Override
	public List<YongjiVO> selYjJangJiinoutCuList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJangJiinoutCuList(params);
	}
	@Override
	public String selYjJangWjname(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJangWjname(params).getWjname();
	}
	@Override
	public List<YongjiVO> selYjJangYjList() throws Exception {
		return YongjiDAO.selYjJangYjList();
	}
	@Override
	public YongjiVO selYjJangJp(YongjiVO params) throws Exception {
		return YongjiDAO.selYjJangJp(params);
	}
	
	//TODO 월별 용지 재고 현황
	@Override
	public List<YongjiVO> selYjMonKswjijl0List() throws Exception {
		return YongjiDAO.selYjMonKswjijl0List();
	}
	@Override
	public List<YongjiVO> selYjMonCheckList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckList(params);
	}
	@Override
	public boolean inYjMon(YongjiVO params) throws Exception {
		return (YongjiDAO.inYjMon(params) == 1) ? true : false;
	}
	@Override
	public List<YongjiVO> selYjMonList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonList(params);
	}
	@Override
	public List<YongjiVO> selYjMonJiinoutList(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonJiinoutList(params);
	}
	@Override
	public String selYjMonKswcust0Wcname(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonKswcust0Wcname(params).getWcname();
	}
	@Override
	public List<YongjiVO> selYjMonCheckIb(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckIb(params);
	}
	@Override
	public YongjiVO selYjMonCheckInput1(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckInput1(params);
	}
	@Override
	public boolean upYjMonCheckInput2(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjMonCheckInput2(params) == 1) ? true : false;
	}
	@Override
	public boolean upYjMonCheckInput11(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjMonCheckInput11(params) == 1) ? true : false;
	}
	@Override
	public List<YongjiVO> selYjMonCheckInput21(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckInput21(params);
	}
	@Override
	public YongjiVO selYjMonCheckInput22(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckInput22(params);
	}
	@Override
	public boolean upYjMonCheckInput23(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjMonCheckInput23(params) == 1) ? true : false;
	}
	@Override
	public boolean inYjMonCheckInput24(YongjiVO params) throws Exception {
		return (YongjiDAO.inYjMonCheckInput24(params) == 1) ? true : false;
	}
	@Override
	public List<YongjiVO> selYjMonCheckInput31(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckInput31(params);
	}
	@Override
	public List<YongjiVO> selYjMonCheckInput32(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckInput32(params);
	}
	@Override
	public boolean upYjMonCheckInput33(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjMonCheckInput33(params) == 1) ? true : false;
	}
	@Override
	public boolean inYjMonCheckInput34(YongjiVO params) throws Exception {
		return (YongjiDAO.inYjMonCheckInput34(params) == 1) ? true : false;
	}
	@Override
	public List<YongjiVO> selYjMonCheckInput41(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckInput41(params);
	}
	@Override
	public List<YongjiVO> selYjMonCheckInput42(YongjiVO params) throws Exception {
		return YongjiDAO.selYjMonCheckInput42(params);
	}
	@Override
	public boolean upYjMonCheckInput51(YongjiVO params) throws Exception {
		return (YongjiDAO.upYjMonCheckInput51(params) == 1) ? true : false;
	}
}
