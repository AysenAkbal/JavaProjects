package project1;

public class StarbucksCustomer extends BaseCustomer{

	@Override
	public void verifyCustomer(Customer customer) {
		System.out.println("Starbucks müþterisi e-devlet sistemi üzerinden doðrulandý.");
		
	}

	@Override
	public void takeCoffee(Customer customer) {
		System.out.println("Starbucks müþterisi kahve aldý.");
		
	}

}
