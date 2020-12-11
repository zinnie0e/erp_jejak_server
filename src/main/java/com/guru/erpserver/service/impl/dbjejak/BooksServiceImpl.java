package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.BooksService;
import com.guru.erpserver.mapper.dbjejak.BooksMapper;
import com.guru.erpserver.vo.dbjejak.BooksVO;

@Service
public class BooksServiceImpl implements BooksService{
	@Resource
	private BooksMapper booksDAO;
	
	@Override
	public List<BooksVO> selBooksList1() throws Exception {
		return booksDAO.selBooksList1();
	}
	@Override
	public List<BooksVO> selBooksList2(BooksVO params) throws Exception {
		return booksDAO.selBooksList2(params);
	}
	
	@Override
	public List<BooksVO> selBooksListCheck1(BooksVO params) throws Exception {
		return booksDAO.selBooksListCheck1(params);
	}
	
	@Override
	public List<BooksVO> selBooksListCheck2(BooksVO params) throws Exception {
		return booksDAO.selBooksListCheck2(params);
	}
	
	@Override
	public List<BooksVO> selBooksListCodeCheck1(BooksVO params) throws Exception {
		return booksDAO.selBooksListCodeCheck1(params);
	}
	
	@Override
	public List<BooksVO> selBooksListCodeCheck2(BooksVO params) throws Exception {
		return booksDAO.selBooksListCodeCheck2(params);
	}
	
	@Override
	public List<BooksVO> selBooksListNameCheck1(BooksVO params) throws Exception {
		return booksDAO.selBooksListNameCheck1(params);
	}
	
	@Override
	public List<BooksVO> selBooksListNameCheck2(BooksVO params) throws Exception {
		return booksDAO.selBooksListNameCheck2(params);
	}
	
	@Override
	public BooksVO selBooksDetail(BooksVO params) throws Exception {
		return booksDAO.selBooksDetail(params);
	}
	
	@Override
	public List<BooksVO> selBooksDaesu1(BooksVO params) throws Exception {
		return booksDAO.selBooksDaesu1(params);
	}
	@Override
	public List<BooksVO> selBooksDaesu2(BooksVO params) throws Exception {
		return booksDAO.selBooksDaesu2(params);
	}
	
	@Override
	public boolean delDaesu1(BooksVO params) throws Exception {
		return (booksDAO.delDaesu1(params) == 1) ? true : false;
	}
	@Override
	public long selDaesu2() throws Exception {
		Integer get_param = booksDAO.selDaesu2();
		return get_param != null ? get_param : 0;
	}
	@Override
	public boolean inDaesu3(BooksVO params) throws Exception {
		return (booksDAO.inDaesu3(params) == 1) ? true : false;
	}
	
	@Override
	public List<BooksVO> selBooksYong1(BooksVO params) throws Exception {
		return booksDAO.selBooksYong1(params);
	}
	@Override
	public List<BooksVO> selBooksYong2(BooksVO params) throws Exception {
		return booksDAO.selBooksYong2(params);
	}
	@Override
	public List<BooksVO> selBooksYong3() throws Exception {
		return booksDAO.selBooksYong3();
	}
	
	@Override
	public boolean delYongji1(BooksVO params) throws Exception {
		return (booksDAO.delYongji1(params) == 1) ? true : false;
	}
	@Override
	public boolean inYongji2(BooksVO params) throws Exception {
		return (booksDAO.inYongji2(params) == 1) ? true : false;
	}
	
	@Override
	public String selBooksMaxSbbook(BooksVO params) throws Exception {
		BooksVO get_param = booksDAO.selBooksMaxSbbook(params);
		return get_param != null ? get_param.getSbbook() : "";
	}
	
	@Override
	public List<BooksVO> selBooksSoldOut1(BooksVO params) throws Exception {
		return booksDAO.selBooksSoldOut1(params);
	}
	@Override
	public List<BooksVO> selBooksSoldOut2(BooksVO params) throws Exception {
		return booksDAO.selBooksSoldOut2(params);
	}
	@Override
	public List<BooksVO> selBooksSoldOut3(BooksVO params) throws Exception {
		return booksDAO.selBooksSoldOut3(params);
	}
	
	@Override
	public boolean inBook(BooksVO params) throws Exception {
		return (booksDAO.inBook(params) == 1) ? true : false;
	}
	@Override
	public boolean upBook(BooksVO params) throws Exception {
		return (booksDAO.upBook(params) == 1) ? true : false;
	}
	@Override
	public boolean delBook(BooksVO params) throws Exception {
		return (booksDAO.delBook(params) == 1) ? true : false;
	}
	@Override
	public boolean inBookInsang1(BooksVO params) throws Exception {
		return (booksDAO.inBookInsang1(params) == 1) ? true : false;
	}
	@Override
	public long selBookInsang2() throws Exception {
		Integer get_param = booksDAO.selBookInsang2();
		return get_param != null ? get_param : 0;
	}
	@Override
	public boolean upBookInsang3(BooksVO params) throws Exception {
		return (booksDAO.upBookInsang3(params) == 1) ? true : false;
	}
	@Override
	public boolean inBookInsang4(BooksVO params) throws Exception {
		return (booksDAO.inBookInsang4(params) == 1) ? true : false;
	}
	
	@Override
	public BooksVO selBookTempSbbook1(BooksVO params) throws Exception {
		return booksDAO.selBookTempSbbook1(params);
	}
	@Override
	public boolean upBookTempSbbook2(BooksVO params) throws Exception {
		return (booksDAO.upBookTempSbbook2(params) == 1) ? true : false;
	}
	@Override
	public boolean upBookTempSbbook3(BooksVO params) throws Exception {
		return (booksDAO.upBookTempSbbook3(params) == 1) ? true : false;
	}
	@Override
	public boolean upBookTempSbbook4(BooksVO params) throws Exception {
		return (booksDAO.upBookTempSbbook4(params) == 1) ? true : false;
	}
	@Override
	public boolean upBookTempSbbook5(BooksVO params) throws Exception {
		return (booksDAO.upBookTempSbbook5(params) == 1) ? true : false;
	}
	@Override
	public boolean upBookTempSbbook6(BooksVO params) throws Exception {
		return (booksDAO.upBookTempSbbook6(params) == 1) ? true : false;
	}
	@Override
	public boolean upBookTempSbbook7(BooksVO params) throws Exception {
		return (booksDAO.upBookTempSbbook7(params) == 1) ? true : false;
	}
	private ArrayList<HashMap<String, Object>> mappingSelBooksList(List<BooksVO> list_params) {
		ArrayList<HashMap<String, Object>> result_list = new ArrayList<HashMap<String, Object>>();
		for(BooksVO temp_BooksVO : list_params) {
			HashMap<String, Object> temp_map = new HashMap<>();
			
			temp_map.put("sbbook", temp_BooksVO.getSbbook());
			temp_map.put("sbname", temp_BooksVO.getSbname());
			temp_map.put("uid", temp_BooksVO.getUid());
			
			result_list.add(temp_map);
		}
		
		return result_list;
	}
}
