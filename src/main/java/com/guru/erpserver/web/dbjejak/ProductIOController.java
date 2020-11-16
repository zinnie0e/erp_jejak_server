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
