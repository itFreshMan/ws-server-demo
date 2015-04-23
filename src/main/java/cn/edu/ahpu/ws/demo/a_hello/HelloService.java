package cn.edu.ahpu.ws.demo.a_hello;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloService {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:6789/hello", new HelloService());
	}

	public String sayHello(String name) {
		return "hello : " + name;
	}

	// 通过如下注解,使该方法不公开
	@WebMethod(exclude = true)
	public String sayHello2(String name) {
		return "hello2 :" + name;
	}
}
