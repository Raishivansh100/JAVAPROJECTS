import java.util.Scanner;

public class array1d {
  public static void update(int array[]) {
    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] + 10;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int array[] = new int[n];
    for (int i = 0; i <n; i++) 
    {
      array[i] = sc.nextInt();
    }
    update(array);
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
    sc.close();
  }
}
//bhai dekh ye array pass by reference hai 
//toh jab hum update function me array ko change karte hai toh wo original array me bhi change ho jata hai
//agar hum chahte hai ki original array change na ho toh hume array ka copy bana ke update function me bhejna padega
//whi agar hum koi variable pass karte hai toh wo pass by value hota hai
//toh usme change karne se original variable me koi farak nahi padta hai