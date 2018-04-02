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
