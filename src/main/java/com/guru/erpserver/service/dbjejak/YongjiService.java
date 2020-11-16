package com.guru.erpserver.service.dbjejak;

import java.util.List;

import com.guru.erpserver.vo.dbjejak.YongjiVO;

public interface YongjiService {
	List<YongjiVO> selYjCustYjList() throws Exception;
	List<YongjiVO> selYjCustWcnameYjList() throws Exception;
	String selYjCustWcname(YongjiVO params) throws Exception;
	String selYjWjname(YongjiVO params) throws Exception;
	List<YongjiVO> selYjJiinoutList(YongjiVO params) throws Exception;
	
	//TODO 용지구입
	List<YongjiVO> selYjList() throws Exception;
	
	List<YongjiVO> selYjOrderOrderList() throws Exception;
	
	boolean selYjOrderCount1() throws Exception;
	boolean selYjOrderCount2() throws Exception;
	
	boolean delYjOrderYojijumn() throws Exception;
	List<YongjiVO> selYjOrderInCheck1() throws Exception;
	List<YongjiVO> selYjOrderInCheck2() throws Exception;
	boolean inYjOrderYojijumn(YongjiVO params) throws Exception;
	
	YongjiVO selYjOrderUpCheck() throws Exception;
	boolean upYjOrderYojijumn(YongjiVO params) throws Exception;
	
	List<YongjiVO> selYjOrderListCheckDate1(YongjiVO params) throws Exception;
	List<YongjiVO> selYjOrderListCheckDate2(YongjiVO params) throws Exception;
	
	long selYjOrderFacdanga(YongjiVO params) throws Exception;
	boolean upYjOrderJiinout(YongjiVO params) throws Exception;
	
	long selYjOrderDetailDate(YongjiVO params) throws Exception;
	boolean upYjOrderDetailDate1(YongjiVO params) throws Exception;
	long selYjOrderDetailDate2(YongjiVO params) throws Exception;
	boolean upYjOrderDetailDate3(YongjiVO params) throws Exception;
	
	YongjiVO selYjOrderDetailCust(YongjiVO params) throws Exception;
	boolean upYjOrderDetailCust1(YongjiVO params) throws Exception;
	YongjiVO selYjOrderDetailCust2(YongjiVO params) throws Exception;
	boolean upYjOrderDetailCust3(YongjiVO params) throws Exception;
	
	YongjiVO selYjOrderDetailCode(YongjiVO params) throws Exception;
	List<YongjiVO> selYjOrderDetailCodeList() throws Exception;
	boolean upYjOrderDetailCode1(YongjiVO params) throws Exception;
	YongjiVO selYjOrderDetailCode2(YongjiVO params) throws Exception;
	boolean upYjOrderDetailCode3(YongjiVO params) throws Exception;
	
	YongjiVO selYjOrderCheckOI(YongjiVO params) throws Exception;
	long selYjOrderJeonpyoUidCount(YongjiVO params) throws Exception;
	long selYjOrderJiinoutUidCount() throws Exception;
	boolean inYjOrderJeonpyo(YongjiVO params) throws Exception;
	YongjiVO selYjOrderJiinout(YongjiVO params) throws Exception;
	boolean inYjOrderJiinout(YongjiVO params) throws Exception;
	boolean inYjOrderCheckOrder1(YongjiVO params) throws Exception;
	long selYjOrderCheckOrder2(YongjiVO params) throws Exception;
	boolean inYjOrderCheckOrder3(YongjiVO params) throws Exception;
	boolean upYjOrderCheckInputJ1(YongjiVO params) throws Exception;
	YongjiVO selYjOrderCheckInputJ2(YongjiVO params) throws Exception;
	boolean upYjOrderCheckInputJ3(YongjiVO params) throws Exception;
	List<YongjiVO> selYjOrderCheckInputJ11(YongjiVO params) throws Exception;
	boolean upYjOrderCheckInputJ12(YongjiVO params) throws Exception;
	YongjiVO selYjOrderCheckInputJ21(YongjiVO params) throws Exception;
	YongjiVO selYjOrderCheckInput(YongjiVO params) throws Exception;
	boolean upYjOrderCheckInput11(YongjiVO params) throws Exception;
	List<YongjiVO> selYjOrderCheckInput12(YongjiVO params) throws Exception;
	boolean upYjOrderCheckInput13(YongjiVO params) throws Exception;
	boolean upYjOrderCheckInput14(YongjiVO params) throws Exception;
	YongjiVO selYjOrderCheckInpu21(YongjiVO params) throws Exception;
	boolean upYjOrderYojijumnGmcheck(YongjiVO params) throws Exception;
	
	//TODO 거래처별 구매
	List<YongjiVO> selYjCustJiinoutList(YongjiVO params) throws Exception;
	String selYjCustKswjijl0Wjname(YongjiVO params) throws Exception;
	
	//TODO 용지전표
	List<YongjiVO> selYjJeonList(YongjiVO params) throws Exception;
	YongjiVO selYjJeonDetail(YongjiVO params) throws Exception;
	List<YongjiVO> selYjJeonJiinoutList(YongjiVO params) throws Exception;
	String selYjJeonKswcust0Wcname(YongjiVO params) throws Exception;
	
	//TODO 용지등록하기
	List<YongjiVO> selYjRegiList1() throws Exception;
	List<YongjiVO> selYjRegiList2(YongjiVO params) throws Exception;
	List<YongjiVO> selYjRegKswjijl0List() throws Exception;
	YongjiVO selYjRegDetail(YongjiVO params) throws Exception;
	long selYjRegJiinoutCurno(YongjiVO params) throws Exception;
	boolean inYjRegKswjijl0(YongjiVO params) throws Exception;
	boolean inYjRegJiinout(YongjiVO params) throws Exception;
	boolean upYjRegKswjijl0(YongjiVO params) throws Exception;
	boolean delYjRegKswjijl0(YongjiVO params) throws Exception;
	
	//TODO 용지장부
	List<YongjiVO> selYjJangJiinoutList(YongjiVO params) throws Exception;
	List<YongjiVO> selYjJangJiinoutCuList(YongjiVO params) throws Exception;
	String selYjJangWjname(YongjiVO params) throws Exception;
	List<YongjiVO> selYjJangYjList() throws Exception;
	YongjiVO selYjJangJp(YongjiVO params) throws Exception;
	
	//TODO 월별 용지 재고 현황
	List<YongjiVO> selYjMonKswjijl0List() throws Exception;
	List<YongjiVO> selYjMonCheckList(YongjiVO params) throws Exception;
	boolean inYjMon(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonList(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonJiinoutList(YongjiVO params) throws Exception;
	String selYjMonKswcust0Wcname(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonCheckIb(YongjiVO params) throws Exception;
	YongjiVO selYjMonCheckInput1(YongjiVO params) throws Exception;
	boolean upYjMonCheckInput2(YongjiVO params) throws Exception;
	boolean upYjMonCheckInput11(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonCheckInput21(YongjiVO params) throws Exception;
	YongjiVO selYjMonCheckInput22(YongjiVO params) throws Exception;
	boolean upYjMonCheckInput23(YongjiVO params) throws Exception;
	boolean inYjMonCheckInput24(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonCheckInput31(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonCheckInput32(YongjiVO params) throws Exception;
	boolean upYjMonCheckInput33(YongjiVO params) throws Exception;
	boolean inYjMonCheckInput34(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonCheckInput41(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonCheckInput42(YongjiVO params) throws Exception;
	boolean upYjMonCheckInput51(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonPopup1(YongjiVO params) throws Exception;
	List<YongjiVO> selYjMonPopup2(YongjiVO params) throws Exception;
	
}
