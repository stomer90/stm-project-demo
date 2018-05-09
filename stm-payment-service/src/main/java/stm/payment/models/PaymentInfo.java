package stm.payment.models;

public class PaymentInfo {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PaymentInfo(String name) {
		super();
		this.name = name;
	}
	
}
