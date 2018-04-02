# Webservice
1、使用Eclipse新建一个XidianServices项目：
	 
2、编写HelloService类：
package xidian.services.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloService {

	@WebMethod
	public String helloserver(String message) {
		return "hello " + message;
	}
}
编写Server类：
package xidian.services.server;

import javax.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {
		HelloService helloService = new HelloService();
		String addr = "http://127.0.0.1:8888/hello";
		Endpoint.publish(addr, helloService);
	}
}
3、运行Server类，打开浏览器，输入http://127.0.0.1:8888/hello?wsdl ，出现自动生成的WSDL文件
4、打开cmd，进入当前工程的xidian.services目录下，执行命令：
wsimport -p xidian.services.webservice -keep http://127.0.0.1:8888/hello?wsdl
	 
在Eclipse中刷新工程，即可看到新生成的目录
	 
5、编写客户端类Client如下：
	package xidian.services.client;

import xidian.services.webservice.HelloService;
import xidian.services.webservice.HelloServiceService;

public class Client {

	public static void main(String[] args) {
		HelloServiceService helloServiceService = new HelloServiceService();
		HelloService helloService = helloServiceService.getHelloServicePort();
		System.out.println(helloService.helloserver("xidian!"));
	}
}
	运行Client.java看到控制台打印:hello xidian!
	 
	说明利用JAX-WS成功实现Web services。
