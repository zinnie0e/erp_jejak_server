package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.DirectKbService;
import com.guru.erpserver.mapper.dbjejak.DirectKbMapper;
import com.guru.erpserver.vo.dbjejak.DirectKbVO;

@Service
public class DirectKbServiceImpl implements DirectKbService {
	@Resource
	private DirectKbMapper directKbDAO;

	// TODO 공통

	// TODO 용지대
	@Override
	public List<DirectKbVO> selKbYongji1() throws Exception {
		return directKbDAO.selKbYongji1();
	}
	@Override
	public List<DirectKbVO> selKbYongji2(DirectKbVO params) throws Exception {
		return directKbDAO.selKbYongji2(params);
	}
	@Override
	public List<DirectKbVO> selKbYongji3(DirectKbVO params) throws Exception {
		return directKbDAO.selKbYongji3(params);
	}
	@Override
	public List<DirectKbVO> selKbYongji4(DirectKbVO params) throws Exception {
		return directKbDAO.selKbYongji4(params);
	}
	@Override
	public List<DirectKbVO> selKbYongji5(DirectKbVO params) throws Exception {
		return directKbDAO.selKbYongji5(params);
	}

	// TODO 출력료
	@Override
	public List<DirectKbVO> selKbPrint1() throws Exception {
		return directKbDAO.selKbPrint1();
	}

	@Override
	public List<DirectKbVO> selKbPrint2() throws Exception {
		return directKbDAO.selKbPrint2();
	}

	@Override
	public List<DirectKbVO> selKbPrint3() throws Exception {
		return directKbDAO.selKbPrint3();
	}

	@Override
	public boolean inKbPrint(DirectKbVO params) throws Exception {
		return (directKbDAO.inKbPrint(params) == 1) ? true : false;
	}

	// TODO 사보료
	@Override
	public List<DirectKbVO> selKbHouseOrgan1() throws Exception {
		return directKbDAO.selKbHouseOrgan1();
	}

	@Override
	public List<DirectKbVO> selKbHouseOrgan2() throws Exception {
		return directKbDAO.selKbHouseOrgan2();
	}
	
	@Override
	public List<DirectKbVO> selKbHouseOrgan3() throws Exception {
		return directKbDAO.selKbHouseOrgan3();
	}

	@Override
	public boolean inKbHouseOrgan(DirectKbVO params) throws Exception {
		return (directKbDAO.inKbHouseOrgan(params) == 1) ? true : false;
	}
	
	// TODO 인쇄비
	@Override
	public List<DirectKbVO> selKbPresswork1(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork1(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork2(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork2(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork3(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork3(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork4(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork4(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork5(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork5(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork6(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork6(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork7(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork7(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork8(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork8(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork9(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork9(params);
	}
	@Override
	public boolean upKbPressworkOp52(DirectKbVO params) throws Exception {
		int quert_result = directKbDAO.upKbPressworkOp52(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<DirectKbVO> selKbPresswork10(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork10(params);
	}
	@Override
	public boolean upKbPresswork2(DirectKbVO params) throws Exception {
		int quert_result = directKbDAO.upKbPresswork2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<DirectKbVO> selKbPresswork11(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork11(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork12(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork12(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork13(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork13(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork14(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork14(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork15(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork15(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork16(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork16(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork17(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork17(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork18(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork18(params);
	}
	@Override
	public List<DirectKbVO> selKbPresswork19(DirectKbVO params) throws Exception {
		return directKbDAO.selKbPresswork19(params);
	}
	
	// TODO 제본비
	@Override
	public List<DirectKbVO> selKbBinding1(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding1(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding2(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding2(params);
	}
	@Override
	public DirectKbVO selKbBinding3(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding3(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding4(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding4(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding5(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding5(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding6(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding6(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding7(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding7(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding8(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding8(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding9(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding9(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding10(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding10(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding11(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding11(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding12(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding12(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding13(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding13(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding14(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding14(params);
	}
	@Override
	public List<DirectKbVO> selKbBinding15(DirectKbVO params) throws Exception {
		return directKbDAO.selKbBinding15(params);
	}
	
	// TODO 코팅비
	@Override
	public List<DirectKbVO> selKbCoating1(DirectKbVO params) throws Exception {
		return directKbDAO.selKbCoating1(params);
	}
	@Override
	public List<DirectKbVO> selKbCoating2(DirectKbVO params) throws Exception {
		return directKbDAO.selKbCoating2(params);
	}
	@Override
	public List<DirectKbVO> selKbCoating3() throws Exception {
		return directKbDAO.selKbCoating3();
	}
	@Override
	public List<DirectKbVO> selKbCoating4(DirectKbVO params) throws Exception {
		return directKbDAO.selKbCoating4(params);
	}
	@Override
	public List<DirectKbVO> selKbCoating5(DirectKbVO params) throws Exception {
		return directKbDAO.selKbCoating5(params);
	}
	@Override
	public List<DirectKbVO> selKbCoating6(DirectKbVO params) throws Exception {
		return directKbDAO.selKbCoating6(params);
	}
	@Override
	public List<DirectKbVO> selKbCoating7(DirectKbVO params) throws Exception {
		return directKbDAO.selKbCoating7(params);
	}
	
	// TODO 비닐비, 케이스대, CD음반대, 스티커대, 기타
	@Override
	public List<DirectKbVO> selKbManagement1(DirectKbVO params) throws Exception {
		return directKbDAO.selKbManagement1(params);
	}
	@Override
	public List<DirectKbVO> selKbManagement2(DirectKbVO params) throws Exception {
		return directKbDAO.selKbManagement2(params);
	}
	@Override
	public List<DirectKbVO> selKbManagement3(DirectKbVO params) throws Exception {
		return directKbDAO.selKbManagement3(params);
	}
	@Override
	public List<DirectKbVO> selKbManagement4(DirectKbVO params) throws Exception {
		return directKbDAO.selKbManagement4(params);
	}
	@Override
	public List<DirectKbVO> selKbManagement5(DirectKbVO params) throws Exception {
		return directKbDAO.selKbManagement5(params);
	}
	@Override
	public boolean upOp29(DirectKbVO params) throws Exception {
		int quert_result = directKbDAO.upOp29(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<DirectKbVO> selKbManagement6(DirectKbVO params) throws Exception {
		return directKbDAO.selKbManagement6(params);
	}
	@Override
	public boolean upKbManagement1(DirectKbVO params) throws Exception {
		int quert_result = directKbDAO.upKbManagement1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<DirectKbVO> selKbManagement7(DirectKbVO params) throws Exception {
		return directKbDAO.selKbManagement7(params);
	}
	@Override
	public boolean upKbManagement2(DirectKbVO params) throws Exception {
		int quert_result = directKbDAO.upKbManagement2(params);
		return (quert_result != 0) ? true : false;
	}
	@Override
	public List<DirectKbVO> selKbManagement8(DirectKbVO params) throws Exception {
		return directKbDAO.selKbManagement8(params);
	}
	@Override
	public List<DirectKbVO> selKbManagement9() throws Exception {
		return directKbDAO.selKbManagement9();
	}
	@Override
	public boolean inKbManagement1(DirectKbVO params) throws Exception {
		return (directKbDAO.inKbManagement1(params) == 1) ? true : false;
	}
}
