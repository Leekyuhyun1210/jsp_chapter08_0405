package test; // DTO(Data Transfer Object) 클래스

public class Student {
	
	private String name; //이릉
	private int age; //나이
	private int grade; //학년
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
