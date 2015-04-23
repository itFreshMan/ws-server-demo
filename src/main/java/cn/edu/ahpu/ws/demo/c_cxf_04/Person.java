package cn.edu.ahpu.ws.demo.c_cxf_04;

import java.util.Date;

public class Person {
	private String name;
	private int age;
	private Date birthdate;

	public Person() {
		super();
	}

	public Person(String name, int age, Date birthdate) {
		super();
		this.name = name;
		this.age = age;
		this.birthdate = birthdate;
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
