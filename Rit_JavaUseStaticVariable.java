
class Student {
    
    static String college = "SPPU";   // static variable

    int id;

    Student(int id) {
        this.id = id;
    }
}

public class Rit_JavaUseStaticVariable {
     public static void main(String[] args) {
        
        Student s1 = new Student(1);
        Student s2 = new Student(2);

        System.out.println("College (s1): " + s1.college);
        System.out.println("College (s2): " + s2.college);
    }
}


// 🔸 Output
// College (s1): SPPU
// College (s2): SPPU


// 🔥 What is happening?

// 👉 static String college = "SPPU";

// ✔ Only one copy exists
// ✔ Shared by all objects (s1, s2)
// ✔ Stored in method area (static memory)