
class Student {
    int id;

    Student(int id) {
        this.id = id;
    }
}

public class Rit_DynamicMemoryForObject {
     public static void main(String[] args) {
        
        Student s = new Student(101);   // dynamic object (heap)

        System.out.println("ID = " + s.id);
    }
}


// 🔸 Output
// ID = 101

// 👉 ✔ new Student(101) → object created in heap (dynamic memory)
// 👉 ✔ s → reference variable


