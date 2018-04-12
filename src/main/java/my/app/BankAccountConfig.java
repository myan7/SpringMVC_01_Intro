package my.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import my.pojos.CheckingAccount;
import my.pojos.CreditCard;

public class BankAccountConfig {

		@Bean
		public CreditCard creditCard()
		{
			return new CreditCard();
		}
		
		@Bean(initMethod="onInit", destroyMethod="onDestory")
		@Scope("prototype")
		public CheckingAccount checkingAccount()
		{
			return new CheckingAccount();
		}
}
