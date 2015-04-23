package cn.edu.ahpu.ws.demo.c_cxf_01;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebMethod;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * 
 *ServerFactoryBean方式发布Cxf服务
 */
public class HelloCxfService {
	
	public String sayHello(String name){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").format(new Date())+" - hello "+name;
	}
	
	public static void main(String[] args) {
		ServerFactoryBean bean = new ServerFactoryBean();
		bean.setAddress("http://192.168.1.108:6789/hello");
		//提供服务类的类型
		bean.setServiceClass(HelloCxfService.class);
		
		//提供服务的实例
		bean.setServiceBean(new HelloCxfService());
		
		bean.create();
		
		System.out.println("server ready .....");
	}
}
