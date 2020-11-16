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
	private String sbname;
	
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
	private long sum1;
	private long sum2;
	

	private float s1dang;
	private float wdanga;
	private float idanga;
}
