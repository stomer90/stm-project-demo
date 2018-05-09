package stm.account.integration;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${PAYMENT_HOST}")
public interface PaymentClient {

	@GetMapping("/hello")
	ResponseEntity<String> hello();
	
	@GetMapping("/payment/warmup")
	ResponseEntity<String> warmup();
	
	@GetMapping("/find-all")
	public ResponseEntity<List<PaymentInfo>> findAll();
}
