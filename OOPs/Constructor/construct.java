package Constructor;

public class construct {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Harshu");
        Student s3 = new Student(12);
        
    }
}

class Student {
    String name;
    int roll;

    Student() {    //Non parameterised Constuctor
        System.out.println("Constructor is called...");
    }

    Student(String name) {   //parameterised Constuctor
        this.name = name;
    }

    Student(int roll) {      //parameterised Constuctor
        this.roll = roll;
    }
}