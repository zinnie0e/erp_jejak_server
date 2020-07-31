package com.guru.erpserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guru.erpserver.vo.BooksVO;


@Mapper
public interface BooksMapper {
	
	public List<BooksVO> selBooksList1();
	public List<BooksVO> selBooksList2(BooksVO params);
	
	public List<BooksVO> selBooksListCheck1(BooksVO params);
	public List<BooksVO> selBooksListCheck2(BooksVO params);
	
	public List<BooksVO> selBooksListCodeCheck1(BooksVO params);
	public List<BooksVO> selBooksListCodeCheck2(BooksVO params);
	
	public List<BooksVO> selBooksListNameCheck1(BooksVO params);
	public List<BooksVO> selBooksListNameCheck2(BooksVO params);
	
	public List<BooksVO> selBooksDetail(BooksVO params);

	public List<BooksVO> selBooksDeasu1(BooksVO params);
	public List<BooksVO> selBooksDeasu2(BooksVO params);
	
	public List<BooksVO> selBooksYong1(BooksVO params);
	public List<BooksVO> selBooksYong2(BooksVO params);
	public List<BooksVO> selBooksYong3();
	
	public int inBooks(BooksVO params);
	
	public int upBooks(BooksVO params);
	
	public int delBooks(BooksVO params);
}
