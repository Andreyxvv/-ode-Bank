package List.CollectionsClass.BinarySearch;

import Model.Human;

import java.util.*;

public class BinarySearchClassTest {

    public static void main (String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<> (30);
        arrayList1.add ("Иван");
        arrayList1.add ("Ольга");
        arrayList1.add ("Сергей");
        arrayList1.add ("Леонид");
        arrayList1.add ("Вика");
        arrayList1.sort (Comparator.naturalOrder ());
        System.out.println ("Лист String"+arrayList1);
        System.out.println (Collections.binarySearch (arrayList1,new String ("Иван")));

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

        System.out.println ("Лист Human"+ humanList);

        int num = Collections.binarySearch (humanList, new Human (1, 9, "Tim"), new Comparator<Human> () {
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

        System.out.println ("id human"+num);
    }
}
