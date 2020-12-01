package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.AccountingSlipVO;
import com.guru.erpserver.vo.dbjejak.YongjiVO;

@Mapper
public interface AccountingSlipMapper {
	// TODO 공통
	
	// TODO 회계전표
	public List<AccountingSlipVO> selAccountingSlip1(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip1_1(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip2(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip3(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip4();
	public List<AccountingSlipVO> selAccountingSlip5(AccountingSlipVO params);
	public int delAccountingSlip1(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip6(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip7(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip8_1(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip8_2(AccountingSlipVO params);
	public List<AccountingSlipVO> selAccountingSlip9(AccountingSlipVO params);
	public int inAccountingSlip(AccountingSlipVO params);
	
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
	
	// TODO 전기 이월 작업
	public Integer createTableKTBKSyy0(AccountingSlipVO params); /*도서수량*/
	public Integer trunTableKTBKSyy0(AccountingSlipVO params);
	public Integer trunTableKTTEMP1();
	public List<AccountingSlipVO> selElecCarryoverWork1(AccountingSlipVO params);
	public int inElecCarryoverWork1(AccountingSlipVO params);
	public List<AccountingSlipVO> selElecCarryoverWork2();
	public List<AccountingSlipVO> selElecCarryoverWork3(AccountingSlipVO params);
	public int inElecCarryoverWork2_1(AccountingSlipVO params);
	public int inElecCarryoverWork2_2(AccountingSlipVO params);
	
	public Integer createTableKTBKKyy0(AccountingSlipVO params); /*도서금액*/
	public List<AccountingSlipVO> selElecCarryoverWork4(AccountingSlipVO params);
	
	// TODO 미입고도서
	public List<AccountingSlipVO> selBooksNotIn1();
	public List<AccountingSlipVO> selBooksNotIn2();
	public Integer turnBooksNotIn1();
	public List<AccountingSlipVO> selBooksNotIn3(AccountingSlipVO params);
	public List<AccountingSlipVO> selBooksNotIn4(AccountingSlipVO params);
	public List<AccountingSlipVO> selBooksNotIn5(AccountingSlipVO params);
	public int inBooksNotIn1(AccountingSlipVO params);
	
	// TODO 전도서재고조회
	public List<AccountingSlipVO> selAllBooksStock1();
	public List<AccountingSlipVO> selAllBooksStock1_2();
	public List<AccountingSlipVO> selAllBooksStock1_3();
	public List<AccountingSlipVO> selAllBooksStock1_4();
	public List<AccountingSlipVO> selAllBooksStock1_5();
	public List<AccountingSlipVO> selAllBooksStock1_6();
	public List<AccountingSlipVO> selAllBooksStock2(AccountingSlipVO params);
	public List<AccountingSlipVO> selAllBooksStock3(AccountingSlipVO params);
	public List<AccountingSlipVO> selAllBooksStock4(AccountingSlipVO params);
	
}
