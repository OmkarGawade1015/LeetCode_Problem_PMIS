class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqCandy=new HashSet<>();
		
		int orignalCandySize=candyType.length;
		
		for(int x: candyType) {
			uniqCandy.add(x);
		}
		
		int result=Math.min(uniqCandy.size(),orignalCandySize/2);
		
		return result;
    }
}