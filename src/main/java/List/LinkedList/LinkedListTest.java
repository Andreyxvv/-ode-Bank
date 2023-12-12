package List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main (String[] args) {
         LinkedList<String> linkedList = new LinkedList<String> ();
            linkedList.add ("Иван");
            linkedList.add ("Ольга");
            linkedList.add ("Сергей");
            linkedList.add ("Леонид");
            linkedList.add ("Вика");
        // показывает элемент, который сейчас находится в head списка
        System.out.println (linkedList.getFirst ());
        // Показывает индекс определенного элемента.
        System.out.println (linkedList.lastIndexOf (new String ("Леонид")));
        //System.out.println (linkedList.);
    }

}
