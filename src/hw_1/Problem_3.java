package hw_1;

public class Problem_3 {


	public static void main(String[] args) {
	char [] vowels = {'a','e','i','o','u'};
	
	int numberofVowels = 0;
	int umberofSpace = 0;
	int numberofConsonent = 0;

	
	String Name = "To be or not to be, that is the question;"
			+"Whether `tis nobler in the mind to suffer"
			+" the slings and arrows of outrageous fortune,"
			+" or to take arms against a sea of troubles,"
			+" and by opposing end them?";

	
	
	int totalLetter = 0;
	int totalVowel = 0;
	int totalSpace = 0;
	
	
	for (int i = 0; i < Name.length(); i++) {
	    char upperletter = Name.charAt(i);
	    char letter = Character.toLowerCase(upperletter);
	    
	    boolean isletter = Character.isLetter(letter);
	    //To count All letters
	   if (isletter) {
		   totalLetter ++;	   
		   
		   for (char vowel : vowels) {
			   if (vowel==letter) {
				   totalVowel++;
				   break;
			   }
			
		}
		   
		   
	   	} else if(letter==' ') {
	   		
	   		totalSpace++;
	   	}
	    
	           
	}
	
	System.out.println("The text contained vowels: " + totalVowel + "\n"+ "consonants: " + (totalLetter - totalVowel) + "\n"+ "spaces: " + totalSpace);

	}

}
