package com.guru.erpserver.vo.dbjejak;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("booksVO")
@JsonInclude(Include.NON_NULL)
public class BooksVO {
	private String sbbook; //도서코드
	private String sbocod;
	private String sbname; //도서명
	private long sbuprc; //정가
	private int sbkc; //KC
	private long sbjego; //현재고
	private long sbjjsr;
	private String sbgume; //구매처
	private String sbapdt; //등록일자
	private String sbdung; //등급
	private String sbdung2;
	private String sbloca; //위치
	private long sbpack;
	private String sbgubn; //보류구분
	private String sbgdat;
	private String sbpegi; //폐간구분
	private String sbpega; //폐간일자
	private String sbcpbh; //초판일자
	private long sbcpsr; //초판제작부수
	private long sbcpdn; //초판단가
	private String sbcjbh; //최종발행일자
	private long sbcjpn; //최종판수
	private String sbbuse; //편집부서
	private String sbjuja; //저자
	private String sbykja; //역자
	private String sbpnja; //편자
	private String sbpjfr; //편집기간(FROM)
	private String sbpjto; //편집기간(TO)
	private String sbsog1; //송고일(본문)
	private String sbsog2; //송고일(표지)
	private String sbipil; //초판입고일
	private long sbcost; //구매단가
	private long sbweit; //중량
	private String sbgeo1; //사식(거래처)
	private long sbamt1; //사식(금액)
	private String sbrem1; //사식(내역)
	private String sbgeo2; //사보(거래처)
	private long sbamt2; //사보(금액)
	private String sbrem2; //사보(내역)
	private String sbgeo3; //원색(거래처)
	private long sbamt3; //원색(금액)
	private String sbrem3; //원색(내역)
	private String sbpnkn; //판권
	private String sbwons; //사용원서
	private String sbwnna; //원저자
	private String sbkomc; //승인번호
	private String sbisbn; //국제표준 도서코드
	private String sbpanh; //본서판형
	private String sbsbph1; //부록 1 판형
	private String sbjanh; //본서장형
	private String sbsbjh1; //부록 1 장형
	private long sbpage; //본서 페이지
	private long sbsbpg1; //부록 1 페이지
	private String sbpjgb;
	private String sbrank;
	private String sbcase;
	private String sbwing;
	private String sbtigi; //띠지
	private long sbdspg; //대수당페이지
	private String sbjlsu; //절수
	private String sbvat0;
	private long sbmung;
	private long sbsbmg;
	private float sbinse; //국내일때 인세
	private String sbhj01;
	private String sbhj02;
	private String sbhj03;
	private long sbhj04; //국외일때 인세
	private String sbpegn;
	private long uid;
	private String sbname2;
	private String sbbigo; //기타사항
	private String sbsbph2; //부록 2 판형
	private String sbsbjh2; //부록 2 장형
	private String sbsbph3; //부록 3 판형
	private String sbsbjh3; //부록 3 장형
	private String sbsbph4; //부록 4 판형
	private String sbsbjh4; //부록 4 장형
	private long sbsbpg2; //부록 2 페이지
	private long sbsbpg3; //부록 3 페이지
	private long sbsbpg4; //부록4 페이지
	private int sbjnji; //증지
	private int sbinji; //인지
	private int sbstic; //스티커
	private int sbcd; //CD
	private int sbcoti; //코딩
	private int sbcase2; //케이스
	private int sbcoti2; //추가코팅
	private int sbmusn;
	private int sbwing2; //오리꼬미
	private int sbmyun; //면지
	private int sbbyul; //별지
	private int sbhwbo; //화보
	private String tmp;
	private String sbyakc;
	private String sbyak2;
	private String sbpanh2; //본서2 판형
	private long sbpage2; //본서2 페이지
	private int sbbinb; //책속의 책
	private String sbboryu;
	private String sbhjgb;  //인세 - 반면, 판매량
	private int sbjjgb;
	private String sbipgo; //입고처
	private int sbsach; //상철제본
	private int sbtpage; //전체지면수
	private int sbmpage;//음악지면수
	private int sbsongn; //총수록곡수
	private double sbsongi; //국내승인곡
	private double sbsongo; //해외승인곡
	private int sbbookp; //도서판매가
	private int sbcdp; //CD판매가
	private int sbjabji; //잡지
	private String memo_jb; //기타(제본)
	private String memo_cd; //기타(CD)
	private String memo_cs; //기타(케이스)
	private String memo_st; //기타(스티커)
	private String memo_vn;
	private String sbename;
	private String sbpub;
	
	private String tmpcode;
	private String dbname;
	
	private String wdbook;
	private int wdboo9;
	private int wdsuns;
	private int wdsrno;
	private int wddesu;
	private int wdpage;
	private int wdcolo;
	private int wdqnty;
	
	private String wybook;
	private int wyboo9;
	private int wysuns;
	private String wygubn;
	private int wycolo;
	private int wypage;
	private String wyjijl;
	private String wjcode;
	private String wjname;
	private int wyjuls;
	
	private String s1ilja;
	private String s1gubn;
	private String s1bunh;
	private int s1suns;
	private String s1cust;
	private String s1cudu;
	private String s1bodu;
	private String s1book;
	private int s1qnty;
	private int s1uprc;
	private double s1dang;
	private int s1hal1;
	private long s1amnt;
	private int s1vatt;
	private String s1kssb;
	private String s1balb;
	private String s1kgub;
	private String s1pgub;
	private String s1pumj;
	private String s1damd;
	private String s1jjja;
	private String s1jjch;
	private String s1modi;
	private String s1loca;
	
	private String scyakc;
	
	private String value;
	private String key;
	private long num_value;
	private long count; //리미트 시작값
	private long lm_s; //리미트 시작값
	private long lm_t; //리미트 전체값
	
	//TODO INSANG(정가인상예정리스트)
//	private long uid;
	private String bcode;
	private long bprice;
	private int pub;
	
	//TODO BITABLE1(필요부분만)
	private String b1bcode;
}
