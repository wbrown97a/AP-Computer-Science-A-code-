public class isRotation {
   static boolean isRotation(String word1,String word2) {
      
      boolean check = true;
      char startLetter;
      int position;
      if (word1.length() < 1) {
         check = false;
         startLetter = 0;
         }
         else {
         startLetter = word1.charAt(0);
         position = word2.indexOf(startLetter);
         }
     
      
      for (int i = 0; i < word1.length(); i++) {
            
            if (position < 0) {
               check = false;
               break;
            }
            if (word1.length() != word2.length()) {
                check = false;
                break;
            }
            if (position == word1.length()) {
                position = 0;
            }
            if (word1.charAt(i) != word2.charAt(position)) {
                check = false;
                break;
            }
            position = position + 1;
           }
          System.out.println(check);
          return check;
            
   }    
 public static void main(String[]args){
   isRotation("","y");
 }
} 
