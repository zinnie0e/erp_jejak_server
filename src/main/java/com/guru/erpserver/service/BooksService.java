package com.guru.erpserver.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.BooksVO;

public interface BooksService {
	ArrayList<HashMap<String, Object>> selBooksList() throws Exception;
	
	ArrayList<HashMap<String, Object>> selBooksListCodeCheck(BooksVO params) throws Exception;
	
	ArrayList<HashMap<String, Object>> selBooksListNameCheck(BooksVO params) throws Exception;
	
	List<BooksVO> selBooksDetail(BooksVO params) throws Exception;
	
	boolean inBooks(BooksVO params) throws Exception;
	
	boolean upBooks(BooksVO params) throws Exception;
	
	boolean delBooks(BooksVO params) throws Exception;
}
