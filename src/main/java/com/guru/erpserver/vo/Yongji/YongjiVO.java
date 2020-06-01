package com.guru.erpserver.vo.Yongji;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("yongjiVO")
@JsonInclude(Include.NON_NULL)
public class YongjiVO {
	//TODO 공통
	private long uid;
	
	private String wjcode;
	
	private String jicode;
	
	private String comment;
	
	private String yjcode;
	private String yjname;
	
	private long bdate;
	
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
	private String m11;
	
	private long jm;
	private long yb;
	private String gubn;
	private long colo;
	private double rnum;
	private long ycost;
	private long pcost;
	private long pdanga;
	private long jutag;
	private String t3bigo;
	
	private long listid;
	private String gb;
	private long dae;
	private long pg;
	private String jc;
	private String jn;
	private String t4bigo;
	
	private String bname;
	private String bcode;
	
	private long bucode;
	
	private String date1; //컬럼명X
	private String date2; //컬럼명X
	private long nsum;
	
	//TODO YOJIJUMN(용지주문테이블)
//	private long uid;
	private long jdate;
//	private String yjcode;
//	private String yjname;
	private long yjamount;
	private long fixnum;
	private long fxamount;
	private String gmcom;
	private long gmcheck;
	private String cnumlist;
		
	//TODO TMPJAB
//	private long uid;
	private long jbdate;
	private String jbcode;
	private String jbname;
	private long jbamnt;
	private long jbpage;
	private String jbpanh;
	private long jbjanh;
	private String jbbigo;
//	private String m1;
//	private String m2;
//	private String m3;
//	private String m31;
//	private String m32;
//	private String m33;
//	private String m34;
//	private String m4;
//	private String m5;
//	private String m6;
//	private String m7;
//	private String m8;
//	private String m9;
//	private String m10;
//	private String m11;
	private long jpr;
	private long jyj;
	private long jbdanga;
	
	//TODO TMPJAB3(용지,인쇄비)
//	private long uid;
	private long jbid;
//	private String yjcode;
//	private String yjname;
//	private long jm;
//	private long yb;
//	private String gubn;
//	private long colo;
//	private double rnum;
//	private long ycost;
//	private long pcost;
//	private long pdanga;
//	private long jutag;
//	private String t3bigo;
	
	//TODO TMPJAB4(제작대수정보)
//	private long uid;
//	private long listid;
//	private String gb;
//	private long dae;
//	private long pg;
//	private long colo;
//	private long jm;
//	private long yb;
//	private String jc;
//	private String jn;
//	private String t4bigo;
	
	//TODO TMPLIST(제작예정리스트)
//	private long uid;
	private String signdate;
//	private String bname;
//	private String bcode;
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
	private String tbigo;
	private long bcheck;
	  
	//TODO TMPLIST2(제작리스트)
//	private long uid;
//	private long listid;
//	private long bdate;
//	private String m1;
//	private String m2;
//	private String m3;
//	private String m31;
//	private String m32;
//	private String m33;
//	private String m34;
//	private String m4;
//	private String m5;
//	private String m6;
//	private String m7;
//	private String m8;
//	private String m9;
//	private String m10;
//	private String m11;
	private String m12;
	private String m13;
//	private long bucode;
	private long crnum;
	private long ipdate;
	private String pwan;
	private String iwan;
	private long fwonga;
	private long fyongji;
	private String t2bigo;
	
	//TODO TMPLIST3(용지,인쇄비)
//	private long uid;
//	private long listid;
	private String jcode;
	private String jname;
//	private long jm;
//	private long yb;
//	private String gubn;
//	private long colo;
//	private long bucode;
//	private double rnum;
//	private long ycost;
//	private long pcost;
//	private long pdanga;
//	private long jutag;
//	private String t3bigo;
	
	//TODO TMPLIST4(제작대수정보)
//	private long uid;
//	private long listid;
//	private String gb;
	private long bu;
//	private long dae;
//	private long pg;
//	private long colo;
//	private long jm;
//	private long yb;
//	private String jc;
//	private String jn;
//	private String t4bigo;
	
	//TODO KSWJIJL0(용지정보)
//	private long uid;
//	private String wjcode; //코드
	private String wjname; //용지명
	private long ib; //입사용지
	private double danga; //현단가
	private long dandate;
	private long facdanga; //공장도가
	private double halin; //할인율
	private long wjtype; //용지구분
	private long jsuns;
	private long op1; //평량
	private String op2; //규격
	private long op3; //중량
	
	//TODO JIINOUT(용지입출고)
//	private long uid;
	private long juid;
//	private String wjcode;
//	private String jicode;
	private long date;
	private long cdate;
	private long num;
	private long comid;
//	private String comment;
	private long curno;
	private long jeon;
	private long jeuid;
//	private double danga;
	private long tprice;
	private String bigo;
//	private double halin;
	private double n_halin;
	private long n_fac;
	
	//TODO YONGJIMS3(월별 용지재고 현황)
//	private long uid;
//	private String yjcode;
	private String msdate;
	private long qnty1;
	private long qnty2;
	private long qnty3;
	private long qnty4;
	
	//TODO JEONPYO(용지전표)
//	private long uid;
//	private long bdate;
	private long jejanum;
	private String spcom;
	private String buycom;
//	private String bname;
//	private String bcode;
	private long busu;
	private String panh;
	private long myun;
	private String jiname;
//	private String jicode;
	private long jnum1;
	private long jnum2;
	private long jsum;
//	private String comment;
	private long pcheck;
	
	//TODO KSWCUST0(거래처 목록)
//	private long uid;
	private String wccode;
	private String wccode2;
	private String wcname;
	private String sucode;
	private String jmfield;
	private String wcyakc;
	private String wcdeap;
	private String wcjuso;
	private String wctel;
	private String wctae;
	private String wcjong;
	private String wcsaup;
	private String wcjob;
	private String wcemail;
	private long wcjana;
	private long tax;
	private String scdung;
	
	//TODO 테이블
	private String value;
}
