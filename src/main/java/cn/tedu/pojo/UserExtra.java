package cn.tedu.pojo;
/**
 * �û���չ��
 * ������װuser_extra�������
 * @author Administrator
 *
 */
public class UserExtra {
	private int id;
	private int userId;
	private String work;
	private Double salary;
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
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "UserExter [id=" + id + ", userId=" + userId + ", work=" + work + ", salary=" + salary + "]";
	}
	
	

}
