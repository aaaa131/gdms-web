package com.oracle.gdms.util;

import java.util.ResourceBundle;

public class Factory {
	//创建工厂
	private Factory() {}
	
	private static Factory fac = null;
	//单例
	public static Factory getInstance() {
		fac = fac == null ? new Factory():fac;
		return fac;
	}
	
	private static ResourceBundle rb = null;
	static {
		rb = ResourceBundle.getBundle("config/application");//读取配置文件
	}
	
	public Object getObject(String key) {
		String clsname = rb.getString(key);//根据key找到相关的类路径和名称
		try {
			return Class.forName(clsname).newInstance();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return null;
	}

}
