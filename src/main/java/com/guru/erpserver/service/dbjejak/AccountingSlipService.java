package com.guru.erpserver.service.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.AccountingSlipVO;

public interface AccountingSlipService {
	
	// TODO 회계전표
	List<AccountingSlipVO> selAccountingSlip1(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selAccountingSlip2(AccountingSlipVO params) throws Exception;	
	List<AccountingSlipVO> selAccountingSlip3(AccountingSlipVO params) throws Exception;	
	
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
	
	// TODO 미입고도서
	List<AccountingSlipVO> selBooksNotIn1() throws Exception;
	List<AccountingSlipVO> selBooksNotIn2() throws Exception;
	
	// TODO 전도서재고조회
	List<AccountingSlipVO> selAllBooksStock1() throws Exception;
	List<AccountingSlipVO> selAllBooksStock2(AccountingSlipVO params) throws Exception;
	List<AccountingSlipVO> selAllBooksStock3(AccountingSlipVO params) throws Exception;
}
