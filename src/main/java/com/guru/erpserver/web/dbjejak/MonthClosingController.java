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
	@RequestMapping(value="/monthclosing/insert_bookcost_statement19", method=RequestMethod.POST)
	public boolean inBookCostStatement19(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inBookCostStatement19(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/update_bookcost_statement20", method = RequestMethod.POST)
	public boolean upBookCostStatement20(@RequestBody MonthClosingVO params) throws Exception {
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
	// 입력 uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement35", method=RequestMethod.POST)
	public boolean upBookCostStatement35(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement35(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement36", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement36(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement36(params);
	}
	// 입력 bur_uid, i
	@RequestMapping(value = "/monthclosing/select_bookcost_statement37", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement37(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement37(params);
	}
	// 입력 pannum5, daeji5, sobu5, sum5, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement38", method=RequestMethod.POST)
	public boolean upBookCostStatement38(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement38(params);
	}
	// 입력 daeid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement39", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement39(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement39(params);
	}
	// 입력 pannum5, filmnum5, filmcost5, sobu5, sum5, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement40", method=RequestMethod.POST)
	public boolean upBookCostStatement40(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement40(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement41", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement41(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement41(params);
	}
	// 입력 rnum, pdanga, new_cost, uids
	@RequestMapping(value="/monthclosing/update_bookcost_statement42", method=RequestMethod.POST)
	public boolean upBookCostStatement42(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement42(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement43", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement43(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement43(params);
	}
	// 입력 rnum, pdanga, new_cost, uids
	@RequestMapping(value="/monthclosing/update_bookcost_statement44", method=RequestMethod.POST)
	public boolean upBookCostStatement44(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement44(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement45", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement45(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement45(params);
	}
	// 입력 ccode8, bcode8, cdate8, cnum8, cprice8, totcost8, crnum8
	@RequestMapping(value="/monthclosing/update_bookcost_statement46", method=RequestMethod.POST)
	public boolean upBookCostStatement46(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement46(params);
	}
	// 입력 uid
	@RequestMapping(value="/monthclosing/delete_bookcost_statement47", method=RequestMethod.POST)
	public boolean delBookCostStatement47(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.delBookCostStatement47(params);
	}
	// 입력 cnum8, cprice8, totcost8, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement48", method=RequestMethod.POST)
	public boolean upBookCostStatement48(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement48(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement49", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement49(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement49(params);
	}
	// 입력 ccode9, bcode9, cdate9, cnum9, cprice9, bitag, crnum9
	@RequestMapping(value="/monthclosing/insert_bookcost_statement50", method=RequestMethod.POST)
	public boolean inBookCostStatement50(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inBookCostStatement50(params);
	}
	// 입력 w1, w2, w3, w4, w5, w6, w7, w8, w9, w11, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement51", method=RequestMethod.POST)
	public boolean upBookCostStatement51(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement51(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement52", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement52(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement52(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement53", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement53(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement53(params);
	}
	// 입력 listid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement54", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement54(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement54(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement55", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement55(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement55(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement56", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement56(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement56(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement57", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement57(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement57(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement58", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement58(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement58(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement59", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement59(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement59(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement60", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement60(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement60(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement61", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement61(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement61(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement62", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement62(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement62(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement63", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement63(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement63(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement64", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement64(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement64(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement65", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement65(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement65(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement66", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement66(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement66(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement67", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement67(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement67(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement68", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement68(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement68(params);
	}
	// 입력 
	@RequestMapping(value = "/monthclosing/select_bookcost_statement69", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement69(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement69(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement70", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement70(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement70(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement71", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement71(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement71(params);
	}
	// 입력 uid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement72", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement72(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement72(params);
	}
	// 입력 listid
	@RequestMapping(value = "/monthclosing/select_bookcost_statement73", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement73(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement73(params);
	}
	// 입력 sbbook
	@RequestMapping(value = "/monthclosing/select_bookcost_statement74", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement74(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement74(params);
	}
	// 입력 sbbook
	@RequestMapping(value = "/monthclosing/select_bookcost_statement75", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement75(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement75(params);
	}
	// 입력 bcode
	@RequestMapping(value = "/monthclosing/select_bookcost_statement76", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement76(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement76(params);
	}
	// 입력 sbbook
	@RequestMapping(value = "/monthclosing/select_bookcost_statement77", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement77(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement77(params);
	}
	// 입력 name1
	@RequestMapping(value = "/monthclosing/select_bookcost_statement78", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement78(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement78(params);
	}
	// 입력 name1
	@RequestMapping(value = "/monthclosing/select_bookcost_statement79", method = RequestMethod.POST)
	public List<MonthClosingVO> selBookCostStatement79(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selBookCostStatement79(params);
	}
	// 입력 w6, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement1", method=RequestMethod.POST)
	public boolean upBookCostStatement1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement1(params);
	}
	// 입력 cprice9, crnum9, ccode9
	@RequestMapping(value="/monthclosing/update_bookcost_statement2", method=RequestMethod.POST)
	public boolean upBookCostStatement2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement2(params);
	}
	// 입력 cprice9, crnum9, ccode
	@RequestMapping(value="/monthclosing/update_bookcost_statement3", method=RequestMethod.POST)
	public boolean upBookCostStatement3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement3(params);
	}
	// 입력 cprice9, crnum9, ccode9
	@RequestMapping(value="/monthclosing/update_bookcost_statement4", method=RequestMethod.POST)
	public boolean upBookCostStatement4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement4(params);
	}
	// 입력 m1, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement5", method=RequestMethod.POST)
	public boolean upBookCostStatement5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement5(params);
	}
	// 입력 ccode8, crnum8
	@RequestMapping(value="/monthclosing/update_bookcost_statement6", method=RequestMethod.POST)
	public boolean upBookCostStatement6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement6(params);
	}
	// 입력 m2, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement7", method=RequestMethod.POST)
	public boolean upBookCostStatement7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement7(params);
	}
	// 입력 ccode7, crnum7
	@RequestMapping(value="/monthclosing/update_bookcost_statement8", method=RequestMethod.POST)
	public boolean upBookCostStatement8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement8(params);
	}
	// 입력 m3, ccode, juid
	@RequestMapping(value="/monthclosing/update_bookcost_statement9", method=RequestMethod.POST)
	public boolean upBookCostStatement9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement9(params);
	}
	// 입력 m3, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement10", method=RequestMethod.POST)
	public boolean upBookCostStatement10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement10(params);
	}
	// 입력 ccode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement11", method=RequestMethod.POST)
	public boolean upBookCostStatement11(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement11(params);
	}
	// 입력 ccode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement12", method=RequestMethod.POST)
	public boolean upBookCostStatement12(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement12(params);
	}
	// 입력 ccode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement13", method=RequestMethod.POST)
	public boolean upBookCostStatement13(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement13(params);
	}
	// 입력 m6, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement14", method=RequestMethod.POST)
	public boolean upBookCostStatement14(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement14(params);
	}
	// 입력 ccode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement15", method=RequestMethod.POST)
	public boolean upBookCostStatement15(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement15(params);
	}
	// 입력 m7, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement16", method=RequestMethod.POST)
	public boolean upBookCostStatement16(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement16(params);
	}
	// 입력 ccode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement17", method=RequestMethod.POST)
	public boolean upBookCostStatement17(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement17(params);
	}
	// 입력 m8, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement18", method=RequestMethod.POST)
	public boolean upBookCostStatement18(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement18(params);
	}
	// 입력 ccode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement19", method=RequestMethod.POST)
	public boolean upBookCostStatement19(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement19(params);
	}
	// 입력 m9, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement21", method=RequestMethod.POST)
	public boolean upBookCostStatement21(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement21(params);
	}
	// 입력 ccode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement22", method=RequestMethod.POST)
	public boolean upBookCostStatement22(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement22(params);
	}
	// 입력 m10, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement23", method=RequestMethod.POST)
	public boolean upBookCostStatement23(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement23(params);
	}
	// 입력 ccode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement24", method=RequestMethod.POST)
	public boolean upBookCostStatement24(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement24(params);
	}
	// 입력 m11, listid
	@RequestMapping(value="/monthclosing/update_bookcost_statement25", method=RequestMethod.POST)
	public boolean upBookCostStatement25(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement25(params);
	}
	// 입력 bcode, bprice
	@RequestMapping(value="/monthclosing/update_bookcost_statement26", method=RequestMethod.POST)
	public boolean upBookCostStatement26(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement26(params);
	}
	// 입력 bcode, bprice
	@RequestMapping(value="/monthclosing/update_bookcost_statement27", method=RequestMethod.POST)
	public boolean upBookCostStatement27(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement27(params);
	}
	// 입력 bcode, crnum
	@RequestMapping(value="/monthclosing/update_bookcost_statement28", method=RequestMethod.POST)
	public boolean upBookCostStatement28(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement28(params);
	}
	// 입력 bcode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement29", method=RequestMethod.POST)
	public boolean upBookCostStatement29(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement29(params);
	}
	// 입력 bcode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement30", method=RequestMethod.POST)
	public boolean upBookCostStatement30(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement30(params);
	}
	// 입력 bcode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement31", method=RequestMethod.POST)
	public boolean upBookCostStatement31(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement31(params);
	}
	// 입력 bcode, uid
	@RequestMapping(value="/monthclosing/update_bookcost_statement32", method=RequestMethod.POST)
	public boolean upBookCostStatement32(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upBookCostStatement32(params);
	}
	// 입력 ccode9, bcode9, cdate9, cnum9, cprice9, bitag, crnum9
	@RequestMapping(value="/monthclosing/insert_bookcost_statement1", method=RequestMethod.POST)
	public boolean inBookCostStatement1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inBookCostStatement1(params);
	}
	// 입력 bcode, dbname2, dbname3
	@RequestMapping(value="/monthclosing/insert_bookcost_statement2", method=RequestMethod.POST)
	public boolean inBookCostStatement2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inBookCostStatement2(params);
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
	@RequestMapping(value="/monthclosing/insert_jmcost_statement17", method=RequestMethod.POST)
	public boolean inJMCostStatement17(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inJMCostStatement17(params);
	}
	// 입력 : total_cost, total_danga, uid
	@RequestMapping(value="/monthclosing/update_jmcost_statement18", method=RequestMethod.POST)
	public boolean upJMCostStatement18(@RequestBody MonthClosingVO params) throws Exception {
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
	// 입력 : yjcode, msdate
	@RequestMapping(value = "/monthclosing/select_pum_per6", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumPer6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumPer6(params);
	}
	// 입력 : yjcode, date1,date2
	@RequestMapping(value = "/monthclosing/select_pum_per7", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumPer7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumPer7(params);
	}
	// 입력 : wccode
	@RequestMapping(value = "/monthclosing/select_pum_per8", method = RequestMethod.POST)
	public List<MonthClosingVO> selPumPer8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPumPer8(params);
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
	
	// TODO 제조비명세표
	// 입력 : 
	@RequestMapping(value = "/monthclosing/select_MC_Specification1", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification1(params);
	}
	// 입력 : dbattr, dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification2", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification2(params);
	}
	// 입력 : dbattr, dbattr, dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification3", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification3(params);
	}
	// 입력 : dbattr, dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification4", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification4(params);
	}
	// 입력 : dbattr, dbattr, dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification5", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification5(params);
	}
	// 입력 : jmfield
	@RequestMapping(value = "/monthclosing/select_MC_Specification6", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification6(params);
	}
	// 입력 : dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification7", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification7(params);
	}
	// 입력 : sbbook
	@RequestMapping(value = "/monthclosing/select_MC_Specification8", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification8(params);
	}
	// 입력 : jenum
	@RequestMapping(value = "/monthclosing/select_MC_Specification9", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification9(params);
	}
	// 입력 : fdname, dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification10", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification10(params);
	}
	// 입력 : dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification11", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification11(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification11(params);
	}
	// 입력 : dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification12", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification12(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification12(params);
	}
	// 입력 : dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification13", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification13(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification13(params);
	}
	// 입력 : 
	@RequestMapping(value = "/monthclosing/select_MC_Specification14", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification14(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification14(params);
	}
	// 입력 : custcode, bdate 
	@RequestMapping(value = "/monthclosing/select_MC_Specification15", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification15(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification15(params);
	}
	// 입력 : dbname, bdate 
	@RequestMapping(value = "/monthclosing/select_MC_Specification16", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification16(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification16(params);
	}
	// 입력 : jenum 
	@RequestMapping(value = "/monthclosing/select_MC_Specification17", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification17(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification17(params);
	}
	// 입력 : dbattr, dbattr, dbname ,bdate 
	@RequestMapping(value = "/monthclosing/select_MC_Specification18", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification18(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification18(params);
	}
	// 입력 : dbname, bdate 
	@RequestMapping(value = "/monthclosing/select_MC_Specification19", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification19(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification19(params);
	}
	// 입력 : date1, date2 
	@RequestMapping(value = "/monthclosing/select_MC_Specification20", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification20(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification20(params);
	}
	// 입력 : jenum 
	@RequestMapping(value = "/monthclosing/select_MC_Specification21", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification21(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification21(params);
	}
	// 입력 : dbname 
	@RequestMapping(value = "/monthclosing/select_MC_Specification22", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification22(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification22(params);
	}
	// 입력 : uid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification23", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification23(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification23(params);
	}
	// 입력 : uid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification24", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification24(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification24(params);
	}
	// 입력 : uid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification25", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification25(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification25(params);
	}
	// 입력 : wccode 
	@RequestMapping(value = "/monthclosing/select_MC_Specification26", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification26(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification26(params);
	}
	// 입력 : uid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification27", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification27(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification27(params);
	}
	// 입력 : uid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification28", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification28(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification28(params);
	}
	// 입력 : crnum7 
	@RequestMapping(value = "/monthclosing/select_MC_Specification29", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification29(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification29(params);
	}
	// 입력 : wccode 
	@RequestMapping(value = "/monthclosing/select_MC_Specification30", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification30(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification30(params);
	}
	// 입력 : dbname, new_uid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification31", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification31(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification31(params);
	}
	// 입력 : dbattr, dbname, uid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification32", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification32(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification32(params);
	}
	// 입력 : crnum8 
	@RequestMapping(value = "/monthclosing/select_MC_Specification33", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification33(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification33(params);
	}
	// 입력 : wccode 
	@RequestMapping(value = "/monthclosing/select_MC_Specification34", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification34(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification34(params);
	}
	// 입력 : crnum9 
	@RequestMapping(value = "/monthclosing/select_MC_Specification35", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification35(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification35(params);
	}
	// 입력 : wccode 
	@RequestMapping(value = "/monthclosing/select_MC_Specification36", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification36(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification36(params);
	}
	// 입력 : crnum9 
	@RequestMapping(value = "/monthclosing/select_MC_Specification37", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification37(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification37(params);
	}
	// 입력 : wccode 
	@RequestMapping(value = "/monthclosing/select_MC_Specification38", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification38(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification38(params);
	}
	// 입력 : crnum9 
	@RequestMapping(value = "/monthclosing/select_MC_Specification39", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification39(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification39(params);
	}
	// 입력 : crnum9 
	@RequestMapping(value = "/monthclosing/select_MC_Specification40", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification40(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification40(params);
	}
	// 입력 : crnum9 
	@RequestMapping(value = "/monthclosing/select_MC_Specification41", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification41(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification41(params);
	}
	// 입력 : jenum 
	@RequestMapping(value = "/monthclosing/select_MC_Specification42", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification42(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification42(params);
	}
	// 입력 : bdate 
	@RequestMapping(value = "/monthclosing/select_MC_Specification43", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification43(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification43(params);
	}
	// 입력 : wccode 
	@RequestMapping(value = "/monthclosing/select_MC_Specification44", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification44(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification44(params);
	}
	// 입력 : date1, date2 
	@RequestMapping(value = "/monthclosing/select_MC_Specification45", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification45(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification45(params);
	}
	// 입력 : jenum 
	@RequestMapping(value = "/monthclosing/select_MC_Specification46", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification46(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification46(params);
	}
	// 입력 : uid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification47", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification47(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification47(params);
	}
	// 입력 : listid 
	@RequestMapping(value = "/monthclosing/select_MC_Specification48", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification48(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification48(params);
	}
	// 입력 : crnum7 
	@RequestMapping(value = "/monthclosing/select_MC_Specification49", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification49(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification49(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/monthclosing/select_MC_Specification50", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification50(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification50(params);
	}
	// 입력 : crnum8
	@RequestMapping(value = "/monthclosing/select_MC_Specification51", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification51(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification51(params);
	}
	// 입력 : crnum9
	@RequestMapping(value = "/monthclosing/select_MC_Specification52", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification52(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification52(params);
	}
	// 입력 : crnum9
	@RequestMapping(value = "/monthclosing/select_MC_Specification53", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification53(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification53(params);
	}
	// 입력 : crnum9
	@RequestMapping(value = "/monthclosing/select_MC_Specification54", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification54(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification54(params);
	}
	// 입력 : crnum9
	@RequestMapping(value = "/monthclosing/select_MC_Specification55", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification55(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification55(params);
	}
	// 입력 : 
	@RequestMapping(value = "/monthclosing/select_MC_Specification56", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification56(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification56(params);
	}
	// 입력 : dbattr, dbattr, dbname, bdate 
	@RequestMapping(value = "/monthclosing/select_MC_Specification57", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification57(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification57(params);
	}
	// 입력 : dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification58", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification58(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification58(params);
	}
	// 입력 : jmfield
	@RequestMapping(value = "/monthclosing/select_MC_Specification59", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification59(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification59(params);
	}
	// 입력 : dbname, dbattr, uid, ccode
	@RequestMapping(value = "/monthclosing/select_MC_Specification60", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification60(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification60(params);
	}
	// 입력 : bdate, custcode
	@RequestMapping(value = "/monthclosing/select_MC_Specification61", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification61(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification61(params);
	}
	// 입력 : dbname, jejonum
	@RequestMapping(value = "/monthclosing/select_MC_Specification62", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification62(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification62(params);
	}
	// 입력 : dbname, dbattr, uid
	@RequestMapping(value = "/monthclosing/select_MC_Specification63", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification63(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification63(params);
	}
	// 입력 : dbname, dbattr, uid, bitag
	@RequestMapping(value = "/monthclosing/select_MC_Specification64", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification64(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification64(params);
	}
	// 입력 : dbname, jejonum
	@RequestMapping(value = "/monthclosing/select_MC_Specification65", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification65(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification65(params);
	}
	// 입력 : dbattr, dbattr, dbname, bdate
	@RequestMapping(value = "/monthclosing/select_MC_Specification66", method = RequestMethod.POST)
	public List<MonthClosingVO> selMCSpecification66(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selMCSpecification66(params);
	}
	// 입력 : dbname, uid, jejonum, jejodate, jejosuns, bookname, bookcode, jejoamnt, jejodang, s1, s2, s21, s3, s4, s5
	@RequestMapping(value="/monthclosing/insert_MC_Specification1", method=RequestMethod.POST)
	public boolean inMCSpecification1(@RequestBody MonthClosingVO params) throws Exception {
	return monthClosingSVC.inMCSpecification1(params);
	}
	// 입력 : dbname, uid, jejodate
	@RequestMapping(value="/monthclosing/insert_MC_Specification2", method=RequestMethod.POST)
	public boolean inMCSpecification2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inMCSpecification2(params);
	}
	// 입력 : uid, jejonum, jejodate, jejosuns, bookname, bookcode, jejoamnt, jejodang, s1, s2, s3, s4, s5
	@RequestMapping(value="/monthclosing/insert_MC_Specification3", method=RequestMethod.POST)
	public boolean inMCSpecification3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inMCSpecification3(params);
	}
	// 입력 : custcode, bdate, jana
	@RequestMapping(value="/monthclosing/insert_MC_Specification4", method=RequestMethod.POST)
	public boolean inMCSpecification4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.inMCSpecification4(params);
	}
	// 입력 : dbnmae, t_yongji, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification1", method=RequestMethod.POST)
	public boolean upMCSpecification1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification1(params);
	}
	// 입력 : dbname, dbattr, sum1, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification2", method=RequestMethod.POST)
	public boolean upMCSpecification2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification2(params);
	}
	// 입력 : dbname, dbattr, name1, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification3", method=RequestMethod.POST)
	public boolean upMCSpecification3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification3(params);
	}
	// 입력 : dbname, dbattr, name1, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification4", method=RequestMethod.POST)
	public boolean upMCSpecification4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification4(params);
	}
	// 입력 : dbname, dbattr, name1, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification5", method=RequestMethod.POST)
	public boolean upMCSpecification5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification5(params);
	}
	// 입력 : dbname, dbattr, name1, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification6", method=RequestMethod.POST)
	public boolean upMCSpecification6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification6(params);
	}
	// 입력 : dbname, dbattr, name1, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification7", method=RequestMethod.POST)
	public boolean upMCSpecification7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification7(params);
	}
	// 입력 : dbname, dbattr, name1, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification8", method=RequestMethod.POST)
	public boolean upMCSpecification8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification8(params);
	}
	// 입력 : dbname, sum1, bolist, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification9", method=RequestMethod.POST)
	public boolean upMCSpecification9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification9(params);
	}
	// 입력 : dbname, dbattr, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification10", method=RequestMethod.POST)
	public boolean upMCSpecification10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification10(params);
	}
	// 입력 : jana, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification11", method=RequestMethod.POST)
	public boolean upMCSpecification11(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification11(params);
	}
	// 입력 : dbname, bolist, uid
	@RequestMapping(value="/monthclosing/update_MC_Specification12", method=RequestMethod.POST)
	public boolean upMCSpecification12(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.upMCSpecification12(params);
	}
	// 입력 : dbname, jejodate
	@RequestMapping(value="/monthclosing/delete_MC_Specification1", method=RequestMethod.POST)
		public boolean delMCSpecification1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.delMCSpecification1(params);
	}
	// 입력 : uid
	@RequestMapping(value="/monthclosing/delete_MC_Specification2", method=RequestMethod.POST)
	public boolean delMCSpecification2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.delMCSpecification2(params);
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
	
	// TODO 거래처별 지불명세서
	// 입력 : 
	@RequestMapping(value = "/monthclosing/select_Payment_Account1", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount1(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount1(params);
	}
	// 입력 : ccode, date1, date2 
	@RequestMapping(value = "/monthclosing/select_Payment_Account2", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount2(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount2(params);
	}
	// 입력 : jmfield, dbname, jejodate, dbattr
	@RequestMapping(value = "/monthclosing/select_Payment_Account3", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount3(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount3(params);
	}
	// 입력 : bdate, custcode
	@RequestMapping(value = "/monthclosing/select_Payment_Account4", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount4(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount4(params);
	}
	// 입력 : comid, date1, date2
	@RequestMapping(value = "/monthclosing/select_Payment_Account5", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount5(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount5(params);
	}
	// 입력 : m1, date1, date2
	@RequestMapping(value = "/monthclosing/select_Payment_Account6", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount6(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount6(params);
	}
	// 입력 : listid5
	@RequestMapping(value = "/monthclosing/select_Payment_Account7", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount7(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount7(params);
	}
	// 입력 : listid
	@RequestMapping(value = "/monthclosing/select_Payment_Account8", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount8(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount8(params);
	}
	// 입력 : m1, date1, date2
	@RequestMapping(value = "/monthclosing/select_Payment_Account9", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount9(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount9(params);
	}
	// 입력 : dbname, dbattr
	@RequestMapping(value = "/monthclosing/select_Payment_Account10", method = RequestMethod.POST)
	public List<MonthClosingVO> selPaymentAccount10(@RequestBody MonthClosingVO params) throws Exception {
		return monthClosingSVC.selPaymentAccount10(params);
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
