package cn.conon.jse.sample.websers.ws.document.server;
import javax.jws.WebService;
//Service Implementation  
@WebService(endpointInterface = "cn.conon.jse.sample.websers.ws.document.server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
}