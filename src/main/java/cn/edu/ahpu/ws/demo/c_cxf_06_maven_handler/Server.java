package cn.edu.ahpu.ws.demo.c_cxf_06_maven_handler;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {

	public static void main(String[] args) {
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setAddress("http://127.0.0.1:6789/student");
		//�ṩ�����������
		bean.setServiceClass(IStudentService.class);//����Ҫд�ӿ�����
		
		//�ṩ�����ʵ��
		bean.setServiceBean(new StudentServiceImpl());
		
		//������
		bean.getInInterceptors().add(new LoggingInInterceptor());
		bean.getInFaultInterceptors().add(new LoggingOutInterceptor());
		bean.create();
		
		System.out.println("server ready .....");
	}
}
