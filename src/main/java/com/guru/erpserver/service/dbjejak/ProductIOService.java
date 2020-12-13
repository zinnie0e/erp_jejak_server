package com.guru.erpserver.service.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.CustomerVO;
import com.guru.erpserver.vo.dbjejak.ProductIOVO;

public interface ProductIOService {
	
	// TODO 구매일보
	List<ProductIOVO> selPurchaseDaily1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily2_2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily3(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily4(ProductIOVO params) throws Exception;
	List<ProductIOVO> selPurchaseDaily5(ProductIOVO params) throws Exception;
	
	// TODO 월입고현황표
	List<ProductIOVO> selMonStockStatusTable(ProductIOVO params) throws Exception;
	boolean upMonStockStatusTable1(ProductIOVO params) throws Exception;
	boolean upMonStockStatusTable2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selMonStockStatusTable2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selMonStockStatusTable3(ProductIOVO params) throws Exception;
	
	// TODO 월입고현황표 디테일
	List<ProductIOVO> selMonStockStatusTableDetail1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selMonStockStatusTableDetail2(ProductIOVO params) throws Exception;
	
	// TODO 재고조회
	List<ProductIOVO> selInventoryInquiry1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selInventoryInquiry2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selInventoryInquiry3(ProductIOVO params) throws Exception;
	
	// TODO 월간거래처구분별일일집계
	List<ProductIOVO> selMonCuDailyTotal1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selMonCuDailyTotal2(ProductIOVO params) throws Exception;
	
	// TODO 도서수불카드
	List<ProductIOVO> selBookPaymentCard1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentCard2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentCard3(ProductIOVO params) throws Exception;
	
	// TODO 거래명세서일일번호별집계
	List<ProductIOVO> selDealDailyNumber1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber3(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber3_2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber4(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber4_2(ProductIOVO params) throws Exception;
	boolean upDealDailyNumber1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber5(ProductIOVO params) throws Exception;
	boolean inDealDailyNumber1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber6(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber7(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber8(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber9(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber10(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDealDailyNumber11(ProductIOVO params) throws Exception;
	
	// TODO 일일집계현황
	List<ProductIOVO> selDailyStatus1(ProductIOVO params) throws Exception;
	List<ProductIOVO> selDailyStatus2(ProductIOVO params) throws Exception;
	
	// TODO 폐기리스트
	List<ProductIOVO> selDisposalList(ProductIOVO params) throws Exception;
	
	// TODO 구분별도서수불재고현황
	List<ProductIOVO> selBookPaymentStockStatusByCate1() throws Exception;
	List<ProductIOVO> selBookPaymentStockStatusByCate2(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentStockStatusByCate3(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentStockStatusByCate4(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentStockStatusByCate5(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentStockStatusByCate6(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentStockStatusByCate7(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentStockStatusByCate8(ProductIOVO params) throws Exception;
	List<ProductIOVO> selBookPaymentStockStatusByCate9(ProductIOVO params) throws Exception;
	boolean upBookPaymentStockStatusByCate1(ProductIOVO params) throws Exception;
	boolean upBookPaymentStockStatusByCate2(ProductIOVO params) throws Exception;
	boolean upBookPaymentStockStatusByCate3(ProductIOVO params) throws Exception;
}
