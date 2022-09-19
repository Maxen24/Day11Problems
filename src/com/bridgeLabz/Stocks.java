/**
 * 
 */
package com.bridgeLabz;

/**
 * @author mshub
 *
 */
public class Stocks {
		
	int  stockMarket(int numberofshares, int shareprice, int totalvalue) {
		totalvalue=shareprice*numberofshares;
		System.out.println("numberofshares are"+" "+numberofshares+" "+"and"+" "+"Share price is"+" "+shareprice);
		return totalvalue;
		

	}
}
