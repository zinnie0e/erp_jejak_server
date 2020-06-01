package com.guru.erpserver.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.JmJejakVO;

public interface JmJejakService {
	// TODO 입고대장
	List<JmJejakVO> selJmDayList(JmJejakVO params) throws Exception;
	
	// TODO 제작계획표
	List<JmJejakVO> selJmjejakplan1(JmJejakVO params) throws Exception;
	List<JmJejakVO> selJmjejakplan2(JmJejakVO params) throws Exception;

	// TODO 표지작업지시서
	List<JmJejakVO> selJmPyo(JmJejakVO params) throws Exception;

	// TODO 본문작업지시서
	List<JmJejakVO> selJmBon(JmJejakVO params) throws Exception;
	List<JmJejakVO> selJmBon2(JmJejakVO params) throws Exception;
	List<JmJejakVO> selJmBon3(JmJejakVO params) throws Exception;
	
	// TODO 발주서
	List<JmJejakVO> selJmBal1() throws Exception;
	List<JmJejakVO> selJmBal2(JmJejakVO params) throws Exception;
	List<JmJejakVO> selJmBal3(JmJejakVO params) throws Exception;
	List<JmJejakVO> selJmBal4(JmJejakVO params) throws Exception;
	List<JmJejakVO> selJmBal5(JmJejakVO params) throws Exception;
}
