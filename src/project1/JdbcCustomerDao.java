package project1;

public class JdbcCustomerDao implements ICustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println("Müþteri sisteme JDBC ile eklendi: "+ customer.getFistName() + " " +customer.getLastName());
	
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri sistemden JDBC ile silindi.");

	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri sistemde JDBC ile güncellendi.");

	}

}
