package cn.edu.ahpu.ws.demo.c_cxf_01;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * 
 *JaxWsServerFactoryBean��ʽ����Cxf����:����ΪServerFactoryBean����
 */
@WebService
public class HelloCxfService2 {
	public static void main(String[] args) {
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setAddress("http://127.0.0.1:6789/hello");
		//�ṩ�����������
		bean.setServiceClass(HelloCxfService2.class);
		
		//�ṩ�����ʵ��
		bean.setServiceBean(new HelloCxfService2());
		
		bean.create();
		
		System.out.println("server ready .....");
	}
	
	public String sayHi(String name){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").format(new Date())+" - hi "+name;
	}
	
}
