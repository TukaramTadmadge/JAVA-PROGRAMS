import java.util.Scanner;

class A {
    int rollno;
    String name;
    Scanner sc = new Scanner(System.in);

    public void get() {
        System.out.println("Class is created");
        System.out.print("Enter the roll number: ");
        rollno = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter the name: ");
        name = sc.nextLine();
    }

    // Getter methods
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
}

// Class B - Displays roll number and name
class B {
    public void display(A obj) {
        System.out.println("Roll is: " + obj.getRollno());
        System.out.println("Name is: " + obj.getName());
    }
}

// Main class
public class simpleclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.get(); 

        B obj2 = new B();
        obj2.display(obj); // Pass obj of class A to display()
    }
}
