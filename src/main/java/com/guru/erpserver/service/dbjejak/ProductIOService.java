package com.guru.erpserver.service.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.ProductIOVO;

public interface ProductIOService {
	
	// TODO 구매일보
	List<ProductIOVO> selPurchaseDaily1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily3(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily4(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily5(ProductIOVO params) throws Exception;
	
	// TODO 월입고현황표
	List<ProductIOVO> selMonStockStatusTable(ProductIOVO params) throws Exception;
	boolean upMonStockStatusTable1(ProductIOVO params) throws Exception;
	boolean upMonStockStatusTable2(ProductIOVO params) throws Exception;
	
	// TODO 월입고현황표 디테일
	List<ProductIOVO> selMonStockStatusTableDetail1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selMonStockStatusTableDetail2(ProductIOVO params) throws Exception;
	
	// TODO 일일집계현황
	List<ProductIOVO> selDailyStatus1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDailyStatus2(ProductIOVO params) throws Exception;
	
	// TODO 폐기리스트
	List<ProductIOVO> selDisposalList(ProductIOVO params) throws Exception;
}
