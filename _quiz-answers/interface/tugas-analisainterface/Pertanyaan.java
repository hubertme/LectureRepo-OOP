public class Pertanyaan implements Kompleksitas
{
   // Encapsulation
   private String pertanyaan, jawaban;
   private int levelKompleksitas;

   // Default constructor for "Pertanyaan" class
   public Pertanyaan (String query, String hasil)
   {
      pertanyaan = query;
      jawaban = hasil;
      levelKompleksitas = 1;
   }
   
   // Set the complexity of a question
   public void setKompleksitas (int level)
   {
      levelKompleksitas = level;
   }
   
   // Fetch the complexity of a question
   public int getKompleksitas()
   {
      return levelKompleksitas;
   }
   
   // Fetch question
   public String getPertanyaan()
   {
      return pertanyaan;
   }
   
   // Fetch correct answer
   public String getJawaban()
   {
      return jawaban;
   }
   
   // Check whether user's answer to a question is correct or not
   public boolean jawabanBenar (String kandidatJawaban)
   {
      return jawaban.equals(kandidatJawaban);
   }
   
   // Combine the question and answer 
   public String toString()
   {
      return pertanyaan + "\n" + jawaban;
   }
}