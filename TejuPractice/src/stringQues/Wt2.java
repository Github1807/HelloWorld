package stringQues;

public class Wt2 {

	public static void main(String[] args) {
		long maximumProfit(vector<int> inv, long order) {    
		    
		    
		    // TLE 
		    // long profit = 0;
		    // while(order > 0) {       
		    //     sort(inv.begin(), inv.end());
		    //     int maxElement = inv[inv.size()-1];
		    //     profit += maxElement;
		    //     order--;
		    //     inv[inv.size()-1] -= 1;
		    // }
		    // return profit;
		    
		    sort(inv.begin(), inv.end(), greater<long>())    ;
		    long profit = 0;
		    int n;
		    long sum = 0;
		    
		    for(int i =  1; i < inv.size() && order > 0; i++){
		        n = inv[i-1] - inv[i];
		        if(i * n <= order){
		            sum = (n * (inv[i] + 1 + inv[i-1])) / 2;
		            profit += i * sum;
		            order -= i * n;
		        }
		        else{
		            n = order/i;
		            sum = (n * ( ( 2 * inv[i-1]) - n + 1))/ 2;
		            profit += i * sum;
		            profit += (order % i ) * (inv[i - 1] - n);
		            order = 0;
		        }        
		    }
		    
		    if(order > 0){
		        n = order / inv.size();
		        sum = (n * ( ( 2 * inv[inv.size() - 1]) - n + 1)) / 2;
		        profit += inv.size() * sum;
		        profit += (order * inv.size()) * (inv[inv.size() - 1] - n);
		    }
		    
		    return profit;
		}

	}

}
