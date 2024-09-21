import java.util.ArrayList;

public class Main {
  public static void main(String[] args) 
  {
    Pet pet1 = new Cat("Cat");
    Pet pet2 = new Dog("Dog");
    Pet pet3 = new LoudDog("LD");

    ArrayList<Pet> petList = new ArrayList<Pet>();
    petList.add(pet1);
    petList.add(pet2);
    petList.add(pet3);

    //System.out.println(petList.get(0).getName() + " " + petList.get(1).getName());

    Kennel myKennel = new Kennel(petList);
    myKennel.allSpeak();
  }
}
