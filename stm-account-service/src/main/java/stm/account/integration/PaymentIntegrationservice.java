package stm.account.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PaymentIntegrationservice {

	@Value("${PAYMENT_HOST}")
	private String paymentServiceName;
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="someFallbackMethod")
	public String active() {
		String url = new StringBuilder("http://").append(paymentServiceName).append("/hello").toString();
		String response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
		}).getBody();
		
		
		return response;
	}
	
	private String someFallbackMethod() {
		return "This is FallBack Method";
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
