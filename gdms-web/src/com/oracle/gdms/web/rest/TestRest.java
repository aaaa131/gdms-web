package com.oracle.gdms.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oracle.gdms.entity.GoodsEntity;

@Path("/huazhao")

public class TestRest {
	
	@Path("/hello")
	@GET
	
	public void hello() {
		
		System.out.println("hello world!");
		
	}
	
	public GoodsEntity pushOne(int goodsid) {

		return null;
	}

}
