package project1;

public class CampaignService implements ICampaignService {

	Campaign campaign;
	ICampaignDao campaigndao;
	
	public CampaignService(ICampaignDao campaigndao, Campaign campaign) {
		this.campaign = campaign;
		this.campaigndao = campaigndao;
	}

	@Override
	public void addCampaign(Customer customer) {
		campaigndao.add(customer);
		campaign.campaignAdd(customer);

	}

	@Override
	public void deleteCampaign(Customer customer) {
		campaigndao.delete(customer);

	}

	@Override
	public void updateCampaign(Customer customer) {
		campaigndao.update(customer);

	}
}
