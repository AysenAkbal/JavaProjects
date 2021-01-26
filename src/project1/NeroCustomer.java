package project1;

public class NeroCustomer extends BaseCustomer {


	@Override
	public void verifyCustomer(Customer customer) {
		System.out.println("Nero müþterisi kayýt öncesi e-devlet sorgulamasý gerektirmemektedir.");
	}

	@Override
	public void takeCoffee(Customer customer) {
		System.out.println("Nero müþterisi kahve aldý.");
	}

}
