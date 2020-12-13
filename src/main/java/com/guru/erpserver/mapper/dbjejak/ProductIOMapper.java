package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.CustomerVO;
import com.guru.erpserver.vo.dbjejak.ProductIOVO;

@Mapper
public interface ProductIOMapper {
	// TODO 공통
	
	// TODO 구매일보
	public List<ProductIOVO> selPurchaseDaily1(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily2(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily2_2(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily3(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily4(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily5(ProductIOVO params);

	// TODO 월입고현황표
	public List<ProductIOVO> selMonStockStatusTable(ProductIOVO params);
	public int upMonStockStatusTable1(ProductIOVO params);
	public int upMonStockStatusTable2(ProductIOVO params);
	public List<ProductIOVO> selMonStockStatusTable2(ProductIOVO params);
	public List<ProductIOVO> selMonStockStatusTable3(ProductIOVO params);
	
	// TODO 월입고현황표 디테일
	public List<ProductIOVO> selMonStockStatusTableDetail1(ProductIOVO params);
	public List<ProductIOVO> selMonStockStatusTableDetail2(ProductIOVO params);
	
	// TODO 재고조회
	public List<ProductIOVO> selInventoryInquiry1(ProductIOVO params);
	public List<ProductIOVO> selInventoryInquiry2(ProductIOVO params);
	public List<ProductIOVO> selInventoryInquiry3(ProductIOVO params);
	
	// TODO 월간거래처구분별일일집계
	public List<ProductIOVO> selMonCuDailyTotal1(ProductIOVO params);
	public List<ProductIOVO> selMonCuDailyTotal2(ProductIOVO params);
	
	// TODO 도서수불카드
	public List<ProductIOVO> selBookPaymentCard1(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentCard2(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentCard3(ProductIOVO params);
	
	// TODO 거래명세서일일번호별집계
	public List<ProductIOVO> selDealDailyNumber1(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber2(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber3(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber3_2(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber4(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber4_2(ProductIOVO params);
	public int upDealDailyNumber1(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber5(ProductIOVO params);
	public int inDealDailyNumber1(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber6(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber7(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber8(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber9(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber10(ProductIOVO params);
	public List<ProductIOVO> selDealDailyNumber11(ProductIOVO params);
	
	// TODO 일일집계현황
	public List<ProductIOVO> selDailyStatus1(ProductIOVO params);
	public List<ProductIOVO> selDailyStatus2(ProductIOVO params);
	
	// TODO 폐기리스트
	public List<ProductIOVO> selDisposalList(ProductIOVO params);
	
	// TODO 구분별도서수불재고현황
	public List<ProductIOVO> selBookPaymentStockStatusByCate1();
	public List<ProductIOVO> selBookPaymentStockStatusByCate2(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentStockStatusByCate3(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentStockStatusByCate4(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentStockStatusByCate5(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentStockStatusByCate6(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentStockStatusByCate7(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentStockStatusByCate8(ProductIOVO params);
	public List<ProductIOVO> selBookPaymentStockStatusByCate9(ProductIOVO params);
	public int upBookPaymentStockStatusByCate1(ProductIOVO params);
	public int upBookPaymentStockStatusByCate2(ProductIOVO params);
	public int upBookPaymentStockStatusByCate3(ProductIOVO params);
}
