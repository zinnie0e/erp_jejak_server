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
	
	// TODO 잡물 원가계산서
		public List<MonthClosingVO> selJMCostStatement1(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement2(MonthClosingVO params);
	public List<MonthClosingVO> selJMCostStatement3(MonthClosingVO params);
	
	// TODO 품목별 원재료명세서(월별)
	public List<MonthClosingVO> selPumMon1(MonthClosingVO params);
	public List<MonthClosingVO> selPumMon2();
	public List<MonthClosingVO> selPumMon3(MonthClosingVO params);
	public int inPumMon1(MonthClosingVO params);
	
	// TODO 품목별 원재료명세서(기간)
	public List<MonthClosingVO> selPumPer1(MonthClosingVO params);
	
	// TODO 저자료 지급 내역(상/하)
	public List<MonthClosingVO> selRoyaltyUD1(MonthClosingVO params);
	public List<MonthClosingVO> selRoyaltyUD2(MonthClosingVO params);
	
	// TODO 월별 저자료 지출결의서
	public List<MonthClosingVO> selMonthlyRoyalty(MonthClosingVO params);
	
	// TODO 저자료 지급 내역 ??
	public List<MonthClosingVO> selRoyalty(MonthClosingVO params);
	
	// TODO 주은교육 제작현황
	public List<MonthClosingVO> selJueun(MonthClosingVO params);

}