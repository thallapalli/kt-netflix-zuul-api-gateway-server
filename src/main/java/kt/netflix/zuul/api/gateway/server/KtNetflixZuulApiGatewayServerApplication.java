package kt.netflix.zuul.api.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class KtNetflixZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KtNetflixZuulApiGatewayServerApplication.class, args);
	}

}
