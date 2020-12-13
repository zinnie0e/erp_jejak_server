package com.guru.erpserver.service.impl.dbjejak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.ProductIOService;
import com.guru.erpserver.mapper.dbjejak.ProductIOMapper;
import com.guru.erpserver.vo.dbjejak.CustomerVO;
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
	public List<ProductIOVO> selPurchaseDaily2_2(ProductIOVO params) throws Exception {
		return productIODAO.selPurchaseDaily2_2(params);
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
	@Override
	public List<ProductIOVO> selMonStockStatusTable2(ProductIOVO params) throws Exception {
		return productIODAO.selMonStockStatusTable2(params);
	}	
	@Override
	public List<ProductIOVO> selMonStockStatusTable3(ProductIOVO params) throws Exception {
		return productIODAO.selMonStockStatusTable3(params);
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
	
	// TODO 재고조회
	@Override
	public List<ProductIOVO> selInventoryInquiry1(ProductIOVO params) throws Exception {
		return productIODAO.selInventoryInquiry1(params);
	}
	@Override
	public List<ProductIOVO> selInventoryInquiry2(ProductIOVO params) throws Exception {
		return productIODAO.selInventoryInquiry2(params);
	}
	@Override
	public List<ProductIOVO> selInventoryInquiry3(ProductIOVO params) throws Exception {
		return productIODAO.selInventoryInquiry3(params);
	}
	
	// TODO 월간거래처구분별일일집계
	@Override
	public List<ProductIOVO> selMonCuDailyTotal1(ProductIOVO params) throws Exception {
		return productIODAO.selMonCuDailyTotal1(params);
	}
	@Override
	public List<ProductIOVO> selMonCuDailyTotal2(ProductIOVO params) throws Exception {
		return productIODAO.selMonCuDailyTotal2(params);
	}
	
	// TODO 도서수불카드
	@Override
	public List<ProductIOVO> selBookPaymentCard1(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentCard1(params);
	}
	@Override
	public List<ProductIOVO> selBookPaymentCard2(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentCard2(params);
	}
	@Override
	public List<ProductIOVO> selBookPaymentCard3(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentCard3(params);
	}
	
	// TODO 거래명세서일일번호별집계
	@Override
	public List<ProductIOVO> selDealDailyNumber1(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber1(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber2(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber2(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber3(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber3(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber3_2(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber3_2(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber4(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber4(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber4_2(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber4_2(params);
	}
	@Override
	public boolean upDealDailyNumber1(ProductIOVO params) throws Exception {
		int quert_result = productIODAO.upDealDailyNumber1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber5(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber5(params);
	}
	@Override
	public boolean inDealDailyNumber1(ProductIOVO params) throws Exception {
		int quert_result = productIODAO.inDealDailyNumber1(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber6(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber6(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber7(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber7(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber8(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber8(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber9(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber9(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber10(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber10(params);
	}
	@Override
	public List<ProductIOVO> selDealDailyNumber11(ProductIOVO params) throws Exception {
		return productIODAO.selDealDailyNumber11(params);
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
	
	// TODO 구분별도서수불재고현황
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate1() throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate1();
	}	
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate2(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate2(params);
	}
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate3(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate3(params);
	}
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate4(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate4(params);
	}	
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate5(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate5(params);
	}
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate6(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate6(params);
	}
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate7(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate7(params);
	}	
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate8(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate8(params);
	}
	@Override
	public List<ProductIOVO> selBookPaymentStockStatusByCate9(ProductIOVO params) throws Exception {
		return productIODAO.selBookPaymentStockStatusByCate9(params);
	}
	@Override
	public boolean upBookPaymentStockStatusByCate1(ProductIOVO params) throws Exception {
		int quert_result = productIODAO.upBookPaymentStockStatusByCate1(params);
		return (quert_result == 1) ? true : false;
	}	
	@Override
	public boolean upBookPaymentStockStatusByCate2(ProductIOVO params) throws Exception {
		int quert_result = productIODAO.upBookPaymentStockStatusByCate2(params);
		return (quert_result == 1) ? true : false;
	}
	@Override
	public boolean upBookPaymentStockStatusByCate3(ProductIOVO params) throws Exception {
		int quert_result = productIODAO.upBookPaymentStockStatusByCate3(params);
		return (quert_result == 1) ? true : false;
	}
	
}
