package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.guru.erpserver.vo.dbjejak.ProductIOVO;

@Mapper
public interface ProductIOMapper {
	// TODO 공통
	
	// TODO 구매일보
	public List<ProductIOVO> selPurchaseDaily1(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily2(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily3(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily4(ProductIOVO params);
	public List<ProductIOVO> selPurchaseDaily5(ProductIOVO params);

	// TODO 월입고현황표
	public List<ProductIOVO> selMonStockStatusTable(ProductIOVO params);
	public int upMonStockStatusTable1(ProductIOVO params);
	public int upMonStockStatusTable2(ProductIOVO params);
	
	// TODO 월입고현황표 디테일
	public List<ProductIOVO> selMonStockStatusTableDetail1(ProductIOVO params);
	public List<ProductIOVO> selMonStockStatusTableDetail2(ProductIOVO params);
	
	// TODO 일일집계현황
	public List<ProductIOVO> selDailyStatus1(ProductIOVO params);
	public List<ProductIOVO> selDailyStatus2(ProductIOVO params);
	
	// TODO 폐기리스트
	public List<ProductIOVO> selDisposalList(ProductIOVO params);
	
}
