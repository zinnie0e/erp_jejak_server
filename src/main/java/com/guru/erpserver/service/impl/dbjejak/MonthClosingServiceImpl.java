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
	@Override
	public List<MonthClosingVO> selBookCostStatement4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement4(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement5(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement6(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement7(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement7(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement8(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement8(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement9(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement9(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement10(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement10(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement11(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement11(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement12(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement12(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement13(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement13(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement14(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement14(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement15(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement15(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement16(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement16(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement17(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement17(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement18(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement18(params);
	}
	@Override
	public boolean inBookCostStatement19(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inBookCostStatement19(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement20(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement20(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement21(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement21(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement22(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement22(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement23(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement23(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement24(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement24(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement25(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement25(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement26(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement26(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement27(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement27(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement28(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement28(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement29(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement29(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement30(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement30(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement31(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement31(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement32(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement32(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement33(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement33(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement34(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement34(params);
	}
	@Override
	public boolean upBookCostStatement35(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement35(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement36(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement36(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement37(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement37(params);
	}
	@Override
	public boolean upBookCostStatement38(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement38(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement39(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement39(params);
	}
	@Override
	public boolean upBookCostStatement40(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement40(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement41(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement41(params);
	}
	@Override
	public boolean upBookCostStatement42(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement42(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement43(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement43(params);
	}
	@Override
	public boolean upBookCostStatement44(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement44(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement45(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement45(params);
	}
	@Override
	public boolean upBookCostStatement46(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement46(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean delBookCostStatement47(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.delBookCostStatement47(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement48(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement48(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement49(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement49(params);
	}
	@Override
	public boolean inBookCostStatement50(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inBookCostStatement50(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement51(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement51(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement52(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement52(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement53(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement53(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement54(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement54(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement55(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement55(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement56(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement56(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement57(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement57(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement58(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement58(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement59(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement59(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement60(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement60(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement61(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement61(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement62(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement62(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement63(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement63(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement64(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement64(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement65(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement65(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement66(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement66(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement67(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement67(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement68(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement68(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement69(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement69(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement70(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement70(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement71(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement71(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement72(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement72(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement73(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement73(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement74(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement74(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement75(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement75(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement76(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement76(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement77(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement77(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement78(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement78(params);
	}
	@Override
	public List<MonthClosingVO> selBookCostStatement79(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookCostStatement79(params);
	}
	@Override
	public boolean inBookCostStatement1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inBookCostStatement1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inBookCostStatement2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inBookCostStatement2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement3(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement3(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement4(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement4(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement5(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement5(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement6(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement6(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement7(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement7(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement8(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement8(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement9(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement9(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement10(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement10(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement11(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement11(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement12(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement12(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement13(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement13(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement14(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement14(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement15(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement15(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement16(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement16(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement17(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement17(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement18(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement18(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement19(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement19(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement21(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement21(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement22(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement22(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement23(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement23(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement24(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement24(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement25(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement25(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement26(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement26(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement27(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement27(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement28(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement28(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement29(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement29(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement30(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement30(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement31(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement31(params);
		System.out.println(quert_result);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookCostStatement32(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement32(params);
		return (quert_result == 1) ? true : false;
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
	@Override
	public List<MonthClosingVO> selJMCostStatement4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement4(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement5(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement6(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement7(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement7(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement8(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement8(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement9(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement9(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement10(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement10(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement11(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement11(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement12(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement12(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement13(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement13(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement14(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement14(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement15(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement15(params);
	}
	@Override
	public List<MonthClosingVO> selJMCostStatement16(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJMCostStatement16(params);
	}
	@Override
	public boolean inJMCostStatement17(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement17(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upJMCostStatement18(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookCostStatement18(params);
		return (quert_result == 1) ? true : false;
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
	public List<MonthClosingVO> selPumMon4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon4(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon5(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon6(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon7(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon7(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon8(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon8(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon9(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon9(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon10(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon10(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon11(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon11(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon12(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon12(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon13(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon13(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon14(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon14(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon15(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon15(params);
	}
	@Override
	public List<MonthClosingVO> selPumMon16(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumMon16(params);
	}
	@Override
	public boolean inPumMon1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inPumMon1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inPumMon2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inPumMon2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon3(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon3(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon4(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon4(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon5(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon5(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon6(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon6(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon7(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon7(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon8(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon8(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon9(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon9(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPumMon10(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPumMon10(params);
		return (quert_result == 1) ? true : false;
	}
	
	// TODO 품목별 원재료명세서(기간)
	@Override
	public List<MonthClosingVO> selPumPer1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer1(params);
	}
	@Override
	public List<MonthClosingVO> selPumPer2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer2(params);
	}
	@Override
	public List<MonthClosingVO> selPumPer3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer3(params);
	}
	@Override
	public List<MonthClosingVO> selPumPer4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer4(params);
	}
	@Override
	public List<MonthClosingVO> selPumPer5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer5(params);
	}
	@Override
	public List<MonthClosingVO> selPumPer6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer6(params);
	}
	@Override
	public List<MonthClosingVO> selPumPer7(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer6(params);
	}
	@Override
	public List<MonthClosingVO> selPumPer8(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPumPer8(params);
	}
	@Override
	public boolean inPumPer1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inPumPer1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean delPumPer1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.delPumPer1(params);
		return (quert_result == 1) ? true : false;
	}
	
	// TODO 제조비명세표
	@Override
	public List<MonthClosingVO> selMCSpecification1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification1(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification2(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification3(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification4(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification5(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification6(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification7(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification7(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification8(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification8(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification9(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification9(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification10(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification10(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification11(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification11(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification12(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification12(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification13(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification13(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification14(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification14(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification15(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification15(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification16(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification16(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification17(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification17(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification18(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification18(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification19(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification19(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification20(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification20(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification21(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification21(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification22(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification22(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification23(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification23(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification24(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification24(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification25(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification25(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification26(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification26(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification27(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification27(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification28(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification28(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification29(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification29(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification30(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification30(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification31(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification31(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification32(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification32(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification33(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification33(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification34(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification34(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification35(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification35(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification36(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification36(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification37(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification37(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification38(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification38(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification39(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification39(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification40(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification40(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification41(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification41(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification42(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification42(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification43(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification43(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification44(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification44(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification45(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification45(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification46(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification46(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification47(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification47(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification48(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification48(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification49(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification49(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification50(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification50(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification51(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification51(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification52(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification52(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification53(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification53(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification54(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification54(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification55(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification55(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification56(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification56(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification57(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification57(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification58(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification58(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification59(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification59(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification60(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification60(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification61(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification61(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification62(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification62(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification63(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification63(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification64(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification64(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification65(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification65(params);
	}
	@Override
	public List<MonthClosingVO> selMCSpecification66(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selMCSpecification66(params);
	}
	@Override
	public boolean inMCSpecification1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inMCSpecification1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inMCSpecification2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inMCSpecification2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inMCSpecification3(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inMCSpecification3(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inMCSpecification4(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inMCSpecification4(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification3(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification3(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification4(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification4(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification5(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification5(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification6(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification6(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification7(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification7(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification8(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification8(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification9(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification9(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification10(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification10(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification11(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification11(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMCSpecification12(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upMCSpecification12(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean delMCSpecification1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.delMCSpecification1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean delMCSpecification2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.delMCSpecification2(params);
		return (quert_result == 1) ? true : false;
	}
	
	// TODO 거래처별 지불명세서
	@Override
	public List<MonthClosingVO> selPaymentAccount1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount1(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount2(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount3(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount4(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount5(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount6(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount7(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount7(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount8(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount8(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount9(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount9(params);
	}
	@Override
	public List<MonthClosingVO> selPaymentAccount10(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPaymentAccount10(params);
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
	@Override
	public List<MonthClosingVO> selRoyaltyUD3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD3(params);
	}
	@Override
	public List<MonthClosingVO> selRoyaltyUD4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD4(params);
	}
	@Override
	public List<MonthClosingVO> selRoyaltyUD5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD5(params);
	}
	@Override
	public List<MonthClosingVO> selRoyaltyUD6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD6(params);
	}
	@Override
	public List<MonthClosingVO> selRoyaltyUD7(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD7(params);
	}
	@Override
	public List<MonthClosingVO> selRoyaltyUD8(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD8(params);
	}
	@Override
	public List<MonthClosingVO> selRoyaltyUD9(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD9(params);
	}
	@Override
	public List<MonthClosingVO> selRoyaltyUD10(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD10(params);
	}
	@Override
	public List<MonthClosingVO> selRoyaltyUD11(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selRoyaltyUD11(params);
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
	
	// TODO 구매단가입력
	@Override 	
	public List<MonthClosingVO> selPurchasePrice1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice1(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice2(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice3(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice4(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice5(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice6(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice7(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice7(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice8(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice8(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice9(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice9(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice10(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice10(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice11(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice11(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice12(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice12(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice13(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice13(params);
	}
	@Override 	
	public List<MonthClosingVO> selPurchasePrice14(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selPurchasePrice14(params);
	}
	@Override
	public boolean inPurchasePrice1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inPurchasePrice1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inPurchasePrice2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inPurchasePrice2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPurchasePrice1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPurchasePrice1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPurchasePrice2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPurchasePrice2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upPurchasePrice3(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upPurchasePrice3(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean delPurchasePrice1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.delPurchasePrice1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean delPurchasePrice2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.delPurchasePrice2(params);
		return (quert_result == 1) ? true : false;
	}
	
	// TODO 도서 수량/금액 집계
	@Override
	public List<MonthClosingVO> selBookQuantityAmountTotal1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookQuantityAmountTotal1(params);
	}
	@Override
	public List<MonthClosingVO> selBookQuantityAmountTotal2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookQuantityAmountTotal2(params);
	}
	@Override
	public List<MonthClosingVO> selBookQuantityAmountTotal3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookQuantityAmountTotal3(params);
	}
	@Override
	public List<MonthClosingVO> selBookQuantityAmountTotal4(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookQuantityAmountTotal4(params);
	}
	@Override
	public List<MonthClosingVO> selBookQuantityAmountTotal5(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookQuantityAmountTotal5(params);
	}
	@Override
	public List<MonthClosingVO> selBookQuantityAmountTotal6(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookQuantityAmountTotal6(params);
	}

	@Override
	public boolean inBookQuantityAmountTotal1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inBookQuantityAmountTotal1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inBookQuantityAmountTotal2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inBookQuantityAmountTotal2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean inBookQuantityAmountTotal3(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inBookQuantityAmountTotal3(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookQuantityAmountTotal1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookQuantityAmountTotal1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookQuantityAmountTotal2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookQuantityAmountTotal2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookQuantityAmountTotal3(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookQuantityAmountTotal3(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookQuantityAmountTotal4(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookQuantityAmountTotal4(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookQuantityAmountTotal5(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookQuantityAmountTotal5(params);
		return (quert_result == 1) ? true : false;
	}
	
	
	// TODO 도서금액집계
	@Override
	public List<MonthClosingVO> selBookAmountTotal1(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookAmountTotal1(params);
	}
	@Override
	public List<MonthClosingVO> selBookAmountTotal2(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookAmountTotal2(params);
	}
	@Override
	public List<MonthClosingVO> selBookAmountTotal3(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selBookAmountTotal3(params);
	}
	@Override
	public boolean inBookAmountTotal1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.inBookAmountTotal1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookAmountTotal1(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookAmountTotal1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookAmountTotal2(MonthClosingVO params) throws Exception {
		int quert_result = monthClosingDAO.upBookAmountTotal2(params);
		return (quert_result == 1) ? true : false;
	}
		
	// TODO 주은교육 제작현황
	@Override
	public List<MonthClosingVO> selJueun(MonthClosingVO params) throws Exception {
		return monthClosingDAO.selJueun(params);
	}

}
