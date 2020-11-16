package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.MonthClosingService;
import com.guru.erpserver.mapper.dbjejak.MonthClosingMapper;
import com.guru.erpserver.vo.dbjejak.MonthClosingVO;

@Service
public class MonthClosingServiceImpl implements MonthClosingService {
	@Resource
	private MonthClosingMapper monthClosingDAO;

	// TODO 공통

	// TODO 도서별 원가계산서
	@Override
	public List<MonthClosingVO> selBookCostStatement1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement1(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement2(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement3(params);
	}
	
	// TODO 잡물 원가계산서
	@Override
	public List<MonthClosingVO> selJMCostStatement1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement1(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement2(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement3(params);
	}
	
	// TODO 품목별 원재료명세서(월별)
	@Override
	public List<MonthClosingVO> selPumMon1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon1(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon2() throws Exception {
		return monthClosingDAO.selPumMon2();
	}
	@Override
	public List<MonthClosingVO> selPumMon3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon3(params);
	}
	@Override
	public boolean inPumMon1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inPumMon1(params);
		return (quert_result == 1) ? true : false;
	}
	
	// TODO 품목별 원재료명세서(기간)
	@Override
	public List<MonthClosingVO> selPumPer1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer1(params);
	}
	
	// TODO 저자료 지급 내역(상/하)
	@Override
	public List<MonthClosingVO> selRoyaltyUD1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD1(params);
	}	
	
	@Override
	public List<MonthClosingVO> selRoyaltyUD2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD2(params);
	}
	
	// TODO 월별 저자료 지출결의서
	@Override
	public List<MonthClosingVO> selMonthlyRoyalty(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMonthlyRoyalty(params);
	}
	
	// TODO 저자료 지급 내역??
	@Override
	public List<MonthClosingVO> selRoyalty(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyalty(params);
	}
	
	// TODO 주은교육 제작현황
	@Override
	public List<MonthClosingVO> selJueun(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJueun(params);
	}

}