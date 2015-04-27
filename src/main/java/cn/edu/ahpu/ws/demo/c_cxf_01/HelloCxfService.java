package cn.edu.ahpu.ws.demo.c_cxf_01;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * 
 *ServerFactoryBean��ʽ����Cxf����
 */
public class HelloCxfService {
	
	public String sayHello(String name){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").format(new Date())+" - hello "+name;
	}
	
	public static void main(String[] args) {
		ServerFactoryBean bean = new ServerFactoryBean();
		bean.setAddress("http://127.0.0.1:6789/hello");
		//�ṩ�����������
		bean.setServiceClass(HelloCxfService.class);
		
		
		//�ṩ�����ʵ��
		bean.setServiceBean(new HelloCxfService());
		
		bean.create();
		
		System.out.println("server ready .....");
	}
}
