package com.guru.erpserver.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("customerVO")
@JsonInclude(Include.NON_NULL)
public class CustomerVO {
	private int uid;
	private String wccode; //코드
	private String wccode2; //구매코드
	private String wcname; //거래처명
	private String sucode;
	private String jmfield;
	private String wcyakc; //약칭
	private String wcdeap; //대표자
	private String wcjuso; //주소
	private String wctel; //연락처
	private String wctae;
	private String wcjong;
	private String wcsaup;
	private String wcjob; //업종
	private String wcemail; //이메일
	private int wcjana; //잔액
	private int tax; //계산서(세금계산서 : 0, 계산서 : 1)
	private String scdung;
	private String ips;
	private String uname;
	
	private int count; //리미트 시작값
	private int lm_s; //리미트 시작값
	private int lm_t; //리미트 전체값
}
