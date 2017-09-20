package Week7;

import javax.swing.*;

class DebugPhoneBook extends DebugBook
{
   private String area;
   private String size;

    DebugPhoneBook (int pages, String city)
   {
      super(pages);
      area = city;
       int CUTOFF = 30;
       if(pages > CUTOFF)
         size = "big";
      else
         size = "small";
   }
    void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book.");
   }
}