package com.guru.erpserver.vo.dbjejak;

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
	private String dbname2;
	private String dbname3;
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
	
	private String yjcode;
	private String msdate;
	private String tmon1;
	private String tmon2;
	private long qnty1;
	private long amnt1;
	private long qnty2;
	private long amnt2;
	private long qnty3;
	private long amnt3;
	private long qnty4;
	private long amnt4;
	
	private String wjcode;
	private String wjname;
	
	//도서별 원가계산서 
	//lwhee
	private String sbsbph1;
	private String sbsbph2;
	private String sbsbph3;
	private String sbsbph4;
	private String sbsbjh1;
	private String sbsbjh2;
	private String sbsbjh3;
	private String sbsbjh4;
	private String sbsbpg1;
	private String sbsbpg2;
	private String sbsbpg3;
	private String sbsbpg4;
	private String m1;
	private String m2;
	private String m3;
	private String sbpanh;
	private String sbjanh;
	private String wcname;
	private int bmyun;
	private int btype;
	
	private int listid5;
	private String gubn5;
	private String panst5;
	private int pannum5;
	private int filmnum5;
	private int filmdan5;
	private	int filmcost5;
	private int daeji5;
	private int sobudan5;
	private int sobu5;
	private int sum5;
	
	private String jcode;
	private String jname;
	private String gubn;
	private int colo;
	private float rnum;
	private int pcost;
	private int pdanga;
	private String T3BIGO;
	
	private String wccode;
	
	private int cnum7;
	private int cpage7;
	private float cprice17;
	private float cprice27;
	private float pdanga7;
	private int totcost7;
	private int crnum7;
	
	private int cprice8;
	private float cnum8;
	private float totcost8;
	private int jenum;
	private int jabtag;
	private int w1;
	private int w2;
	private int w21;
	private int w3;
	private int w4;
	private int w5;
	private int w6;
	private int w7;
	private int w8;
	private int w9;
	private int w10;
	private int w11;
	private int wtotal;
	private float wdanga;
	private String bookcode;
	private String sthaly;
	private String sbdung;
	private float total_cost;
	private float total_danga;
	private int bur_uid;
	private int jebon;
	private int cgubn7;
	private String ccode9;
	private int cprice9;
	
	private int tnum;
	private int new_cost;
	private int date;
	private int mrow;
	private int row;
	private float danga;
	
	//잡물 원가계산서
	private String jbcode;
	private int jbpage; 
	private String jbpanh; 
	private int jbjanh; 
	private String m5;
	private String m7;
	private String m8;
	private String m9;
	private int pans;
	private int sobus;
	private int sums;
	private String yjname;
	private int jms;
	private int ybs;
	private float rnums;
	private int ycosts;
	private int pcosts;
	
	//품목별 원재료명세서(월별)
	private int new_q;
	private int new_a;
	private String newdate;
	
	//품목별 원재료명세서(월별)
	private String indate;
	private int tm;
	private int ty;
	private String s1book;
	
	//저자료 지급 내역 (상/하)
	private String name1;
	private String name2;
	private String num1;
	private String num2;
	private String addr1;
	private String addr2;
	private String addr3;
	
	//도서 수량/금액 집계
	private int tbmgubn;
	private String fieldname;
	private float new_val;
	private String s1gubn;
	private int tbasr;
	private int tbbsr;
	private int tbcsr;
	private int tbdsr;
	private int tbesr;
	private int tbfsr;
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
	
	//구매단가입력
	private String jejotbl;
	private long juid;
	private int b1;
	private int b2;
	private int b3;
	private int b4;
	private int b5;
	private int b6;
	private int b7;
	private int b8;
	private int b9;
	private int b10;
	private int b11;
	private int b12;
	private int b13;
	private int b14;
	private int b15;
	private float new_danga;
	private String idate;
	private int inum;
	private int s1qnty;
	private int s1amnt;
	private float s1dang;
	private int seqno;
	private String acctcode;
	private String type;
	private int	credit;	
	private String descript;
	private float idanga;
	private int fchk;
	private int asr;
	private int bsr;
	private int csr;
	private int dsr;
	private int esr;
	private int fsr;
}
