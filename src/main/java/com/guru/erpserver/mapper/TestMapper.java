package com.guru.erpserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guru.erpserver.vo.TestVO;

@Mapper
public interface TestMapper {
	List<TestVO> selectTestList() throws Exception;
}
