package leetcode.string_part_1;

public class Reverse_words {

	public static void main(String[] args) {
		 String s = " Hello World ";
		 String[] word=s.split("\\s+");
	      StringBuilder stringBuilder =new StringBuilder ();
	      for(int i=word.length-1;i>=0;i--) {
	    	  stringBuilder.append(word[i]).append(" ");
	    	  
	      }
	      String reversed = stringBuilder.toString().trim(); // Convert StringBuilder to String and remove trailing space
	        System.out.println(reversed);
}

	}


