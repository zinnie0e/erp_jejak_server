package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.AccountingSlipService;
import com.guru.erpserver.mapper.dbjejak.AccountingSlipMapper;
import com.guru.erpserver.vo.dbjejak.AccountingSlipVO;
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
	public List<AccountingSlipVO> selAccountingSlip2(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip2(params);
	}	
	@Override
	public List<AccountingSlipVO> selAccountingSlip3(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAccountingSlip3(params);
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
	
	// TODO 미입고도서
	@Override
	public List<AccountingSlipVO> selBooksNotIn1() throws Exception {
		return accountingSlipDAO.selBooksNotIn1();
	}
	@Override
	public List<AccountingSlipVO> selBooksNotIn2() throws Exception {
		return accountingSlipDAO.selBooksNotIn2();
	}
	
	// TODO 전도서재고조회
	@Override
	public List<AccountingSlipVO> selAllBooksStock1() throws Exception {
		return accountingSlipDAO.selAllBooksStock1();
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock2(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAllBooksStock2(params);
	}
	@Override
	public List<AccountingSlipVO> selAllBooksStock3(AccountingSlipVO params) throws Exception {
		return accountingSlipDAO.selAllBooksStock3(params);
	}
	
}
