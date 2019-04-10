package cn.tedu.pojo;
/**
 * ∂©µ•∂‘œÛ
 * @author Administrator
 *
 */
public class Orders {
	private int id;
	private int userId;
	private int orderNo;
	private String orderDesc;
	private Double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", orderNo=" + orderNo + ", orderDesc=" + orderDesc
				+ ", price=" + price + "]";
	}
	
}
