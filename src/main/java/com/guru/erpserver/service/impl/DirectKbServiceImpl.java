package com.guru.erpserver.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.DirectKbService;
import com.guru.erpserver.mapper.DirectKbMapper;
import com.guru.erpserver.vo.DirectKbVO;
import com.guru.erpserver.vo.JmJejakVO;
import com.guru.erpserver.vo.Yongji.YongjiVO;

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
	
	// TODO 코팅비
	@Override
	public List<DirectKbVO> selKbCoating1(DirectKbVO params) throws Exception {
		return directKbDAO.selKbCoating1(params);
	}
	@Override
	public List<DirectKbVO> selKbCoating2(DirectKbVO params) throws Exception {
		return directKbDAO.selKbCoating2(params);
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
}
