package xidian.services.server;

import javax.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {
		HelloService helloService = new HelloService();
		String addr = "http://127.0.0.1:8888/hello";
		Endpoint.publish(addr, helloService);
	}
}
