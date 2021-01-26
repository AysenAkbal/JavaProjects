package project1;

public class Main {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService(new JdbcCustomerDao(),new StarbucksCustomer());
		SalesService salesService = new SalesService(new StarbucksCustomer());
		CampaignService campaignService = new CampaignService(new JdbcCampaignDao(),new StarbucksCampaign());
		
		Customer customer = new Customer();
		customer.setFistName("Ayþen");
		customer.setLastName("Akbal");
		customer.setId(2);
		
		customerService.add(customer);
		salesService.takeCoffee(customer);
		campaignService.addCampaign(customer);

	}

}
