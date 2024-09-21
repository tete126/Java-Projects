import java.util.ArrayList;

public class Delimiters
{
 private String openDel;
 private String closeDel;

 public Delimiters(String open, String close)
 {
  openDel = open;
  closeDel = close;
 }

 public ArrayList<String> getDelimitersList(String[] tokens)
 {
   ArrayList<String> delimiters = new ArrayList<String>();
   
   for(int i = 0; i < tokens.length; i++)
     {
       if(tokens[i].equals(openDel) || tokens[i].equals(closeDel))
       {
         delimiters.add(tokens[i]);
       }
     }

   return delimiters;
 }

 public boolean isBalanced(ArrayList<String> delimiters)
 {
   int countOpen = 0;
   int countClose = 0;

   for(int i = 0; i < delimiters.size(); i++)
     {
       if(delimiters.get(i).equals(openDel))
       {
         countOpen++;
       }
       if(delimiters.get(i).equals(closeDel))
       {
         countClose++;
       }

       if(countClose > countOpen)
       {
         return false;
       }
     }

   if(countOpen == countClose)
   {
     return true;
   }
   
   return false;
   
 }
 
}
