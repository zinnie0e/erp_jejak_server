package com.guru.erpserver.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.BooksService;
import com.guru.erpserver.mapper.BooksMapper;
import com.guru.erpserver.vo.BooksVO;

@Service
public class BooksServiceImpl implements BooksService{
	@Resource
	private BooksMapper booksDAO;
	
	@Override
	public ArrayList<HashMap<String, Object>> selBooksList() throws Exception {
		return mappingSelBooksList(booksDAO.selBooksList());
	}
	
	@Override
	public ArrayList<HashMap<String, Object>> selBooksListCodeCheck(BooksVO params) throws Exception {
		return mappingSelBooksList(booksDAO.selBooksListCodeCheck(params));
	}
	
	@Override
	public ArrayList<HashMap<String, Object>> selBooksListNameCheck(BooksVO params) throws Exception {
		return mappingSelBooksList(booksDAO.selBooksListNameCheck(params));
	}
	
	@Override
	public List<BooksVO> selBooksDetail(BooksVO params) throws Exception {
		return booksDAO.selBooksDetail(params);
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
