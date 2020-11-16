package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.ProductIOService;
import com.guru.erpserver.mapper.dbjejak.ProductIOMapper;
import com.guru.erpserver.vo.dbjejak.ProductIOVO;

@Service
public class ProductIOServiceImpl implements ProductIOService {
	@Resource
	private ProductIOMapper productIODAO;

	// TODO 공통

	// TODO 구매일보
	@Override
	public List<ProductIOVO> selPurchaseDaily1(ProductIOVO params) throws Exception {
		return productIODAO.selPurchaseDaily1(params);
	}	
	@Override
	public List<ProductIOVO> selPurchaseDaily2(ProductIOVO params) throws Exception {
		return productIODAO.selPurchaseDaily2(params);
	}
	@Override
	public List<ProductIOVO> selPurchaseDaily3(ProductIOVO params) throws Exception {
		return productIODAO.selPurchaseDaily3(params);
	}
	@Override
	public List<ProductIOVO> selPurchaseDaily4(ProductIOVO params) throws Exception {
		return productIODAO.selPurchaseDaily4(params);
	}
	@Override
	public List<ProductIOVO> selPurchaseDaily5(ProductIOVO params) throws Exception {
		return productIODAO.selPurchaseDaily5(params);
	}
	
	// TODO 월입고현황표
	@Override
	public List<ProductIOVO> selMonStockStatusTable(ProductIOVO params) throws Exception {
		return productIODAO.selMonStockStatusTable(params);
	}	
	@Override
	public boolean upMonStockStatusTable1(ProductIOVO params) throws Exception {
		int quert_result = productIODAO.upMonStockStatusTable1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upMonStockStatusTable2(ProductIOVO params) throws Exception {
		int quert_result = productIODAO.upMonStockStatusTable2(params);
		return (quert_result == 1) ? true : false;
	}
	
	// TODO 월입고현황표 디테일
	@Override
	public List<ProductIOVO> selMonStockStatusTableDetail1(ProductIOVO params) throws Exception {
		return productIODAO.selMonStockStatusTableDetail1(params);
	}
	@Override
	public List<ProductIOVO> selMonStockStatusTableDetail2(ProductIOVO params) throws Exception {
		return productIODAO.selMonStockStatusTableDetail2(params);
	}

	// TODO 일일집계현황
	@Override
	public List<ProductIOVO> selDailyStatus1(ProductIOVO params) throws Exception {
		return productIODAO.selDailyStatus1(params);
	}
	@Override
	public List<ProductIOVO> selDailyStatus2(ProductIOVO params) throws Exception {
		return productIODAO.selDailyStatus2(params);
	}
	
	// TODO 폐기리스트
	@Override
	public List<ProductIOVO> selDisposalList(ProductIOVO params) throws Exception {
		return productIODAO.selDisposalList(params);
	}
	
}
