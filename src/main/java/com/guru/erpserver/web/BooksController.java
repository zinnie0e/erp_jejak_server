package com.guru.erpserver.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.BooksService;
import com.guru.erpserver.vo.BooksVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class BooksController {
	@Resource
	private BooksService booksSVC;

	
	@RequestMapping(value="/books/select_bookList1", method=RequestMethod.POST)
	public List<BooksVO> selBooksList1() throws Exception {
		return booksSVC.selBooksList1();
	}
	@RequestMapping(value="/books/select_bookList2", method=RequestMethod.POST)
	public List<BooksVO> selBooksList2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksList2(params);
	}
	
	@RequestMapping(value="/books/select_list_check1", method=RequestMethod.POST)
	public List<BooksVO> selBooksListCheck1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksListCheck1(params);
	}
	@RequestMapping(value="/books/select_list_check2", method=RequestMethod.POST)
	public List<BooksVO> selBooksListCheck2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksListCheck2(params);
	}
	
	@RequestMapping(value="/books/select_list_code_check1", method=RequestMethod.POST)
	public List<BooksVO> selBooksListCodeCheck1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksListCodeCheck1(params);
	}
	@RequestMapping(value="/books/select_list_code_check2", method=RequestMethod.POST)
	public List<BooksVO> selBooksListCodeCheck2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksListCodeCheck2(params);
	}
	
	@RequestMapping(value="/books/select_list_name_check1", method=RequestMethod.POST)
	public List<BooksVO> selBooksListNameCheck1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksListNameCheck1(params);
	}
	@RequestMapping(value="/books/select_list_name_check2", method=RequestMethod.POST)
	public List<BooksVO> selBooksListNameCheck2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksListNameCheck2(params);
	}
	
	@RequestMapping(value="/books/select_detail", method=RequestMethod.POST)
	public List<BooksVO> selBooksDetail(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDetail(params);
	}
	
	@RequestMapping(value="/books/select_book_deasu1", method=RequestMethod.POST)
	public List<BooksVO> selBooksDeasu1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDeasu1(params);
	}
	@RequestMapping(value="/books/select_book_deasu2", method=RequestMethod.POST)
	public List<BooksVO> selBooksDeasu2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDeasu2(params);
	}
	
	@RequestMapping(value="/books/select_book_yong1", method=RequestMethod.POST)
	public List<BooksVO> selBooksYong1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksYong1(params);
	}
	@RequestMapping(value="/books/select_book_yong2", method=RequestMethod.POST)
	public List<BooksVO> selBooksYong2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksYong2(params);
	}
	@RequestMapping(value="/books/select_book_yong3", method=RequestMethod.POST)
	public List<BooksVO> selBooksYong3() throws Exception {
		return booksSVC.selBooksYong3();
	}
	
	@RequestMapping(value="/books/insert", method=RequestMethod.POST)
	public boolean inBooks(@RequestBody BooksVO params) throws Exception {
		return booksSVC.inBooks(params);
	}
	
	@RequestMapping(value="/books/update", method=RequestMethod.POST)
	public boolean upBooks(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBooks(params);
	}
	
	@RequestMapping(value="/books/delete", method=RequestMethod.POST)
	public boolean delBooks(@RequestBody BooksVO params) throws Exception {
		return booksSVC.delBooks(params);
	}
}
