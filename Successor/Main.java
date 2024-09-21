
public class Main {
  public static void main(String[] args) {
    int [][] arr = {{15, 5, 9, 10}, {12, 16, 11, 6}, {14, 8, 13, 7}};

    //Successors s = new Successors();
    //Position p = s.findPosition(12, arr);
    Position p = Successors.findPosition(12, arr);
    System.out.println(p);
    Position [][] arr2 = Successors.getSuccessorArray(arr);

    for(int i = 0; i < arr.length; i++)
      {
        for(int j = 0; j < arr[0].length; j++)
          {
            System.out.println(arr2[i][j]);
          }
        
      }
   
  }

}
