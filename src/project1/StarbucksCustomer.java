package project1;

public class StarbucksCustomer extends BaseCustomer{

	@Override
	public void verifyCustomer(Customer customer) {
		System.out.println("Starbucks m��terisi e-devlet sistemi �zerinden do�ruland�.");
		
	}

	@Override
	public void takeCoffee(Customer customer) {
		System.out.println("Starbucks m��terisi kahve ald�.");
		
	}

}
