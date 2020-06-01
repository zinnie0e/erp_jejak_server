package com.guru.erpserver.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("testVO")
public class TestVO {
	private int testc;
}
