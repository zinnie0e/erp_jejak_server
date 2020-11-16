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
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.dbjejak.JmJejakService;
import com.guru.erpserver.vo.dbjejak.JmJejakVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class JmJejakController {
	@Resource
	private JmJejakService jmJejakSVC;
	
	//TODO 공통
	//입력 : jbdate
	@RequestMapping(value="/jmjejak/select_jm_date", method=RequestMethod.POST)
	public List<JmJejakVO> selJmDayList(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmDayList(params);
	}
	
	// TODO 제작계획표
	// 입력 : date1, date2
	@RequestMapping(value = "/jmjejak/select_jejakplan0", method = RequestMethod.POST)
	public List<JmJejakVO> selJmjejakplan0(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmjejakplan0(params);
	}
	// 입력 : date1, date2, lm_s, lm_t
	@RequestMapping(value = "/jmjejak/select_jejakplan1", method = RequestMethod.POST)
	public List<JmJejakVO> selJmjejakplan1(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmjejakplan1(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jmjejak/select_jejakplan2", method = RequestMethod.POST)
	public List<JmJejakVO> selJmjejakplan2(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmjejakplan2(params);
	}
	
	// TODO 표지작업지시서
	// 입력 : tdate1, tdate2
	@RequestMapping(value = "/jmjejak/select_jmpyo_list", method = RequestMethod.POST)
	public List<JmJejakVO> selJmPyo(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmPyo(params);
	}
	
	// TODO 본문작업지시서
	// 입력 : tdate1, tdate2
	@RequestMapping(value = "/jmjejak/select_jmbon_list0", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBon0(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmBon0(params);
	}
	// 입력 : tdate1, tdate2, lm_s, lm_t
	@RequestMapping(value = "/jmjejak/select_jmbon_list", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBon(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmBon(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jmjejak/select_jmbon_list2", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBon2(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmBon2(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/jmjejak/select_jmbon_list3", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBon3(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmBon3(params);
	}
	
	// TODO 발주서
	@RequestMapping(value = "/jmjejak/select_bal_cust_list", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBal1() throws Exception {
		return jmJejakSVC.selJmBal1();
	}

	// 입력 : tdate1, tdate2
	@RequestMapping(value = "/jmjejak/select_bal_count_list", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBal2(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmBal2(params);
	}
	// 입력 : ccode
	@RequestMapping(value = "/jmjejak/select_bal_list3", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBal3(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmBal3(params);
	}
	// 입력 : tdate1, tdate2
	@RequestMapping(value = "/jmjejak/select_bal_list4", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBal4(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmBal4(params);
	}
	// 입력 : jbcode
	@RequestMapping(value = "/jmjejak/select_bal_list5", method = RequestMethod.POST)
	public List<JmJejakVO> selJmBal5(@RequestBody JmJejakVO params) throws Exception {
		return jmJejakSVC.selJmBal5(params);
	}
}
