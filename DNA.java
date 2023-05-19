// Dertermines wheter there is a protein in a strand of DNA
public class DNA {
 
    public static void main(String[] args) {
   
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
      
      // three DNA strands to test
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
  
    //generic String variable dna can be set to any DNA sequence
      String dna = dna1;
  
      // find length of dna
      int length = dna.length();
      // print length
      System.out.println("Length: " + length);
  
      // find index of ATG
      int start = dna.indexOf("ATG");
      // print start
      System.out.println("Start: " + start);
  
      // find index of TGA
      int stop = dna.indexOf("TGA");
      // print end
      System.out.println("Stop: " + stop);
      System.out.println(dna.charAt(stop));
  
      // if statement checks for a start and end condition and if the number of nucletotides in between stop and start is multiple of 3
      if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
        // String protein variable is substring of dna start at start and ends at end plus 3
        String protein = dna.substring(start, stop+3);
        // print out protein
        System.out.println("Protein: " + protein);
      } 
      // else print out No protein
      else {
        System.out.println("No protein");
      }
   
    }
   
  }