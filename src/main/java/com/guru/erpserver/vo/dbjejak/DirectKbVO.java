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
	private String wcname;
	private String wcjob;
	
	private long tprice;
	private long date;
	private long comid;
	
	private long count;
	private long sum;
	
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
	private long rnum;
	private long colo;
	private long pdanga;
	
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
	
	//TODO 코팅비
	private long totcost8;
	private float cnum8;
	private long cprice8;
	
	//TODO 비닐비, 케이스대, CD음반대, 스티커대, 기타
	private long tag;
	private long cprice9;
	private long cnum9;
	private long cdate9;
	private long op29;
	private long tval;
	private String ccode9;
	private String bcode9;
	private String sbname;
	private String sbbook;
}
