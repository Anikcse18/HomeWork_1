package hw_1;
import java.util.Arrays;

public class Problem_4 {

	public static void main(String[] args) {
		 // Example soliloquy text
	    String soliloquy = "To be, or not to be, that is the question.";
	    
	    // Extract words from the soliloquy
	    String[] words = extractWords(soliloquy);
	    
	    // Sort words using bubble sort
	    bubbleSort(words);
	    
	    // Print sorted words
	    System.out.println("Sorted words:");
	    for (String word : words) {
	        System.out.println(word);
	    }
	}

	// Method to extract words from a given text
	public static String[] extractWords(String text) {
	    // Define words as sequences of characters separated by non-letter characters
	    // Regex splits by non-word characters (anything that's not a letter, digit, or underscore)
	    return text.split("[^a-zA-Z]+");
	}

	// Bubble sort algorithm to sort an array of strings
	public static void bubbleSort(String[] array) {
	    int n = array.length;
	    boolean swapped;
	    
	    for (int i = 0; i < n - 1; i++) {
	        swapped = false;
	        for (int j = 0; j < n - 1 - i; j++) {
	            // Compare two adjacent elements
	            if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
	                // Swap if they are in the wrong order
	                String temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	                swapped = true;
	            }
	        }
	        // If no elements were swapped, the array is sorted
	        if (!swapped) {
	            break;
	        }
	    }
	}
		
		
	

}
