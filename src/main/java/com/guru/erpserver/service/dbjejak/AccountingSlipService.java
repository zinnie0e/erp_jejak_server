package com.guru.erpserver.service.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.AccountingSlipVO;
import com.guru.erpserver.vo.dbjejak.YongjiVO;

public interface AccountingSlipService {
	
	// TODO 회계전표
	List<AccountingSlipVO> selAccountingSlip1(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selAccountingSlip1_1(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selAccountingSlip2(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selAccountingSlip3(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selAccountingSlip4() throws Exception;
	List<AccountingSlipVO> selAccountingSlip5(AccountingSlipVO params) throws Exception;
	boolean delAccountingSlip1(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selAccountingSlip6(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selAccountingSlip7(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selAccountingSlip8_1(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selAccountingSlip8_2(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selAccountingSlip9(AccountingSlipVO params) throws Exception;
	boolean inAccountingSlip(AccountingSlipVO params) throws Exception;
	
	// TODO 원천징수
	List<AccountingSlipVO> selWithholdingTax(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selWithholdingTax2(AccountingSlipVO params) throws Exception;
	boolean inWithholdingTax(AccountingSlipVO params) throws Exception;
	boolean upWithholdingTax(AccountingSlipVO params) throws Exception;
	boolean delWithholdingTax(AccountingSlipVO params) throws Exception;
	
	// TODO 도서별 월별집계
	List<AccountingSlipVO> selMonthlySumByBook(AccountingSlipVO params) throws Exception;
	
	// TODO 년도별 월별집계
	List<AccountingSlipVO> selMonthlyAggregateByYear(AccountingSlipVO params) throws Exception;
	
	// TODO 도서별 제작현황
	List<AccountingSlipVO> selProductionByBook1(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selProductionByBook2(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selProductionByBook3(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selProductionByBook3_1(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selProductionByBook3_2(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selProductionByBook4(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selProductionByBook5(AccountingSlipVO params) throws Exception;
	
	// TODO 전기 이월 작업
	boolean createTableKTBKSyy0(AccountingSlipVO params) throws Exception; /*도서수량*/
	boolean trunTableKTBKSyy0(AccountingSlipVO params) throws Exception;
	boolean trunTableKTTEMP1() throws Exception;
	List<AccountingSlipVO> selElecCarryoverWork1(AccountingSlipVO params) throws Exception;
	boolean inElecCarryoverWork1(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selElecCarryoverWork2() throws Exception;
	List<AccountingSlipVO> selElecCarryoverWork3(AccountingSlipVO params) throws Exception;
	boolean inElecCarryoverWork2_1(AccountingSlipVO params) throws Exception;
	boolean inElecCarryoverWork2_2(AccountingSlipVO params) throws Exception;
	
	boolean createTableKTBKKyy0(AccountingSlipVO params) throws Exception; /*도서금액*/
	List<AccountingSlipVO> selElecCarryoverWork4(AccountingSlipVO params) throws Exception;
	
	// TODO 미입고도서
	List<AccountingSlipVO> selBooksNotIn1() throws Exception;
	List<AccountingSlipVO> selBooksNotIn2() throws Exception;
	boolean turnBooksNotIn1() throws Exception;
	List<AccountingSlipVO> selBooksNotIn3(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selBooksNotIn4(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selBooksNotIn5(AccountingSlipVO params) throws Exception;
	boolean inBooksNotIn1(AccountingSlipVO params) throws Exception;
	
	// TODO 전도서재고조회
	List<AccountingSlipVO> selAllBooksStock1() throws Exception;
	List<AccountingSlipVO> selAllBooksStock1_2() throws Exception;
	List<AccountingSlipVO> selAllBooksStock1_3() throws Exception;
	List<AccountingSlipVO> selAllBooksStock1_4() throws Exception;
	List<AccountingSlipVO> selAllBooksStock1_5() throws Exception;
	List<AccountingSlipVO> selAllBooksStock1_6() throws Exception;
	List<AccountingSlipVO> selAllBooksStock2(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selAllBooksStock3(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selAllBooksStock4(AccountingSlipVO params) throws Exception;

}
