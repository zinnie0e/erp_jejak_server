package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.YongjiVO;

@Mapper
public interface YongjiMapper {
	public List<YongjiVO> selYjCustYjList();
	public List<YongjiVO> selYjCustWcnameYjList();
	public YongjiVO selYjCustWcname(YongjiVO params);
	public YongjiVO selYjWjname(YongjiVO params);
	public List<YongjiVO> selYjJiinoutList(YongjiVO params);
	
	//TODO 용지구입
	public List<YongjiVO> selYjList();
	
	public List<YongjiVO> selYjBuyOrderList();
	
	public Integer selYjOrderCount1();
	public Integer selYjOrderCount2();
	
	public int delYjOrderYojijumn();
	public List<YongjiVO> selYjOrderInCheck1();
	public List<YongjiVO> selYjOrderInCheck2();
	public int inYjOrderYojijumn(YongjiVO params);
	
	public YongjiVO selYjOrderUpCheck();
	public int upYjOrderYojijumn(YongjiVO params);
	
	public List<YongjiVO> selYjOrderListCheckDate1(YongjiVO params);
	public List<YongjiVO> selYjOrderListCheckDate2(YongjiVO params);
	
	public YongjiVO selYjOrderFacdanga(YongjiVO params);
	public int upYjOrderJiinout(YongjiVO params);
	
	public YongjiVO selYjBuyHalin1(YongjiVO params);
	public int upYjBuyHalin2(YongjiVO params);
	public YongjiVO selYjBuyHalin3(YongjiVO params);
	public int upYjBuyHalin4(YongjiVO params);
	
	public YongjiVO selYjOrderDetailDate(YongjiVO params);
	public int upYjOrderDetailDate1(YongjiVO params);
	public YongjiVO selYjOrderDetailDate2(YongjiVO params);
	public int upYjOrderDetailDate3(YongjiVO params);
	
	public YongjiVO selYjOrderDetailCust(YongjiVO params);
	public int upYjOrderDetailCust1(YongjiVO params);
	public YongjiVO selYjOrderDetailCust2(YongjiVO params);
	public int upYjOrderDetailCust3(YongjiVO params);
	
	public YongjiVO selYjOrderDetailCode(YongjiVO params);
	public List<YongjiVO> selYjOrderDetailCodeList();
	public int upYjOrderDetailCode1(YongjiVO params);
	public YongjiVO selYjOrderDetailCode2(YongjiVO params);
	public int upYjOrderDetailCode3(YongjiVO params);
	
	public YongjiVO selYjOrderCheckOI(YongjiVO params);
	public Integer selYjOrderJeonpyoMaxUid(YongjiVO params);
	public Integer selYjOrderJiinoutMaxUid();
	public YongjiVO selYjOrderBuyKswjijl0(YongjiVO params);
	public YongjiVO selYjOrderBuyJiinout(YongjiVO params);
	public int inYjOrderJeonpyo(YongjiVO params);
	public YongjiVO selYjOrderJiinout(YongjiVO params);
	public int inYjOrderJiinout(YongjiVO params);
	public int inYjOrderCheckOrder1(YongjiVO params);
	public YongjiVO selYjOrderCheckOrder2(YongjiVO params);
	public int inYjOrderCheckOrder3(YongjiVO params);
	public int upYjOrderCheckInputJ1(YongjiVO params);
	public YongjiVO selYjOrderCheckInputJ2(YongjiVO params);
	public int upYjOrderCheckInputJ3(YongjiVO params);
	public List<YongjiVO> selYjOrderCheckInputJ11(YongjiVO params);
	public int upYjOrderCheckInputJ12(YongjiVO params);
	public YongjiVO selYjOrderCheckInputJ21(YongjiVO params);
	public YongjiVO selYjOrderCheckInput(YongjiVO params);
	public int upYjOrderCheckInput11(YongjiVO params);
	public List<YongjiVO> selYjOrderCheckInput12(YongjiVO params);
	public int upYjOrderCheckInput13(YongjiVO params);
	public int upYjOrderCheckInput14(YongjiVO params);
	public YongjiVO selYjOrderCheckInpu21(YongjiVO params);
	public int upYjOrderYojijumnGmcheck(YongjiVO params);
	
	//TODO 거래처별 구매
	public List<YongjiVO> selYjCustJiinoutList(YongjiVO params);
	public YongjiVO selYjCustKswjijl0Wjname(YongjiVO params);
	
	//TODO 용지전표
	public List<YongjiVO> selYjJeonList(YongjiVO params);
	public YongjiVO selYjJeonDetail(YongjiVO params);
	public List<YongjiVO> selYjJeonJiinoutList(YongjiVO params);
	public YongjiVO selYjJeonKswcust0Wcname(YongjiVO params);
	
	public YongjiVO selYjJeonPopup1(YongjiVO params);
	public YongjiVO selYjJeonPopup2(YongjiVO params);
	public YongjiVO selYjJeonPopup3(YongjiVO params);
	public YongjiVO selYjJeonPopup4(YongjiVO params);
	
	//TODO 용지등록하기
	public List<YongjiVO> selYjRegiList1();
	public List<YongjiVO> selYjRegiList2(YongjiVO params);
	public List<YongjiVO> selYjRegKswjijl0List();
	public YongjiVO selYjRegDetail(YongjiVO params);
	public YongjiVO selYjRegJiinoutCurno(YongjiVO params);
	public int inYjRegKswjijl0(YongjiVO params);
	public int inYjRegJiinout(YongjiVO params);
	public int upYjRegKswjijl0(YongjiVO params);
	public int delYjRegKswjijl0(YongjiVO params);
	
	//TODO 용지장부
	public List<YongjiVO> selYjJangJiinoutList(YongjiVO params);
	public List<YongjiVO> selYjJangJiinoutCuList(YongjiVO params);
	public YongjiVO selYjJangWjname(YongjiVO params);
	public List<YongjiVO> selYjJangYjList();
	public YongjiVO selYjJangJp(YongjiVO params);
	
	public List<YongjiVO> selYjJangOther1(YongjiVO params);
	public YongjiVO selYjJangOther2(YongjiVO params);
	
	//TODO 월별 용지 재고 현황
	public List<YongjiVO> selYjMonCheckList(YongjiVO params);
	public List<YongjiVO> selYjMonKswjijl0List();
	public int inYjMon(YongjiVO params);
	public List<YongjiVO> selYjMonList(YongjiVO params);
	public List<YongjiVO> selYjMonJiinoutList(YongjiVO params);
	public YongjiVO selYjMonKswcust0Wcname(YongjiVO params);
	public List<YongjiVO> selYjMonCheckIb();
	public YongjiVO selYjMonCheckInput1(YongjiVO params);
	public int upYjMonCheckInput2(YongjiVO params);
	public int upYjMonCheckInput11(YongjiVO params);
	public List<YongjiVO> selYjMonCheckInput21(YongjiVO params);
	public YongjiVO selYjMonCheckInput22(YongjiVO params);
	public int upYjMonCheckInput23(YongjiVO params);
	public int inYjMonCheckInput24(YongjiVO params);
	public List<YongjiVO> selYjMonCheckInput31(YongjiVO params);
	public List<YongjiVO> selYjMonCheckInput32(YongjiVO params);
	public YongjiVO selYjMonCheckInput33(YongjiVO params);
	public int inYjMonCheckInput34(YongjiVO params);
	public int upYjMonCheckInput35(YongjiVO params);
	public List<YongjiVO> selYjMonCheckInput41(YongjiVO params);
	public List<YongjiVO> selYjMonCheckInput42(YongjiVO params);
	public YongjiVO selYjMonCheckInput43(YongjiVO params);
	public int inYjMonCheckInput44(YongjiVO params);
	public int upYjMonCheckInput51(YongjiVO params);
	public List<YongjiVO> selYjMonPopup1(YongjiVO params);
	public List<YongjiVO> selYjMonPopup2(YongjiVO params);
	
	public Integer createTableJeonpyo(YongjiVO params);
}
