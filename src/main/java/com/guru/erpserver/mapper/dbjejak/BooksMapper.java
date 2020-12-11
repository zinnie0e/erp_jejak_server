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
	
	public BooksVO selBooksDetail(BooksVO params);

	public List<BooksVO> selBooksDaesu1(BooksVO params);
	public List<BooksVO> selBooksDaesu2(BooksVO params);
	
	public int delDaesu1(BooksVO params);
	public Integer selDaesu2();
	public int inDaesu3(BooksVO params);
	
	public List<BooksVO> selBooksYong1(BooksVO params);
	public List<BooksVO> selBooksYong2(BooksVO params);
	public List<BooksVO> selBooksYong3();
	
	public int delYongji1(BooksVO params);
	public int inYongji2(BooksVO params);
	
	public BooksVO selBooksMaxSbbook(BooksVO params);
	
	public List<BooksVO> selBooksSoldOut1(BooksVO params);
	public List<BooksVO> selBooksSoldOut2(BooksVO params);
	public List<BooksVO> selBooksSoldOut3(BooksVO params);
	
	public int inBook(BooksVO params);
	public int upBook(BooksVO params);
	public int delBook(BooksVO params);
	
	public int inBookInsang1(BooksVO params);
	public Integer selBookInsang2();
	public int upBookInsang3(BooksVO params);
	public int inBookInsang4(BooksVO params);
	
	public BooksVO selBookTempSbbook1(BooksVO params);
	public int upBookTempSbbook2(BooksVO params);
	public int upBookTempSbbook3(BooksVO params);
	public int upBookTempSbbook4(BooksVO params);
	public int upBookTempSbbook5(BooksVO params);
	public int upBookTempSbbook6(BooksVO params);
	public int upBookTempSbbook7(BooksVO params);
}
