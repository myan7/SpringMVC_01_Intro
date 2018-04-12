package my.pojos;

public class SavingAccount implements Account {

	private Card atmCard;

	public SavingAccount() {
	}

	public SavingAccount(Card atmCard) {
		this.atmCard = atmCard;
	}

	public String createAccount() {
		return "Saving Account has been created successfully!";
	}

	@Override
	public String cardDetails() {

		return atmCard.cardDetails();
	}
}
