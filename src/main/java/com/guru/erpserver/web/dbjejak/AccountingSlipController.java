package com.guru.erpserver.web.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.dbjejak.AccountingSlipService;
import com.guru.erpserver.vo.dbjejak.AccountingSlipVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class AccountingSlipController {
	@Resource
	private AccountingSlipService accountingSlipSVC;
	
	// TODO 공통 
	
	// TODO 회계전표
	// 입력 : ymd
	@RequestMapping(value = "/accountingslip/select_accounting_slip1", method = RequestMethod.POST)
	public List<AccountingSlipVO> selAccountingSlip1(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selAccountingSlip1(params);
	}	
	// 입력 : jeuid, ymd
	@RequestMapping(value = "/accountingslip/select_accounting_slip2", method = RequestMethod.POST)
	public List<AccountingSlipVO> selAccountingSlip2(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selAccountingSlip2(params);
	}	
	// 입력 : paruid
	@RequestMapping(value = "/accountingslip/select_accounting_slip3", method = RequestMethod.POST)
	public List<AccountingSlipVO> selAccountingSlip3(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selAccountingSlip3(params);
	}
	
	// TODO 원천징수
	@RequestMapping(value = "/accountingslip/select_withholding_tax", method = RequestMethod.POST)
	public List<AccountingSlipVO> selWithholdingTax(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selWithholdingTax(params);
	}
	@RequestMapping(value = "/accountingslip/select_withholding_tax2", method = RequestMethod.POST)
	public List<AccountingSlipVO> selWithholdingTax2(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selWithholdingTax2(params);
	}
	@RequestMapping(value="/accountingslip/insert_withholding_tax", method=RequestMethod.POST)
	public boolean inWithholdingTax(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.inWithholdingTax(params);
	}
	@RequestMapping(value="/accountingslip/update_withholding_tax", method=RequestMethod.POST)
	public boolean upWithholdingTax(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.upWithholdingTax(params);
	}
	@RequestMapping(value="/accountingslip/delete_withholding_tax", method=RequestMethod.POST)
	public boolean delWithholdingTax(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.delWithholdingTax(params);
	}
	
	// TODO 도서별 월별집계
	// 입력 : year, month, bookcode
	@RequestMapping(value = "/accountingslip/select_monthly_sum_bybook", method = RequestMethod.POST)
	public List<AccountingSlipVO> selMonthlySumByBook(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selMonthlySumByBook(params);
	}
	
	// TODO 년도별 월별집계
	// 입력 : year, month
	@RequestMapping(value = "/accountingslip/select_monthlyaggregate_byyear", method = RequestMethod.POST)
	public List<AccountingSlipVO> selMonthlyAggregateByYear(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selMonthlyAggregateByYear(params);
	}
	
	// TODO 도서별 제작현황
	// 입력 : sbbook
	@RequestMapping(value = "/accountingslip/select_production_bybook1", method = RequestMethod.POST)
	public List<AccountingSlipVO> selProductionByBook1(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selProductionByBook1(params);
	}
	// 입력 : bcode
	@RequestMapping(value = "/accountingslip/select_production_bybook2", method = RequestMethod.POST)
	public List<AccountingSlipVO> selProductionByBook2(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selProductionByBook2(params);
	}
	// 입력 : listid
	@RequestMapping(value = "/accountingslip/select_production_bybook3", method = RequestMethod.POST)
	public List<AccountingSlipVO> selProductionByBook3(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selProductionByBook3(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/accountingslip/select_production_bybook3_1", method = RequestMethod.POST)
	public List<AccountingSlipVO> selProductionByBook3_1(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selProductionByBook3_1(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/accountingslip/select_production_bybook3_2", method = RequestMethod.POST)
	public List<AccountingSlipVO> selProductionByBook3_2(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selProductionByBook3_2(params);
	}
	// 입력 : uid2
	@RequestMapping(value = "/accountingslip/select_production_bybook4", method = RequestMethod.POST)
	public List<AccountingSlipVO> selProductionByBook4(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selProductionByBook4(params);
	}
	// 입력 : wwbook
	@RequestMapping(value = "/accountingslip/select_production_bybook5", method = RequestMethod.POST)
	public List<AccountingSlipVO> selProductionByBook5(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selProductionByBook5(params);
	}
	
	// TODO 미입고도서
	@RequestMapping(value = "/accountingslip/select_books_notin1", method = RequestMethod.POST)
	public List<AccountingSlipVO> selBooksNotIn1() throws Exception {
		return accountingSlipSVC.selBooksNotIn1();
	}
	@RequestMapping(value = "/accountingslip/select_books_notin2", method = RequestMethod.POST)
	public List<AccountingSlipVO> selBooksNotIn2() throws Exception {
		return accountingSlipSVC.selBooksNotIn2();
	}
	
	// TODO 전도서재고조회
	@RequestMapping(value = "/accountingslip/select_allbooks_stock1", method = RequestMethod.POST)
	public List<AccountingSlipVO> selAllBooksStock1() throws Exception {
		return accountingSlipSVC.selAllBooksStock1();
	}
	// 입력 : sbbook
	@RequestMapping(value = "/accountingslip/select_allbooks_stock2", method = RequestMethod.POST)
	public List<AccountingSlipVO> selAllBooksStock2(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selAllBooksStock2(params);
	}
	// 입력 : sbbook
	@RequestMapping(value = "/accountingslip/select_allbooks_stock3", method = RequestMethod.POST)
	public List<AccountingSlipVO> selAllBooksStock3(@RequestBody AccountingSlipVO params) throws Exception {
		return accountingSlipSVC.selAllBooksStock3(params);
	}
}
