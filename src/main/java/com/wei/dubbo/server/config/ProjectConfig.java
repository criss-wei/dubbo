package com.wei.dubbo.server.config;


import java.util.ResourceBundle;

/**
 * 
 * @author wei
 * @date 2019年3月26日  下午2:22:55
 */
public class ProjectConfig {
	public static final ResourceBundle RB=ResourceBundle.getBundle("project.properties");
	
	/**
	 * 通过键获取系统文件中配置的值
	 * @param key
	 * @return
	 */
	public static final String get(String key) {
		return RB.getString(key);
	}
	/**
	 * 快捷获取值 用于多次取的值
	 * @return
	 */
	public static final String getName() {
		return get("name");
	}

}
