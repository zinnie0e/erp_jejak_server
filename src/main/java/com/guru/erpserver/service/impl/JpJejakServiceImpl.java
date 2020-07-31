package com.guru.erpserver.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.JpJejakService;
import com.guru.erpserver.mapper.JpJejakMapper;
import com.guru.erpserver.vo.JpJejak.JpJejakVO;
import com.guru.erpserver.vo.Yongji.YongjiVO;

@Service
public class JpJejakServiceImpl implements JpJejakService{
	@Resource
	private JpJejakMapper jpJejakDAO;
	
	//TODO 공통
	@Override
	public List<JpJejakVO> selJpDay(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpDay(params);
	}
	
	//TODO 발주예정제품리스트
	@Override
	public ArrayList<HashMap<String, Object>> selBjlistDateList(JpJejakVO params) throws Exception {
		ArrayList<HashMap<String, Object>> result_list = new ArrayList<HashMap<String, Object>>();
		
		List<JpJejakVO> list_params = jpJejakDAO.selBjlistDateList(params);
		for(JpJejakVO temp_jpJejakVO : list_params) {
			HashMap<String, Object> temp_map = new HashMap<>();
			
			temp_map.put("signdate", temp_jpJejakVO.getSigndate());
			
			result_list.add(temp_map);
		}
		return result_list;
	}
	
	@Override
	public long selBjlistPageCount(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjlistPageCount(params);
	}
	
	@Override
	public List<JpJejakVO> selBjlistList(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjlistList(params);
	}
	
	@Override
	public boolean delBjlistItem(JpJejakVO params) throws Exception {
		int quert_result = jpJejakDAO.delBjlistItem(params);
		return (quert_result == 1) ? true : false;
	}
	
	@Override
	public JpJejakVO selBjlistItem(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjlistItem(params);
	}
	
	@Override
	public String selBjlistBalju1(JpJejakVO params) throws Exception {	
		JpJejakVO jpJejakVO = jpJejakDAO.selBjlistBalju1(params);
		
		return jpJejakVO != null ? jpJejakVO.getSbbook() : null;
	}
	
	@Override
	public JpJejakVO selBjlistBalju2(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selBjlistBalju2(params);
	}
	
	@Override
	public JpJejakVO selBjlistBalju3(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selBjlistBalju2(params);
	}
	
	@Override
	public List<JpJejakVO> selBjlistBalju4(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selBjlistBalju4(params);
	}
	
	@Override
	public JpJejakVO selBjlistBalju41(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selBjlistBalju41(params);
	}
	
	@Override
	public JpJejakVO selBjlistBalju411(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selBjlistBalju411(params);
	}
	
	@Override
	public JpJejakVO selBjlistBalju412(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selBjlistBalju412(params);
	}
	
	@Override
	public long selBjlistBalju413(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selBjlistBalju413(params);
	}
	
	@Override
	public JpJejakVO selBjlistBalju4131(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selBjlistBalju4131(params);
	}
	
	//TODO 제작계획표
	@Override
	public List<JpJejakVO> selJpjejakplan1(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpjejakplan1(params);
	}
	@Override
	public List<JpJejakVO> selJpjejakplan2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpjejakplan2(params);
	}
	@Override
	public List<JpJejakVO> selJpjejakplan3(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpjejakplan3(params);
	}
	@Override
	public List<JpJejakVO> selJpjejakplan4(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpjejakplan4(params);
	}
	
	//TODO 발주서
	@Override
	public List<JpJejakVO> selJpBal1() throws Exception {
		return jpJejakDAO.selJpBal1();
	}
	@Override
	public List<JpJejakVO> selJpBal2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBal2(params);
	}
	@Override
	public List<JpJejakVO> selJpBal3(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBal3(params);
	}
	@Override
	public List<JpJejakVO> selJpBal4(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBal4(params);
	}
	@Override
	public List<JpJejakVO> selJpBal5(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBal5(params);
	}
	
	//TODO 표지작업지시서
	@Override
	public List<JpJejakVO> selJpPyo(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpPyo(params);
	}
	@Override
	public JpJejakVO selYakc(JpJejakVO params) throws Exception {		
		return jpJejakDAO.selYakc(params);
	}
	
	//TODO 본문작업지시서
	@Override
	public List<JpJejakVO> selJpBon(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBon(params);
	}
	@Override
	public List<JpJejakVO> selJpBon2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBon2(params);
	}
	@Override
	public List<JpJejakVO> selJpBon3(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBon3(params);
	}
	@Override
	public List<JpJejakVO> selJpBon4(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBon4(params);
	}
	
	//TODO 입고대장
	@Override
	public List<JpJejakVO> selWarehousing(JpJejakVO params) throws Exception {
		return jpJejakDAO.selWarehousing(params);
	}
	
	//TODO 제작예정리스트 열람
	@Override
	public String selYejung1() throws Exception {	
		return jpJejakDAO.selYejung1().getSigndate();
	}
	@Override
	public List<JpJejakVO> selYejung2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selYejung2(params);
	}
	
	//TODO 제작예정리스트 등록
	@Override
	public List<JpJejakVO> selYejungRegi1(JpJejakVO params) throws Exception {
		return jpJejakDAO.selYejungRegi1(params);
	}
	@Override
	public List<JpJejakVO> selYejungRegi2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selYejungRegi2(params);
	}
	
	//TODO 제품정가인상리스트
	@Override
	public List<JpJejakVO> selJpPriceUpList() throws Exception {
		return jpJejakDAO.selJpPriceUpList();
	}
	
	//TODO 제품보류리스트
	@Override
	public List<JpJejakVO> selJpHoldList() throws Exception {
		return jpJejakDAO.selJpHoldList();
	}
	
	//TODO 제품폐간리스트
	@Override
	public List<JpJejakVO> selJpCloseList() throws Exception {
		return jpJejakDAO.selJpCloseList();
	}
	
	//TODO 신간적정재고관리
	@Override
	public List<JpJejakVO> selJpNewStockList(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpNewStockList(params);
	}
}
