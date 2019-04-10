package cn.tedu.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * �û���Ϣ����
 * �����������װuser_info�������
 * @author Administrator
 *
 */
public class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String userName;
	private String userAddr;
	private int userAge;
	
	private UserExtra userExtra;
	
	//�����û���һ�Զ��ϵ��orders
	private List<Orders> orders;
	
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public UserExtra getUserExtra() {
		return userExtra;
	}
	public void setUserExtra(UserExtra userExtra) {
		this.userExtra = userExtra;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", userAddr=" + userAddr + ", userAge=" + userAge
				+ ", userExtra=" + userExtra + ", orders=" + orders + "]";
	}
	
	
}
