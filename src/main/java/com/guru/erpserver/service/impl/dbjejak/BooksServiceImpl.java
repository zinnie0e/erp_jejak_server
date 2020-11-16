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
	public List<BooksVO> selBooksDetail(BooksVO params) throws Exception {
		return booksDAO.selBooksDetail(params);
	}
	
	@Override
	public List<BooksVO> selBooksDeasu1(BooksVO params) throws Exception {
		return booksDAO.selBooksDeasu1(params);
	}
	@Override
	public List<BooksVO> selBooksDeasu2(BooksVO params) throws Exception {
		return booksDAO.selBooksDeasu2(params);
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
	public boolean inBooks(BooksVO params) throws Exception {
		int quert_result = booksDAO.inBooks(params);
		return (quert_result == 1) ? true : false;
	}
	
	@Override
	public boolean upBooks(BooksVO params) throws Exception {
		int quert_result = booksDAO.upBooks(params);
		return (quert_result == 1) ? true : false;
	}
	
	@Override
	public boolean delBooks(BooksVO params) throws Exception {
		int quert_result = booksDAO.delBooks(params);
		return (quert_result == 1) ? true : false;
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
