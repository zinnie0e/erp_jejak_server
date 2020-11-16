package com.guru.erpserver.vo.dbjejak;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("jmJejakVO")
@JsonInclude(Include.NON_NULL)
public class JmJejakVO {
	//TODO 공통
	private long uid;
	private String tmp;
	private long date1;
	private long date2;

	private long jbdate;
	private String jbname;
	private String jbcode;
	private long jbamnt;
	private String jbpanh;
	private String jbbigo;
	private String jbjanh;
	private long jbpage;
	private long jbid;
	private String gubn;
	private String yjcode;
	private String yjname;
	private long jm;
	private long yb;
	private long colo;
	private long rnum;
	private long ycost;
	private long pcost;
	private long pdanga;
	private long jutag;
	private String t3bigo;
	
	private String m1;
	private String m2;
	private String m3;
	private String m31;
	private String m32;
	private String m33;
	private String m34;
	private String m4;
	private String m5;
	private String m6;
	private String m7;
	private String m8;
	private String m9;
	private String m10;
	
	
	//TODO kscbook0(도서 마스터)
	private String sbbook;
	private String sbocod;
	private String sbname;
	private long sbuprc;
	private long sbkc;
	private long sbjego;
	private long sbjjsr;
	private String sbgume;
	private String sbapdt;
	private String sbdung;
	private String sbdung2;
	private String sbloca;
	private long sbpack;
	private String sbgubn;
	private String sbgdat;
	private String sbpegi;
	private String sbpega;
	private String sbcpbh;
	private long sbcpsr;
	private long sbcpdn;
	private String sbcjbh;
	private long sbcjpn;
	private String sbbuse;
	private String sbjuja;
	private String sbykja;
	private String sbpnja;
	private String sbpjfr;
	private String sbpjto;
	private String sbsog1;
	private String sbsog2;
	private String sbipil;
	private long sbcost;
	private long sbweit;
	private String sbgeo1;
	private long sbamt1;
	private String sbrem1;
	private String sbgeo2;
	private long sbamt2;
	private String sbrem2;
	private String sbgeo3;
	private long sbamt3;
	private String sbrem3;
	private String sbpnkn;
	private String sbwons;
	private String sbwnna;
	private String sbkomc;
	private String sbisbn;
	private String sbpanh;
	private String sbsbph1;
	private String sbjanh;
	private String sbsbjh1;
	private long sbpage;
	private long sbsbpg1;
	private String sbpjgb;
	private String sbrank;
	private String sbcase;
	private String sbwing;
	private String sbtigi;
	private long sbdspg;
	private String sbjlsu;
	private String sbvat0;
	private long sbmung;
	private long sbsbmg;
	private double sbinse;
	private String sbhj01;
	private String sbhj02;
	private String sbhj03;
	private long sbhj04;
	private String sbpegn;
	private String sbname2;
	private String sbbigo;
	private String sbsbph2;
	private String sbsbjh2;
	private String sbsbph3;
	private String sbsbjh3;
	private String sbsbph4;
	private String sbsbjh4;
	private long sbsbpg2;
	private long sbsbpg3;
	private long sbsbpg4;
	private long sbjnji;
	private long sbinji;
	private long sbstic;
	private long sbcd;
	private long sbcoti;
	private long sbcase2;
	private long sbcoti2;
	private long sbmusn;
	private long sbwing2;
	private long sbmyun;
	private long sbbyul;
	private long sbhwbo;
	private String sbyakc;
	private String sbyak2;
	private String sbpanh2;
	private long sbpage2;
	private long sbbinb;
	private String sbboryu;
	private String sbhjgb;
	private long sbjjgb;
	private String sbipgo;
	private long sbsach;
	private long sbtpage;
	private long sbmpage;
	private long sbsongn;
	private double sbsongi;
	private double sbsongo;
	private long sbbookp;
	private long sbcdp;
	private long sbjabji;
	private String memo_jb;
	private String memo_cd;
	private String memo_cs;
	private String memo_st;
	private String memo_vn;
	private String sbename;
	private String sbpub;
	
	//TODO 제작계획표
	private String wcname1;
	private String wcname2;
	private String wcname3;
	private String wcname8;
	
	//TODO 표지작업지시서
	private String temp1;
	private String temp2;
	private long tdate1;
	private long tdate2;
	
	//TODO 본문작업지시서
	private long pannum5;
	private String gb;
	private long dae;
	private String t4bigo;
	
	//TODO 발주서
	private String wccode;
	private String wcname;
	private String wcjob;
	private String ccode;
	
	private int count; //리미트 시작값
	private int lm_s; //리미트 시작값
	private int lm_t; //리미트 전체값
}
