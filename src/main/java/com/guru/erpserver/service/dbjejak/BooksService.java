package com.guru.erpserver.service.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.BooksVO;

public interface BooksService {
	
	List<BooksVO> selBooksList1() throws Exception;
	List<BooksVO> selBooksList2(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksListCheck1(BooksVO params) throws Exception;
	List<BooksVO> selBooksListCheck2(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksListCodeCheck1(BooksVO params) throws Exception;
	List<BooksVO> selBooksListCodeCheck2(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksListNameCheck1(BooksVO params) throws Exception;
	List<BooksVO> selBooksListNameCheck2(BooksVO params) throws Exception;
	
	BooksVO selBooksDetail(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksDaesu1(BooksVO params) throws Exception;
	List<BooksVO> selBooksDaesu2(BooksVO params) throws Exception;
	
	boolean delDaesu1(BooksVO params) throws Exception;
	long selDaesu2() throws Exception;
	boolean inDaesu3(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksYong1(BooksVO params) throws Exception;
	List<BooksVO> selBooksYong2(BooksVO params) throws Exception;
	List<BooksVO> selBooksYong3() throws Exception;
	
	boolean delYongji1(BooksVO params) throws Exception;
	boolean inYongji2(BooksVO params) throws Exception;
	
	String selBooksMaxSbbook(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksSoldOut1(BooksVO params) throws Exception;
	List<BooksVO> selBooksSoldOut2(BooksVO params) throws Exception;
	List<BooksVO> selBooksSoldOut3(BooksVO params) throws Exception;
	
	boolean inBook(BooksVO params) throws Exception;
	boolean upBook(BooksVO params) throws Exception;
	boolean delBook(BooksVO params) throws Exception;
	
	boolean inBookInsang1(BooksVO params) throws Exception;
	long selBookInsang2() throws Exception;
	boolean upBookInsang3(BooksVO params) throws Exception;
	boolean inBookInsang4(BooksVO params) throws Exception;
	
	BooksVO selBookTempSbbook1(BooksVO params) throws Exception;
	boolean upBookTempSbbook2(BooksVO params) throws Exception;
	boolean upBookTempSbbook3(BooksVO params) throws Exception;
	boolean upBookTempSbbook4(BooksVO params) throws Exception;
	boolean upBookTempSbbook5(BooksVO params) throws Exception;
	boolean upBookTempSbbook6(BooksVO params) throws Exception;
	boolean upBookTempSbbook7(BooksVO params) throws Exception;
}
