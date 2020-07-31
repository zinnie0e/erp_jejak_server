package com.guru.erpserver.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.MonthClosingVO;

public interface MonthClosingService {
	
	// TODO 도서별 원가계산서
	List<MonthClosingVO> selBookCostStatement1(MonthClosingVO params) throws Exception;	
	List<MonthClosingVO> selBookCostStatement2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selBookCostStatement3(MonthClosingVO params) throws Exception;
	
	// TODO 잡물 원가계산서
	List<MonthClosingVO> selJMCostStatement1(MonthClosingVO params) throws Exception;	
	List<MonthClosingVO> selJMCostStatement2(MonthClosingVO params) throws Exception;
	List<MonthClosingVO> selJMCostStatement3(MonthClosingVO params) throws Exception;

	// TODO 저자료 지급 내역(상/하)
	List<MonthClosingVO> selRoyaltyUD1(MonthClosingVO params) throws Exception;	
	List<MonthClosingVO> selRoyaltyUD2(MonthClosingVO params) throws Exception;

	
	// TODO 월별 저자료 지출결의서
	List<MonthClosingVO> selMonthlyRoyalty(MonthClosingVO params) throws Exception;
	
	// TODO 저자료 지급 내역??
	List<MonthClosingVO> selRoyalty(MonthClosingVO params) throws Exception;
	
	// TODO 주은교육 제작현황
	List<MonthClosingVO> selJueun(MonthClosingVO params) throws Exception;
}
