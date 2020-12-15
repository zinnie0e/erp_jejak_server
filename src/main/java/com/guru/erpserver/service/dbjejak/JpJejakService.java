package com.guru.erpserver.service.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.CustomerVO;
import com.guru.erpserver.vo.dbjejak.JpJejakVO;

public interface JpJejakService {
	//TODO 공통
	List<JpJejakVO> selJpDay(JpJejakVO params) throws Exception;
	
	//TODO 발주예정제품리스트
	ArrayList<HashMap<String, Object>> selBjlistDateList(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjlistPageCount(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjlistList(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjlistList1(JpJejakVO params) throws Exception;
	boolean delBjlistItem(JpJejakVO params) throws Exception;
	JpJejakVO selBjlistItem(JpJejakVO params) throws Exception;
	String selBjlistBalju1(JpJejakVO params) throws Exception;
	JpJejakVO selBjlistBalju2(JpJejakVO params) throws Exception;
	JpJejakVO selBjlistBalju3(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjlistBalju4(JpJejakVO params) throws Exception;
	JpJejakVO selBjlistBalju41(JpJejakVO params) throws Exception;
	JpJejakVO selBjlistBalju411(JpJejakVO params) throws Exception;
	JpJejakVO selBjlistBalju412(JpJejakVO params) throws Exception;
	long selBjlistBalju413(JpJejakVO params) throws Exception;
	JpJejakVO selBjlistBalju4131(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak1(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak2(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak3(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak4(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak5(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak6(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak7(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak8(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak9(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak10(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak11(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak12(JpJejakVO params) throws Exception;
	List<JpJejakVO> selBjYjJejak13(JpJejakVO params) throws Exception;
	boolean upBjYjJejak1(JpJejakVO params) throws Exception;
	
	List<JpJejakVO> selStartBj1(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj2(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj3() throws Exception;
	List<JpJejakVO> selStartBj4(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj5() throws Exception;
	List<JpJejakVO> selStartBj6(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj7() throws Exception;
	List<JpJejakVO> selStartBj8() throws Exception;
	List<JpJejakVO> selStartBj9(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj10(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj11(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj12() throws Exception;
	List<JpJejakVO> selStartBj13() throws Exception;
	List<JpJejakVO> selStartBj14(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj15() throws Exception;
	List<JpJejakVO> selStartBj16(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj17(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj18(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj19(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj20() throws Exception;
	List<JpJejakVO> selStartBj21(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj22() throws Exception;
	List<JpJejakVO> selStartBj23(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj24() throws Exception;
	List<JpJejakVO> selStartBj25(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj26(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj27(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj28(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj29(JpJejakVO params) throws Exception;
	List<JpJejakVO> selStartBj30(JpJejakVO params) throws Exception;
	boolean upStartBj1(JpJejakVO params) throws Exception;
	boolean upStartBj2(JpJejakVO params) throws Exception;
	boolean upStartBj3(JpJejakVO params) throws Exception;
	boolean upStartBj4(JpJejakVO params) throws Exception;
	boolean inStartBj1(JpJejakVO params) throws Exception;
	boolean inStartBj2(JpJejakVO params) throws Exception;
	boolean inStartBj3(JpJejakVO params) throws Exception;
	boolean inStartBj4(JpJejakVO params) throws Exception;
	boolean inStartBj5(JpJejakVO params) throws Exception;
	boolean inStartBj6(JpJejakVO params) throws Exception;
	boolean inStartBj7(JpJejakVO params) throws Exception;
	boolean inStartBj8(JpJejakVO params) throws Exception;
	boolean inStartBj9(JpJejakVO params) throws Exception;
	boolean inStartBj10(JpJejakVO params) throws Exception;
	boolean inStartBj11(JpJejakVO params) throws Exception;
	boolean inStartBj12(JpJejakVO params) throws Exception;
	boolean inStartBj13(JpJejakVO params) throws Exception;
	boolean inStartBj14(JpJejakVO params) throws Exception;
	boolean inStartBj15(JpJejakVO params) throws Exception;
	
	//TODO 제작계획표
	List<JpJejakVO> selJpjejakplan0(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpjejakplan1(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpjejakplan2(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpjejakplan3(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpjejakplan4(JpJejakVO params) throws Exception;
	
	//TODO 중쇄예정제품
	List<JpJejakVO> selJpReprint1(JpJejakVO params) throws Exception;
	JpJejakVO selJpReprint2(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpReprint3(JpJejakVO params) throws Exception;
	JpJejakVO selJpReprint4(JpJejakVO params) throws Exception;
		
	//TODO 발주서
	List<JpJejakVO> selJpBal1() throws Exception;
	List<JpJejakVO> selJpBal2(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpBal3(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpBal4(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpBal5(JpJejakVO params) throws Exception;
	
	long selJpBalListid(JpJejakVO params) throws Exception;
	boolean upJpBalPwan(JpJejakVO params) throws Exception;
	boolean upJpBalIwan(JpJejakVO params) throws Exception;
	
	//TODO 표지작업지시서
	List<JpJejakVO> selJpPyo(JpJejakVO params) throws Exception;
	JpJejakVO selYakc(JpJejakVO params) throws Exception;
	
	JpJejakVO selJpPyoColo1(JpJejakVO params) throws Exception;
	boolean upJpPyoColo2(JpJejakVO params) throws Exception;
	JpJejakVO selJpPyoColo3(JpJejakVO params) throws Exception;
	boolean upJpPyoColo4(JpJejakVO params) throws Exception;
	
	//TODO 본문작업지시서
	List<JpJejakVO> selJpBon0(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpBon(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpBon2(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpBon3(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpBon4(JpJejakVO params) throws Exception;
	
	JpJejakVO selJpBonDetail1(JpJejakVO params) throws Exception;
	boolean upJpBonDetail2(JpJejakVO params) throws Exception;
	boolean upJpBonDetail3(JpJejakVO params) throws Exception;
	JpJejakVO selJpBonDetail4(JpJejakVO params) throws Exception;
	JpJejakVO selJpBonDetail5(JpJejakVO params) throws Exception;
	boolean upJpBonDetail6(JpJejakVO params) throws Exception;
	boolean upJpBonDetail7(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJpBonDetail8(JpJejakVO params) throws Exception;
	boolean upJpBonDetail9(JpJejakVO params) throws Exception;
	
	//TODO 입고대장
	List<JpJejakVO> selWarehousing(JpJejakVO params) throws Exception;
	
	//TODO 제작예정리스트 열람
	String selYejung1() throws Exception;
	int selYejung2Count(JpJejakVO params) throws Exception;
	List<JpJejakVO> selYejung2(JpJejakVO params) throws Exception;
	boolean delYejung(JpJejakVO params) throws Exception;
	
	//TODO 제작예정리스트 등록
	List<JpJejakVO> selYejungRegi1(JpJejakVO params) throws Exception;
	List<JpJejakVO> selYejungRegi2(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd1(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd2(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd3(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd4(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd5(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd6(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd7(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd8(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd9(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd10(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd11(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd12(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd13(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd14(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd15(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd16(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd17(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd18(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd19(JpJejakVO params) throws Exception;
	List<JpJejakVO> selJejakYjListAdd20(JpJejakVO params) throws Exception;
	boolean inJejakYjListAdd1(JpJejakVO params) throws Exception;
	
	//TODO 제품정가인상리스트
	List<JpJejakVO> selJpPriceUpList() throws Exception;
	
	//TODO 제품보류리스트
	List<JpJejakVO> selJpHoldList() throws Exception;
	
	//TODO 제품폐간리스트
	List<JpJejakVO> selJpCloseList() throws Exception;
	
	//TODO 신간적정재고관리
	List<JpJejakVO> selJpNewStockList(JpJejakVO params) throws Exception;
	boolean delJpNewStock(JpJejakVO params) throws Exception;
	boolean upJpNewStock(JpJejakVO params) throws Exception;
}
