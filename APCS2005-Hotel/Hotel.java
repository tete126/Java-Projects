import java.util.ArrayList;

public class Hotel
{
  private Reservation[] rooms;

  private ArrayList<String> waitList = new ArrayList<String>();

  public Hotel(int numRooms)
  {
    rooms = new Reservation[numRooms];
  }


  public Reservation requestRoom (String guestName)
  {
      for(int i = 0; i < rooms.length; i++)
      {
        if (rooms[i] == null)
        {
          rooms[i] = new Reservation(guestName, i);
          return rooms[i];
        }
      }

     waitList.add(guestName);
     return null;                                                       
  }

  
  public Reservation cancelAndReassign (Reservation res)
  {
    int num = res.getRoomNumber();
    
    if(waitList.size() > 0)
    {
      String guest = waitList.get(0);
      waitList.remove(0);
      rooms[num] = new Reservation(guest, num);
    }
    else
    {
      rooms[num] = null;
    }

    return rooms[num];
  }

}
