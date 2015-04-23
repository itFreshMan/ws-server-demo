package cn.edu.ahpu.ws.demo.c_cxf_04;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import cn.edu.ahpu.ws.demo.c_cxf_02.HelloServiceImpl;
import cn.edu.ahpu.ws.demo.c_cxf_02.IHelloService;

public class Server {

	public static void main(String[] args) {
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setAddress("http://192.168.1.108:6789/person");
		//提供服务类的类型
		bean.setServiceClass(PersonService.class);//这里要写接口名称
		
		//提供服务的实例
		bean.setServiceBean(new PersonService());
		
		//拦截器
		bean.getInInterceptors().add(new LoggingInInterceptor());
		bean.getInFaultInterceptors().add(new LoggingOutInterceptor());
		bean.create();
		
		System.out.println("server ready .....");
	}
}
