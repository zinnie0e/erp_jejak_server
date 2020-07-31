package com.guru.erpserver.vo;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("monthClosingVO")
@JsonInclude(Include.NON_NULL)
public class MonthClosingVO {
	//TODO 공통
	private long uid;
	private String dbname;
	private String dbattr;
	
	private long date1;
	private long date2;
	
	
	private long bdate;
	private long crnum;
	private long bucode;
	private String bname;
	private String bcode;
	private long bnum;
	private long sbuprc;
	private long sbinse;
	
	private String sbbook;
	private String sbname;
	private String sbhjgb;
	private long sum1;
	private long sum2;
	
	private String sbjjgb;
	private String sbjuja;
	
	private long sbhj04;
	
	private long count;
	private long listid;
	private long yjtag;
	private long ycost;
	private long jm;
	private long yb;
	private long lm_s; //리미트 시작값
	private long lm_t; //리미트 전체값
	
	private long jbdate;
	private String jbname;
	private long jbamnt;
	private long jbid;
	private long jutag;
	
	
	
	
	
}
