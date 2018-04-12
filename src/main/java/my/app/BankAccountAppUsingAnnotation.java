package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.pojos.Account;
import my.pojos.CheckingAccount;

public class BankAccountAppUsingAnnotation {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(BankAccountConfig.class);
		Account account = context.getBean("checkingAccount", CheckingAccount.class);
		
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
	}
}
