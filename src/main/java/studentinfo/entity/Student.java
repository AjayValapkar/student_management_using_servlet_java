package studentinfo.entity;

public class Student {
	private Integer id;
	private String name;
	private String email;
	private String address;
	private Integer rollno;
	private String date;


	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( String name, String email, String address, Integer rollno, String date) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.rollno = rollno;
		this.date = date;
	}

	public Student(Integer id2, String name, String email, String address, Integer rollno, String date) {
		this.id=id2;
		this.name = name;
		this.email = email;
		this.address = address;
		this.rollno = rollno;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", rollno="
				+ rollno + ", date=" + date + "]";
	}

}
