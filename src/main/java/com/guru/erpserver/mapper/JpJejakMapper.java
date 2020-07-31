package com.guru.erpserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.JpJejak.JpJejakVO;
import com.guru.erpserver.vo.Yongji.YongjiVO;

@Mapper
public interface JpJejakMapper {
	
	//TODO 공통
	public List<JpJejakVO> selJpDay(JpJejakVO params);
	
	//TODO 발주예정제품리스트
	public List<JpJejakVO> selBjlistDateList(JpJejakVO params);
	public long selBjlistPageCount(JpJejakVO params);
	public List<JpJejakVO> selBjlistList(JpJejakVO params);
	public int delBjlistItem(JpJejakVO params);
	public JpJejakVO selBjlistItem(JpJejakVO params);
	public JpJejakVO selBjlistBalju1(JpJejakVO params);
	public JpJejakVO selBjlistBalju2(JpJejakVO params);
	public JpJejakVO selBjlistBalju3(JpJejakVO params);
	public List<JpJejakVO> selBjlistBalju4(JpJejakVO params);
	public JpJejakVO selBjlistBalju41(JpJejakVO params);
	public JpJejakVO selBjlistBalju411(JpJejakVO params);
	public JpJejakVO selBjlistBalju412(JpJejakVO params);
	public long selBjlistBalju413(JpJejakVO params);
	public JpJejakVO selBjlistBalju4131(JpJejakVO params);
	
	//TODO 제작계획표
	public List<JpJejakVO> selJpjejakplan1(JpJejakVO params);
	public List<JpJejakVO> selJpjejakplan2(JpJejakVO params);
	public List<JpJejakVO> selJpjejakplan3(JpJejakVO params);
	public List<JpJejakVO> selJpjejakplan4(JpJejakVO params);
	
	//TODO 발주서
	public List<JpJejakVO> selJpBal1();
	public List<JpJejakVO> selJpBal2(JpJejakVO params);
	public List<JpJejakVO> selJpBal3(JpJejakVO params);
	public List<JpJejakVO> selJpBal4(JpJejakVO params);
	public List<JpJejakVO> selJpBal5(JpJejakVO params);
	
	//TODO 표지작업지시서
	public List<JpJejakVO> selJpPyo(JpJejakVO params);
	public JpJejakVO selYakc(JpJejakVO params);

	//TODO 본문작업지시서
	public List<JpJejakVO> selJpBon(JpJejakVO params);
	public List<JpJejakVO> selJpBon2(JpJejakVO params);
	public List<JpJejakVO> selJpBon3(JpJejakVO params);
	public List<JpJejakVO> selJpBon4(JpJejakVO params);
	
	//TODO 입고대장
	public List<JpJejakVO> selWarehousing(JpJejakVO params);
	
	//TODO 제작예정리스트 열람
	public JpJejakVO selYejung1();
	public List<JpJejakVO> selYejung2(JpJejakVO params);
	
	//TODO 제작예정리스트 등록
	public List<JpJejakVO> selYejungRegi1(JpJejakVO params);	
	public List<JpJejakVO> selYejungRegi2(JpJejakVO params);	
	
	//TODO 제품정가인상리스트
	public List<JpJejakVO> selJpPriceUpList();
	
	//TODO 제품보류리스트
	public List<JpJejakVO> selJpHoldList();
	
	//TODO 제품폐간리스트
	public List<JpJejakVO> selJpCloseList();
	
	//TODO 신간적정재고관리
	public List<JpJejakVO> selJpNewStockList(JpJejakVO params);
}
