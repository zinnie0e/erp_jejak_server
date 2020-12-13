package com.guru.erpserver.vo.dbjejak;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("productIOVO")
@JsonInclude(Include.NON_NULL)
public class ProductIOVO {
	//TODO 공통
	private long uid;
	private long uid2;
	private String dbname;
	
	private long date;
	private long date1;
	private long date2;
	
	private String s1ilja;
	private String s1ilja1;
	private String s1ilja2;
	private String sbname;
	private String bname;
	
	private String sgyyyy;
	private String s1cust;
	private String s1book;
	private String s1bunh;
	private String s1gubn;
	private String wccode2;
	private String wcname;
	private String bookname;
	private String bookcode;
	private String ccode;
	private String subsuns;
	private String m3;
	private String idate;
	private String pnum;
	private String sbpegi;
	private String sbbook;
	private String sqbook;
	private String tbsbook;
	private String s1kgub;
	private String s3ilja;
	private String s3ilja1;
	private String s3ilja2;
	private String s3gubn;
	private String s3balb;
	private String s3cust;
	private String s3cus9;
	private String s3cjil;
	private String s3sgub;
	private String s3ueum;
	private String s3mank;
	private String tmp;
	private String max_s3balb;
	private String wcsaup;
	private String wcdeap;
	private String wcjuso;
	private String wctae;
	private String wcjong;
	private String sgbook;
	private String tbkbook;
	
	private long tbckm;
	private long tbdkm;
	private long tbekm;
	private long tbfkm;
	private long sum_tbakm;
	private long sum_tbckm;
	private long sum_tbdkm;
	private long sum_tbekm;
	private long sum_tbfkm;
	private long tbakm;
	private long sum_tbasr;
	private long sum_tbcsr;
	private long sum_tbdsr;
	private long sum_tbesr;
	private long sum_tbfsr;
	private long s1qnty;
	private long s1uprc;
	private long s1amnt;
	private long jdate;
	private long jnum;
	private long juid;
	private long jgubn;
	private long fchk;
	private long tnum;
	private long xnum;
	private long wtotal;
	private long t1id;
	private long inum;
	private long fchk2;
	private long sqcrnm;
	private long sqcrnm0;
	private long sbuprc;
	private long tbmgubn;
	private long tbasr;
	private long tbbsr;
	private long tbcsr;
	private long tbdsr;
	private long tbesr;
	private long tbfsr;
	private long sum1;
	private long sum2;
	private long sum3;
	private long sum4;
	private long sum5;
	private long sum6;
	private long month;
	private long s3qnty;
	private long s3amnt;
	private long s3vatt;
	private long s3guns;
	private long s3kssh;
	private long s3kikn;
	

	private float s1dang;
	private float wdanga;
	private float idanga;
	private float sgdn00;
	private float sgdn01;
	private float sgdn02;
	private float sgdn03;
	private float sgdn04;
	private float sgdn05;
	private float sgdn06;
	private float sgdn07;
	private float sgdn08;
	private float sgdn09;
	private float sgdn10;
	private float sgdn11;
	private float sgdn12;
	
	private int lm_s; 
	private int lm_t;
}
