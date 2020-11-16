package com.guru.erpserver.vo.dbjejak;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("accountingSlipVO")
@JsonInclude(Include.NON_NULL)
public class AccountingSlipVO {
	//TODO 공통
	private long uid;
	private String dbname;
	private String chrec;
	private String month;
	private String year;
	private long value;
	
	private long date;
	private long date1;
	private long date2;
	
	private long listdate;
	private long mknum;
	private long mknum2;
	private long kyamnt;
	private long kytax1;
	private long kytax2;
	private long jeuid;
	private long seqno;
	private long debit;
	private long credit;
	private long inum;
	private float idanga;
	private long fchk;
	private long fchk2;
	private long paruid;
	private long b1;
	private long b2;
	private long b3;
	private long b4;
	private long b5;
	private long b6;
	private long b7;
	private long b8;
	private long b9;
	private long b10;
	private long b11;
	private long b12;
	private long b13;
	private long b14;
	private long b15;
	private long j1;
	private long j2;
	private long j3;
	private long j4;	
	private long j5;
	private long j6;
	private long j7;
	private long j8;
	private long j9;
	private long j10;
	private long j11;
	private long j12;
	private long j13;
	private long j14;
	private long j15;
	private long jab;
	private long sumq1;
	private long suma1;
	private long sumq3;
	private long suma3;
	private long sumq4;
	private long suma4;
	private long sumq5;
	private long suma5;
	private long sumq6;
	private long suma6;
	private long bnum;
	private long bdate;
	private long wtotal;
	private long tnum;
	private long xnum;
	private long uid2;
	private long t1id;
	private long wwbusu;
	private long wttotl;
	private long sqcrnm;
	private long sum_xnum;
	private long s1qnty;
	private long s1amnt;
	
	
	
	private String mkdate;
	private String mkbook;
	private String mkname;
	private String mkname2;
	private String kydate1;
	private String kydate2;
	private String kyname;
	private String kynum;
	private String kyaddr;
	private String kycomm;
	private String kygubn;
	private String ymd;
	private String acctcode;
	private String type;
	private String descript;
	private String ymd2;
	private String sbname;
	private String idate;
	private String ccode;
	private String pnum;
	private String wwyyyy;
	private String wwmmmm;
	private String wwdddd;
	private String wwbook;
	private String sbbook;
	private String bcode;
	private String listid;
	private String sbpegi;
	private String sbgubn;
	private String sqbook;
	private String bookcode;
	private String s1book;
	private String s1gubn;
}
