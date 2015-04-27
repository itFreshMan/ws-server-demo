package cn.edu.ahpu.ws.demo.c_cxf_06_maven_handler;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IStudentService {
	
	@WebMethod
	public Student findPerson(String name);
	
	@WebMethod
	public String printPersonInfo(Student s);
	
	@WebMethod
	public String sayHello(String name);
}
