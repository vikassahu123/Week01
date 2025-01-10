public class ProfitCalculate 
{ public static void main(String[]args) 
  { int costPrice=; 
    int sellingPrice=129; 
    int chemistryMark=191; 

    int	profit=sellingPrice-costPrice; 
	
	double profitPercentage=(double)profit/costPrice*100;
	
	System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
  } 
}