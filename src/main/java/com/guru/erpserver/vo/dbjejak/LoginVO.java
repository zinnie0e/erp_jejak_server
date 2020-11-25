package com.guru.erpserver.vo.dbjejak;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("loginVO")
@JsonInclude(Include.NON_NULL)
public class LoginVO {
	private String ip;
	private String id;
	private String pw;
	private String swdung;
	
	private String result;
}
