package com.guru.erpserver.service.impl.dbsky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbsky.DbSkyTestService;
import com.guru.erpserver.mapper.dbsky.DbSkyTestMapper;
import com.guru.erpserver.vo.dbsky.DbSkyTestVO;

@Service
public class DbSkyTestServiceImpl implements DbSkyTestService {
	@Resource
	private DbSkyTestMapper dbSkyTestDAO;

	// TODO 공통

	@Override
	public List<DbSkyTestVO> selAllBooksStock4(DbSkyTestVO params) throws Exception {
		return dbSkyTestDAO.selAllBooksStock4(params);
	}

}
