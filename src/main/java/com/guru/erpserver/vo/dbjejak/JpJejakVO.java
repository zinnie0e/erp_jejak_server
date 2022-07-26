package com.guru.erpserver.vo.dbjejak;

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
	
	private long max_uid;
	private long sum_wdqnty;
	private long btype;
	private long bprice;
	private long bmyun;
	private long pnum1;
	private long pnum2;
	private long pbu;
	private long pcolo;
	private long bnum;
	private long bjulsu;
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
	private long bcheck;
	private long count_uid;
	private long sbuprc;
	private long sbkc;
	private long sbjego;
	private long sbjjsr;
	private long sbpack;
	private long wdboo9;
	private long sbcpsr;
	private long sbcpdn;
	private long sbcjpn;
	private long sbcost;
	private long sbweit;
	private long wddesu;
	private long wdpage;
	private long sbamt1;
	private long sbamt2;
	private long sbamt3;
	private long sbpage;
	private long sbsbpg1;
	private long sbdspg;
	private long sbmung;
	private long sbsbmg;
	private double sbinse;
	private long sbhj04;
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
	private long sbpage2;
	private long sbbinb;
	private long sbjjgb;
	private long sbsach;
	private long sbtpage;
	private long sbmpage;
	private long sbsongn;
	private double sbsongi;
	private double sbsongo;
	private long sbbookp;
	private long sbcdp;
	private long sbjabji;
	private long wyboo9;
	private long max_crnum;
	private long wysuns;
	private long wycolo;
	private long wypage;
	private long wychek;
	private long ye;
	private long do_; //원래 컬럼명은 'do'
	private long bu;
	private long ty;
	
	private long crnum;
	
	private long pnum;
	private long jnum;
	private long ipdate;
	private long jbdate;
	private long jbamnt;
	private long jbpage;
	private long jbjanh;
	private long jgubn;
	private long jpr;
	private long jyj;
	private long jbdanga;
	private long listid;
	
	private long colo;
	private long jm;
	private long yb;
	
	private long bucode;
	private long pprice;
	private long pannum5;
	private long dae;
	
	private long bdate;
	private long bdate1;
	private long bdate2;
	private long nprice;
	
	private int count; //리미트 시작값
	private int lm_s; //리미트 시작값
	private int lm_t; //리미트 전체값
	private int max_wdcolo;
	private int wdcolo;
	private int wdqnty;
	private long sqcrnm0;
	private long sqcrnm;
	private long xnum;
	private long tbmgubn;
	
	private long pub;
	private long yjdate;
	private long jdate;
	private long yjqnty;
	private long jejanum;
	private long busu;
	private long myun;
	private long jnum1;
	private long jnum2;
	private long jsum;
	private long pcheck;
	
	private long juid;
	private long date;
	private long cdate;
	private long num;
	private long comid;
	private long curno;
	private long jeon;
	private long jeuid;
	private double danga;
	private long tprice;
	private double halin;
	private double n_halin;
	private long n_fac;
	private double rnum;
	private long ycost;
	private long pcost;
	private long pdanga;
	private long jutag;
	private long fprice;
	private long ccost;
	private long cdate8;
	private float cnum8;
	private long cprice8;
	private long totcost8;
	private long crnum8;
	private long listid5;
	private int filmnum5;
	private int filmdan5;
	private int filmcost5;
	private int daeji5;
	private int sobudan5;
	private long sobu5;
	private long sum5;
	private long wdboo9c;
	private long cdate9;
	private long cnum9;
	private long cprice9;
	private long bitag;
	private long crnum9;
	private long jenum;
	private long w1;
	private long w2;
	private long w3;
	private long w4;
	private long w5;
	private long w6;
	private long w7;
	private long w8;
	private long w9;
	private long w10;
	private long w11;
	private long cdate5;
	private long cnum5;
	private long crnum5;
	private long cdate7;
	private long cgubn7;
	private long cnum7;
	private long cpage7;
	private long crnum7;
	private long totcost7;
	
	
	private int op51;
	private int op52;
	private int pg;
	private int cgub;
	
	private float jcost;
	private float cprice17;
	private float cprice27;
	private float pdanga7;

	private String s1ilja;
	private String s1gubn;
	private String s1book;
	private long psum;
	private int tbdsr;
	private int s1qnty;
	private int tbcsr;

	private String pgubn;
	private String ccode7;
	private String bcode7;
	private String bcode5;
	private String ccode5;
	private String ppan;
	private String jc;
	private String jn;
	private String signdate;
	private String bname;
	private String bcode;
	private String bpanh;
	private String pfirst;
	private String tbigo;
	private String sbbook;
	private String sbocod;
	private String sbname;
	private String sbgume;
	private String sbapdt;
	private String sbdung;
	private String sbdung2;
	private String sbloca;
	private String sbgubn;
	private String sbgdat;
	private String sbpegi;
	private String sbpega;
	private String sbcpbh;
	private String sbcjbh;
	private String sbbuse;
	private String ccode9;
	private String bcode9;
	private String sbjuja;
	private String sbykja;
	private String sbpnja;
	private String sbpjfr;
	private String sbpjto;
	private String sbsog1;
	private String sbsog2;
	private String sbipil;
	private String sbgeo1;
	private String sbrem1;
	private String sbgeo2;
	private String sbrem2;
	private String sbgeo3;
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
	private String sbpjgb;
	private String sbrank;
	private String sbcase;
	private String sbwing;
	private String sbtigi;
	private String sbjlsu;
	private String sbvat0;
	private String sbhj01;
	private String sbhj02;
	private String sbhj03;
	private String sbpegn;
	private String sbname2;
	private String sbbigo;
	private String sbsbph2;
	private String sbsbjh2;
	private String sbsbph3;
	private String sbsbjh3;
	private String sbsbph4;
	private String sbsbjh4;
	private String sbyakc;
	private String sbyak2;
	private String sbpanh2;
	private String sbboryu;
	private String sbhjgb;
	private String sbipgo;
	private String memo_jb;
	private String memo_cd;
	private String memo_cs;
	private String memo_st;
	private String memo_vn;
	private String sbename;
	private String sbpub;
	private String wybook;
	private String wjname;
	private String wygubn;
	private String wyjijl;
	private String wyjm01;
	private String wyjm02;
	private String wyyb01;
	private String wyyb02;
	private String wcname1;
	private String wcname2;
	private String wcname3;
	private String jcode;
	private String option;
	private String jbcode;
	private String jbname;
	private String jbpanh;
	private String jbbigo;
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
	private String wcjob;
	private String m2;
	private String m12;
	private String m13;
	private String m5;
	private String gubn;
	private String wcyakc;
	private String jname;
	private String m1;
	private String m3;
	private String wccode;
	private String temp1;
	private String temp2;
	private String t3bigo;
	private String gubn5;
	private String panst5;
	private String ccode8;
	private String bcode8;
	private String fpanh;
	private String bigo;
	private String wjcode;
	private String comment;
	private String jiname;
	private String jicode;
	private String panh;
	private String spcom;
	private String buycom;
	private String yjbook;
	private String dbname;
	private String tbsbook;
	private String database;
	private String sqbook;
	private String bookcode;
	private String keyfield;
	private String key;
	private String wdbook;
	private String wcname;
	private String bookname;
	private String iwan;
	private String ncode;
	private String t4bigo;
	private String pwan;
	private String gb;
	private String cpanh;
}
