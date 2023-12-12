package List.CollectionsClass.Sort;
import Model.Human;
import java.util.*;

public class SortClassTest {

    public static void main (String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<> (30);
        arrayList1.add ("Иван");
        arrayList1.add ("Ольга");
        arrayList1.add ("Сергей");
        arrayList1.add ("Леонид");
        arrayList1.add ("Вика");
        // arrayList1.add (null);
        //Важно!!! Коллекция может хранить и выдавать null, НО отсортировать string с null мы не можем !!!
        // Так как Comparator<? super Obj> для данной величины не предусмотрен.
        System.out.println (arrayList1);
        //System.out.println (arrayList1.get (5));
        // Сортировка идет по Comparator<? super Obj>,
        // для string естественный порядок переопределен А(min) - Z(max).
        Collections.sort (arrayList1,Comparator.naturalOrder ());
        System.out.println (arrayList1);
        Collections.sort (arrayList1,Comparator.reverseOrder ());
        System.out.println (arrayList1);

        List<Human> humanList = Arrays.asList (new Human (1,11,"Rey"),new Human (2,12,"Bob"),new Human (0,9,"Tim"));
        Collections.sort (humanList, new Comparator<Human> () {
            @Override
            public int compare (Human o1, Human o2) {
                if(o1.getId () - o2.getId () > 0){
                    return 1;
                }
                if(o1.getId () - o2.getId () < 0){
                    return -1;
                }else
                    return 0;
            }
        });
        System.out.println (humanList);
    }
}
