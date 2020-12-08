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
	public BooksVO selBooksDetail(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDetail(params);
	}
	
	//TODO 대수정보
	@RequestMapping(value="/books/select_book_daesu1", method=RequestMethod.POST)
	public List<BooksVO> selBooksDaesu1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDaesu1(params);
	}
	@RequestMapping(value="/books/select_book_daesu2", method=RequestMethod.POST)
	public List<BooksVO> selBooksDaesu2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBooksDaesu2(params);
	}
	
	@RequestMapping(value="/books/delete_daesu1", method=RequestMethod.POST)
	public boolean delDaesu1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.delDaesu1(params);
	}
	@RequestMapping(value="/books/select_daesu2", method=RequestMethod.POST)
	public long selDaesu2() throws Exception {
		return booksSVC.selDaesu2();
	}
	@RequestMapping(value="/books/insert_daesu3", method=RequestMethod.POST)
	public boolean inDaesu3(@RequestBody BooksVO params) throws Exception {
		return booksSVC.inDaesu3(params);
	}
	
	//TODO 용지정보
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
	
	@RequestMapping(value="/books/delete_yongji1", method=RequestMethod.POST)
	public boolean delYongji1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.delYongji1(params);
	}
	@RequestMapping(value="/books/insert_yongji2", method=RequestMethod.POST)
	public boolean inYongji2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.inYongji2(params);
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
	
	@RequestMapping(value="/books/insert_book", method=RequestMethod.POST)
	public boolean inBook(@RequestBody BooksVO params) throws Exception {
		return booksSVC.inBook(params);
	}
	@RequestMapping(value="/books/update_book", method=RequestMethod.POST)
	public boolean upBook(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBook(params);
	}
	@RequestMapping(value="/books/delete_book", method=RequestMethod.POST)
	public boolean delBook(@RequestBody BooksVO params) throws Exception {
		return booksSVC.delBook(params);
	}
	
	//TODO 정가인상
	//입력 : sbbook
	@RequestMapping(value="/books/update_book_insang", method=RequestMethod.POST)
	public boolean inBookInsang(@RequestBody BooksVO params) throws Exception {
		int num_sbbook = Integer.valueOf(params.getSbbook().replaceAll("[^0-9]","")) + 1;
		String ncode = String.format("%06s", num_sbbook);
		
		boolean in1 = booksSVC.inBookInsang1(params);
		
		long n_uid = booksSVC.selBookInsang2() + 1;
		
		BooksVO set_param = new BooksVO();
		set_param.setValue(ncode); //수정 값 sbbook
		set_param.setUid(n_uid);
		set_param.setSbuprc(params.getSbuprc()); //nval
		set_param.setSbbook(params.getSbbook()); //조건 값
		
		boolean up1 = booksSVC.upBookInsang3(set_param);
		
		BooksVO set_param2 = new BooksVO();
		set_param2.setBcode(ncode);
		set_param2.setBprice(params.getSbuprc());
		
		boolean in2 = booksSVC.inBookInsang4(set_param2);
		
		return in1 && up1 && in2;
	}
	
	@RequestMapping(value="/books/insert_book_insang1", method=RequestMethod.POST)
	public boolean inBookInsang1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.inBookInsang1(params);
	}
	@RequestMapping(value="/books/select_book_insang2", method=RequestMethod.POST)
	public long selBookInsang2() throws Exception {
		return booksSVC.selBookInsang2();
	}
	@RequestMapping(value="/books/update_book_insang3", method=RequestMethod.POST)
	public boolean upBookInsang3(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBookInsang3(params);
	}
	@RequestMapping(value="/books/insert_book_insang4", method=RequestMethod.POST)
	public boolean inBookInsang4(@RequestBody BooksVO params) throws Exception {
		return booksSVC.inBookInsang4(params);
	}
	
	//TODO 임시도서코드변경
	//입력 : sbbook, sbname, uid
	@RequestMapping(value="/books/update_temp_sbbook", method=RequestMethod.POST)
	public String upBookTempSbbook(@RequestBody BooksVO params) throws Exception {
		if(booksSVC.selBookTempSbbook1(params) != null) {
			return "overlab";
		} else {
			BooksVO get_param = booksSVC.selBooksDetail(params);
			
			String new_b = params.getSbbook().substring(0, 5);
			String old_b = get_param.getSbbook().substring(0, 5);
			
			BooksVO set_param = new BooksVO();
			set_param.setSbname(params.getSbname());
			set_param.setSbbook(params.getSbbook());
			set_param.setUid(params.getUid());
			boolean result1 = booksSVC.upBookTempSbbook2(set_param);
			
			set_param.setWdbook(old_b);
			set_param.setValue(new_b);
			boolean result2 = booksSVC.upBookTempSbbook3(set_param);
			
			set_param.setWybook(old_b);
			boolean result3 = booksSVC.upBookTempSbbook4(set_param);
			
			set_param.setB1bcode(get_param.getSbbook());
			set_param.setValue(params.getSbbook());
			boolean result4 = booksSVC.upBookTempSbbook5(set_param);
			
			set_param.setBcode(get_param.getSbbook());
			boolean result5 = booksSVC.upBookTempSbbook6(set_param);
			boolean result6 = booksSVC.upBookTempSbbook7(set_param);
			
			return String.valueOf(result1 && result2 && result3 && result4 && result5 && result6);
		}
	}
	@RequestMapping(value="/books/sel_books_temp_sbbook1", method=RequestMethod.POST)
	public BooksVO selBookTempSbbook1(@RequestBody BooksVO params) throws Exception {
		return booksSVC.selBookTempSbbook1(params);
	}
	@RequestMapping(value="/books/update_temp_sbbook2", method=RequestMethod.POST)
	public boolean upBookTempSbbook2(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBookTempSbbook2(params);
	}
	@RequestMapping(value="/books/update_temp_sbbook3", method=RequestMethod.POST)
	public boolean upBookTempSbbook3(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBookTempSbbook3(params);
	}
	@RequestMapping(value="/books/update_temp_sbbook4", method=RequestMethod.POST)
	public boolean upBookTempSbbook4(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBookTempSbbook4(params);
	}
	@RequestMapping(value="/books/update_temp_sbbook5", method=RequestMethod.POST)
	public boolean upBookTempSbbook5(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBookTempSbbook5(params);
	}
	@RequestMapping(value="/books/update_temp_sbbook6", method=RequestMethod.POST)
	public boolean upBookTempSbbook6(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBookTempSbbook6(params);
	}
	@RequestMapping(value="/books/update_temp_sbbook7", method=RequestMethod.POST)
	public boolean upBookTempSbbook7(@RequestBody BooksVO params) throws Exception {
		return booksSVC.upBookTempSbbook7(params);
	}
}
