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
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.DirectKbService;
import com.guru.erpserver.vo.CustomerVO;
import com.guru.erpserver.vo.DirectKbVO;
import com.guru.erpserver.vo.JmJejakVO;
import com.guru.erpserver.vo.Yongji.YongjiVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class DirectKbController {
	@Resource
	private DirectKbService directKbSVC;
	
	// TODO 공통 200601
	
	// TODO 용지대
	@RequestMapping(value = "/directkb/select_kb_yongji1", method = RequestMethod.POST)
	public List<DirectKbVO> selKbYongji1() throws Exception {
		return directKbSVC.selKbYongji1();
	}
	// 입력 : date1, date2, wccode
	@RequestMapping(value = "/directkb/select_kb_yongji2", method = RequestMethod.POST)
	public List<DirectKbVO> selKbYongji2(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbYongji2(params);
	}
	
	// TODO 출력료
	@RequestMapping(value = "/directkb/select_kb_print1", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPrint1() throws Exception {
		return directKbSVC.selKbPrint1();
	}
	@RequestMapping(value = "/directkb/select_kb_print2", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPrint2() throws Exception {
		return directKbSVC.selKbPrint2();
	}
	@RequestMapping(value = "/directkb/select_kb_print3", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPrint3() throws Exception {
		return directKbSVC.selKbPrint3();
	}
	// 입력 : uid, ccode, cdate, cgubn, cprice
	@RequestMapping(value="/directkb/insert_kb_print", method=RequestMethod.POST)
	public boolean inKbPrint(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.inKbPrint(params);
	}
	
	// TODO 사보료
	@RequestMapping(value = "/directkb/select_kb_house_organ1", method = RequestMethod.POST)
	public List<DirectKbVO> selKbHouseOrgan1() throws Exception {
		return directKbSVC.selKbHouseOrgan1();
	}
	@RequestMapping(value = "/directkb/select_kb_house_organ2", method = RequestMethod.POST)
	public List<DirectKbVO> selKbHouseOrgan2() throws Exception {
		return directKbSVC.selKbHouseOrgan2();
	}
	@RequestMapping(value = "/directkb/select_kb_house_organ3", method = RequestMethod.POST)
	public List<DirectKbVO> selKbHouseOrgan3() throws Exception {
		return directKbSVC.selKbHouseOrgan3();
	}
	// 입력 : uid, ccode, cdate, cgubn, cprice
	@RequestMapping(value="/directkb/insert_kb_house_organ", method=RequestMethod.POST)
	public boolean inKbHouseOrgan(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.inKbHouseOrgan(params);
	}
	
	// TODO 인쇄비
	// 입력 : date1, date2
	@RequestMapping(value = "/directkb/select_kb_presswork1", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork1(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork1(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork2", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork2(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork2(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork3", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork3(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork3(params);
	}
	// 입력 : date1, date2
	@RequestMapping(value = "/directkb/select_kb_presswork4", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork4(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork4(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork5", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork5(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork5(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork6", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork6(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork6(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork7", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork7(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork7(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork8", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork8(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork8(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork9", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork9(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork9(params);
	}
	
	// TODO 제본비
	// 입력 : tdate
	@RequestMapping(value = "/directkb/select_kb_binding1", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding1(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding1(params);
	}
	// 입력 : t1id, idate
	@RequestMapping(value = "/directkb/select_kb_binding2", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding2(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding2(params);
	}
	// 입력 : juid
	@RequestMapping(value = "/directkb/select_kb_binding3", method = RequestMethod.POST)
	public DirectKbVO selKbBinding3(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding3(params);
	}
	
	// TODO 코팅비
	// 입력 : date1, date2
	@RequestMapping(value = "/directkb/select_kb_coating1", method = RequestMethod.POST)
	public List<DirectKbVO> selKbCoating1(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbCoating1(params);
	}
	// 입력 : date1, date2
	@RequestMapping(value = "/directkb/select_kb_coating2", method = RequestMethod.POST)
	public List<DirectKbVO> selKbCoating2(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbCoating2(params);
	}
	
	
	// TODO 비닐비, 케이스대, CD음반대, 스티커대, 기타
	// 입력 : tag, date1, date2
	@RequestMapping(value = "/directkb/select_kb_management1", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement1(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbManagement1(params);
	}
	// 입력 : tag, date1, date2
	@RequestMapping(value = "/directkb/select_kb_management2", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement2(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbManagement2(params);
	}
	// 입력 : ccode9
	@RequestMapping(value = "/directkb/select_kb_management3", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement3(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbManagement3(params);
	}
	// 입력 : tag, ccode9 
	@RequestMapping(value = "/directkb/select_kb_management4", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement4(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbManagement4(params);
	}
	// 입력 : tag, ccode9
	@RequestMapping(value = "/directkb/select_kb_management5", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement5(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbManagement5(params);
	}
	
}
