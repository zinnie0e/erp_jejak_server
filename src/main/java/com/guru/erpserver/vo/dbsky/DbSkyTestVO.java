package com.guru.erpserver.vo.dbsky;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("dbSkyTestVO")
@JsonInclude(Include.NON_NULL)
public class DbSkyTestVO {
	//TODO 공통
	private long uid;
	private long sqcrnm0;
	
	private String sqbook;
	private String sbbook;
}
