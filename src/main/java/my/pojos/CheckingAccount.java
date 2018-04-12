package my.pojos;

import org.springframework.beans.factory.annotation.Autowired;

public class CheckingAccount implements Account {
	@Autowired
	private Card creditCard;

	public void setCreditCard(Card creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String createAccount() {

		return "Checking Account has been created successfully!";
	}

	@Override
	public String cardDetails() {

		return creditCard.cardDetails();
	}
	
	public void onInit()
	{
		System.out.println("onInit method of CheckingAccount has been invoked.");
	}
	
	public void onDestory()
	{
		System.out.println("onDestory method of CheckingAccount has been invoked.");
	}
}
