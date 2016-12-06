package org.xdemo.example.activiti.controller.controller;

import java.io.File;

public class Util {
	
	public static String[] list(){
		String basePath=Util.class.getResource("/").getPath();
		basePath=basePath.substring(1,basePath.length());
		return new File(basePath+File.separator+"diagrams").list();
	}

	public void test() {
		System.out.println(111);
		System.out.println(222);
	}
}
