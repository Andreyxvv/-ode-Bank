package List.Stack.LIFO;

/**
 * В структуре данных LIFO элементы вставляются и извлекаются в соответствии с принципом «последним пришел – первым вышел». Это означает, что последний вставленный элемент извлекается первым. В информатике стек — это термин,
 * используемый для обозначения такой структуры данных.
 * Суть стека памяти, а именно каждый новый вызов метода из метода,
 * это тарелка вверх кучи.
 */
public class ClassPrincipalLIFO {
    public static void metho1(){
        System.out.println ("start method 1");
        System.out.println ("end method 1");
    }
    public static void metho2(){
        System.out.println ("start method 2");
        metho1 ();
        System.out.println ("end method 2");
    }
    public static void metho3(){
        System.out.println ("start method 3");
        metho2 ();
        System.out.println ("end method 3");
    }

    public static void main (String[] args) {
        System.out.println ("main начало!");
        metho3 ();
        System.out.println ("main конец!");

    }

}
