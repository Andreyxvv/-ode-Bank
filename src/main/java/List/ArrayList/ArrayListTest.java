package List.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main (String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<> (30);
        arrayList1.add ("Иван");
        arrayList1.add ("Ольга");
        arrayList1.add ("Сергей");
        arrayList1.add ("Леонид");
        arrayList1.add ("Вика");
        // Вставляем элемент на указанную позицию не затирая существующий
        arrayList1.add (0,"Ирина");
        // Вставляем элемент на указанную позицию затирая существующий
        arrayList1.set (0,"Затерли Ирину");
        //System.out.println (arrayList1);
        // тут создается новый объект копия arrayList1
        ArrayList<String> arrayList2 = new ArrayList<> (arrayList1);
        // создаем ArrayList с заранее обозначенной емкостью в 200.
        ArrayList<A> arrayList3 = new ArrayList<> (200);
        ArrayList<String> arrayList4 = new ArrayList<> ();
        arrayList4.add ("Начало листа!");
        arrayList4.addAll (arrayList1);
        // Вставка коллекции arrayList1 начиная с индекса 3
        arrayList4.addAll (3,arrayList1);
        System.out.println (arrayList4);
        // ВАЖНО!!! поиск .indexOf( по obj) с возвр. int, работает через equals() (ЕГО НАДО ПЕРЕОПРЕДЕЛЯТЬ для obj)!!!
        // Удаление элемента .remove (по obj), работает через equals()!!! (ЕГО НАДО ПЕРЕОПРЕДЕЛЯТЬ для obj)!!!
        // ВАЖНО!!! поиск .contains(по obj) с возвр. boolean, работает через equals() (ЕГО НАДО ПЕРЕОПРЕДЕЛЯТЬ для obj)!!!
        boolean val1 = arrayList4.contains ("Затерли Ирину");
        int num1 = arrayList4.indexOf ("Затерли Ирину"); // Выдаст индекс первого найденного элемента.
        int num2 = arrayList4.lastIndexOf ("Затерли Ирину"); // Выдаст индекс последнего найденного элемента.
        System.out.println (num1+" И "+num2);
        System.out.println (val1);
        // Можно во всю пользоваться полиморфизмом
        arrayList3.add (new A () {
        });
        arrayList3.add (new Test1 ());
        arrayList3.add (new Test2 ());
        arrayList3.add (new Test3 ());
        boolean b = arrayList3.add (new Test3 ());
        //System.out.println (arrayList3);
        //===========================================================
        String str1 = "qwe1";
        String str2 = "qwe2";
        String str3 = "qwe3";
        String[] arrayStr = {str1,str2,str3};
        // Важно создавая List, через Arrays.asList ()  мы получаем List, который напрямую связан с массивом из которого он создается.
        // Под капотом Arrays.asList () - тут под капотом ArrayList<>
        List<String> stringList = Arrays.asList (arrayStr);
        System.out.println (stringList);
        arrayStr[0] = "abc";
        System.out.println (stringList);
        List<String> stringList2 = Arrays.asList ("bob","nick","rey");
        // List<> выше не изменяем, получим UnsupportedOperationException (запрошенная операция не поддерживается)
        //stringList2.add ("bill"); Нельзя!
        stringList2.get (1);
        System.out.println (stringList2.get (1));
        //===========================================================
        List<String> arraylist5 = new ArrayList<String> ();
        arraylist5.add ("Сергей");
        arraylist5.add ("Леонид");
        // Удаляем из коллекции arrayList1 все элементы, которые совпадают с arrayList5
        // arrayList1.removeAll (arraylist5);
        //Удаляем из коллекции arrayList1 все элементы, которые не совпадают с arrayList5
        //arrayList1.retainAll (arraylist5);
        // Метод containsAll() -> boolean: Содержит ли arrayList1 все элементы из коллекции arrayList5
        //boolean a =  arrayList1.containsAll (arraylist5);
        //System.out.println (a);
        //===========================================================
        // subList - создает не новый arrayList, а создает (view) существующего.
        // То, есть arrayList1  и subList связаны и посути представляют одну и туже коллекцию.
        List<String> subList = arrayList1.subList (2,4);
        System.out.println (subList);
        // Получаем массив obj и cast до String НЕЛЬЗЯ!!!!
        Object[] arrayStr1 =  arrayList1.toArray ();
        String[] arrayStr2 = arrayList1.toArray(new String[0]);
        //===========================================================
        // List<> ниже не изменяем, получим UnsupportedOperationException (запрошенная операция не поддерживается).
        //stringList1.add ("bill"); Нельзя!
        // Ниже быстрая инициализация arrayList
        List<String> stringList1 = List.of ("A","B","C","D");
        System.out.println (stringList1);
        // List<> ниже не изменяем, получим UnsupportedOperationException (запрошенная операция не поддерживается).
        //stringList1.add ("bill"); Нельзя!
        // Ниже копирование сущ. arrayList
        List<String> stringList3 = List.copyOf (arrayList1);
        System.out.println (stringList1);





    }

}
