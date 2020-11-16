package com.guru.erpserver.service.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.DirectKbVO;

public interface DirectKbService {
	// TODO 용지대
	List<DirectKbVO> selKbYongji1() throws Exception;
	List<DirectKbVO> selKbYongji2(DirectKbVO params) throws Exception;
	
	// TODO 출력료
	List<DirectKbVO> selKbPrint1() throws Exception;
	List<DirectKbVO> selKbPrint2() throws Exception;
	List<DirectKbVO> selKbPrint3() throws Exception;
	boolean inKbPrint(DirectKbVO params) throws Exception;
	
	// TODO 사보료
	List<DirectKbVO> selKbHouseOrgan1() throws Exception;
	List<DirectKbVO> selKbHouseOrgan2() throws Exception;
	List<DirectKbVO> selKbHouseOrgan3() throws Exception;
	boolean inKbHouseOrgan(DirectKbVO params) throws Exception;
	
	// TODO 인쇄비
	List<DirectKbVO> selKbPresswork1(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbPresswork2(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbPresswork3(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbPresswork4(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbPresswork5(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbPresswork6(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbPresswork7(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbPresswork8(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbPresswork9(DirectKbVO params) throws Exception;
	boolean upKbPressworkOp52(DirectKbVO params) throws Exception;
	
	// TODO 제본비
	List<DirectKbVO> selKbBinding1(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbBinding2(DirectKbVO params) throws Exception;
	DirectKbVO selKbBinding3(DirectKbVO params) throws Exception;
	
	// TODO 코팅비
	List<DirectKbVO> selKbCoating1(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbCoating2(DirectKbVO params) throws Exception;
	
	// TODO 비닐비, 케이스대, CD음반대, 스티커대, 기타
	List<DirectKbVO> selKbManagement1(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbManagement2(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbManagement3(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbManagement4(DirectKbVO params) throws Exception;
	List<DirectKbVO> selKbManagement5(DirectKbVO params) throws Exception;
	boolean upOp29(DirectKbVO params) throws Exception;
}
