package project1;

public class NeroCustomer extends BaseCustomer {


	@Override
	public void verifyCustomer(Customer customer) {
		System.out.println("Nero m��terisi kay�t �ncesi e-devlet sorgulamas� gerektirmemektedir.");
	}

	@Override
	public void takeCoffee(Customer customer) {
		System.out.println("Nero m��terisi kahve ald�.");
	}

}
