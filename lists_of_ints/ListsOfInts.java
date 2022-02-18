import java.util.List;
import java.util.ArrayList;

public class ListsOfInts {
  public static List<Integer> getOdds(){
    // Write code here
    List<Integer> res = new ArrayList<Integer>();
    for(int i=0; i < 100; i++){
      if (i % 2 != 0){
        res.add(i);
      }
    }
    return res;
  }

  public static List<Integer> getEvens(){
    // Write code here
    List<Integer> res = new ArrayList<Integer>();
    for(int i=0; i < 100; i += 2){
      if (i % 2 == 0){
        res.add(i);
      }
    }
    return res;
  }

  public static List<Integer> getPowersOfTwo(){
    // Write code here
    List<Integer> res = new ArrayList<Integer>();
    for (double i = 0; i <= 12; i ++){
      res.add((int)(Math.pow(2, i)));
    }
    return res;

  }

  public static void main(String[] args){
    System.out.println(getOdds());
    System.out.println(getEvens());
    System.out.println(getPowersOfTwo());
  }
}
