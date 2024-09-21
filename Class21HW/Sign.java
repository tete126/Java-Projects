public class Sign
{
  private String message;
  private int width;

  public Sign(String message, int width)
  {
  this.message = message;
  this.width = width;
  }

  public int numberOfLines()
  {
    int numLines = message.length() / width;

    if(message.length() % width > 0)
    {
      return numLines + 1;
    }


return numLines;

}

public String getLines()
{

String line = "";

if(message.length() <= width)
{
return message;
}


while(message.length() > width)
{
line += message.substring(0, width) + ";";
message = message.substring(width);
}

line += message;

return line;

}
}

