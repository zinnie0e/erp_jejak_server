package com.guru.erpserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guru.erpserver.vo.BooksVO;


@Mapper
public interface BooksMapper {
	public List<BooksVO> selBooksList();
	
	public List<BooksVO> selBooksListCodeCheck(BooksVO params);
	
	public List<BooksVO> selBooksListNameCheck(BooksVO params);
	
	public List<BooksVO> selBooksDetail(BooksVO params);
	
	public int inBooks(BooksVO params);
	
	public int upBooks(BooksVO params);
	
	public int delBooks(BooksVO params);
}
