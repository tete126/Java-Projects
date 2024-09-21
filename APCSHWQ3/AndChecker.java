public class AndChecker implements Checker
  {
    Checker c1;
    Checker c2;

    public AndChecker(Checker c1, Checker c2)
    {
      this.c1 = c1;
      this.c2 = c2;
    }

    public boolean accept(String text)
    {
      return c1.accept(text) && c2.accept(text);
    }
    
  }
