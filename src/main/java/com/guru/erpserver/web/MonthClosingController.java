package com.guru.erpserver.web;

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

import com.guru.erpserver.service.MonthClosingService;
import com.guru.erpserver.vo.CustomerVO;
import com.guru.erpserver.vo.MonthClosingVO;
import com.guru.erpserver.vo.JmJejakVO;
import com.guru.erpserver.vo.Yongji.YongjiVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class MonthClosingController {
	@Resource
	private MonthClosingService monthClosingSVC;
	
	// TODO 공통 
	
	// TODO 도서별 원가계산서
	// 입력 : date1, date2
	@RequestMapping(value = "/monthclosing/select_bookcost_statement1", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement1(params);
	}
	// 입력 : date1, date2, lm_s, lm_t
	@RequestMapping(value = "/monthclosing/select_bookcost_statement2", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement2(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement3", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement3(params);
	}
	
	// TODO 잡물 원가계산서
	// 입력 : date1, date2
	@RequestMapping(value = "/monthclosing/select_jmcost_statement1", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement1(params);
	}
	// 입력 : date1, date2, lm_s, lm_t
	@RequestMapping(value = "/monthclosing/select_jmcost_statement2", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement2(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement3", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement3(params);
	}
	
	
	// TODO 저자료 지급 내역(상/하)
	// 입력 : dbattr
	@RequestMapping(value = "/monthclosing/select_royalty_ud1", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD1(params);
	}
	// 입력 : dbname, sbbook
	@RequestMapping(value = "/monthclosing/select_royalty_ud2", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD2(params);
	}

	

	
	// TODO 월별 저자료 지출결의서
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_monthly_royalty", method = RequestMethod.POST)
	public List<MonthClosingVO> selMonthlyRoyalty(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMonthlyRoyalty(params);
	}
	
	// TODO 저자료 지급 내역??
	// 입력 : dbname
	@RequestMapping(value = "/monthclosing/select_royalty", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyalty(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyalty(params);
	}
	
	// TODO 주은교육 제작현황
	// 입력 : date1, date2
	@RequestMapping(value = "/monthclosing/select_monthclosing_jueun", method = RequestMethod.POST)
	public List<MonthClosingVO> selJueun(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJueun(params);
	}
}
