package List.Vector;

import java.util.Vector;

public class VectorClassTest {

    public static void main (String[] args) {

        Vector<String> vectorList = new Vector<> (30);
        vectorList.add ("Иван");
        vectorList.add ("Ольга");
        vectorList.add ("Сергей");
        vectorList.add ("Леонид");
        vectorList.add ("Вика");

        System.out.println (vectorList);
        System.out.println (vectorList.get (1));
        System.out.println (vectorList.firstElement ());
        System.out.println (vectorList.lastElement ());
        vectorList.remove (2);
        System.out.println (vectorList);
    }

}
