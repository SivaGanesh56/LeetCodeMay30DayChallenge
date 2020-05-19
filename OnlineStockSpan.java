/*

@Author: Siva Ganesh

Problem Link ==> https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3334/

Description:   Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's price for the current day. 
              The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.

Sample Cases:  
        if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85]
        then the stock spans would be [1, 1, 1, 2, 1, 4, 6].
        
Apporach: Naive

*/

class StockSpanner {
    List<Integer> list;
    public StockSpanner() {
        this.list = new ArrayList<>();
    }
    public int next(int price) {
        list.add(price);
    	if(list.size()==1) {
    		return 1;
    	}
    	int i = list.size()-2;
    	int span = 1;
    	while(i>=0) {
    		if(list.get(i)>price) {
    			return span;
    		}
    		i--;
    		span++;
    	}
    	return span;
    }
}
