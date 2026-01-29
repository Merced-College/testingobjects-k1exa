//Kendra Sandoval
//1.27.26
//Cat class

public class CatTest {

public static void main(String[] args) {
        
// A1: Create a Cat with no constructors defined.
Cat cat1 = new Cat();

// A2: Print the object directly.
System.out.println("Printing cat1 directly:");
System.out.println(cat1);

Cat c1 = new Cat();

System.out.println("\nDefaults for c1 fields (before any assignment):");
System.out.println("name = " + c1.getName());   // expected: null
System.out.println("age = " + c1.getAge());     // expected: 0
System.out.println("breed = " + c1.getBreed()); // expected: null


Cat c2 = new Cat(); // uses default constructor values
System.out.println("\nc2 after default constructor:");
System.out.println("name = " + c2.getName() + ", age = " + c2.getAge() + ", breed = " + c2.getBreed());

Cat c3 = new Cat("Mouse", 4, "Short haired domestic"); // uses parameterized constructor
System.out.println("\nc3 after parameterized constructor:");
System.out.println("name = " + c3.getName() + ", age = " + c3.getAge() + ", breed = " + c3.getBreed());


System.out.println("\nPrinting objects after overriding toString():");
System.out.println("c2 = " + c2);
System.out.println("c3 = " + c3);



System.out.println("\nMutating via setters after making fields private:");
c3.setAge(6);
c3.setName("Obi");
c3.setBreed("Long haired domestic");
System.out.println("c3 age via getter = " + c3.getAge());
System.out.println("c3 now = " + c3);

    } //end main
}  //end class