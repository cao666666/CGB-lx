package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 借助此类封装我们自己项目中的配置信息
 * @author 123
 *
 */
public class Configuration {
	private List<String> list;
	private Map<String , Object> map;
	private Properties properties;
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Configuration [list=" + list + ", map=" + map + ", properties=" + properties + "]";
	}
	
	
	
	

}
