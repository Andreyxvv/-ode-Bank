package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapClassTest {

    public static void main (String[] args) {
        // Важно ключи должны быть уникальны иначе элемент идущий
        // последующим перезапишет предыдущий.
        Map<Integer,String> integerStringMap = new HashMap<> ();
        integerStringMap.put (1,"A");
        integerStringMap.put (2,"B");
        integerStringMap.put (3,"C");
        integerStringMap.put (4,"D");
        integerStringMap.put (5,"E");
        integerStringMap.put (6,"Eqqwww");
        // Вставляет значение мар, при условии, что такого ключа нет.
        integerStringMap.putIfAbsent (1,"Acswg");
        System.out.println (integerStringMap);
        // Выдает само значение по ключу.
        System.out.println (integerStringMap.get (2));
        integerStringMap.remove (6);
        System.out.println (integerStringMap);
        // Проверка наличия данного ключа
        System.out.println (integerStringMap.containsKey (4));
        // Проверка наличия данного значения
        System.out.println (integerStringMap.containsValue ("D"));
        // Тут получаем коллекцию из значений
        System.out.println (integerStringMap.values ());
        // Тут получаем кучу
        System.out.println (integerStringMap.keySet ());
        // Создаем итератор и проходим Map
        for (Map.Entry<Integer,String> e: integerStringMap.entrySet ()) {
            System.out.println ("==============");
            System.out.println (e.getKey ());
            System.out.println (e.getValue ());
            System.out.println (e.hashCode ());
            System.out.println (e.getClass ());
            System.out.println ("==============");
        }
        // Важные параметры при создании Map<String,String>, влияющие на производительность:
        // 1. initialCapacity - размер массива внутри HashMap<> (чем он больше тем быстрее ищем элементы,
        // НО тем больше памяти он занимает)
        // 2. LoadFactor - параметр определяющий, процентное соотношение, при котором начнется создание нового массива
        // c initialCapacity * 2, после создания нового массива элементы перемещаются из старого с рехешированием.
        Map<String,String> testMap = new HashMap<> (16,0.75f);

        /**
         * !!!!!!!!!!!!!!
         * На работу Map<,> очень влияет качество переопределенной хеш функции, а именно:
         * если мы например сделаем при переопределении метод хешфункции возврат числа 3 все время, то при
         * вставке (put) элемента в Map<,> все время будет, определятся индекс например 5 и
         * все элементы будут помещаться в LinkedLine список в одну ячейку массива.
         */

        /**
         * Второй важный момент - это использовать в качестве ключей immutable obj
         * Пример в качестве ключа мы использовали obj Human и на основании данных
         * полей мы вычислили хеш функцию и на основании ее поместили этот элемент в Map<,>.
         * Далее мы например поменяли возраст у obj Human и решили проверить методом
         * .containsKey () проверить наличие ключа на основе измененного obj Human
         * в Map<,>. В итоге мы получим false так как при поиске не совпадут хеш коды
         * obj Human (до | после).
         */

    }
}
