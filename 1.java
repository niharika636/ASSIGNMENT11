import java.util.*;
class Set {
  public static void main(String a[]) {
        HashSet<String> set1 = new HashSet<String>();
           set1.add("A");
          set1.add("B");
          set1.add("C");
         set1.add("D");
          System.out.print("FIRST SET:\n"+set1);
          HashSet<String>et2 = new HashSet<String>();
          set2.add("E");
          set2.add("D");
         set2.add("G");
         set2.add("B");
   System.out.print("Second SET:\n"+set2);
          set1.retainAll(set2);
          System.out.println("Set content:");
          System.out.println(set1);
     }
}