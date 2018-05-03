package br.com.flaviotvrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringcloudDemoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDemoConfigServerApplication.class, args);
	}
}
