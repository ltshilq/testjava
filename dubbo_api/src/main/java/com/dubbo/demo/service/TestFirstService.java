package com.dubbo.demo.service;

import com.dubbo.demo.bean.Dubbo;

public interface TestFirstService {

	public String SayGood(String name);
	
	public Dubbo selectByID(int id);
}
