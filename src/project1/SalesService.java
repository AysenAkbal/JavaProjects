package project1;

public class SalesService implements ISalesService{
	
	BaseCustomer basecustomer;
	
	public SalesService(BaseCustomer basecustomer) {
		this.basecustomer = basecustomer;
		
	}

	@Override
	public void takeCoffee(Customer customer) {
		basecustomer.takeCoffee(customer);
		
	}

}
