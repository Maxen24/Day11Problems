/**
 * 
 */
package com.bridgeLabz;

/**
 * @author mshub
 *
 */
public class Account {

	public int debit(int withdrawlMoney, int amountLeft, int amountAvailable) {
		
		if (amountAvailable>amountLeft) {
			withdrawlMoney=amountAvailable-amountLeft;
			return withdrawlMoney;
	} else {
			System.out.println("Debited amount exceeded account balance");
			System.out.println("Your Available balance is"+" "+"Rs"+amountAvailable);
			return withdrawlMoney;
		}
		
	}
	public static void main(String[] args) {
		Account debitedMoney=new Account();
		Account availableMoney=new Account();
		//System.out.println("Your Account debited by"+" "+"Rs"+debitedMoney.debit(0, 500, 1000));
		System.out.println("Your Account debited by"+" "+"Rs"+availableMoney.debit(0,1000,600));
	
	}
	

}
