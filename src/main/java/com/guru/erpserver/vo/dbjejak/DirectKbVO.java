package com.guru.erpserver.vo.dbjejak;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("directKbVO")
@JsonInclude(Include.NON_NULL)
public class DirectKbVO {
	//TODO 공통
	private long uid;
	
	private long date1;
	private long date2;
	
	
	//TODO 용지대
	private String wccode;
	private String wccode2;
	private String wcname;
	private String wcjob;
	private String sucode;
	private String jmfield;
	private String wcyakc;
	private String wcdeap;
	private String wcjuso;
	private String wctel;
	private String wctae;
	private String wcjong;
	private String wcsaup;
	private String wcemail;
	private String SCDUNG;
	private String jicode;
	private String comment;
	private String bigo;
	private String op2;
	private String wjcode;
	private String wjname;
	private String jname;
	
	
	private long jsuns;
	private long wjtype;
	private long facdanga;
	private long dandate;
	private long ib;
	private long op1;
	private long op3;
	private long wcjana;
	private long tprice;
	private long date;
	private long comid;
	private long count;
	private long sum;
	
	private long n_fac;
	private long num;
	private long curno;
	private long jeon;
	private long jeuid;
	private float danga;
	private float halin;
	private float n_halin;
	
	//TODO 출력료
	private long cdate;
	private String cgubn;
	private String ccode;
	private long cprice;
	private long max_uid;
	
	//TODO 인쇄비
	private long listid;
	private long listid5;
	private long bdate;
	private long crnum;
	private long bucode;
	private String bname;
	private String bcode;
	private long tax;
	private long op52;
	private long sum5;
	private long pcost;
	private long jbdate;
	private String jbname;
	private String m1;
	private long filmcost5;
	private long daeji5;
	private String gubn5;
	private long filmnum5;
	private long filmdan5;
	private long sobu5;
	private String panst5;
	private long pannum5;
	private long sobudan5;
	private String gubn;
	private String bpanh;
	private long rnum;
	private long colo;
	private long pdanga;
	private long pnum;
	private long fnum;	
	private long daeji;
	private String jbcode;
	private String jbpanh;
	private String jbbigo;
	private long jbamnt;
	private long jbpage;
	private long jbjanh;
	private long totcost7;
	
	//TODO 제본비
	private long uid2;
	private String tdate;
	private long t1id;
	private String idate;
	private long juid;
	private long jdate;
	private long jnum;
	private String bookcode;
	private String bookname;
	private long sum_totcost7;
	private String ccode7;
	private String cdate7;
	private String subsuns;
	private String m3;
	private long inum;
	private float idanga;
	private long fchk2;
	private long jgubn;
	private long fchk;
	private long tnum;
	private long xnum;
	private String fieldname1;
	private String fieldname2;
	private String sbpanh;
	private long sbpage;
	private String sbsbph1;
	private String sbsbph2;
	private String sbsbph3;
	private String sbsbph4;
	private long sbsbpg1;
	private long sbsbpg2;
	private long sbsbpg3;
	private long sbsbpg4;
	private long crnum7;
	private float pdanga7;
	private float cprice27;
	private long cnum7;
	private String tcode;
	private long sum_wdqnty;
	private long count_uid;
	
	//TODO 코팅비
	private long totcost8;
	private float cnum8;
	private long cprice8;
	private long cgubn8;
	
	
	//TODO 비닐비, 케이스대, CD음반대, 스티커대, 기타
	private long tag;
	private long cprice9;
	private long cnum9;
	private long cdate9;
	private long op29;
	private long tval;
	private long crnum9;
	private long jenum;
	private String ccode9;
	private String bcode9;
	private String sbname;
	private String sbbook;
	private String key;
	private String keyfield;
	private String w6;
	private String w7;
	private String w8;
	private String w9;
	private String fieldname;
}
