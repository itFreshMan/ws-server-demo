package cn.edu.ahpu.ws.demo.c_cxf_02;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
	public static void main(String[] args) {
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setAddress("http://127.0.0.1:6789/hello");
		//�ṩ�����������
		bean.setServiceClass(IHelloService.class);//����Ҫд�ӿ�����
		
		//�ṩ�����ʵ��
		bean.setServiceBean(new HelloServiceImpl());
		
		//������
		bean.getInInterceptors().add(new LoggingInInterceptor());
		bean.getInFaultInterceptors().add(new LoggingOutInterceptor());
		bean.create();
		
		System.out.println("server ready .....");
	}
}
