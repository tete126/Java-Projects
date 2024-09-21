public class Main {
  public static void main(String[] args) {
    Checker aChecker = new SubstringChecker ("artichokes");
    Checker kChecker = new SubstringChecker ("kale");
    Checker yummyChecker;
    Checker c1 = new NotChecker(aChecker);
    Checker c2 = new NotChecker(kChecker);
    yummyChecker = new AndChecker(c1, c2);
    System.out.println(yummyChecker.accept("chocolate truffles"));
    System.out.println(yummyChecker.accept("kale is great"));
    System.out.println(yummyChecker.accept("Yuck: artichokes & kale")); 

    System.out.println();
    
    Checker broccoliChecker = new SubstringChecker("broccoli");
    System.out.println(broccoliChecker.accept ("broccoli"));
    System.out.println(broccoliChecker.accept ("I like broccoli"));
    System.out.println(broccoliChecker.accept ("carrots are great"));
    System.out.println(broccoliChecker.accept ("Broccoli Bonanza"));

    System.out.println();
    
    Checker bChecker = new SubstringChecker ("beets") ;
    Checker cChecker = new SubstringChecker ("carrots");
    Checker bothChecker = new AndChecker (bChecker, cChecker) ;
    Checker aChecker2 = new SubstringChecker ("artichokes");
    Checker veggies = new AndChecker (bothChecker, aChecker2) ;
    
    System.out.println(bothChecker.accept ("I love beets and carrots"));
  
    System.out.println(bothChecker.accept ("beets are great"));

    System.out.println(veggies.accept ("artichokes, beets, and carrots"));

    System.out.println();

    System.out.println(yummyChecker.accept ("chocolate truffles"));
    System.out.println(yummyChecker.accept ("kale is great"));
    System.out.println(yummyChecker.accept ("Yuck: artichokes & kale"));

  }
}
