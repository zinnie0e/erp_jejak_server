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
	
	List<BooksVO> selBooksDeasu1(BooksVO params) throws Exception;
	List<BooksVO> selBooksDeasu2(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksYong1(BooksVO params) throws Exception;
	List<BooksVO> selBooksYong2(BooksVO params) throws Exception;
	List<BooksVO> selBooksYong3() throws Exception;
	
	boolean inBooks(BooksVO params) throws Exception;
	
	boolean upBooks(BooksVO params) throws Exception;
	
	boolean delBooks(BooksVO params) throws Exception;
}
