package List.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTest {

    public static void main (String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<> (30);
        arrayList1.add ("Иван");
        arrayList1.add ("Ольга");
        arrayList1.add ("Сергей");
        arrayList1.add ("Леонид");
        arrayList1.add ("Вика");

        // Классический итератор может только удалять элемент!
//        Iterator<String> stringIterator = arrayList1.iterator ();
//        while (stringIterator.hasNext ()){
//            System.out.println (stringIterator.next ());
//            stringIterator.remove ();
//        }
//        System.out.println (arrayList1);

        // Тут можно и удалять элемент и удалять, и заменять set.
        ListIterator<String> stringIterator2 = arrayList1.listIterator ();
        while (stringIterator2.hasNext ()){
            stringIterator2.next ();
            stringIterator2.set ("ТУК");
        }
        System.out.println (arrayList1);
    }

}
