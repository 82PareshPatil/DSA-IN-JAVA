import java.util.*;
import java.lang.*;

public class Linear_Search {
    public static int linera(String a[], String key)
    {
       for(int i=0;i<a.length;i++)
       {
           if(a[i].equals(key))
           {
            return i;
           }
       }
return -1;
    }
    public static void main(String args[])
    {
        String a[]={"Apple", "Banana", "Mango", "Pineapple", "Javaapple"};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter you Want Fruit Name: ");
        String key=s.nextLine();
        int num=linera(a, key);
        if (num != -1) {
            System.out.println("Fruit found at index: " + num);
        } else {
            System.out.println("Fruit not found.");
        }
    }
}
// import java.util.*;

// public class Linear_Search {
//     public static int linear(String a[], String key) {
//         for (int i = 0; i < a.length; i++) {
//             if (a[i].equals(key)) {  // Use equals() to compare strings
//                 return i;            // Return index if found
//             }
//         }
//         return -1;                   // Return -1 if not found
//     }

//     public static void main(String args[]) {
//         String a[] = {"Apple", "Banana", "Mango", "Pineapple", "Javaapple"};
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the fruit name you want: ");
//         String key = s.nextLine();
//         int index = linear(a, key);

//         if (index != -1) {
//             System.out.println("Fruit found at index: " + index);
//         } else {
//             System.out.println("Fruit not found.");
//         }
        
//         s.close(); // Close the scanner
//     }
// }
