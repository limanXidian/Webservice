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
