import java.util.ArrayList;

public class StringCoder
  {
    private String masterString;

    public StringCoder(String master)
    {
      masterString = master;
    }

    public String decodeString(ArrayList<StringPart> parts)
    {
      String decoded = "";
      for(int i = 0; i < parts.size(); i++)
        {
          String part = parts.get(i);
          decoded += masterString.substring(part.getStart(), part.getStart() + part.getLength());
        }

      return decoded;
    }

    private StringPart findPart(String str)
    {
      
    }

    public ArrayList<StringPart> encodeString(String word)
    {
      ArrayList<StringPart> parts = new ArrayList<StringPart>();

      while (word.length() > 0)
        {
          StringPart sp = findPart(word);
          parts.add(sp);
          word = word.substring(sp.getLength());
        }

      return parts;
    }
  }
