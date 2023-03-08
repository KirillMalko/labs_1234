//        Создать приложение, удовлетворяющее требованиям, приведенным в
//        задании. Наследование применять только в тех заданиях, в которых это
//        логически обосновано. Аргументировать принадлежность классу каждого
//        создаваемого метода и корректно переопределить для каждого класса методы
//        equals(), hashCode(), toString()
//
//        Создать объект класса Одномерный массив, используя классы
//        Массив, Элемент. Методы: создать, вывести на консоль, выполнить операции
//        (сложить, вычесть, перемножить).

public class Main {
    public static void main(String[] args) {
        Array array1 = new Array(3);
        array1.setElement(0, new Element(1));
        array1.setElement(1, new Element(2));
        array1.setElement(2, new Element(3));

        Array array2 = new Array(3);
        array2.setElement(0, new Element(4));
        array2.setElement(1, new Element(5));
        array2.setElement(2, new Element(6));

        Array sumArray = array1.add(array2);
        Array diffArray = array1.subtract(array2);
        Array productArray = array1.multiply(array2);

        System.out.println("Array 1:");
        array1.print();
        System.out.println("Array 2:");
        array2.print();
        System.out.println("Array 1 + Array 2:");
        sumArray.print();
        System.out.println("Array 1 - Array 2:");
        diffArray.print();
        System.out.println("Array 1 * Array 2:");
        productArray.print();
    }
}