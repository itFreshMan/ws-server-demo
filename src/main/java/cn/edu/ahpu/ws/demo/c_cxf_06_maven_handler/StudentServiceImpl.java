package cn.edu.ahpu.ws.demo.c_cxf_06_maven_handler;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;


public class StudentServiceImpl implements IStudentService{
	
	public Student findPerson(String name) {
		System.out.println("start findPerson ...");
		Student s = new Student();
		s.setAge(18);
		s.setName("devil");
		s.setBirthdate(new Date());
		s.setScore(89);
		return s;
	}
	
	public String printPersonInfo(Student s){
		System.out.println("start printPersonInfo ...");
		return "[name:"+s.getName()+",age:"+s.getAge()+",score:"+s.getScore()+"birthdate:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(s.getBirthdate())+"]";
	}

	@Override
	public String sayHello(String name) {
		return "ÄãºÃ°¡:"+name;
	}
}
