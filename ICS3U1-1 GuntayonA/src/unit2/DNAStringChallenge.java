package unit2;

/**
Description: DNAStringChallenge worksheet
Date: Nov 26 2024
@author: Alexander Guntayon
*/

public class DNAStringChallenge {
  public static void main(String[] args) {
    /**
      http://rosalind.info/problems/dna/
    */
	  String dna = "AADDBBCBDDDCCDDBBBCCCCAAAAAAA"; // The DNA
	  
	  int a = 0; // DNA a
	  int b = 0; // DNA b
	  int c = 0; // DNA c
	  int d = 0; // DNA d
	  
	  
	  
	  for (int i = 0; i < dna.length(); i++) { // For loop checks what char is at each index
		  if (dna.charAt(i) == 'A') {
			  a += 1;
		  }
		  else if (dna.charAt(i) == 'B') {
			  b += 1;
		  }
		  else if (dna.charAt(i) == 'C') {
			  c += 1;
		  }
		  else {
			  d += 1;
		  }

	  }
	  System.out.println(a + " " + b + " " + c + " " + d); // Prints out results
			  
  }
}