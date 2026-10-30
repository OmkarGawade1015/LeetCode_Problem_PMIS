class Solution {
    public int thirdMax(int[] arr) {

        Integer largest=null;
		Integer second=null;
		Integer third=null;
		
		for(int num : arr) {
			if((largest != null && largest==num) || 
            (second != null && second==num) ||
            third != null && num==third )
				continue;

			if(largest == null || num > largest) {
				third=second;
				second=largest;
				largest=num;
			}
			
			else if(second == null || num > second) {
				third=second;
				second=num;
			}
			else if(third == null || num > third){
				third=num;
				
			}
		}

        if (third == null) {
            return (int) largest;
        }
		
		
	return third;
        
    }
}