package com.guru.erpserver.service.dbjejak;

import com.guru.erpserver.vo.dbjejak.LoginVO;

public interface LoginService {
	boolean countLoginIP(LoginVO params) throws Exception;
	String selLoginDung(LoginVO params) throws Exception;
	boolean countLoginUser(LoginVO params) throws Exception;
}
