package com.guru.erpserver.vo.JpJejak;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("jpJejakVO")
@JsonInclude(Include.NON_NULL)
public class JpJejakVO {
	//TODO 공통
	private long uid;
	
	private String tmp;
	
	private String date1; //컬럼명X
	private String date2; //컬럼명X
	
	private String limit; //컬럼명X
	private String result; //컬럼명X
	
	//TODO tmplist(제작예정리스트)
//	private long uid;
	private String signdate;
	private String bname;
	private String bcode;
	private long btype;
	private String bpanh;
	private long bprice;
	private long bmyun;
	private long pnum1;
	private long pnum2;
	private long ppan;
	private long bnum;
	private long bjulsu;
	private String pfirst;
	private double yinc;
	private long pdate;
	private long bcolor;
	private long ypan;
	private long yban;
	private long p1;
	private long p2;
	private long p3;
	private long p4;
	private long p5;
	private long p6;
	private long p7;
	private long p8;
	private long p9;
	private long p10;
	private long p11;
	private long p12;
	private long p13;
	private String tbigo;
	private long bcheck;
	
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
//	private long uid;
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
//	private String tmp;
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
	
	//TODO kswyonj0(도서별 사용용지정보)
//	private long uid;
	private String wybook;
	private long wyboo9;
	private long wysuns;
	private String wygubn;
	private String wyjijl;
	private long wycolo;
	private long wypage;
	private String wyjm01;
	private String wyjm02;
	private String wyyb01;
	private String wyyb02;
	private long wychek;
//	private String tmp;
	
	//TODO yeo(인쇄여분표)
//	private long uid;
	private long ye;
	private long do_; //원래 컬럼명은 'do'
	private long bu;
	private long ty;
	
	//TODO 제품계획표
	private long crnum;
	private String wcname1;
	private String wcname2;
	private String wcname3;
	private String jcode;
	
	//TODO 발주서
	private String wcjob;
	private long listid;
	private String m31;
	private String m32;
	private String m33;
	private String m34;
	private String m4;
	private String m6;
	private String m7;
	private String m8;
	private String m9;
	private String m10;
	private String m11;
	private String wcemail;
	private String ccode;
	
	
	//TODO 표지작업지시서
	private String m2;
	private String m12;
	private String m13;
	private String m5;
	private String gubn;
	private String wcyakc;
	private String jname;
	private long colo;
	private long jm;
	private long yb;
	
	//TODO 본문작업지시서
	private String m1;
	private String m3;
	private long bucode;
	private String wccode;
	private String temp1;
	private String temp2;
	private String t3bigo;
	private long pannum5;
	private String pwan;
	private String gb;
	private long dae;
	private String t4bigo;
	
	
	//TODO 입고대장
	private long bdate;
	private long bdate1;
	private long bdate2;
	private String wcname;
	private String iwan;
	
	//TODO 제작예정리스트 열람
	private String ncode;
	private long nprice;
	
	//TODO 제작예정리스트 등록
	private int count; //리미트 시작값
	private int lm_s; //리미트 시작값
	private int lm_t; //리미트 전체값
	private String keyfield;
	private String key;
	
	//TODO 제품정가인상리스트
	private long pub;
	
	//TODO 신간적정재고관리
	private String yjbook;
	private long yjdate;
	private long yjqnty;
}
