package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import my.pojos.Account;

public class BankAccountApplication {

	public static void main(String[] args) {
//		Account account = new SavingAccount();
//		Account account = new CheckingAccount();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account account = context.getBean("myAccount",Account.class);
		
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
		((AbstractApplicationContext)context).close();
		
//		Account account1 = context.getBean("myAccount",Account.class);
//		System.out.println(account);
//		System.out.println(account1);
//		System.out.println("account's hashcode: \t"+account.hashCode());
//		System.out.println("account1's hashcode: \t"+account1.hashCode());
	}
}
