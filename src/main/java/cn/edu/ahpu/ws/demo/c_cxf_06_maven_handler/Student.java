package cn.edu.ahpu.ws.demo.c_cxf_06_maven_handler;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "StudentInfo")
public class Student implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private Date birthdate;
	private int score;

	public Student(String name, int age, Date birthdate, int score) {
		super();
		this.name = name;
		this.age = age;
		this.birthdate = birthdate;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student() {
		super();
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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
}
