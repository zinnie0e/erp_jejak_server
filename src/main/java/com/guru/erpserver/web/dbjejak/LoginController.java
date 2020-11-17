package com.guru.erpserver.web.dbjejak;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guru.erpserver.service.dbjejak.LoginService;
import com.guru.erpserver.vo.dbjejak.LoginVO;

@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
@RestController
public class LoginController {
	@Resource
	private LoginService loginSVC;
	
	@RequestMapping(value="/login/ip", method=RequestMethod.POST)
	public boolean countLoginIP(@RequestBody LoginVO params) throws Exception {
		return loginSVC.countLoginIP(params);
	}
	
	@RequestMapping(value="/login/user", method=RequestMethod.POST)
	public boolean countLoginUser(@RequestBody LoginVO params) throws Exception {
		return loginSVC.countLoginUser(params);
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public LoginVO checkLogin(@RequestBody LoginVO params) throws Exception {
		LoginVO result = new LoginVO();
		
		if (loginSVC.countLoginIP(params) || "ajk".equals(params.getId()) || "ksj".equals(params.getId()) || "kgy".equals(params.getId())) {
			if (loginSVC.countLoginUser(params)) {
				result.setResult("success");
			} else {
				result.setResult("fail");
			}
		} else {
			result.setResult("null");
		}
		
		return result;
	}
}
