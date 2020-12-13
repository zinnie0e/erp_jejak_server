package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.CustomerVO;
import com.guru.erpserver.vo.dbjejak.JpJejakVO;

@Mapper
public interface JpJejakMapper {
	
	//TODO 공통
	public List<JpJejakVO> selJpDay(JpJejakVO params);
	
	//TODO 발주예정제품리스트
	public List<JpJejakVO> selBjlistDateList(JpJejakVO params);
	public List<JpJejakVO> selBjlistPageCount(JpJejakVO params);
	public List<JpJejakVO> selBjlistList(JpJejakVO params);
	public List<JpJejakVO> selBjlistList1(JpJejakVO params);
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
	public List<JpJejakVO> selBjYjJejak1(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak2(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak3(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak4(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak5(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak6(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak7(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak8(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak9(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak10(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak11(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak12(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak13(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak14(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak15(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak16(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak17(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak18(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak19(JpJejakVO params);
	public List<JpJejakVO> selBjYjJejak20(JpJejakVO params);
	public int upBjYjJejak1(JpJejakVO params);
	
	//TODO 제작계획표
	public List<JpJejakVO> selJpjejakplan0(JpJejakVO params);
	public List<JpJejakVO> selJpjejakplan1(JpJejakVO params);
	public List<JpJejakVO> selJpjejakplan2(JpJejakVO params);
	public List<JpJejakVO> selJpjejakplan3(JpJejakVO params);
	public List<JpJejakVO> selJpjejakplan4(JpJejakVO params);
	
	//TODO 중쇄예정제품
	public List<JpJejakVO> selJpReprint1(JpJejakVO params);
	public JpJejakVO selJpReprint2(JpJejakVO params);
	public List<JpJejakVO> selJpReprint3(JpJejakVO params);
	public JpJejakVO selJpReprint4(JpJejakVO params);
	
	//TODO 발주서
	public List<JpJejakVO> selJpBal1();
	public List<JpJejakVO> selJpBal2(JpJejakVO params);
	public List<JpJejakVO> selJpBal3(JpJejakVO params);
	public List<JpJejakVO> selJpBal4(JpJejakVO params);
	public List<JpJejakVO> selJpBal5(JpJejakVO params);
	
	public Integer selJpBalListid(JpJejakVO params);
	public int upJpBalPwan(JpJejakVO params);
	public int upJpBalIwan(JpJejakVO params);
	
	//TODO 표지작업지시서
	public List<JpJejakVO> selJpPyo(JpJejakVO params);
	public JpJejakVO selYakc(JpJejakVO params);

	public JpJejakVO selJpPyoColo1(JpJejakVO params);
	public int upJpPyoColo2(JpJejakVO params);
	public JpJejakVO selJpPyoColo3(JpJejakVO params);
	public int upJpPyoColo4(JpJejakVO params);
	
	//TODO 본문작업지시서
	public List<JpJejakVO> selJpBon0(JpJejakVO params);
	public List<JpJejakVO> selJpBon(JpJejakVO params);
	public List<JpJejakVO> selJpBon2(JpJejakVO params);
	public List<JpJejakVO> selJpBon3(JpJejakVO params);
	public List<JpJejakVO> selJpBon4(JpJejakVO params);
	
	public JpJejakVO selJpBonDetail1(JpJejakVO params);
	public int upJpBonDetail2(JpJejakVO params);
	public int upJpBonDetail3(JpJejakVO params);
	public JpJejakVO selJpBonDetail4(JpJejakVO params);
	public JpJejakVO selJpBonDetail5(JpJejakVO params);
	public int upJpBonDetail6(JpJejakVO params);
	public int upJpBonDetail7(JpJejakVO params);
	public List<JpJejakVO> selJpBonDetail8(JpJejakVO params);
	public int upJpBonDetail9(JpJejakVO params);
	
	//TODO 입고대장
	public List<JpJejakVO> selWarehousing(JpJejakVO params);
	
	//TODO 제작예정리스트 열람
	public JpJejakVO selYejung1();
	public int selYejung2Count(JpJejakVO params);
	public List<JpJejakVO> selYejung2(JpJejakVO params);
	public int delYejung(JpJejakVO params);
	
	//TODO 제작예정리스트 등록
	public List<JpJejakVO> selYejungRegi1(JpJejakVO params);	
	public List<JpJejakVO> selYejungRegi2(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd1(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd2(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd3(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd4(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd5(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd6(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd7(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd8(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd9(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd10(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd11(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd12(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd13(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd14(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd15(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd16(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd17(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd18(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd19(JpJejakVO params);
	public List<JpJejakVO> selJejakYjListAdd20(JpJejakVO params);
	public int inJejakYjListAdd1(JpJejakVO params);
	
	//TODO 제품정가인상리스트
	public List<JpJejakVO> selJpPriceUpList();
	
	//TODO 제품보류리스트
	public List<JpJejakVO> selJpHoldList();
	
	//TODO 제품폐간리스트
	public List<JpJejakVO> selJpCloseList();
	
	//TODO 신간적정재고관리
	public List<JpJejakVO> selJpNewStockList(JpJejakVO params);
	public int delJpNewStock(JpJejakVO params);
	public int upJpNewStock(JpJejakVO params);
}
