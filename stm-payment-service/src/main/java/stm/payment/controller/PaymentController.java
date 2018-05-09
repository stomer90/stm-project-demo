package stm.payment.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import stm.payment.models.PaymentInfo;

@RestController
public class PaymentController {

	@GetMapping("/hello")
	@ResponseBody
	public ResponseEntity<String> index(){
		return ResponseEntity.ok("Hello PhongNv. This is Payment Service");
	}
	
	@GetMapping("/payment/warmup")
	@ResponseBody
	public ResponseEntity<String> warmup(){
		return ResponseEntity.ok("Hello PhongNv. This is Warmup / paymentservice");
	}
	
	@GetMapping("/find-all")
	public ResponseEntity<List<PaymentInfo>> findAll(){
		List<PaymentInfo> paymentInfos = Stream.of("PaymentInfo - HN", "PaymentInfo - USA", "PaymentInfo - Bamboo")
				.map(item -> new PaymentInfo(item)).collect(Collectors.toList());
		return ResponseEntity.ok(paymentInfos);
	}
	
}
