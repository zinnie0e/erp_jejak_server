package com.guru.erpserver.web.dbjejak;

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

import com.guru.erpserver.service.dbjejak.BooksService;
import com.guru.erpserver.vo.dbjejak.BooksVO;

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
	
	@RequestMapping(value="/books/select_book_daesu1", method=RequestMethod.POST)
	public List<BooksVO> selBooksDaesu1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDaesu1(params);
	}
	@RequestMapping(value="/books/select_book_daesu2", method=RequestMethod.POST)
	public List<BooksVO> selBooksDaesu2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDaesu2(params);
	}
	
	@RequestMapping(value="/books/del_books_daesu", method=RequestMethod.POST)
	public boolean delBooksDaesu(@RequestBody BooksVO params) throws Exception {
		return booksSVC.delBooksDaesu(params);
	}
	@RequestMapping(value="/books/sel_books_kswdesu0_max_uid", method=RequestMethod.POST)
	public long selBooksKswdesu0MaxUid() throws Exception {
		return booksSVC.selBooksKswdesu0MaxUid();
	}
	@RequestMapping(value="/books/in_books_daesu", method=RequestMethod.POST)
	public boolean inBooksDaesu(@RequestBody BooksVO params) throws Exception {
		return booksSVC.inBooksDaesu(params);
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
	
	@RequestMapping(value="/books/del_books_yongji", method=RequestMethod.POST)
	public boolean delBooksYongji(@RequestBody BooksVO params) throws Exception {
		return booksSVC.delBooksYongji(params);
	}
	@RequestMapping(value="/books/in_books_yongji", method=RequestMethod.POST)
	public boolean inBooksYongji(@RequestBody BooksVO params) throws Exception {
		return booksSVC.inBooksYongji(params);
	}
	
	@RequestMapping(value="/books/sel_books_max_sbbook", method=RequestMethod.POST)
	public String selBooksMaxSbbook(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksMaxSbbook(params);
	}
	
	@RequestMapping(value="/books/sel_books_sold_out1", method=RequestMethod.POST)
	public List<BooksVO> selBooksSoldOut1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksSoldOut1(params);
	}
	@RequestMapping(value="/books/sel_books_sold_out2", method=RequestMethod.POST)
	public List<BooksVO> selBooksSoldOut2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksSoldOut2(params);
	}
	@RequestMapping(value="/books/sel_books_sold_out3", method=RequestMethod.POST)
	public List<BooksVO> selBooksSoldOut3(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksSoldOut3(params);
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
