import java.util.*;
  
class jss {

public static void main(String[] args)
{

ArrayList<Integer> demo=new ArrayList<>();
ArrayList<Integer> memo=new ArrayList<>();
demo.add(1);
demo.add(16);
demo.add(13);
demo.add(14);
demo.add(15);
int n=demo.get(1);

memo.addAll(demo);
//demo.remove(0);

demo.sort(Comparator.naturalOrder());
System.out.println(demo);

demo.set(2,20);
System.out.println(memo);
System.out.println(n);


}
}