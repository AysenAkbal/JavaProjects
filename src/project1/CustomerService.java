package project1;

public class CustomerService implements ICustomerService {

	ICustomerDao customerdao;
	BaseCustomer basecustomer;
	Campaign campaign;

	public CustomerService(ICustomerDao customerdao, BaseCustomer basecustomer) {
		this.customerdao = customerdao;
		this.basecustomer = basecustomer;

	}

	@Override
	public void add(Customer customer) {
		basecustomer.verifyCustomer(customer);
		customerdao.add(customer);
	}

	@Override
	public void update(Customer customer) {
		customerdao.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		customerdao.delete(customer);
	}

}
