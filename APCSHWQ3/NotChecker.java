public class NotChecker implements Checker
  {
    Checker c;

    public NotChecker(Checker c)
    {
      this.c = c;
    }

    public boolean accept(String text)
    {
      return !c.accept(text);
      //return str.indexOf(s) == -1;
    }
  }
