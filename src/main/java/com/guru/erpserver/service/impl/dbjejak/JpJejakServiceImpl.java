package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.JpJejakService;
import com.guru.erpserver.mapper.dbjejak.JpJejakMapper;
import com.guru.erpserver.vo.dbjejak.CustomerVO;
import com.guru.erpserver.vo.dbjejak.JpJejakVO;

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
	public List<JpJejakVO> selBjlistPageCount(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjlistPageCount(params);
	}
	
	@Override
	public List<JpJejakVO> selBjlistList(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjlistList(params);
	}
	@Override
	public List<JpJejakVO> selBjlistList1(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjlistList1(params);
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
	@Override
	public List<JpJejakVO> selBjYjJejak1(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak1(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak2(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak3(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak3(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak4(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak4(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak5(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak5(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak6(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak6(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak7(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak7(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak8(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak8(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak9(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak9(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak10(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak10(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak11(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak11(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak12(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak12(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak13(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak13(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak14(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak14(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak15(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak15(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak16(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak16(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak17(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak17(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak18(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak18(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak19(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak19(params);
	}
	@Override
	public List<JpJejakVO> selBjYjJejak20(JpJejakVO params) throws Exception {
		return jpJejakDAO.selBjYjJejak20(params);
	}
	@Override
	public boolean upBjYjJejak1(JpJejakVO params) throws Exception {
		return jpJejakDAO.upBjYjJejak1(params) == 1 ? true : false;
	}
	
	//TODO 제작계획표
	@Override
	public List<JpJejakVO> selJpjejakplan0(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpjejakplan0(params);
	}
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
	
	//TODO 중쇄예정제품
	@Override
	public List<JpJejakVO> selJpReprint1(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpReprint1(params);
	}
	@Override
	public JpJejakVO selJpReprint2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpReprint2(params);
	}
	@Override
	public List<JpJejakVO> selJpReprint3(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpReprint3(params);
	}
	@Override
	public JpJejakVO selJpReprint4(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpReprint4(params);
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
	@Override
	public long selJpBalListid(JpJejakVO params) throws Exception {	
		Integer get_param = jpJejakDAO.selJpBalListid(params);
		long listid = 0;
		if(get_param != null) {
			listid = get_param;
		}
		return listid;
	}
	@Override
	public boolean upJpBalPwan(JpJejakVO params) throws Exception {
		return jpJejakDAO.upJpBalPwan(params) == 1 ? true : false;
	}
	@Override
	public boolean upJpBalIwan(JpJejakVO params) throws Exception {
		return jpJejakDAO.upJpBalIwan(params) == 1 ? true : false;
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
	@Override
	public JpJejakVO selJpPyoColo1(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpPyoColo1(params);
	}
	@Override
	public boolean upJpPyoColo2(JpJejakVO params) throws Exception {
		return jpJejakDAO.upJpPyoColo2(params) == 1 ? true : false;
	}
	@Override
	public JpJejakVO selJpPyoColo3(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpPyoColo3(params);
	}
	@Override
	public boolean upJpPyoColo4(JpJejakVO params) throws Exception {
		return jpJejakDAO.upJpPyoColo4(params) == 1 ? true : false;
	}
	
	//TODO 본문작업지시서
	@Override
	public List<JpJejakVO> selJpBon0(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBon0(params);
	}
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
	
	@Override
	public JpJejakVO selJpBonDetail1(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBonDetail1(params);
	}
	@Override
	public boolean upJpBonDetail2(JpJejakVO params) throws Exception {
		int result = jpJejakDAO.upJpBonDetail2(params);
		return (result == 1) ? true : false;
	}
	@Override
	public boolean upJpBonDetail3(JpJejakVO params) throws Exception {
		int result = jpJejakDAO.upJpBonDetail3(params);
		return (result == 1) ? true : false;
	}
	@Override
	public JpJejakVO selJpBonDetail4(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBonDetail4(params);
	}
	@Override
	public JpJejakVO selJpBonDetail5(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBonDetail5(params);
	}
	@Override
	public boolean upJpBonDetail6(JpJejakVO params) throws Exception {
		int result = jpJejakDAO.upJpBonDetail6(params);
		return (result == 1) ? true : false;
	}
	@Override
	public boolean upJpBonDetail7(JpJejakVO params) throws Exception {
		int result = jpJejakDAO.upJpBonDetail7(params);
		return (result == 1) ? true : false;
	}
	@Override
	public List<JpJejakVO> selJpBonDetail8(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJpBonDetail8(params);
	}
	@Override
	public boolean upJpBonDetail9(JpJejakVO params) throws Exception {
		int quert_result = jpJejakDAO.upJpBonDetail9(params);
		return (quert_result == 1) ? true : false;
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
	public int selYejung2Count(JpJejakVO params) throws Exception {
		System.out.println("!--" + jpJejakDAO.selYejung2Count(params));
		return jpJejakDAO.selYejung2Count(params);
	}
	@Override
	public List<JpJejakVO> selYejung2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selYejung2(params);
	}
	@Override
	public boolean delYejung(JpJejakVO params) throws Exception {
		int quert_result = jpJejakDAO.delYejung(params);
		return (quert_result == 1) ? true : false;
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
	@Override
	public List<JpJejakVO> selJejakYjListAdd1(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd1(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd2(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd2(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd3(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd3(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd4(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd4(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd5(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd5(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd6(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd6(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd7(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd7(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd8(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd8(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd9(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd9(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd10(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd10(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd11(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd11(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd12(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd12(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd13(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd13(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd14(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd14(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd15(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd15(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd16(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd16(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd17(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd17(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd18(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd18(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd19(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd19(params);
	}
	@Override
	public List<JpJejakVO> selJejakYjListAdd20(JpJejakVO params) throws Exception {
		return jpJejakDAO.selJejakYjListAdd20(params);
	}
	@Override
	public boolean inJejakYjListAdd1(JpJejakVO params) throws Exception {
		int quert_result = jpJejakDAO.inJejakYjListAdd1(params);
		return (quert_result == 1) ? true : false;
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
	@Override
	public boolean delJpNewStock(JpJejakVO params) throws Exception {
		int quert_result = jpJejakDAO.delJpNewStock(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upJpNewStock(JpJejakVO params) throws Exception {
		int quert_result = jpJejakDAO.upJpNewStock(params);
		return (quert_result == 1) ? true : false;
	}
}
