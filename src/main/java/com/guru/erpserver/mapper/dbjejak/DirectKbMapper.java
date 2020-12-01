package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.DirectKbVO;

@Mapper
public interface DirectKbMapper {
	// TODO 공통
	
	// TODO 용지대
	public List<DirectKbVO> selKbYongji1();
	public List<DirectKbVO> selKbYongji2(DirectKbVO params);
	public List<DirectKbVO> selKbYongji3(DirectKbVO params);
	public List<DirectKbVO> selKbYongji4(DirectKbVO params);
	public List<DirectKbVO> selKbYongji5(DirectKbVO params);
	
	// TODO 출력료
	public List<DirectKbVO> selKbPrint1();
	public List<DirectKbVO> selKbPrint2();
	public List<DirectKbVO> selKbPrint3();
	public int inKbPrint(DirectKbVO params);
	
	// TODO 사보료
	public List<DirectKbVO> selKbHouseOrgan1();
	public List<DirectKbVO> selKbHouseOrgan2();
	public List<DirectKbVO> selKbHouseOrgan3();
	public int inKbHouseOrgan(DirectKbVO params);
	
	// TODO 인쇄비
	public List<DirectKbVO> selKbPresswork1(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork2(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork3(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork4(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork5(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork6(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork7(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork8(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork9(DirectKbVO params);
	public int upKbPressworkOp52(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork10(DirectKbVO params);
	public int upKbPresswork2(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork11(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork12(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork13(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork14(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork15(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork16(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork17(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork18(DirectKbVO params);
	public List<DirectKbVO> selKbPresswork19(DirectKbVO params);
	
	// TODO 제본비
	public List<DirectKbVO> selKbBinding1(DirectKbVO params);
	public List<DirectKbVO> selKbBinding2(DirectKbVO params);
	public DirectKbVO selKbBinding3(DirectKbVO params);
	public List<DirectKbVO> selKbBinding4(DirectKbVO params);
	public List<DirectKbVO> selKbBinding5(DirectKbVO params);
	public List<DirectKbVO> selKbBinding6(DirectKbVO params);
	public List<DirectKbVO> selKbBinding7(DirectKbVO params);
	public List<DirectKbVO> selKbBinding8(DirectKbVO params);
	public List<DirectKbVO> selKbBinding9(DirectKbVO params);
	public List<DirectKbVO> selKbBinding10(DirectKbVO params);
	public List<DirectKbVO> selKbBinding11(DirectKbVO params);
	public List<DirectKbVO> selKbBinding12(DirectKbVO params);
	public List<DirectKbVO> selKbBinding13(DirectKbVO params);
	public List<DirectKbVO> selKbBinding14(DirectKbVO params);
	public List<DirectKbVO> selKbBinding15(DirectKbVO params);
	
	// TODO 코팅비
	public List<DirectKbVO> selKbCoating1(DirectKbVO params);
	public List<DirectKbVO> selKbCoating2(DirectKbVO params);
	public List<DirectKbVO> selKbCoating3();
	public List<DirectKbVO> selKbCoating4(DirectKbVO params);
	public List<DirectKbVO> selKbCoating5(DirectKbVO params);
	public List<DirectKbVO> selKbCoating6(DirectKbVO params);
	public List<DirectKbVO> selKbCoating7(DirectKbVO params);
	
	// TODO 비닐비, 케이스대, CD음반대, 스티커대, 기타
	public List<DirectKbVO> selKbManagement1(DirectKbVO params);
	public List<DirectKbVO> selKbManagement2(DirectKbVO params);
	public List<DirectKbVO> selKbManagement3(DirectKbVO params);
	public List<DirectKbVO> selKbManagement4(DirectKbVO params);
	public List<DirectKbVO> selKbManagement5(DirectKbVO params);
	public int upOp29(DirectKbVO params);
	public List<DirectKbVO> selKbManagement6(DirectKbVO params);
	public int upKbManagement1(DirectKbVO params);
	public List<DirectKbVO> selKbManagement7(DirectKbVO params);
	public int upKbManagement2(DirectKbVO params);
	public List<DirectKbVO> selKbManagement8(DirectKbVO params);
	public List<DirectKbVO> selKbManagement9();
	public int inKbManagement1(DirectKbVO params);
}
