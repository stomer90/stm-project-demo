package stm.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import stm.account.integration.PaymentClient;
import stm.account.integration.PaymentInfo;
import stm.account.integration.PaymentIntegrationservice;

@RestController
public class AccountController {

	@Autowired
	PaymentClient paymentClient;
	
	@Autowired
	PaymentIntegrationservice paymentIntegrationservice;
	
	@GetMapping("/hello")
	@ResponseBody
	public ResponseEntity<String> index(){
		return ResponseEntity.ok("Hello PhongNv. This is ACCOUNT Service");
	}
	
	@GetMapping("/call-payment/hello")
	@ResponseBody
	public ResponseEntity<String> callIntegration(){
		return paymentClient.hello();
	}
	
	@GetMapping("/call-payment/warmup")
	@ResponseBody
	public ResponseEntity<String> callWarmup(){
		return paymentClient.warmup();
	}
	
	@GetMapping("/call-payment/find-all")
	@ResponseBody
	public ResponseEntity<List<PaymentInfo>> findAll(){
		return paymentClient.findAll();
	}
	

	@GetMapping("/hello-1")
	@ResponseBody
	public ResponseEntity<String> index_1(){
		return ResponseEntity.ok(paymentIntegrationservice.active());
	}
}
