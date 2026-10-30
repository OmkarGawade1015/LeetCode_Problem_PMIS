class Solution {
    public int[][] flipAndInvertImage(int[][] Image) {
        for(int i=0;i<Image.length;i++) {
			int start=0;
			int end=Image[i].length-1;
			
			while(start<=end) {
				if(Image[i][start]==Image[i][end]) {
					Image[i][start]=1-Image[i][start];
					Image[i][end]=Image[i][start];
				}
				start++;
				end--;
			}		
		}
		return Image;
    }
}