package com.guru.erpserver.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.CustomerService;
import com.guru.erpserver.vo.CustomerVO;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class CustomerController {
	@Resource
	private CustomerService custSVC;

	@RequestMapping(value="/cust/select_list", method=RequestMethod.POST)
	public List<CustomerVO> selCustList() throws Exception {
		return custSVC.selCustList();
	}
	
	@RequestMapping(value="/cust/select_detail", method=RequestMethod.POST)
	public List<CustomerVO> selCustDetail(@RequestBody CustomerVO params) throws Exception {
		return custSVC.selCustDetail(params);
	}
	
	@RequestMapping(value="/cust/insert", method=RequestMethod.POST)
	public boolean inCust(@RequestBody CustomerVO params) throws Exception {
		return custSVC.inCust(params);
	}
	
	@RequestMapping(value="/cust/update", method=RequestMethod.POST)
	public boolean upCust(@RequestBody CustomerVO params) throws Exception {
		return custSVC.upCust(params);
	}
	
	@RequestMapping(value="/cust/delete", method=RequestMethod.POST)
	public boolean delCust(@RequestBody CustomerVO params) throws Exception {
		return custSVC.delCust(params);
	}
	
	@RequestMapping(value="/cust/select_ip_list", method=RequestMethod.POST)
	public List<CustomerVO> selIpList() throws Exception {
		return custSVC.selIpList();
	}
	
	@RequestMapping(value="/cust/update_ip", method=RequestMethod.POST)
	public boolean upIp(@RequestBody CustomerVO params) throws Exception {
		return custSVC.upIp(params);
	}
}
