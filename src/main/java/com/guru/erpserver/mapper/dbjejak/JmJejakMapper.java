package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.JmJejakVO;

@Mapper
public interface JmJejakMapper {

	// TODO 공통
	public List<JmJejakVO> selJmDayList(JmJejakVO params);
	
	// TODO 제작계획표
	public List<JmJejakVO> selJmjejakplan0(JmJejakVO params);
	public List<JmJejakVO> selJmjejakplan1(JmJejakVO params);
	public List<JmJejakVO> selJmjejakplan2(JmJejakVO params);
	
	// TODO 표지작업지시서
	public List<JmJejakVO> selJmPyo(JmJejakVO params);

	// TODO 본문작업지시서
	public List<JmJejakVO> selJmBon0(JmJejakVO params);
	public List<JmJejakVO> selJmBon(JmJejakVO params);
	public List<JmJejakVO> selJmBon2(JmJejakVO params);
	public List<JmJejakVO> selJmBon3(JmJejakVO params);
	
	// TODO 발주서
	public List<JmJejakVO> selJmBal1();
	public List<JmJejakVO> selJmBal2(JmJejakVO params);
	public List<JmJejakVO> selJmBal3(JmJejakVO params);
	public List<JmJejakVO> selJmBal4(JmJejakVO params);
	public List<JmJejakVO> selJmBal5(JmJejakVO params);
}
