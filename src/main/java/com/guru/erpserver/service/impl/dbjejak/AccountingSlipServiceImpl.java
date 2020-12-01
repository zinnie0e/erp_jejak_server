package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.AccountingSlipService;
import com.guru.erpserver.mapper.dbjejak.AccountingSlipMapper;
import com.guru.erpserver.vo.dbjejak.AccountingSlipVO;
import com.guru.erpserver.vo.dbjejak.YongjiVO;
@Service
public class AccountingSlipServiceImpl implements AccountingSlipService {
	@Resource
	private AccountingSlipMapper accountingSlipDAO;

	// TODO 공통
	
	// TODO 회계전표
	@Override
	public List<AccountingSlipVO> selAccountingSlip1(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip1(params);
	}	
	@Override
	public List<AccountingSlipVO> selAccountingSlip1_1(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip1_1(params);
	}
	@Override
	public List<AccountingSlipVO> selAccountingSlip2(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip2(params);
	}	
	@Override
	public List<AccountingSlipVO> selAccountingSlip3(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip3(params);
	}
	@Override
	public List<AccountingSlipVO> selAccountingSlip4() throws Exception {
		return accountingSlipDAO.selAccountingSlip4();
	}
	@Override
	public List<AccountingSlipVO> selAccountingSlip5(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip5(params);
	}
	@Override
	public boolean delAccountingSlip1(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.delAccountingSlip1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<AccountingSlipVO> selAccountingSlip6(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip6(params);
	}
	@Override
	public List<AccountingSlipVO> selAccountingSlip7(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip7(params);
	}
	@Override
	public List<AccountingSlipVO> selAccountingSlip8_1(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip8_1(params);
	}	
	@Override
	public List<AccountingSlipVO> selAccountingSlip8_2(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip8_2(params);
	}	
	@Override
	public List<AccountingSlipVO> selAccountingSlip9(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip9(params);
	}
	@Override
	public boolean inAccountingSlip(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.inAccountingSlip(params);
		return (quert_result == 1) ? true : false;
	}

	// TODO 원천징수
	@Override
	public List<AccountingSlipVO> selWithholdingTax(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selWithholdingTax(params);
	}
	@Override
	public List<AccountingSlipVO> selWithholdingTax2(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selWithholdingTax2(params);
	}
	@Override
	public boolean inWithholdingTax(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.inWithholdingTax(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upWithholdingTax(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.upWithholdingTax(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean delWithholdingTax(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.delWithholdingTax(params);
		return (quert_result == 1) ? true : false;
	}
	
	// TODO 도서별 월별집계
	@Override
	public List<AccountingSlipVO> selMonthlySumByBook(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selMonthlySumByBook(params);
	}
	
	// TODO 년도별 월별집계
	@Override
	public List<AccountingSlipVO> selMonthlyAggregateByYear(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selMonthlyAggregateByYear(params);
	}	
	
	// TODO 도서별 제작현황
	@Override
	public List<AccountingSlipVO> selProductionByBook1(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selProductionByBook1(params);
	}
	@Override
	public List<AccountingSlipVO> selProductionByBook2(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selProductionByBook2(params);
	}
	@Override
	public List<AccountingSlipVO> selProductionByBook3(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selProductionByBook3(params);
	}
	@Override
	public List<AccountingSlipVO> selProductionByBook3_1(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selProductionByBook3_1(params);
	}
	@Override
	public List<AccountingSlipVO> selProductionByBook3_2(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selProductionByBook3_2(params);
	}
	@Override
	public List<AccountingSlipVO> selProductionByBook4(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selProductionByBook4(params);
	}
	@Override
	public List<AccountingSlipVO> selProductionByBook5(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selProductionByBook5(params);
	}
	
	// TODO 전기 이월 작업
	@Override
	public boolean createTableKTBKSyy0(AccountingSlipVO params) throws Exception { /*도서수량*/
		try { accountingSlipDAO.createTableKTBKSyy0(params); } 
		catch (Exception e) { e.printStackTrace(); return false; }
		return true;
	}
	@Override
	public boolean trunTableKTBKSyy0(AccountingSlipVO params) throws Exception {
		try { accountingSlipDAO.trunTableKTBKSyy0(params); } 
		catch (Exception e) { e.printStackTrace(); return false; }
		return true;
	}
	@Override
	public boolean trunTableKTTEMP1() throws Exception {
		try { accountingSlipDAO.trunTableKTTEMP1(); } 
		catch (Exception e) { e.printStackTrace(); return false; }
		return true;
	}
	@Override
	public List<AccountingSlipVO> selElecCarryoverWork1(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selElecCarryoverWork1(params);
	}
	@Override
	public boolean inElecCarryoverWork1(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.inElecCarryoverWork1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<AccountingSlipVO> selElecCarryoverWork2() throws Exception {
		return accountingSlipDAO.selElecCarryoverWork2();
	}
	@Override
	public List<AccountingSlipVO> selElecCarryoverWork3(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selElecCarryoverWork3(params);
	}
	@Override
	public boolean inElecCarryoverWork2_1(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.inElecCarryoverWork2_1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inElecCarryoverWork2_2(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.inElecCarryoverWork2_2(params);
		return (quert_result == 1) ? true : false;
	}
	
	@Override
	public boolean createTableKTBKKyy0(AccountingSlipVO params) throws Exception { /*도서금액*/
		try { accountingSlipDAO.createTableKTBKKyy0(params); } 
		catch (Exception e) { e.printStackTrace(); return false; }
		return true;
	}
	@Override
	public List<AccountingSlipVO> selElecCarryoverWork4(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selElecCarryoverWork4(params);
	}
	
	// TODO 미입고도서
	@Override
	public List<AccountingSlipVO> selBooksNotIn1() throws Exception {
		return accountingSlipDAO.selBooksNotIn1();
	}
	@Override
	public List<AccountingSlipVO> selBooksNotIn2() throws Exception {
		return accountingSlipDAO.selBooksNotIn2();
	}
	@Override
	public boolean turnBooksNotIn1() throws Exception {
		int quert_result = accountingSlipDAO.turnBooksNotIn1();
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<AccountingSlipVO> selBooksNotIn3(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selBooksNotIn3(params);
	}
	@Override
	public List<AccountingSlipVO> selBooksNotIn4(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selBooksNotIn4(params);
	}
	@Override
	public List<AccountingSlipVO> selBooksNotIn5(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selBooksNotIn5(params);
	}
	@Override
	public boolean inBooksNotIn1(AccountingSlipVO params) throws Exception {
		int quert_result = accountingSlipDAO.inBooksNotIn1(params);
		return (quert_result == 1) ? true : false;
	}
	
	// TODO 전도서재고조회
	@Override
	public List<AccountingSlipVO> selAllBooksStock1() throws Exception {
		return accountingSlipDAO.selAllBooksStock1();
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock1_2() throws Exception {
		return accountingSlipDAO.selAllBooksStock1_2();
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock1_3() throws Exception {
		return accountingSlipDAO.selAllBooksStock1_3();
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock1_4() throws Exception {
		return accountingSlipDAO.selAllBooksStock1_4();
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock1_5() throws Exception {
		return accountingSlipDAO.selAllBooksStock1_5();
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock1_6() throws Exception {
		return accountingSlipDAO.selAllBooksStock1_6();
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock2(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAllBooksStock2(params);
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock3(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAllBooksStock3(params);
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock4(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAllBooksStock4(params);
	}
	
	
}
