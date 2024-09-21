public class SubstringChecker implements Checker
  {
    String str;
    public SubstringChecker(String str)
    {
      this.str = str;
    }

    public boolean accept(String text)
    {
      //return text.indexOf(str) != -1;
      return text.indexOf(str) >= 0;
    }
  }
