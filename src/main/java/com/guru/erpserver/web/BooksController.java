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

	@RequestMapping(value="/books/select_list", method=RequestMethod.POST)
	public ArrayList<HashMap<String, Object>> selBooksList() throws Exception {
		return booksSVC.selBooksList();
	}
	
	@RequestMapping(value="/books/select_list_code_check", method=RequestMethod.POST)
	public ArrayList<HashMap<String, Object>> selBooksListCodeCheck(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksListCodeCheck(params);
	}
	
	@RequestMapping(value="/books/select_list_name_check", method=RequestMethod.POST)
	public ArrayList<HashMap<String, Object>> selBooksListNameCheck(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksListNameCheck(params);
	}
	
	@RequestMapping(value="/books/select_detail", method=RequestMethod.POST)
	public List<BooksVO> selBooksDetail(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDetail(params);
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
