package com.guru.erpserver.service.dbjejak;

import java.util.List;
import com.guru.erpserver.vo.dbjejak.CustomerVO;

public interface CustomerService {
	
	List<CustomerVO> selCustList1() throws Exception;
	List<CustomerVO> selCustList2(CustomerVO params) throws Exception;
	
	List<CustomerVO> selCustDetail(CustomerVO params) throws Exception;
	
	boolean inCust(CustomerVO params) throws Exception;
	
	boolean upCust(CustomerVO params) throws Exception;
	
	boolean delCust(CustomerVO params) throws Exception;
	
	List<CustomerVO> selIpList() throws Exception;
	
	boolean upIp(CustomerVO params) throws Exception;
}
