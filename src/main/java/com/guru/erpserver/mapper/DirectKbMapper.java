package com.guru.erpserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.DirectKbVO;
import com.guru.erpserver.vo.JmJejakVO;
import com.guru.erpserver.vo.Yongji.YongjiVO;

@Mapper
public interface DirectKbMapper {
	// TODO 공통
	
	// TODO 용지대
	public List<DirectKbVO> selKbYongji1();
	public List<DirectKbVO> selKbYongji2(DirectKbVO params);
	
	// TODO 출력료
	public List<DirectKbVO> selKbPrint1();
	public List<DirectKbVO> selKbPrint2();
	public long selKbPrint3();
	public int inKbPrint(DirectKbVO params);
	
	// TODO 사보료
	public List<DirectKbVO> selKbHouseOrgan1();
	public List<DirectKbVO> selKbHouseOrgan2();
	
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
	
	// TODO 제본비
	public List<DirectKbVO> selKbBinding1(DirectKbVO params);
	public List<DirectKbVO> selKbBinding2(DirectKbVO params);
	public DirectKbVO selKbBinding3(DirectKbVO params);
	
	// TODO 코팅비
	public List<DirectKbVO> selKbCoating1(DirectKbVO params);
	public List<DirectKbVO> selKbCoating2(DirectKbVO params);
	
	// TODO 비닐비, 케이스대, CD음반대, 스티커대, 기타
	public List<DirectKbVO> selKbManagement1(DirectKbVO params);
	public List<DirectKbVO> selKbManagement2(DirectKbVO params);
	public List<DirectKbVO> selKbManagement3(DirectKbVO params);
	public List<DirectKbVO> selKbManagement4(DirectKbVO params);
	public List<DirectKbVO> selKbManagement5(DirectKbVO params);
}
