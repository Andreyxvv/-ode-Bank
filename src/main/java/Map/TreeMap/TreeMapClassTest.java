package Map.TreeMap;

import Model.Human;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClassTest {
    public static void main (String[] args) {
        /**
         * 1. Важно ключи должны быть уникальны иначе элемент идущий последующим перезапишет предыдущий.
         * 2. TreeMap<> - основная суть применения для ранжирования, так как все ключи расположены в порядке
         * возрастания по умолчанию.
         * 3. Если мы в качестве ключа используем класс (пример Human) у которого не реализован интерфейс Comparator, то
         * мы получим ClassCastException.
         */
        TreeMap<Double, Human> doubleHumanMap = new TreeMap<> ();
        //Вставка элемента
        doubleHumanMap.put (1.1,new Human (1,12,"Rey"));
        doubleHumanMap.put (1.5,new Human (2,90,"Bob"));
        doubleHumanMap.put (2.0,new Human (5,50,"Tim"));
        // Получить элемент по ключу
        System.out.println (doubleHumanMap.get (1.5));
        // Проверить наличие элемента в Map по значению
        System.out.println (doubleHumanMap.containsValue (new Human (5,50,"Tim")));
        // Вставляем и удаляем элемент
        doubleHumanMap.put (1000.0,new Human (123,50000,"Tiqweewm"));
        doubleHumanMap.put (1000.1,new Human (4123,50000,"Tiqweewm"));
        System.out.println (doubleHumanMap);
        doubleHumanMap.remove (1000.0);
        doubleHumanMap.remove (1000.1,new Human (4123,50000,"Tiqweewm"));
        System.out.println (doubleHumanMap);
        // Первый элемент TreeMap
        System.out.println (doubleHumanMap.firstEntry());
        // Последний элемент TreeMap
        System.out.println (doubleHumanMap.lastEntry ());
        // Выведет TreeMap в обратном порядке
        System.out.println (doubleHumanMap.descendingMap ());
        // Выведет все значения ключей больше 1.0
        System.out.println (doubleHumanMap.tailMap (1.0));
        // Выведет все значения ключей меньше 1.5 не включительно
        System.out.println (doubleHumanMap.headMap (1.5));

        // Если ключ Human, то определяем Comparator
        TreeMap<Human,Double> doubleHumanMap2 = new TreeMap<> (new Comparator<Human> () {
            @Override
            public int compare (Human o1, Human o2) {
                return o1.getName ().compareTo (o2.getName ());
            }
        });
    }
}
