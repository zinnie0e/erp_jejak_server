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

import com.guru.erpserver.service.dbjejak.DirectKbService;
import com.guru.erpserver.vo.dbjejak.DirectKbVO;

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
	// 입력 : wccode
	@RequestMapping(value = "/directkb/select_kb_yongji3", method = RequestMethod.POST)
	public List<DirectKbVO> selKbYongji3(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbYongji3(params);
	}
	// 입력 : date1, date2, wccode
	@RequestMapping(value = "/directkb/select_kb_yongji4", method = RequestMethod.POST)
	public List<DirectKbVO> selKbYongji4(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbYongji4(params);
	}
	// 입력 : jicode
	@RequestMapping(value = "/directkb/select_kb_yongji5", method = RequestMethod.POST)
	public List<DirectKbVO> selKbYongji5(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbYongji5(params);
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
	// 입력 : op52, uid
	@RequestMapping(value="/directkb/update_kb_presswork_op52", method=RequestMethod.POST)
	public boolean upKbPressworkOp52(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.upKbPressworkOp52(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork10", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork10(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork10(params);
	}
	// 입력 : daeji5, sum5, uid
	@RequestMapping(value="/directkb/update_kb_presswork_2", method=RequestMethod.POST)
	public boolean upKbPresswork2(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.upKbPresswork2(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/directkb/select_kb_presswork11", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork11(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork11(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork12", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork12(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork12(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/directkb/select_kb_presswork13", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork13(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork13(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork14", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork14(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork14(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/directkb/select_kb_presswork15", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork15(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork15(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork16", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork16(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork16(params);
	}
	// 입력 : bdate
	@RequestMapping(value = "/directkb/select_kb_presswork17", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork17(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork17(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork18", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork18(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork18(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_presswork19", method = RequestMethod.POST)
	public List<DirectKbVO> selKbPresswork19(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbPresswork19(params);
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
	// 입력 : idate
	@RequestMapping(value = "/directkb/select_kb_binding4", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding4(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding4(params);
	}
	// 입력 : cdate7, ccode7
	@RequestMapping(value = "/directkb/select_kb_binding5", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding5(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding5(params);
	}
	// 입력 : idate
	@RequestMapping(value = "/directkb/select_kb_binding6", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding6(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding6(params);
	}
	// 입력 : t1id, idate
	@RequestMapping(value = "/directkb/select_kb_binding7", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding7(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding7(params);
	}
	// 입력 : t1id
	@RequestMapping(value = "/directkb/select_kb_binding8", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding8(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding8(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_binding9", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding9(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding9(params);
	}
	// 입력 : fieldname1, fieldname2, sbbook
	@RequestMapping(value = "/directkb/select_kb_binding10", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding10(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding10(params);
	}
	// 입력 : crnum7
	@RequestMapping(value = "/directkb/select_kb_binding11", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding11(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding11(params);
	}
	// 입력 : tcode, bucode
	@RequestMapping(value = "/directkb/select_kb_binding12", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding12(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding12(params);
	}
	// 입력 : listid
	@RequestMapping(value = "/directkb/select_kb_binding13", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding13(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding13(params);
	}
	// 입력 : jbdate, m3
	@RequestMapping(value = "/directkb/select_kb_binding14", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding14(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding14(params);
	}
	// 입력 : crnum7
	@RequestMapping(value = "/directkb/select_kb_binding15", method = RequestMethod.POST)
	public List<DirectKbVO> selKbBinding15(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbBinding15(params);
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
	@RequestMapping(value = "/directkb/select_kb_coating3", method = RequestMethod.POST)
	public List<DirectKbVO> selKbCoating3() throws Exception {
		return directKbSVC.selKbCoating3();
	}
	// 입력 : date1, date2, wccode
	@RequestMapping(value = "/directkb/select_kb_coating4", method = RequestMethod.POST)
	public List<DirectKbVO> selKbCoating4(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbCoating4(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_coating5", method = RequestMethod.POST)
	public List<DirectKbVO> selKbCoating5(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbCoating5(params);
	}
	// 입력 : date1, date2, wccode
	@RequestMapping(value = "/directkb/select_kb_coating6", method = RequestMethod.POST)
	public List<DirectKbVO> selKbCoating6(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbCoating6(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/directkb/select_kb_coating7", method = RequestMethod.POST)
	public List<DirectKbVO> selKbCoating7(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbCoating7(params);
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
	// 입력 : tval, uid
	@RequestMapping(value="/directkb/update_kb_op29", method=RequestMethod.POST)
	public boolean upOp29(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.upOp29(params);
	}
	// 입력 : key, keyfield
	@RequestMapping(value = "/directkb/select_kb_management6", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement6(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbManagement6(params);
	}
	// 입력 : 
	@RequestMapping(value="/directkb/update_kb_management1", method=RequestMethod.POST)
	public boolean upKbManagement1(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.upKbManagement1(params);
	}
	// 입력 : 
	@RequestMapping(value = "/directkb/select_kb_management7", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement7(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbManagement7(params);
	}
	// 입력 : 
	@RequestMapping(value="/directkb/update_kb_management2", method=RequestMethod.POST)
	public boolean upKbManagement2(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.upKbManagement2(params);
	}
	// 입력 : 
	@RequestMapping(value = "/directkb/select_kb_management8", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement8(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.selKbManagement8(params);
	}
	@RequestMapping(value = "/directkb/select_kb_management9", method = RequestMethod.POST)
	public List<DirectKbVO> selKbManagement9() throws Exception {
		return directKbSVC.selKbManagement9();
	}
	// 입력 : 
	@RequestMapping(value="/directkb/insert_kb_management1", method=RequestMethod.POST)
	public boolean inKbManagement1(@RequestBody DirectKbVO params) throws Exception {
		return directKbSVC.inKbManagement1(params);
	}
	
}
