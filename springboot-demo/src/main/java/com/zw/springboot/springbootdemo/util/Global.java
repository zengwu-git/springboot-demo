/**
 * Copyright &copy; 2019-2029 ZN All rights reserved.
 */
package com.zw.springboot.springbootdemo.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 全局配置类
 * @author ZN
 * @version 2014-06-25
 */
public class Global {

	/**
	 * 当前对象实例
	 */
	private static Global global = new Global();

	private static Map<String, String> map = new HashMap();

	/**
	 * 属性文件加载对象
	 */
	private static PropertiesLoader loader;

	static {
		try {
			loader = new PropertiesLoader("rad.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取当前对象实例
	 */
	public static Global getInstance() {
		return global;
	}
	
	/**
	 * 获取配置
	 * @see
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = loader.getProperty(key);
			map.put(key, value != null ? value : "");
		}
		return value;
	}


	public static String getEmail(){
		// 如果配置了email返回email
		String email = Global.getConfig("email");
		return email;
}
    public static String getPassword(){
        // 如果配置了email返回email
        String password = Global.getConfig("password");
        return password;
    }
}
