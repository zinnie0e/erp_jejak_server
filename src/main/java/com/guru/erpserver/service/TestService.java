package com.guru.erpserver.service;

import java.util.List;
import com.guru.erpserver.vo.TestVO;

public interface TestService {
	List<TestVO> getTestList() throws Exception;
}
