public class Rit_DynamicMemoryForPrimitiveIndirect {
    public static void main(String[] args) {
        
        int[] arr = new int[1];   // dynamic (heap)

        arr[0] = 10;

        System.out.println("Value = " + arr[0]);
    }
}

// 🔸 Output
// Value = 10

// 👉 ✔ Array is an object → stored in heap





// 🔹 2. Primitive Data Type Example ❌ (Not Dynamic)
// public class Main {
//     public static void main(String[] args) {
        
//         int a = 10;   // primitive (NOT dynamic)

//         System.out.println("Value = " + a);
//     }
// }