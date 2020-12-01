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
	
	List<BooksVO> selBooksDetail(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksDaesu1(BooksVO params) throws Exception;
	List<BooksVO> selBooksDaesu2(BooksVO params) throws Exception;
	
	boolean delBooksDaesu(BooksVO params) throws Exception;
	long selBooksKswdesu0MaxUid() throws Exception;
	boolean inBooksDaesu(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksYong1(BooksVO params) throws Exception;
	List<BooksVO> selBooksYong2(BooksVO params) throws Exception;
	List<BooksVO> selBooksYong3() throws Exception;
	
	boolean delBooksYongji(BooksVO params) throws Exception;
	boolean inBooksYongji(BooksVO params) throws Exception;
	
	String selBooksMaxSbbook(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksSoldOut1(BooksVO params) throws Exception;
	List<BooksVO> selBooksSoldOut2(BooksVO params) throws Exception;
	List<BooksVO> selBooksSoldOut3(BooksVO params) throws Exception;
	
	boolean inBooks(BooksVO params) throws Exception;
	
	boolean upBooks(BooksVO params) throws Exception;
	
	boolean delBooks(BooksVO params) throws Exception;
}
