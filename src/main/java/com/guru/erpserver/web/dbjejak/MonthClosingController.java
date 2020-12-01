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

import com.guru.erpserver.service.dbjejak.MonthClosingService;
import com.guru.erpserver.vo.dbjejak.MonthClosingVO;

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
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement4", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement4(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement5", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement5(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement6", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement6(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement7", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement7(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement8", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement8(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement9", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement9(params);
	}
	// 입력 m3
	@RequestMapping(value = "/monthclosing/select_bookcost_statement10", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement10(params);
	}
	// 입력 bur_uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement11", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement11(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement11(params);
	}
	// 입력 bur_uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement12", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement12(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement12(params);
	}
	// 입력 jebon
	@RequestMapping(value = "/monthclosing/select_bookcost_statement13", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement13(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement13(params);
	}
	// 입력 bur_uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement14", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement14(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement14(params);
	}
	
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement15", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement15(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement15(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement16", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement16(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement16(params);
	}
	
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement17", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement17(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement17(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement18", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement18(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement18(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/insert_bookcost_statement19", method = RequestMethod.POST)
	public List<MonthClosingVO> inBookCostStatement19(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inBookCostStatement19(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/up_bookcost_statement20", method = RequestMethod.POST)
	public List<MonthClosingVO> upBookCostStatement20(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement20(params);
	}
	// 입력 bookcode
	@RequestMapping(value = "/monthclosing/select_bookcost_statement21", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement21(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement21(params);
	}
	// 입력 bookcode
	@RequestMapping(value = "/monthclosing/select_bookcost_statement22", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement22(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement22(params);
	}
	// 입력 bookcode
	@RequestMapping(value = "/monthclosing/select_bookcost_statement23", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement23(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement23(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement24", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement24(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement24(params);
	}
	
	// 입력 tdate1, tdate2
	@RequestMapping(value = "/monthclosing/select_bookcost_statement25", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement25(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement25(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement26", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement26(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement26(params);
	}
	// 입력 bur_uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement27", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement27(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement27(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement28", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement28(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement28(params);
	}
	// 입력 bur_uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement29", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement29(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement29(params);
	}
	// 입력 bookcode
	@RequestMapping(value = "/monthclosing/select_bookcost_statement30", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement30(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement30(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement31", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement31(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement31(params);
	}
	// 입력 date
	@RequestMapping(value = "/monthclosing/select_bookcost_statement32", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement32(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement32(params);
	}
	// 입력 mrow
	@RequestMapping(value = "/monthclosing/select_bookcost_statement33", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement33(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement33(params);
	}
	// 입력 jcode
	@RequestMapping(value = "/monthclosing/select_bookcost_statement34", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement34(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement34(params);
	}
	// 입력 new_cost, row
	@RequestMapping(value = "/monthclosing/update_bookcost_statement35", method = RequestMethod.POST)
	public List<MonthClosingVO> upBookCostStatement35(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement35(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement36", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement36(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement36(params);
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
	// 입력 : tdat1, tdate2
	@RequestMapping(value = "/monthclosing/select_jmcost_statement4", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement4(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement5", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement5(params);
	}
	// 입력 : m1
	@RequestMapping(value = "/monthclosing/select_jmcost_statement6", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement6(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement7", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement7(params);
	}
	// 입력 : m3
	@RequestMapping(value = "/monthclosing/select_jmcost_statement8", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement8(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement9", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement9(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement10", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement10(params);
	}
	// 입력 : m3
	@RequestMapping(value = "/monthclosing/select_jmcost_statement11", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement11(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement11(params);
	}
	// 입력 : m8, uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement12", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement12(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement12(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement13", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement13(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement13(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement14", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement14(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement14(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement15", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement15(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement15(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_jmcost_statement16", method = RequestMethod.POST)
	public List<MonthClosingVO> selJMCostStatement16(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJMCostStatement16(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/insert_jmcost_statement17", method = RequestMethod.POST)
	public List<MonthClosingVO> inJMCostStatement17(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inJMCostStatement17(params);
	}
	// 입력 : total_cost, total_danga, uid
	@RequestMapping(value = "/monthclosing/update_jmcost_statement18", method = RequestMethod.POST)
	public List<MonthClosingVO> upJMCostStatement18(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upJMCostStatement18(params);
	}
	
	// TODO 품목별 원재료명세서(월별)
	// 입력 : msdate
	@RequestMapping(value = "/monthclosing/select_pum_mon1", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon1(params);
	}
	@RequestMapping(value = "/monthclosing/select_pum_mon2", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon2() throws Exception {
		return monthClosingSVC.selPumMon2();
	}
	// 입력 : msdate
	@RequestMapping(value = "/monthclosing/select_pum_mon3", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon3(params);
	}
	// 입력 : x
	@RequestMapping(value = "/monthclosing/select_pum_mon4", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon4(params);
	}
	// 입력 : msdate
	@RequestMapping(value = "/monthclosing/select_pum_mon5", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon5(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_pum_mon6", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon6(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_pum_mon7", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon7(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_pum_mon8", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon8(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_pum_mon9", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon9(params);
	}
	// 입력 : bdate, yjcode
	@RequestMapping(value = "/monthclosing/select_pum_mon10", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon10(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_pum_mon11", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon11(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon11(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_pum_mon12", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon12(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon12(params);
	}
	// 입력 : bdate, jcode
	@RequestMapping(value = "/monthclosing/select_pum_mon13", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon13(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon13(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_pum_mon14", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon14(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon14(params);
	}
	// 입력 : bdate, yjcode
	@RequestMapping(value = "/monthclosing/select_pum_mon15", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon15(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon15(params);
	}
	// 입력 : msdate
	@RequestMapping(value = "/monthclosing/select_pum_mon16", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumMon16(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumMon16(params);
	}
	// 입력 : msdate
	@RequestMapping(value="/monthclosing/insert_pum_mon1", method=RequestMethod.POST)
	public boolean inPumMon1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inPumMon1(params);
	}
	// 입력 : bdate, wjcode
	@RequestMapping(value="/monthclosing/insert_pum_mon2", method=RequestMethod.POST)
	public boolean inPumMon2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inPumMon2(params);
	}
	// 입력 : bdate
	@RequestMapping(value="/monthclosing/update_pum_mon1", method=RequestMethod.POST)
	public boolean upPumMon1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon1(params);
	}
	// 입력 : qnty1, amnt1, yjcode, bdate
	@RequestMapping(value="/monthclosing/update_pum_mon2", method=RequestMethod.POST)
	public boolean upPumMon2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon2(params);
	}
	// 입력 : nsum, psum, jicode, bdate
	@RequestMapping(value="/monthclosing/update_pum_mon3", method=RequestMethod.POST)
	public boolean upPumMon3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon3(params);
	}
	// 입력 : new_q, new_a, uid
	@RequestMapping(value="/monthclosing/update_pum_mon4", method=RequestMethod.POST)
	public boolean upPumMon4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon4(params);
	}
	// 입력 : new_q, new_a, uid
	@RequestMapping(value="/monthclosing/update_pum_mon5", method=RequestMethod.POST)
	public boolean upPumMon5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon5(params);
	}
	// 입력 : new_q, uid
	@RequestMapping(value="/monthclosing/update_pum_mon6", method=RequestMethod.POST)
	public boolean upPumMon6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon6(params);
	}
	// 입력 : new_a, uid
	@RequestMapping(value="/monthclosing/update_pum_mon7", method=RequestMethod.POST)
	public boolean upPumMon7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon7(params);
	}
	// 입력 : new_a, uid
	@RequestMapping(value="/monthclosing/update_pum_mon8", method=RequestMethod.POST)
	public boolean upPumMon8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon8(params);
	}
	// 입력 : new_val, uid
	@RequestMapping(value="/monthclosing/update_pum_mon9", method=RequestMethod.POST)
	public boolean upPumMon9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon9(params);
	}
	// 입력 : new_q, new_a, uid
	@RequestMapping(value="/monthclosing/update_pum_mon10", method=RequestMethod.POST)
	public boolean upPumMon10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPumMon10(params);
	}
	
	// TODO 품목별 원재료명세서(기간)
	// 입력 : msdate
	@RequestMapping(value = "/monthclosing/select_pum_per1", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumPer1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumPer1(params);
	}
	// 입력 : x
	@RequestMapping(value = "/monthclosing/select_pum_per2", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumPer2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumPer2(params);
	}
	// 입력 : yjcode, msdate
	@RequestMapping(value = "/monthclosing/select_pum_per3", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumPer3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumPer3(params);
	}
	// 입력 : yjcode, msdate
	@RequestMapping(value = "/monthclosing/select_pum_per4", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumPer4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumPer4(params);
	}
	// 입력 : yjcode, msdate
	@RequestMapping(value = "/monthclosing/select_pum_per5", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumPer5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumPer5(params);
	}
	// 입력 : yjcode, bdate, qnty1, amnt1, qnty2, amnt2, qnty3, amnt3, qnty4, amnt4
	@RequestMapping(value="/monthclosing/insert_pum_per1", method=RequestMethod.POST)
	public boolean inPumPer1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inPumPer1(params);
	}
	// 입력 : yjcode, tmon1, tmon2
		@RequestMapping(value="/monthclosing/delete_pum_per1", method=RequestMethod.POST)
		public boolean delPumPer1(@RequestBody MonthClosingVO params) throws Exception {
			return monthClosingSVC.delPumPer1(params);
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
	// 입력 : 
	@RequestMapping(value = "/monthclosing/select_royalty_ud3", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD3(params);
	}
	// 입력 : 
	@RequestMapping(value = "/monthclosing/select_royalty_ud4", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD4(params);
	}
	// 입력 : jname
	@RequestMapping(value = "/monthclosing/select_royalty_ud5", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD5(params);
	}
	// 입력 : dbname, sbbook
	@RequestMapping(value = "/monthclosing/select_royalty_ud6", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD6(params);
	}
	// 입력 : dbname, sbbook
	@RequestMapping(value = "/monthclosing/select_royalty_ud7", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD7(params);
	}
	// 입력 : jname
	@RequestMapping(value = "/monthclosing/select_royalty_ud8", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD8(params);
	}
	// 입력 : dbname, sbbook
	@RequestMapping(value = "/monthclosing/select_royalty_ud9", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD9(params);
	}
	// 입력 : dbname, sbbook
	@RequestMapping(value = "/monthclosing/select_royalty_ud10", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD10(params);
	}
	// 입력 : jname
	@RequestMapping(value = "/monthclosing/select_royalty_ud11", method = RequestMethod.POST)
	public List<MonthClosingVO> selRoyaltyUD11(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selRoyaltyUD11(params);
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
	
	// TODO 구매단가입력
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_PurchasePrice1", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice1(params);
	} 
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_PurchasePrice2", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice2(params);
	} 
	// 입력 : bdate
	@RequestMapping(value = "/monthclosing/select_PurchasePrice3", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice3(params);
	} 
	// 입력 : dbname, juid
	@RequestMapping(value = "/monthclosing/select_PurchasePrice4", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice4(params);
	} 
	// 입력 : juid, bdate
	@RequestMapping(value = "/monthclosing/select_PurchasePrice5", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice5(params);
	} 
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_PurchasePrice6", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice6(params);
	} 
	// 입력 : dbname, bookcode, inum, idate
	@RequestMapping(value = "/monthclosing/select_PurchasePrice7", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice7(params);
	} 
	// 입력 : bdate, juid
	@RequestMapping(value = "/monthclosing/select_PurchasePrice8", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice8(params);
	} 
	// 입력 : dbname
	@RequestMapping(value = "/monthclosing/select_PurchasePrice9", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice9(params);
	} 
	// 입력 : dbname, bookcode, tbmgubn
	@RequestMapping(value = "/monthclosing/select_PurchasePrice10", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice10(params);
	} 
	// 입력 : dbname, bookcode, tbmgubn
	@RequestMapping(value = "/monthclosing/select_PurchasePrice11", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice11(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice11(params);
	} 
	// 입력 : bookcode, date1
	@RequestMapping(value = "/monthclosing/select_PurchasePrice12", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice12(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice12(params);
	} 
	// 입력 : dbname
	@RequestMapping(value = "/monthclosing/select_PurchasePrice13", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice13(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice13(params);
	} 
	// 입력 : s1book, date1
	@RequestMapping(value = "/monthclosing/select_PurchasePrice14", method = RequestMethod.POST)
	public List<MonthClosingVO> selPurchasePrice14(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPurchasePrice14(params);
	} 
	// 입력 : bdate, seqno, acctcode, type, debit, credit, descript, inum, idanga, juid, fchk
	@RequestMapping(value="/monthclosing/insert_PurchasePrice1", method=RequestMethod.POST)
	public boolean inPurchasePrice1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inPurchasePrice1(params);
	}
	// 입력 : dbname, bookcode, date1, new_danga
	@RequestMapping(value="/monthclosing/insert_PurchasePrice2", method=RequestMethod.POST)
	public boolean inPurchasePrice2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inPurchasePrice2(params);
	}
	// 입력 : new_danga, uid
	@RequestMapping(value="/monthclosing/update_PurchasePrice1", method=RequestMethod.POST)
	public boolean upPurchasePrice1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPurchasePrice1(params);
	}
	// 입력 : dbname, new_danga, s1amnt, uid
	@RequestMapping(value="/monthclosing/update_PurchasePrice2", method=RequestMethod.POST)
	public boolean upPurchasePrice2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPurchasePrice2(params);
	}
	// 입력 : dbname, s1dang, s1amnt, uid
	@RequestMapping(value="/monthclosing/update_PurchasePrice3", method=RequestMethod.POST)
	public boolean upPurchasePrice3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upPurchasePrice3(params);
	}
	// 입력 : uid
	@RequestMapping(value="/monthclosing/delete_PurchasePrice1", method=RequestMethod.POST)
	public boolean delPurchasePrice1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.delPurchasePrice1(params);
	}
	// 입력 : bdate
	@RequestMapping(value="/monthclosing/delete_PurchasePrice2", method=RequestMethod.POST)
	public boolean delPurchasePrice2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.delPurchasePrice2(params);
	}
	
	//TODO 도서 수량/금액 집계
	// 입력 : dbname
	@RequestMapping(value = "/monthclosing/select_BookQuantityAmount_Total1", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookQuantityAmountTotal1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookQuantityAmountTotal1(params);
	}
	// 입력 : dbname2
	@RequestMapping(value = "/monthclosing/select_BookQuantityAmount_Total2", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookQuantityAmountTotal2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookQuantityAmountTotal2(params);
	}
	// 입력 : dbname3, s1book
	@RequestMapping(value = "/monthclosing/select_BookQuantityAmount_Total3", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookQuantityAmountTotal3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookQuantityAmountTotal3(params);
	}
	// 입력 : dbname3, s1book, tm
	@RequestMapping(value = "/monthclosing/select_BookQuantityAmount_Total4", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookQuantityAmountTotal4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookQuantityAmountTotal4(params);
	}
	// 입력 : s1book, ty
	@RequestMapping(value = "/monthclosing/select_BookQuantityAmount_Total5", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookQuantityAmountTotal5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookQuantityAmountTotal5(params);
	}
	// 입력 : s1book, ty
	@RequestMapping(value = "/monthclosing/select_BookQuantityAmount_Total6", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookQuantityAmountTotal6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookQuantityAmountTotal6(params);
	}

	// 입력 : dbname2, s1book, tbmgubn
	@RequestMapping(value="/monthclosing/insert_BookQuantityAmount_Total1", method=RequestMethod.POST)
	public boolean inBookQuantityAmountTotal1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inBookQuantityAmountTotal1(params);
	}
	// 입력 : dbname2, fieldname, s1book, tm, sum1
	@RequestMapping(value="/monthclosing/insert_BookQuantityAmount_Total2", method=RequestMethod.POST)
	public boolean inBookQuantityAmountTotal2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inBookQuantityAmountTotal2(params);
	}
	// 입력 : dbname3, s1book, kk
	@RequestMapping(value="/monthclosing/insert_BookQuantityAmount_Total3", method=RequestMethod.POST)
	public boolean inBookQuantityAmountTotal3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inBookQuantityAmountTotal3(params);
	}
	// 입력 : dbname2, tm
	@RequestMapping(value="/monthclosing/update_BookQuantityAmount_Total1", method=RequestMethod.POST)
	public boolean upBookQuantityAmountTotal1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookQuantityAmountTotal1(params);
	}
	// 입력 : dbname3, tm 
	@RequestMapping(value="/monthclosing/update_BookQuantityAmount_Total2", method=RequestMethod.POST)
	public boolean upBookQuantityAmountTotal2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookQuantityAmountTotal2(params);
	}
	// 입력 : dbname3, tm 
	@RequestMapping(value="/monthclosing/update_BookQuantityAmount_Total3", method=RequestMethod.POST)
	public boolean upBookQuantityAmountTotal3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookQuantityAmountTotal3(params);
	}
	// 입력 : dbname, fieldname, sum2, s1book, tm
	@RequestMapping(value="/monthclosing/update_BookQuantityAmount_Total4", method=RequestMethod.POST)
	public boolean upBookQuantityAmountTotal4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookQuantityAmountTotal4(params);
	}
	// 입력 : dbname3, fieldname, new_val, s1book, tm
	@RequestMapping(value="/monthclosing/update_BookQuantityAmount_Total5", method=RequestMethod.POST)
	public boolean upBookQuantityAmountTotal5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookQuantityAmountTotal5(params);
	}
	
	// TODO 도서금액집계
	// 입력 : dbname
	@RequestMapping(value = "/monthclosing/select_BookAmount_Total1", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookAmountTotal1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookAmountTotal1(params);
	}
	// 입력 : s1book, ty
	@RequestMapping(value = "/monthclosing/select_BookAmount_Total2", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookAmountTotal2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookAmountTotal2(params);
	}
	// 입력 : dbname2, s1book, tm
	@RequestMapping(value = "/monthclosing/select_BookAmount_Total3", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookAmountTotal3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookAmountTotal3(params);
	}
	// 입력 : dbname2, sum2, s1book, tm 
	@RequestMapping(value="/monthclosing/update_BookAmount_Total1", method=RequestMethod.POST)
	public boolean upBookAmountTotal1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookAmountTotal1(params);
	}
	// 입력 : dbname2, sum2, s1book, tm 
	@RequestMapping(value="/monthclosing/update_BookAmount_Total2", method=RequestMethod.POST)
	public boolean upBookAmountTotal2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookAmountTotal2(params);
	}
	
	// TODO 주은교육 제작현황
	// 입력 : date1, date2
	@RequestMapping(value = "/monthclosing/select_monthclosing_jueun", method = RequestMethod.POST)
	public List<MonthClosingVO> selJueun(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selJueun(params);
	}
}
