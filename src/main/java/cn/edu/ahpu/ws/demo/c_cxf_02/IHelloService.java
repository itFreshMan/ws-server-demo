package cn.edu.ahpu.ws.demo.c_cxf_02;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;



@WebService
@BindingType(value=SOAPBinding.SOAP12HTTP_BINDING)
public interface IHelloService {
	public String sayHello(String name);
}
