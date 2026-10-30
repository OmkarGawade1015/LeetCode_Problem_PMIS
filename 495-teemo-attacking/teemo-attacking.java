class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total=0;
		
		if(timeSeries.length==0) {
			return total;
		}
		
		for(int i=0;i<timeSeries.length-1;i++) {
			
			int time=timeSeries[i+1]-timeSeries[i];
			
			if(duration<=time) {
				
				total=total+duration;
				
			}else
				total=total+time;
			
		}
		return total+duration;
    }
}