package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.AccountingSlipVO;

@Mapper
public interface AccountingSlipMapper {
	// TODO 공통
	
	// TODO 회계전표
	public List<AccountingSlipVO> selAccountingSlip1(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip2(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip3(AccountingSlipVO params);
	
	// TODO 원천징수
	public List<AccountingSlipVO> selWithholdingTax(AccountingSlipVO params);
	public List<AccountingSlipVO> selWithholdingTax2(AccountingSlipVO params);
	public int inWithholdingTax(AccountingSlipVO params);
	public int upWithholdingTax(AccountingSlipVO params);
	public int delWithholdingTax(AccountingSlipVO params);
	
	// TODO 도서별 월별집계
	public List<AccountingSlipVO> selMonthlySumByBook(AccountingSlipVO params);
	
	// TODO 년도별 월별집계
	public List<AccountingSlipVO> selMonthlyAggregateByYear(AccountingSlipVO params);
	
	// TODO 도서별 제작현황
	public List<AccountingSlipVO> selProductionByBook1(AccountingSlipVO params);
	public List<AccountingSlipVO> selProductionByBook2(AccountingSlipVO params);
	public List<AccountingSlipVO> selProductionByBook3(AccountingSlipVO params);
	public List<AccountingSlipVO> selProductionByBook3_1(AccountingSlipVO params);
	public List<AccountingSlipVO> selProductionByBook3_2(AccountingSlipVO params);
	public List<AccountingSlipVO> selProductionByBook4(AccountingSlipVO params);
	public List<AccountingSlipVO> selProductionByBook5(AccountingSlipVO params);
	
	// TODO 미입고도서
	public List<AccountingSlipVO> selBooksNotIn1();
	public List<AccountingSlipVO> selBooksNotIn2();
	
	// TODO 전도서재고조회
	public List<AccountingSlipVO> selAllBooksStock1();
	public List<AccountingSlipVO> selAllBooksStock2(AccountingSlipVO params);
	public List<AccountingSlipVO> selAllBooksStock3(AccountingSlipVO params);
	
}
