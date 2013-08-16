package br.com.instaweb.jetty;
import org.eclipse.jetty.server.Server;

public class WebServer {

	public static void main(String[] args) throws Exception {
		ServerFactory factory = new ServerFactory(new ConfigurationBuilder()
													.withContextPath("/test")
													.withPort(8080)
													.withBaseResource("src/main/webapp")
													.build());
		
		Server server = factory.buildServer();
		server.start();
		server.join();
	}
	
}
