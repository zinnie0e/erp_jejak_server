package com.guru.erpserver.service.dbsky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbsky.DbSkyTestVO;

public interface DbSkyTestService {
	// TODO 용지대
	List<DbSkyTestVO> selAllBooksStock4(DbSkyTestVO params) throws Exception;
	
}
