import java.util.*;
 class Hashmap {
  public static void main(String a[]) {
  HashMap<Integer,String>m= new HashMap<Integer,String>();
  m.put(1, "CSE");
  m.put(2, "ME");
 m.put(3, "ECE");
  m.put(4, "CIVIL");
  m.put(5, "FOODTECH");
  for(Map.Entry x:m.entrySet()){
   System.out.println(x.getKey()+":"+x.getValue());
  }
 }
}