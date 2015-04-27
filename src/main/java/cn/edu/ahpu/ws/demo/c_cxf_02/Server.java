package cn.edu.ahpu.ws.demo.c_cxf_02;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
	public static void main(String[] args) {
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setAddress("http://127.0.0.1:6789/hello");
		//提供服务类的类型
		bean.setServiceClass(IHelloService.class);//这里要写接口名称
		
		//提供服务的实例
		bean.setServiceBean(new HelloServiceImpl());
		
		//拦截器
		bean.getInInterceptors().add(new LoggingInInterceptor());
		bean.getInFaultInterceptors().add(new LoggingOutInterceptor());
		bean.create();
		
		System.out.println("server ready .....");
	}
}
