import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    //Delimiters list test 1
    
    Delimiters del = new Delimiters("(", ")");

    String [] arr = {"(", "x + y", ")", "* 5"};
    
    ArrayList<String> delimiters = new ArrayList<String>();
    
    delimiters = del.getDelimitersList(arr);
    
    for(int i = 0; i < delimiters.size(); i++)
      {
        System.out.print(delimiters.get(i) + " ");
      }

    System.out.println();

    //Delimiters list test 2

    Delimiters del2 = new Delimiters("<q>", "</q>");

    String [] arr2 = {"<q>", "yy", "</q>", "zz", "</q>" };

    ArrayList<String> delimiters2 = new ArrayList<String>();

    delimiters2 = del2.getDelimitersList(arr2);

    for(int i = 0; i < delimiters2.size(); i++)
      {
        System.out.print(delimiters2.get(i) + " ");
      }

    //Balanced Test 1
    
    System.out.println();
    
    Delimiters del3 = new Delimiters("<sup>", "</sup>");

    ArrayList<String> balanced = new ArrayList<String>();

    balanced.add("<sup>");
    balanced.add("<sup>");
    balanced.add("</sup>");
    balanced.add("<sup>");
    balanced.add("</sup>");
    balanced.add("</sup>");

    System.out.println(del3.isBalanced(balanced));


    ArrayList<String> balanced2 = new ArrayList<String>();

    balanced2.add("<sup>");
    balanced2.add("</sup>");
    balanced2.add("</sup>");
    balanced2.add("<sup>");

    System.out.println(del3.isBalanced(balanced2));

    
  }
}
