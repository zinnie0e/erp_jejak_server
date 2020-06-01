package com.guru.erpserver.service;

import java.util.List;
import com.guru.erpserver.vo.CustomerVO;

public interface CustomerService {
	List<CustomerVO> selCustList() throws Exception;
	
	List<CustomerVO> selCustDetail(CustomerVO params) throws Exception;
	
	boolean inCust(CustomerVO params) throws Exception;
	
	boolean upCust(CustomerVO params) throws Exception;
	
	boolean delCust(CustomerVO params) throws Exception;
	
	List<CustomerVO> selIpList() throws Exception;
	
	boolean upIp(CustomerVO params) throws Exception;
}
