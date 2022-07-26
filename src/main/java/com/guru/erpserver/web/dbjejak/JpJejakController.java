package com.guru.erpserver.web.dbjejak;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.dbjejak.JpJejakService;
import com.guru.erpserver.vo.dbjejak.CustomerVO;
import com.guru.erpserver.vo.dbjejak.JpJejakVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class JpJejakController {
	@Resource
	private JpJejakService jpJejakSVC;
	
	//TODO 공통
	//입력 : bdate
	@RequestMapping(value="/jpjejak/select_jp_date", method=RequestMethod.POST)
	public List<JpJejakVO> selJpDay(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpDay(params);
	}

	//TODO 발주예정제품리스트
	//입력 : date1(년), date2(월)
	@RequestMapping(value="/jpjejak/select_bjlist_date_list", method=RequestMethod.POST)
	public ArrayList<HashMap<String, Object>> selBjlistDateList(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistDateList(params);
	}
	
	//입력 : signdate
	@RequestMapping(value="/jpjejak/select_bjlist_page_count", method=RequestMethod.POST)
	public List<JpJejakVO> selBjlistPageCount(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistPageCount(params);
	}
	
	//입력 : signdate, lm_s, lm_t
	@RequestMapping(value="/jpjejak/select_bjlist_list", method=RequestMethod.POST)
	public List<JpJejakVO> selBjlistList(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistList(params);
	}
	
	//입력 : date1, date2
	@RequestMapping(value="/jpjejak/select_bjlist_list1", method=RequestMethod.POST)
	public List<JpJejakVO> selBjlistList1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistList1(params);
	}
	
	//입력 : uid
	@RequestMapping(value="/jpjejak/delete_bjlist_item", method=RequestMethod.POST)
	public boolean delBjlistItem(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.delBjlistItem(params);
	}
	
	//입력 : uid
	@RequestMapping(value="/jpjejak/select_bjlist_item", method=RequestMethod.POST)
	public JpJejakVO selBjlistItem(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistItem(params);
	}
	
	//입력 : bcode(5자리)
	@RequestMapping(value="/jpjejak/select_bjlist_balju1", method=RequestMethod.POST)
	public String selBjlistBalju1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju1(params);
	}
	
	//입력 : bcode
	@RequestMapping(value="/jpjejak/select_bjlist_balju2", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju2(params);
	}
	
	//입력 : bcode
	@RequestMapping(value="/jpjejak/select_bjlist_balju3", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju3(params);
	}
	
	//입력 : bcode(5자리)
	@RequestMapping(value="/jpjejak/select_bjlist_balju4", method=RequestMethod.POST)
	public List<JpJejakVO> selBjlistBalju4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju4(params);
	}
	
	//입력 : wyjijl
	@RequestMapping(value="/jpjejak/select_bjlist_balju41", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju41(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju41(params);
	}
	
	//입력 : bnum
	@RequestMapping(value="/jpjejak/select_bjlist_balju411", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju411(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju411(params);
	}
	
	//입력 : bnum, wycolo
	@RequestMapping(value="/jpjejak/select_bjlist_balju412", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju412(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju412(params);
	}
	
	//입력 : bcode(5자리), wyboo9
	@RequestMapping(value="/jpjejak/select_bjlist_balju413", method=RequestMethod.POST)
	public long selBjlistBalju413(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju413(params);
	}
	
	//입력 : bcode(5자리), wyboo9
	@RequestMapping(value="/jpjejak/select_bjlist_balju4131", method=RequestMethod.POST)
	public JpJejakVO selBjlistBalju4131(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjlistBalju4131(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak1", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak1(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak2", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak2(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak3", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak3(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak4", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak4(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak5", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak5(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak5(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak6", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak6(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak6(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak7", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak7(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak7(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak8", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak8(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak8(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak9", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak9(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak9(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak10", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak10(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak10(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak11", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak11(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak11(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak12", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak12(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak12(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_bjyj_jejak13", method=RequestMethod.POST)
	public List<JpJejakVO> selBjYjJejak13(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selBjYjJejak13(params);
	}
	//입력 :
	@RequestMapping(value="/jpjejak/update_jp_bjyjjejak1", method=RequestMethod.POST)
	public boolean upBjYjJejak1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upBjYjJejak1(params);
	}
	
	@RequestMapping(value="/jpjejak/select_startbj1", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj1(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj2", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj2(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj3", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj3() throws Exception {
		return jpJejakSVC.selStartBj3();
	}
	@RequestMapping(value="/jpjejak/select_startbj4", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj4(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj5", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj5() throws Exception {
		return jpJejakSVC.selStartBj5();
	}
	@RequestMapping(value="/jpjejak/select_startbj6", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj6(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj6(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj7", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj7() throws Exception {
		return jpJejakSVC.selStartBj7();
	}
	@RequestMapping(value="/jpjejak/select_startbj8", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj8() throws Exception {
		return jpJejakSVC.selStartBj8();
	}
	@RequestMapping(value="/jpjejak/select_startbj9", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj9(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj9(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj10", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj10(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj10(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj11", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj11(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj11(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj12", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj12() throws Exception {
		return jpJejakSVC.selStartBj12();
	}
	@RequestMapping(value="/jpjejak/select_startbj13", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj13() throws Exception {
		return jpJejakSVC.selStartBj13();
	}
	@RequestMapping(value="/jpjejak/select_startbj14", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj14(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj14(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj15", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj15() throws Exception {
		return jpJejakSVC.selStartBj15();
	}
	@RequestMapping(value="/jpjejak/select_startbj16", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj16(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj16(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj17", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj17(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj17(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj18", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj18(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj18(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj19", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj19(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj19(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj20", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj20() throws Exception {
		return jpJejakSVC.selStartBj20();
	}
	@RequestMapping(value="/jpjejak/select_startbj21", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj21(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj21(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj22", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj22() throws Exception {
		return jpJejakSVC.selStartBj22();
	}
	@RequestMapping(value="/jpjejak/select_startbj23", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj23(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj23(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj24", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj24() throws Exception {
		return jpJejakSVC.selStartBj24();
	}
	@RequestMapping(value="/jpjejak/select_startbj25", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj25(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj25(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj26", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj26(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj26(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj27", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj27(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj27(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj28", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj28(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj28(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj29", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj29(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj29(params);
	}
	@RequestMapping(value="/jpjejak/select_startbj30", method=RequestMethod.POST)
	public List<JpJejakVO> selStartBj30(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selStartBj30(params);
	}
	@RequestMapping(value="/jpjejak/update_startbj1", method=RequestMethod.POST)
	public boolean upStartBj1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upStartBj1(params);
	}
	@RequestMapping(value="/jpjejak/update_startbj2", method=RequestMethod.POST)
	public boolean upStartBj2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upStartBj2(params);
	}
	@RequestMapping(value="/jpjejak/update_startbj3", method=RequestMethod.POST)
	public boolean upStartBj3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upStartBj3(params);
	}
	@RequestMapping(value="/jpjejak/update_startbj4", method=RequestMethod.POST)
	public boolean upStartBj4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upStartBj4(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj1", method=RequestMethod.POST)
	public boolean inStartBj1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj1(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj2", method=RequestMethod.POST)
	public boolean inStartBj2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj2(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj3", method=RequestMethod.POST)
	public boolean inStartBj3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj3(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj4", method=RequestMethod.POST)
	public boolean inStartBj4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj4(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj5", method=RequestMethod.POST)
	public boolean inStartBj5(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj5(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj6", method=RequestMethod.POST)
	public boolean inStartBj6(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj6(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj7", method=RequestMethod.POST)
	public boolean inStartBj7(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj7(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj8", method=RequestMethod.POST)
	public boolean inStartBj8(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj8(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj9", method=RequestMethod.POST)
	public boolean inStartBj9(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj9(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj10", method=RequestMethod.POST)
	public boolean inStartBj10(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj10(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj11", method=RequestMethod.POST)
	public boolean inStartBj11(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj11(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj12", method=RequestMethod.POST)
	public boolean inStartBj12(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj12(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj13", method=RequestMethod.POST)
	public boolean inStartBj13(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj13(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj14", method=RequestMethod.POST)
	public boolean inStartBj14(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj14(params);
	}
	@RequestMapping(value="/jpjejak/insert_startbj15", method=RequestMethod.POST)
	public boolean inStartBj15(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inStartBj15(params);
	}
	
	//TODO 제작계획표
	// 입력 : date1, date2
	@RequestMapping(value = "/jpjejak/select_jejakplan0", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan0(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan0(params);
	}
	// 입력 : date1, date2, lm_s, lm_t
	@RequestMapping(value = "/jpjejak/select_jejakplan1", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan1(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jpjejak/select_jejakplan2", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan2(params);
	}
	// 입력 : bcode, listid
	@RequestMapping(value = "/jpjejak/select_jejakplan3", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan3(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jpjejak/select_jejakplan4", method = RequestMethod.POST)
	public List<JpJejakVO> selJpjejakplan4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpjejakplan4(params);
	}
	
	//TODO 중쇄예정제품
	// 입력 : date1, date2
	@RequestMapping(value = "/jpjejak/select_reprint1", method = RequestMethod.POST)
	public List<JpJejakVO> selJpReprint1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpReprint1(params);
	}
	// 입력 : bcode, jnum
	@RequestMapping(value = "/jpjejak/select_reprint2", method = RequestMethod.POST)
	public JpJejakVO selJpReprint2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpReprint2(params);
	}
	// 입력 : date1, date2
	@RequestMapping(value = "/jpjejak/select_reprint3", method = RequestMethod.POST)
	public List<JpJejakVO> selJpReprint3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpReprint3(params);
	}
	// 입력 : jbcode
	@RequestMapping(value = "/jpjejak/select_reprint4", method = RequestMethod.POST)
	public JpJejakVO selJpReprint4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpReprint4(params);
	}
	
	//TODO 발주서
	@RequestMapping(value="/jpjejak/select_bal_cust_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal1() throws Exception {
		return jpJejakSVC.selJpBal1();
	}
	//입력 : bdate1, bdate2
	@RequestMapping(value="/jpjejak/select_bal_count_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBal2(params);
	}
	//입력 : ccode
	@RequestMapping(value="/jpjejak/select_bal_list3", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBal3(params);
	}
	//입력 : bdate1, bdate2
	@RequestMapping(value="/jpjejak/select_bal_list4", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBal4(params);
	}
	//입력 : listid
	@RequestMapping(value="/jpjejak/select_bal_list5", method=RequestMethod.POST)
	public List<JpJejakVO> selJpBal5(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBal5(params);
	}
	//입력 : uid, pwan, iwan
	@RequestMapping(value="/jpjejak/update_bal_pwan", method=RequestMethod.POST)
	public boolean upJpBalPwan(@RequestBody JpJejakVO params) throws Exception {
		long get_listid = jpJejakSVC.selJpBalListid(params);
		params.setListid(get_listid);
		return jpJejakSVC.upJpBalPwan(params);
	}
	//입력 : uid, pwan, iwan
	@RequestMapping(value="/jpjejak/update_bal_iwan", method=RequestMethod.POST)
	public boolean upJpBalIwan(@RequestBody JpJejakVO params) throws Exception {
		long get_listid = jpJejakSVC.selJpBalListid(params);
		params.setListid(get_listid);
		return jpJejakSVC.upJpBalIwan(params);
	}
	
	//TODO 표지작업지시서
	//입력 : bdate1, bdate2
	@RequestMapping(value="/jpjejak/select_jppyo_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpPyo(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpPyo(params);
	}
	//입력 : bcode
	@RequestMapping(value="/jpjejak/select_selYakc", method=RequestMethod.POST)
	public JpJejakVO selYakc(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYakc(params);
	}
	//입력 : uid, colo
	@RequestMapping(value="/jpjejak/update_jppyo_colo", method=RequestMethod.POST)
	public boolean upJpPyoColo(@RequestBody JpJejakVO params) throws Exception {
		boolean result_up1 = false;
		boolean result_up2 = false;
		JpJejakVO get_param = jpJejakSVC.selJpPyoColo1(params);
		if(get_param == null) return false;
		
		long new_cost = get_param.getPcost() * (params.getColo()+1) / (get_param.getColo()+1);
		
		JpJejakVO set_param = new JpJejakVO();
		set_param.setUid(params.getUid());
		set_param.setColo(params.getColo());
		set_param.setPcost(new_cost);
		
		result_up1 = jpJejakSVC.upJpPyoColo2(set_param);
		
		JpJejakVO get_param2 = jpJejakSVC.selJpPyoColo3(get_param);
		if(get_param2 == null) return false;
		
		long new_sobu = params.getColo() * get_param2.getSobudan5();
		
		BigDecimal decimal1 = BigDecimal.valueOf((new_sobu + (get_param2.getFilmnum5() * get_param2.getFilmdan5()) + get_param2.getDaeji5()));
		BigDecimal decimal2 = BigDecimal.valueOf(1.1);
		
		long new_sum = decimal1.multiply(decimal2).longValue();
		
		JpJejakVO set_param2 = new JpJejakVO();
		set_param2.setUid(get_param2.getUid());
		set_param2.setPannum5(params.getColo());
		set_param2.setSobu5(new_sobu);
		set_param2.setSum5(new_sum);
		
		result_up2 = jpJejakSVC.upJpPyoColo4(set_param);
		
		return result_up1 && result_up2;
	}
	
	// TODO 본문작업지시서
	// 입력 : bdate1, bdate2
	@RequestMapping(value = "/jpjejak/select_jpbon", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon0(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon0(params);
	}
	// 입력 : bdate1, bdate2, lm_s, lm_t
	@RequestMapping(value = "/jpjejak/select_jpbon_list", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jpjejak/select_jpbon_list2", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon2(params);
	}
	// 입력 : uid, bucode
	@RequestMapping(value = "/jpjejak/select_jpbon_list3", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon3(params);
	}
	// 입력 : uid, bucode
	@RequestMapping(value = "/jpjejak/select_jpbon_list4", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBon4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBon4(params);
	}
	@RequestMapping(value = "/jpjejak/select_jpbon_detail1", method = RequestMethod.POST)
	public JpJejakVO selJpBonDetail1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBonDetail1(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail2", method=RequestMethod.POST)
	public boolean upJpBonDetail2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail2(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail3", method=RequestMethod.POST)
	public boolean upJpBonDetail3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail3(params);
	}
	@RequestMapping(value = "/jpjejak/select_jpbon_detail4", method = RequestMethod.POST)
	public JpJejakVO selJpBonDetail4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBonDetail4(params);
	}
	@RequestMapping(value = "/jpjejak/select_jpbon_detail5", method = RequestMethod.POST)
	public JpJejakVO selJpBonDetail5(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBonDetail5(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail6", method=RequestMethod.POST)
	public boolean upJpBonDetail6(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail6(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail7", method=RequestMethod.POST)
	public boolean upJpBonDetail7(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail7(params);
	}
	@RequestMapping(value = "/jpjejak/select_jpbon_detail8", method = RequestMethod.POST)
	public List<JpJejakVO> selJpBonDetail8(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpBonDetail8(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jpbon_detail9", method=RequestMethod.POST)
	public boolean upJpBonDetail9(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpBonDetail9(params);
	}
	
	//TODO 입고대장
	//입력 : bdate1, bdate2
	@RequestMapping(value="/jpjejak/select_selWarehousing", method=RequestMethod.POST)
	public List<JpJejakVO> selWarehousing(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selWarehousing(params);
	}
	
	//TODO 제작예정리스트 열람
	@RequestMapping(value="/jpjejak/select_yejung1", method=RequestMethod.POST)
	public String selYejung1() throws Exception {
		return jpJejakSVC.selYejung1();
	}
	//입력 : signdate
	@RequestMapping(value="/jpjejak/select_yejung2_count", method=RequestMethod.POST)
	public int selYejung2Count(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYejung2Count(params);
	}
	//입력 : signdate, lm_s, lm_t
	@RequestMapping(value="/jpjejak/select_yejung2", method=RequestMethod.POST)
	public List<JpJejakVO> selYejung2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYejung2(params);
	}
	//입력 : uid
	@RequestMapping(value="/jpjejak/delete_jp_yejung", method=RequestMethod.POST)
	public boolean delYejung(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.delYejung(params);
	}
	
	//TODO 제작예정리스트 등록
	//입력 : keyfield, key
	@RequestMapping(value="/jpjejak/select_jp_yejung_regi1", method=RequestMethod.POST)
	public List<JpJejakVO> selYejungRegi1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYejungRegi1(params);
	}
	//입력 : keyfield, key, lm_s, lm_t
	@RequestMapping(value="/jpjejak/select_jp_yejung_regi2", method=RequestMethod.POST)
	public List<JpJejakVO> selYejungRegi2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selYejungRegi2(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add1", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd1(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add2", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd2(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd2(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add3", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd3(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd3(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add4", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd4(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd4(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add5", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd5(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd5(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add6", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd6(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd6(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add7", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd7(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd7(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add8", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd8(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd8(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add9", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd9(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd9(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add10", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd10(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd10(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add11", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd11(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd11(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add12", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd12(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd12(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add13", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd13(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd13(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add14", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd14(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd14(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add15", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd15(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd15(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add16", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd16(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd16(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add17", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd17(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd17(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add18", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd18(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd18(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add19", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd19(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd19(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/select_jp_jejak_yjlist_add20", method=RequestMethod.POST)
	public List<JpJejakVO> selJejakYjListAdd20(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJejakYjListAdd20(params);
	}
	//입력 : 
	@RequestMapping(value="/jpjejak/insert_jp_jejak_yjlist_add1", method=RequestMethod.POST)
	public boolean inJejakYjListAdd1(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.inJejakYjListAdd1(params);
	}
	
	//TODO 제품정가인상리스트
	@RequestMapping(value="/jpjejak/select_jp_priceup_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpPriceUpList() throws Exception {
		return jpJejakSVC.selJpPriceUpList();
	}
	
	//TODO 제품보류리스트
	@RequestMapping(value="/jpjejak/select_jp_hold_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpHoldList() throws Exception {
		return jpJejakSVC.selJpHoldList();
	}
	
	//TODO 제품폐간리스트
	@RequestMapping(value="/jpjejak/select_jp_close_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpCloseList() throws Exception {
		return jpJejakSVC.selJpCloseList();
	}
	
	//TODO 신간적정재고관리
	//입력 : bdate
	@RequestMapping(value="/jpjejak/select_jp_newstock_list", method=RequestMethod.POST)
	public List<JpJejakVO> selJpNewStockList(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.selJpNewStockList(params);
	}
	//입력 : uid
	@RequestMapping(value="/jpjejak/delete_jp_newstock", method=RequestMethod.POST)
	public boolean delJpNewStock(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.delJpNewStock(params);
	}
	//입력 : yjqnty, uid
	@RequestMapping(value="/jpjejak/update_jp_newstock", method=RequestMethod.POST)
	public boolean upJpNewStock(@RequestBody JpJejakVO params) throws Exception {
		return jpJejakSVC.upJpNewStock(params);
	}
}
