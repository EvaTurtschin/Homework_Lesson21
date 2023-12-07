package homework_Dog;

public class Dog {

    String dogName;
    String dogBreed;
    static int counter;

    public Dog(String dogName, String dogBreed)
    {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        counter ++;
    }
  public String toString ()
  { return dogName + " - " + dogBreed;
  }


}
