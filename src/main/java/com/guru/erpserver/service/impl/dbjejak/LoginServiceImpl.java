package com.guru.erpserver.service.impl.dbjejak;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.guru.erpserver.service.dbjejak.LoginService;
import com.guru.erpserver.mapper.dbjejak.LoginMapper;
import com.guru.erpserver.vo.dbjejak.LoginVO;

@Service
public class LoginServiceImpl implements LoginService{
	@Resource
	private LoginMapper loginDAO;
	
	@Override
	public boolean countLoginIP(LoginVO params) throws Exception {
		Integer get_param = loginDAO.countLoginIP(params);
		int count = 0;
		if(get_param != null) {
			count = get_param;
		}
		return (count >= 1) ? true : false;
	}
	
	@Override
	public String selLoginDung(LoginVO params) throws Exception {
		return loginDAO.selLoginDung(params).getSwdung();
	}
	
	@Override
	public boolean countLoginUser(LoginVO params) throws Exception {
		System.out.println(params.getId() + "/" + params.getPw() + "/" + params.getIp());
		Integer get_param = loginDAO.countLoginUser(params);
		
		System.out.println(get_param);
		int count = 0;
		if(get_param != null) {
			count = get_param;
		}
		return (count >= 1) ? true : false;
	}
}
