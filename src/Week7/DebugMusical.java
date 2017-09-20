package Week7;

public class DebugMusical extends DebugPlay
{
   private String composer;

   DebugMusical(String title, String author, String comp)
   {
      super(title, author);
      this.title = title;
      this.author = author;

   }
   public void display()
   {
      System.out.println("The performance is  " + title +
        " by " + author + "\nThe music for " + title +
        " is by " + composer);
   }
}