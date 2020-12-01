package com.guru.erpserver.service.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.MonthClosingVO;

public interface MonthClosingService {
	
	// TODO 도서별 원가계산서
	List<MonthClosingVO> selBookCostStatement1(MonthClosingVO params) throws Exception;	
	List<MonthClosingVO> selBookCostStatement2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement3(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement4(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement5(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement6(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement7(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement8(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement9(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement10(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement11(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement12(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement13(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement14(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement15(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement16(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement17(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement18(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> inBookCostStatement19(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> upBookCostStatement20(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement21(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement22(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement23(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement24(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement25(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement26(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement27(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement28(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement29(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement30(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement31(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement32(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement33(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement34(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> upBookCostStatement35(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement36(MonthClosingVO params) throws Exception;
	
	// TODO 잡물 원가계산서
	List<MonthClosingVO> selJMCostStatement1(MonthClosingVO params) throws Exception;	
	List<MonthClosingVO> selJMCostStatement2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement3(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement4(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement5(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement6(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement7(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement8(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement9(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement10(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement11(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement12(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement13(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement14(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement15(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement16(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> inJMCostStatement17(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> upJMCostStatement18(MonthClosingVO params) throws Exception;

	// TODO 품목별 원재료명세서(월별)
	List<MonthClosingVO> selPumMon1(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon2() throws Exception;
	List<MonthClosingVO> selPumMon3(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon4(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon5(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon6(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon7(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon8(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon9(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon10(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon11(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon12(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon13(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon14(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon15(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumMon16(MonthClosingVO params) throws Exception;
	boolean inPumMon1(MonthClosingVO params) throws Exception;
	boolean inPumMon2(MonthClosingVO params) throws Exception;
	boolean upPumMon1(MonthClosingVO params) throws Exception;
	boolean upPumMon2(MonthClosingVO params) throws Exception;
	boolean upPumMon3(MonthClosingVO params) throws Exception;
	boolean upPumMon4(MonthClosingVO params) throws Exception;
	boolean upPumMon5(MonthClosingVO params) throws Exception;
	boolean upPumMon6(MonthClosingVO params) throws Exception;
	boolean upPumMon7(MonthClosingVO params) throws Exception;
	boolean upPumMon8(MonthClosingVO params) throws Exception;
	boolean upPumMon9(MonthClosingVO params) throws Exception;
	boolean upPumMon10(MonthClosingVO params) throws Exception;
	
	// TODO 품목별 원재료명세서(기간)
	List<MonthClosingVO> selPumPer1(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumPer2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumPer3(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumPer4(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumPer5(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPumPer6(MonthClosingVO params) throws Exception;
	boolean inPumPer1(MonthClosingVO params) throws Exception;
	boolean delPumPer1(MonthClosingVO params) throws Exception;
	
	// TODO 저자료 지급 내역(상/하)
	List<MonthClosingVO> selRoyaltyUD1(MonthClosingVO params) throws Exception;	
	List<MonthClosingVO> selRoyaltyUD2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD3(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD4(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD5(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD6(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD7(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD8(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD9(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD10(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selRoyaltyUD11(MonthClosingVO params) throws Exception;

	
	// TODO 월별 저자료 지출결의서
	List<MonthClosingVO> selMonthlyRoyalty(MonthClosingVO params) throws Exception;
	
	// TODO 저자료 지급 내역??
	List<MonthClosingVO> selRoyalty(MonthClosingVO params) throws Exception;
	
	// TODO 구매단가입력
	List<MonthClosingVO> selPurchasePrice1(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice3(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice4(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice5(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice6(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice7(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice8(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice9(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice10(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice11(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice12(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice13(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selPurchasePrice14(MonthClosingVO params) throws Exception;
	boolean inPurchasePrice1(MonthClosingVO params) throws Exception;
	boolean inPurchasePrice2(MonthClosingVO params) throws Exception;
	boolean upPurchasePrice1(MonthClosingVO params) throws Exception;
	boolean upPurchasePrice2(MonthClosingVO params) throws Exception;
	boolean upPurchasePrice3(MonthClosingVO params) throws Exception;
	boolean delPurchasePrice1(MonthClosingVO params) throws Exception;
	boolean delPurchasePrice2(MonthClosingVO params) throws Exception;
	
	// TODO 도서 수량/금액 집계
	List<MonthClosingVO> selBookQuantityAmountTotal1(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookQuantityAmountTotal2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookQuantityAmountTotal3(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookQuantityAmountTotal4(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookQuantityAmountTotal5(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookQuantityAmountTotal6(MonthClosingVO params) throws Exception;

	boolean inBookQuantityAmountTotal1(MonthClosingVO params) throws Exception;
	boolean inBookQuantityAmountTotal2(MonthClosingVO params) throws Exception;
	boolean inBookQuantityAmountTotal3(MonthClosingVO params) throws Exception;
	boolean upBookQuantityAmountTotal1(MonthClosingVO params) throws Exception;
	boolean upBookQuantityAmountTotal2(MonthClosingVO params) throws Exception;
	boolean upBookQuantityAmountTotal3(MonthClosingVO params) throws Exception;
	boolean upBookQuantityAmountTotal4(MonthClosingVO params) throws Exception;
	boolean upBookQuantityAmountTotal5(MonthClosingVO params) throws Exception;
		
	// TODO 도서금액집계
	List<MonthClosingVO> selBookAmountTotal1(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookAmountTotal2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookAmountTotal3(MonthClosingVO params) throws Exception;
	boolean inBookAmountTotal1(MonthClosingVO params) throws Exception;
	boolean upBookAmountTotal1(MonthClosingVO params) throws Exception;
	boolean upBookAmountTotal2(MonthClosingVO params) throws Exception;
	
	// TODO 주은교육 제작현황
	List<MonthClosingVO> selJueun(MonthClosingVO params) throws Exception;
	
}
