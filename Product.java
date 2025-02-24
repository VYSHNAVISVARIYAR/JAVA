import java.util.Scanner;

public class Product{
  int pcode,price;
  String pname;
  
    public static void main(String[] args) {
      Product Obj1 = new Product();
      Product Obj2 = new Product();
      Product Obj3 = new Product();

      Scanner sc = new Scanner(System.in);
      
      System.out.println("-------");
      System.out.println("Product code:xu12");
      System.out.println("Laptop");
      System.out.println("Enter the price of the laptop:");
      Obj1.price = sc.nextInt();
      System.out.println("-------");

      System.out.println("Product code: xu13");
      System.out.println("Tablet");
      System.out.println("Enter the price of the Tablet:");
      Obj2.price = sc.nextInt();
      System.out.println("---------");

      System.out.println("Product code: xu14");
      System.out.println("Phone");
      System.out.println("Enter the price of the Phone:");
      Obj3.price = sc.nextInt();
      System.out.println("--------");


      if(Obj1.price < Obj2.price &&  Obj1.price < Obj3.price){
        System.out.println("Product 1 has lowest price.");
      }
      else if(Obj2.price < Obj1.price && Obj2.price < Obj3.price){
        System.out.println("Product 2 has lowest price");
      }
      else{
        System.out.println("Product 3 has lowest price.");
      }
      
    }
  }
  
