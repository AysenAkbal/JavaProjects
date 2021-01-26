package project1;

public class JdbcCustomerDao implements ICustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println("M��teri sisteme JDBC ile eklendi: "+ customer.getFistName() + " " +customer.getLastName());
	
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri sistemden JDBC ile silindi.");

	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri sistemde JDBC ile g�ncellendi.");

	}

}
