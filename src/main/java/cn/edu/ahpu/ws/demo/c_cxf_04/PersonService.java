package cn.edu.ahpu.ws.demo.c_cxf_04;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

@WebService
public class PersonService {
	public Person findPerson(String name) {
		System.out.println("start findPerson ...");
		Person p = new Person();
		p.setAge(18);
		p.setName("devil");
		p.setBirthdate(new Date());
		return p;
	}
	
	public String printPersonInfo(Person p){
		System.out.println("start printPersonInfo ...");
		
		return "[name:"+p.getName()+",age:"+p.getAge()+",birthdate:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(p.getBirthdate())+"]";
	}
}
