package List.Stack;

import java.util.Stack;

public class StackClassTest {

    public static void main (String[] args) {
        Stack<String> stackList = new Stack<> ();
        stackList.add ("Иван");
        stackList.add ("Ольга");
        stackList.add ("Сергей");
        stackList.add ("Леонид");
        stackList.add ("Вика");
        // Удаляем элемент наверху стека это без Вики
        stackList.pop ();
        System.out.println (stackList);
        // Вставляем элемент вверх стека
        stackList.push ("Леонид2");
        System.out.println (stackList);
        System.out.println (stackList.isEmpty ());
        // Получаем элемент наверху стека
        System.out.println (stackList.peek ());


    }

}
