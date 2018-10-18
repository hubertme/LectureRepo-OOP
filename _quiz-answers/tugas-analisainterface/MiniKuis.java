import java.util.Scanner;

public class MiniKuis
{
  
   public static void main (String[] args)
   {
   	  // Instantiate q1 & q2
      Pertanyaan q1, q2;
      String mungkin;

      Scanner scan = new Scanner (System.in);

      // Set up q1 & q2
      q1 = new Pertanyaan ("Apa nama ibukota dari Jamaica?",
                            "Kingston");
      q1.setKompleksitas (4);
      
      q2 = new Pertanyaan ("Apa nama ibukota dari Vietnam?",
                           "Saya tidak tahu dan tidak peduli");
      q2.setKompleksitas (10);

      // Display the first question
      System.out.print (q1.getPertanyaan());
      System.out.println (" (Level: " + q1.getKompleksitas() + ")");
      // Input user's answer for the first question
      mungkin = scan.nextLine();

      // Check first question
      if (q1.jawabanBenar(mungkin))
         System.out.println ("Tepat");
      else
         System.out.println ("Salah, jawabannya adalah " + q1.getJawaban());
      
      // Display blank space only (for better console)
      System.out.println();
      
      // Display the second question
      System.out.print (q2.getPertanyaan());
      System.out.println (" (Level: " + q2.getKompleksitas() + ")");
      // Input user's answer for the second question
      mungkin = scan.nextLine();
      
      // Check the second question
      if (q2.jawabanBenar(mungkin))
         System.out.println ("Tepat");
      else
         System.out.println ("Salah, jawabannya adalah " + q2.getJawaban());
   }
}