package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guru.erpserver.vo.dbjejak.CustomerVO;

@Mapper
public interface CustomerMapper {
	
	public List<CustomerVO> selCustList1();
	public List<CustomerVO> selCustList2(CustomerVO params);
	
	public List<CustomerVO> selCustDetail(CustomerVO params);
	
	public int inCust(CustomerVO params);
	
	public int upCust(CustomerVO params);
	
	public int delCust(CustomerVO params);
	
	public List<CustomerVO> selIpList();
	
	public int upIp(CustomerVO params);
}
