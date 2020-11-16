package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.JmJejakService;
import com.guru.erpserver.mapper.dbjejak.JmJejakMapper;
import com.guru.erpserver.vo.dbjejak.JmJejakVO;

@Service
public class JmJejakServiceImpl implements JmJejakService {
	@Resource
	private JmJejakMapper jmJejakDAO;

	// TODO 공통
	@Override
	public List<JmJejakVO> selJmDayList(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmDayList(params);
	}
	
	// TODO 제작계획표
	@Override
	public List<JmJejakVO> selJmjejakplan0(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmjejakplan0(params);
	}
	@Override
	public List<JmJejakVO> selJmjejakplan1(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmjejakplan1(params);
	}
	@Override
	public List<JmJejakVO> selJmjejakplan2(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmjejakplan2(params);
	}

	// TODO 표지작업지시서
	@Override
	public List<JmJejakVO> selJmPyo(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmPyo(params);
	}

	// TODO 본문작업지시서
	@Override
	public List<JmJejakVO> selJmBon0(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmBon0(params);
	}
	@Override
	public List<JmJejakVO> selJmBon(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmBon(params);
	}
	@Override
	public List<JmJejakVO> selJmBon2(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmBon2(params);
	}
	@Override
	public List<JmJejakVO> selJmBon3(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmBon3(params);
	}
	
	// TODO 발주서
	@Override
	public List<JmJejakVO> selJmBal1() throws Exception {
		return jmJejakDAO.selJmBal1();
	}
	@Override
	public List<JmJejakVO> selJmBal2(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmBal2(params);
	}
	@Override
	public List<JmJejakVO> selJmBal3(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmBal3(params);
	}
	@Override
	public List<JmJejakVO> selJmBal4(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmBal4(params);
	}
	@Override
	public List<JmJejakVO> selJmBal5(JmJejakVO params) throws Exception {
		return jmJejakDAO.selJmBal5(params);
	}

}
