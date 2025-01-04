
//  saala sell price print nhi ho rhi .
// public class buy_sell
// {
// public static void main (String[]args)
//   {
// int[] prices = {7,1,5,3,6,4};
// int sell = 0;

// int buy_day = 0;

// int buy_price = 0;
     
// int max_profit = 0;
     
// for (int i = 0; i < prices.length; i++)
//       {
	
// buy_price = prices[0];
	
// if (buy_price > prices[i])
// 	  {
	    
// buy_price = prices[i];
	    
// buy_day = i;
// System.out.println("the buying price will be" + buy_price);
// }
// }
     
// for (int j = buy_day; j < prices.length; j++)
//       {
	
// sell = buy_price;
	
// if (sell < prices[j])
// 	  {
	    
// sell = prices[j];
// System.out.println( "Selling price will be "+ sell);
//       }  
// }
// max_profit = sell - buy_price;
    
// System.out.println(max_profit);
// }

// }
// public class buy_sell{
//       public static void main(String []args){
//             int buy,max_profit=0;
//             int seel=0;
//             int []fruits={3,4,2,7,5,8};
//              buy=fruits[0];
//              int buy_day=0;
//             for(int i=0;i<fruits.length;i++){
                 
//                   if( buy>fruits[i]){
//                           buy=fruits[i];  
//                           buy_day=i;
//                   }
//             }
//             for(int i=buy_day;i<fruits.length;i++){
                 
//                   if( seel<fruits[i]){
//                           seel=fruits[i];  
                          
//                   }
//             }
//             System.out.println("buying price will be "+ buy);
//              System.out.println(  "selling price will be "+ seel);
//              max_profit=seel-buy;
//             System.out.println(  " Maximun profit will be "+ max_profit);
//       }
// }

// 
// hoga but solution seel
class buy_sell{
    public static void main(String[]args){

        int []prices={1,2,6,4,6};
        int buy=prices[0];
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            if(buy<prices[i]){
            max_profit=Math.max(max_profit,prices[i]-buy);
        }
              else{
             buy=prices[i];
          }
        }
       
       System.out.println(max_profit);
    }
}