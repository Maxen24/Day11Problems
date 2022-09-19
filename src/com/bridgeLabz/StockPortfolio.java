/**
 * 
 */
package com.bridgeLabz;

/**
 * @author mshub
 *
 */
public class StockPortfolio extends Stocks {
	String [] stockNames= {"1.Reliance","2.Tatamotor","3.Tatasteel","4.Infosys"};

	@Override
		int stockMarket(int numberofshares, int shareprice, int totalvalue) {
			return super.stockMarket(numberofshares, shareprice, totalvalue);
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockPortfolio mywatchlist= new StockPortfolio();
		System.out.println("My Share Orders are");
		System.out.println(mywatchlist.stockNames[0]+" "+"Open order value is "+" "+mywatchlist.stockMarket(15, 2000, 0));
		System.out.println(mywatchlist.stockNames[1]+" "+"Open order value is "+" "+mywatchlist.stockMarket(10, 476, 0));
		System.out.println(mywatchlist.stockNames[2]+" "+"Open order value is "+" "+mywatchlist.stockMarket(10, 800, 0));
		System.out.println(mywatchlist.stockNames[3]+" "+"Open order value is "+"  "+mywatchlist.stockMarket(15, 1540, 0));
	}
}
