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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.dbjejak.ProductIOService;
import com.guru.erpserver.vo.dbjejak.CustomerVO;
import com.guru.erpserver.vo.dbjejak.ProductIOVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ProductIOController {
	@Resource
	private ProductIOService productIOSVC;
	
	// TODO 공통 
	
	// TODO 구매일보
	// 입력 : dbname
	@RequestMapping(value = "/productio/select_purchase_daily1", method = RequestMethod.POST)
	public List<ProductIOVO> selPurchaseDaily1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selPurchaseDaily1(params);
	}
	// 입력 : dbname, date
	@RequestMapping(value = "/productio/select_purchase_daily2", method = RequestMethod.POST)
	public List<ProductIOVO> selPurchaseDaily2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selPurchaseDaily2(params);
	}
	// 입력 : dbname, date
	@RequestMapping(value = "/productio/select_purchase_daily2_2", method = RequestMethod.POST)
	public List<ProductIOVO> selPurchaseDaily2_2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selPurchaseDaily2_2(params);
	}
	// 입력 : s1book
	@RequestMapping(value = "/productio/select_purchase_daily3", method = RequestMethod.POST)
	public List<ProductIOVO> selPurchaseDaily3(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selPurchaseDaily3(params);
	}
	// 입력 : s1cust
	@RequestMapping(value = "/productio/select_purchase_daily4", method = RequestMethod.POST)
	public List<ProductIOVO> selPurchaseDaily4(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selPurchaseDaily4(params);
	}
	// 입력 : s1bunh, date, s1book
	@RequestMapping(value = "/productio/select_purchase_daily5", method = RequestMethod.POST)
	public List<ProductIOVO> selPurchaseDaily5(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selPurchaseDaily5(params);
	}
	
	// TODO 월입고현황표
	// 입력 : date1, date2
	@RequestMapping(value = "/productio/select_mon_stockstatus_table", method = RequestMethod.POST)
	public List<ProductIOVO> selMonStockStatusTable(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selMonStockStatusTable(params);
	}
	// 입력 : uid
	@RequestMapping(value="/productio/update_mon_stockstatus_table1", method=RequestMethod.POST)
	public boolean upMonStockStatusTable1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.upMonStockStatusTable1(params);
	}
	// 입력 : uid
	@RequestMapping(value="/productio/update_mon_stockstatus_table2", method=RequestMethod.POST)
	public boolean upMonStockStatusTable2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.upMonStockStatusTable2(params);
	}
	// 입력 : date1, date2
	@RequestMapping(value = "/productio/select_mon_stockstatus_table2", method = RequestMethod.POST)
	public List<ProductIOVO> selMonStockStatusTable2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selMonStockStatusTable2(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/productio/select_mon_stockstatus_table3", method = RequestMethod.POST)
	public List<ProductIOVO> selMonStockStatusTable3(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selMonStockStatusTable3(params);
	}
	
	// TODO 월입고현황표 디테일
	// 입력 : uid
	@RequestMapping(value = "/productio/select_mon_stockstatus_table_detail1", method = RequestMethod.POST)
	public List<ProductIOVO> selMonStockStatusTableDetail1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selMonStockStatusTableDetail1(params);
	}
	// 입력 : uid
	@RequestMapping(value = "/productio/select_mon_stockstatus_table_detail2", method = RequestMethod.POST)
	public List<ProductIOVO> selMonStockStatusTableDetail2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selMonStockStatusTableDetail2(params);
	}
	
	// TODO 재고조회
	// 입력 : sbbook, lm_s, lm_t
	@RequestMapping(value = "/productio/select_inventory_inquiry1", method = RequestMethod.POST)
	public List<ProductIOVO> selInventoryInquiry1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selInventoryInquiry1(params);
	}
	// 입력 : sqbook
	@RequestMapping(value = "/productio/select_inventory_inquiry2", method = RequestMethod.POST)
	public List<ProductIOVO> selInventoryInquiry2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selInventoryInquiry2(params);
	}
	// 입력 : bname
	@RequestMapping(value = "/productio/select_inventory_inquiry3", method = RequestMethod.POST)
	public List<ProductIOVO> selInventoryInquiry3(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selInventoryInquiry3(params);
	}
	
	// TODO 월간거래처구분별일일집계
	// 입력 : wccode2
	@RequestMapping(value = "/productio/select_mon_cu_dailytotal1", method = RequestMethod.POST)
	public List<ProductIOVO> selMonCuDailyTotal1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selMonCuDailyTotal1(params);
	}
	// 입력 : dbname, s1ilja1, s1ilja2, s1gubn, s1cust
	@RequestMapping(value = "/productio/select_mon_cu_dailytotal2", method = RequestMethod.POST)
	public List<ProductIOVO> selMonCuDailyTotal2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selMonCuDailyTotal2(params);
	}
	
	// TODO 도서수불카드
	// 입력 : sbbook
	@RequestMapping(value = "/productio/select_book_paymentcard1", method = RequestMethod.POST)
	public List<ProductIOVO> selBookPaymentCard1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selBookPaymentCard1(params);
	}
	// 입력 : 
	@RequestMapping(value = "/productio/select_book_paymentcard2", method = RequestMethod.POST)
	public List<ProductIOVO> selBookPaymentCard2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selBookPaymentCard2(params);
	}
	// 입력 : 
	@RequestMapping(value = "/productio/select_book_paymentcard3", method = RequestMethod.POST)
	public List<ProductIOVO> selBookPaymentCard3(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selBookPaymentCard3(params);
	}
	
	// TODO 거래명세서일일번호별집계
	// 입력 : dbname, s1gubn
	@RequestMapping(value = "/productio/select_deal_dailynumber1", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber1(params);
	}
	// 입력 : dbname, s1ilja, s1gubn
	@RequestMapping(value = "/productio/select_deal_dailynumber2", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber2(params);
	}
	// 입력 : dbname, s1gubn
	@RequestMapping(value = "/productio/select_deal_dailynumber3", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber3(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber3(params);
	}
	// 입력 : dbname, s1gubn
	@RequestMapping(value = "/productio/select_deal_dailynumber3_2", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber3_2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber3_2(params);
	}
	// 입력 : dbname, s3ilja, s3cust, s1gubn
	@RequestMapping(value = "/productio/select_deal_dailynumber4", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber4(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber4(params);
	}
	// 입력 : dbname, s3ilja, s3cust, s1gubn
	@RequestMapping(value = "/productio/select_deal_dailynumber4_2", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber4_2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber4_2(params);
	}
	// 입력 : dbname, s3qnty, s3amnt, uid
	@RequestMapping(value="/productio/update_deal_dailynumber1", method=RequestMethod.POST)
	public boolean upDealDailyNumber1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.upDealDailyNumber1(params);
	}
	// 입력 : dbname, s3ilja
	@RequestMapping(value = "/productio/select_deal_dailynumber5", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber5(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber5(params);
	}
	// 입력 : dbname, s3ilja, s3gubn, s3balb, s3cust, s3qnty, s3amnt, s3mank
	@RequestMapping(value="/productio/insert_deal_dailynumber1", method=RequestMethod.POST)
	public boolean inDealDailyNumber1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.inDealDailyNumber1(params);
	}
	// 입력 : dbname, s3ilja1, s3ilja2, s3gubn
	@RequestMapping(value = "/productio/select_deal_dailynumber6", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber6(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber6(params);
	}
	// 입력 : dbname, s3ilja, s3gubn
	@RequestMapping(value = "/productio/select_deal_dailynumber7", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber7(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber7(params);
	}
	// 입력 :
	@RequestMapping(value = "/productio/select_deal_dailynumber8", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber8(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber8(params);
	}
	// 입력 : 
	@RequestMapping(value = "/productio/select_deal_dailynumber9", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber9(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber9(params);
	}
	// 입력 : 
	@RequestMapping(value = "/productio/select_deal_dailynumber10", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber10(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber10(params);
	}
	// 입력 : 
	@RequestMapping(value = "/productio/select_deal_dailynumber11", method = RequestMethod.POST)
	public List<ProductIOVO> selDealDailyNumber11(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDealDailyNumber11(params);
	}
	
	// TODO 일일집계현황
	// 입력 : dbname, date
	@RequestMapping(value = "/productio/select_daily_status1", method = RequestMethod.POST)
	public List<ProductIOVO> selDailyStatus1(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDailyStatus1(params);
	}
	// 입력 :dbname, date
	@RequestMapping(value = "/productio/select_daily_status2", method = RequestMethod.POST)
	public List<ProductIOVO> selDailyStatus2(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDailyStatus2(params);
	}
	
	// TODO 일일집계현황
	// 입력 : dbname
	@RequestMapping(value = "/productio/select_disposal_list", method = RequestMethod.POST)
	public List<ProductIOVO> selDisposalList(@RequestBody ProductIOVO params) throws Exception {
		return productIOSVC.selDisposalList(params);
	}
}
