package week1.day2;

public class Palindrome {

	 public static void main(String[] args) {

		    String str = "madam", rev = "";

		    for (int i = (str.length()) - 1; i >=0; --i) {
		      rev = rev + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(rev.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }
		}


