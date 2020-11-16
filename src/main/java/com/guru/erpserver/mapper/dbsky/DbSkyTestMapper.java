package com.guru.erpserver.mapper.dbsky;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guru.erpserver.vo.dbsky.DbSkyTestVO;

@Mapper
public interface DbSkyTestMapper {
	
	//전도서재고조회
	public List<DbSkyTestVO> selAllBooksStock4(DbSkyTestVO params);
}
