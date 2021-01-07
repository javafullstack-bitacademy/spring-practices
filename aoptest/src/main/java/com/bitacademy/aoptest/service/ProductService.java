package com.bitacademy.aoptest.service;

import org.springframework.stereotype.Service;

import com.bitacademy.aoptest.vo.ProductVo;

@Service
public class ProductService {

	public ProductVo find(String name) {
		System.out.println("[ProductService] finding...");
//		if( 1 - 1 == 0) {
//			throw new RuntimeException("My Exception");
//		}
		
		return new ProductVo(name);
	}

}
