package project1;

public class JdbcCampaignDao implements ICampaignDao {

	@Override
	public void delete(Customer customer) {
		System.out.print("Kampanya JDBC ile silindi.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.print("Kampanya JDBC ile g�ncellendi.");
		
	}

	@Override
	public void add(Customer customer) {
		System.out.print("Kampanya JDBC ile ekledi.");
	}

}
