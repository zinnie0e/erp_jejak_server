package com.guru.erpserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.guru.erpserver.vo.CustomerVO;

@Mapper
public interface CustomerMapper {
	public List<CustomerVO> selCustList();
	
	public List<CustomerVO> selCustDetail(CustomerVO params);
	
	public int inCust(CustomerVO params);
	
	public int upCust(CustomerVO params);
	
	public int delCust(CustomerVO params);
	
	public List<CustomerVO> selIpList();
	
	public int upIp(CustomerVO params);
}
