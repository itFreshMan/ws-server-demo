package cn.edu.ahpu.ws.demo.c_cxf_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloServiceImpl implements IHelloService {
	@Override
	public String sayHello(String name) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").format(new Date())+" - hi "+name;
	}

}
