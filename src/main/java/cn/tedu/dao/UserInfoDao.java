package cn.tedu.dao;

import java.util.List;

import cn.tedu.pojo.Orders;
import cn.tedu.pojo.UserInfo;

public interface UserInfoDao {
	public UserInfo findExtraByUser(int userId);
	
	public List<UserInfo> findOrderdByUser(int userId);

}
