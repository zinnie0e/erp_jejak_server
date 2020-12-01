package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.MonthClosingVO;

@Mapper
public interface MonthClosingMapper {
	// TODO 공통
	
	// TODO 도서별 원가계산서
	public List<MonthClosingVO> selBookCostStatement1(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement2(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement3(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement4(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement5(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement6(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement7(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement8(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement9(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement10(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement11(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement12(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement13(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement14(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement15(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement16(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement17(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement18(MonthClosingVO params);
	public List<MonthClosingVO> inBookCostStatement19(MonthClosingVO params);
	public List<MonthClosingVO> upBookCostStatement20(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement21(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement22(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement23(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement24(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement25(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement26(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement27(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement28(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement29(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement30(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement31(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement32(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement33(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement34(MonthClosingVO params);
	public List<MonthClosingVO> upBookCostStatement35(MonthClosingVO params);
	public List<MonthClosingVO> selBookCostStatement36(MonthClosingVO params);
	

	
	// TODO 잡물 원가계산서
	public List<MonthClosingVO> selJMCostStatement1(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement2(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement3(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement4(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement5(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement6(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement7(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement8(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement9(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement10(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement11(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement12(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement13(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement14(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement15(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement16(MonthClosingVO params);
	public List<MonthClosingVO> inJMCostStatement17(MonthClosingVO params);
	public List<MonthClosingVO> upJMCostStatement18(MonthClosingVO params);
	
	
	// TODO 품목별 원재료명세서(월별)
	public List<MonthClosingVO> selPumMon1(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon2();
	public List<MonthClosingVO> selPumMon3(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon4(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon5(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon6(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon7(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon8(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon9(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon10(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon11(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon12(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon13(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon14(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon15(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon16(MonthClosingVO params);
	public int inPumMon1(MonthClosingVO params);
	public int inPumMon2(MonthClosingVO params);
	public int upPumMon1(MonthClosingVO params);
	public int upPumMon2(MonthClosingVO params);
	public int upPumMon3(MonthClosingVO params);
	public int upPumMon4(MonthClosingVO params);
	public int upPumMon5(MonthClosingVO params);
	public int upPumMon6(MonthClosingVO params);
	public int upPumMon7(MonthClosingVO params);
	public int upPumMon8(MonthClosingVO params);
	public int upPumMon9(MonthClosingVO params);
	public int upPumMon10(MonthClosingVO params);
	
	
	// TODO 품목별 원재료명세서(기간)
	public List<MonthClosingVO> selPumPer1(MonthClosingVO params);
	public List<MonthClosingVO> selPumPer2(MonthClosingVO params);
	public List<MonthClosingVO> selPumPer3(MonthClosingVO params);
	public List<MonthClosingVO> selPumPer4(MonthClosingVO params);
	public List<MonthClosingVO> selPumPer5(MonthClosingVO params);
	public List<MonthClosingVO> selPumPer6(MonthClosingVO params);
	public int inPumPer1(MonthClosingVO params);
	public int delPumPer1(MonthClosingVO params);
		
	// TODO 저자료 지급 내역(상/하)
	public List<MonthClosingVO> selRoyaltyUD1(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD2(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD3(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD4(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD5(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD6(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD7(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD8(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD9(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD10(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD11(MonthClosingVO params);
	
	// TODO 월별 저자료 지출결의서
	public List<MonthClosingVO> selMonthlyRoyalty(MonthClosingVO params);
	
	// TODO 저자료 지급 내역 ??
	public List<MonthClosingVO> selRoyalty(MonthClosingVO params);
	
	// TODO 구매단가입력
	public List<MonthClosingVO> selPurchasePrice1(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice2(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice3(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice4(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice5(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice6(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice7(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice8(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice9(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice10(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice11(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice12(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice13(MonthClosingVO params);
	public List<MonthClosingVO> selPurchasePrice14(MonthClosingVO params);
	public int inPurchasePrice1(MonthClosingVO params);
	public int inPurchasePrice2(MonthClosingVO params);
	public int upPurchasePrice1(MonthClosingVO params);
	public int upPurchasePrice2(MonthClosingVO params);
	public int upPurchasePrice3(MonthClosingVO params);
	public int delPurchasePrice1(MonthClosingVO params);
	public int delPurchasePrice2(MonthClosingVO params);
	
	// TODO 도서 수량/금액 집계
	public List<MonthClosingVO> selBookQuantityAmountTotal1(MonthClosingVO params);
	public List<MonthClosingVO> selBookQuantityAmountTotal2(MonthClosingVO params);
	public List<MonthClosingVO> selBookQuantityAmountTotal3(MonthClosingVO params);
	public List<MonthClosingVO> selBookQuantityAmountTotal4(MonthClosingVO params);
	public List<MonthClosingVO> selBookQuantityAmountTotal5(MonthClosingVO params);
	public List<MonthClosingVO> selBookQuantityAmountTotal6(MonthClosingVO params);
	public int inBookQuantityAmountTotal1(MonthClosingVO params);
	public int inBookQuantityAmountTotal2(MonthClosingVO params);
	public int inBookQuantityAmountTotal3(MonthClosingVO params);
	public int upBookQuantityAmountTotal1(MonthClosingVO params);
	public int upBookQuantityAmountTotal2(MonthClosingVO params);
	public int upBookQuantityAmountTotal3(MonthClosingVO params);
	public int upBookQuantityAmountTotal4(MonthClosingVO params);
	public int upBookQuantityAmountTotal5(MonthClosingVO params);
	
	// TODO 도서금액집계
	public List<MonthClosingVO> selBookAmountTotal1(MonthClosingVO params);
	public List<MonthClosingVO> selBookAmountTotal2(MonthClosingVO params);
	public List<MonthClosingVO> selBookAmountTotal3(MonthClosingVO params);
	public int inBookAmountTotal1(MonthClosingVO params);
	public int upBookAmountTotal1(MonthClosingVO params);
	public int upBookAmountTotal2(MonthClosingVO params);
	
	// TODO 주은교육 제작현황
	public List<MonthClosingVO> selJueun(MonthClosingVO params);

}
