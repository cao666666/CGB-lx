package cn.tedu.pojo;

public class Door {
	private int id;
	private String doorName;
	private String doorTel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoorName() {
		return doorName;
	}
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	public String getDoorTel() {
		return doorTel;
	}
	public void setDoorTel(String doorTel) {
		this.doorTel = doorTel;
	}
	@Override
	public String toString() {
		return "Door [id=" + id + ", doorName=" + doorName + ", doorTel=" + doorTel + "]";
	}
	

}
