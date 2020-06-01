package com.guru.erpserver.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guru.erpserver.service.TestService;
import com.guru.erpserver.mapper.TestMapper;
import com.guru.erpserver.vo.TestVO;

@Service
public class TestServiceImpl implements TestService{
	@Resource
	private TestMapper testDAO;
	
	@Override
	public List<TestVO> getTestList() throws Exception {
		return testDAO.selectTestList();
	}
}
