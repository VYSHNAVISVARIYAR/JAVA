import java.util.*;

class AddElements {
  public static void main(String[] args){
    ArrayList<String> countries = new ArrayList<>();

    System.out.println("1.Adding elements to an arrayList");
    countries.add("India");
    countries.add("Afghanisthan");
    countries.add("Japan");
    countries.add("Pakisthan");
    countries.add("Myanmar");
    System.out.println("ArrayList: " + countries);
    System.out.println();
    
    System.out.println("2.Accessing an array element");
    String str = countries.get(2);
    System.out.println("The element at index 2 is :"+ str);
    System.out.println();
    
    System.out.println("3.Updating an arrayList");
    countries.set(1,"Bhutan");
    System.out.println("The updated array list is :"+ countries);
    System.out.println();
    
    System.out.println("4.Remove an element from the array list");
    String rem = countries.remove(1);
    System.out.println("The new array is :"+countries);
    System.out.println("The removed element is :" + rem);
    System.out.println();
    
    System.out.println("5.using contains in arraylist");
    System.out.print("Checking whether 'India' is in the array list : ");
    System.out.println(countries.contains("India"));
    System.out.println();
    
    System.out.println("6.To find the size of an array list");
    System.out.println("ArrayList: " + countries);
    int size = countries.size();
    System.out.println("The leng of the array is :"+ size);
    
  }
}
