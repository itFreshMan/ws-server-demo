package cn.edu.ahpu.ws.demo.b_annotation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(serviceName="MyService",targetNamespace="http://www.baidu.com")
public class HelloService2 {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:6789/hello", new HelloService2());
	}

	@WebMethod(operationName="hello")
	@WebResult(name="helloReturn") 
	public String sayHello(@WebParam(name="name") String name ,@WebParam(name="age")int age) {
		return "hello : [" + name+","+age+"]";
	}

	// 通过如下注解,使该方法不公开
	@WebMethod(exclude = true)
	public String sayHello2(String name) {
		return "hello2 :" + name;
	}
}
