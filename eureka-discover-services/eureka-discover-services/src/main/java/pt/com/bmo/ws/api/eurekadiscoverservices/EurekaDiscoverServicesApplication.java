package pt.com.bmo.ws.api.eurekadiscoverservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDiscoverServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoverServicesApplication.class, args);
	}

}
