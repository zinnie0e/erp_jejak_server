package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guru.erpserver.vo.dbjejak.BooksVO;


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

	public List<BooksVO> selBooksDaesu1(BooksVO params);
	public List<BooksVO> selBooksDaesu2(BooksVO params);
	
	public Integer delBooksDaesu(BooksVO params);
	public Integer selBooksKswdesu0MaxUid();
	public Integer inBooksDaesu(BooksVO params);
	
	public List<BooksVO> selBooksYong1(BooksVO params);
	public List<BooksVO> selBooksYong2(BooksVO params);
	public List<BooksVO> selBooksYong3();
	
	public Integer delBooksYongji(BooksVO params);
	public Integer inBooksYongji(BooksVO params);
	
	public BooksVO selBooksMaxSbbook(BooksVO params);
	
	public List<BooksVO> selBooksSoldOut1(BooksVO params);
	public List<BooksVO> selBooksSoldOut2(BooksVO params);
	public List<BooksVO> selBooksSoldOut3(BooksVO params);
	
	public Integer inBooks(BooksVO params);
	
	public Integer upBooks(BooksVO params);
	
	public Integer delBooks(BooksVO params);
}
