

public class Startup {
    static int classLocal;

  public static void main(String[] args) {
      Circle circle = new Circle();
      circle.radius = 5;
      System.out.println("Circle 1s radius " + circle.radius);

      Circle circle2 = new Circle();
      circle2.radius = 10;
      System.out.println("Circle 2s raidus " + circle2.radius);

      Circle circle3 = circle;
      System.out.println("Circle 3 raidus " + circle.radius);

      circle.radius = 10;

      int radius = 5;
      System.out.println("Radius " + radius);

      int radius2 = 10; 
      System.out.println("Radius2 " + radius2);

      radius = 76;
      System.out.println("radius2 " + radius2);

      String name = "Daniel";
      String name1 = "Daniel";

      System.out.println(name.toUpperCase());

      Student student = new Student();
      System.out.println(student);
      student.name = "Daniel";
      System.out.println(student.name);
      student.GPA = Float.parseFloat("354651");
      System.out.println(student.GPA);
      System.out.println(classLocal);
  }
  
  public static double harmonic(int n) {
    int local = 0;
    System.out.println(local);
    System.out.println(classLocal);

    for(int i = 0; i <3; i++){
    System.out.println(forLoopLocal);
    return n; 

    }

  }

  public static int countvowels(){

    String name = "daniel";
    String[] vowels = {"a", "e", "i", "o", "u"};
    
    for (int i = 0; i < name.length(); i++){
      
    }

  }
  public static int getVowels(String term){

    String lowerCased = term.toLowerCase();
    int counter = 0;
    for (int = 0; i < term.length(); i++)

    char letter = term.charAr(i);

    if (letter == 'a' || letter == 'e' || letter =='i' || letter == 'o' || letter == 'u'){
    counter++;
 

    }
    return res;
  }
}
