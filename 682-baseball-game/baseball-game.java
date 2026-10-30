class Solution {
    public int calPoints(String[] operation) {

        Stack<Integer> store=new Stack<>();
		
		for(String op:operation) {
			switch(op) {
			case "+" :
				int last=store.pop();
				int secondLast=store.peek();
				store.push(last);
				store.push(last+secondLast);
				break;
				
			case "D" :
				store.push(2*store.peek());
				break;
				
			case "C" :
				store.pop();
				break;
				
			default :
				store.push(Integer.parseInt(op));
				break;
			}	
			
			}
			
		int sum=0;
		for(int s:store) {
			sum=sum+s;
			
		}
		return sum;
        
    }
}