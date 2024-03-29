package third;

public class StringReverseExcludeChar {
	public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            if (!Character.isLetter(charArray[left])) {
                left++;
            } else if (!Character.isLetter(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(charArray);
    }
	
	 public static void main(String[] args) {
	        String str = "a,b$c";
	        System.out.println("Original string: " + str);
	        System.out.println("Reversed string: " + reverseString(str));
	    }
}
