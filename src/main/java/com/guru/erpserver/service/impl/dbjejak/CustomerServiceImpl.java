package com.guru.erpserver.service.impl.dbjejak;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.CustomerService;
import com.guru.erpserver.mapper.dbjejak.CustomerMapper;
import com.guru.erpserver.vo.dbjejak.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Resource
	private CustomerMapper custDAO;
	
	@Override
	public List<CustomerVO> selCustList1() throws Exception {
		return custDAO.selCustList1();
	}
	
	@Override
	public List<CustomerVO> selCustList2(CustomerVO params) throws Exception {
		return custDAO.selCustList2(params);
	}
	
	@Override
	public List<CustomerVO> selCustDetail(CustomerVO params) throws Exception {
		return custDAO.selCustDetail(params);
	}
	
	@Override
	public boolean inCust(CustomerVO params) throws Exception {
		int quert_result = custDAO.inCust(params);
		return (quert_result == 1) ? true : false;
	}
	
	@Override
	public boolean upCust(CustomerVO params) throws Exception {
		int quert_result = custDAO.upCust(params);
		return (quert_result == 1) ? true : false;
	}
	
	@Override
	public boolean delCust(CustomerVO params) throws Exception {
		int quert_result = custDAO.delCust(params);
		return (quert_result == 1) ? true : false;
	}
	
	@Override
	public List<CustomerVO> selIpList() throws Exception {
		return custDAO.selIpList();
	}
	
	@Override
	public boolean upIp(CustomerVO params) throws Exception {
		int quert_result = custDAO.upIp(params);
		return (quert_result == 1) ? true : false;
	}
}
