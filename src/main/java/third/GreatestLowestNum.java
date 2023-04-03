package third;

import java.util.Arrays;

public class GreatestLowestNum {
	
	public void findGandL(int i[]) {
		
		int temp;
		for(int l:i) {
		for(int j=0;j<i.length-1;j++) {
			if(i[j]<i[j+1]) {
				temp = i[j];
				i[j]=i[j+1];
				i[j+1]=temp;
				
			}
		}
		}
		System.out.println(Arrays.toString(i));
		
	}
	
public static void main(String[] args) {
	GreatestLowestNum g = new GreatestLowestNum();
	g.findGandL(new int[] {2,5,9,4,3,6,1});
}
}
