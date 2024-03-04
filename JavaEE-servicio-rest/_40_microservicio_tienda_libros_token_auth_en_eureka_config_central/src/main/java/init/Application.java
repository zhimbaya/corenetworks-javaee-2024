package init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestClient.Builder getBuilder() {
		return RestClient.builder();
	}
	
	@Bean(name = "ribbonClient")
	public RestClient getClient(@Autowired RestClient.Builder builder) { //SOBRA EL AUTOWIRED
		return builder.build();
	}
	
	@Bean(name = "noRibbonClient")
	public RestClient getOtherClient() {
		return RestClient.create();
	}
}
