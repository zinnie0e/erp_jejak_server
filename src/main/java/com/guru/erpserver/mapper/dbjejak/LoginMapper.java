package com.guru.erpserver.mapper.dbjejak;

import org.apache.ibatis.annotations.Mapper;

import com.guru.erpserver.vo.dbjejak.LoginVO;

@Mapper
public interface LoginMapper {
	public Integer countLoginIP(LoginVO params);
	public LoginVO selLoginDung(LoginVO params);
	public Integer countLoginUser(LoginVO params);
}
