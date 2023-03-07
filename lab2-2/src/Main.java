import java.util.Scanner;

//         Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать
//         калорийность. Провести сортировку овощей для салата на основе одного из параметров.
//         Найти овощи в салате, соответствующие заданному диапазону калорийности.
class Vegetables {
    private String name;
    private double weigth;
    private double calories;

    //создаем конструктор
    public Vegetables(String n, double w, double c) {
        this.name = n;
        this.weigth = w;
        this.calories = c;
    }


    public String getName() {
        return this.name;
    }

    public double getWeigth() {
        return this.weigth;
    }


    public double getCalories() {
        return this.calories;
    }

    public int getAmount() {
        return (int) Math.ceil((this.calories) / this.weigth);
    }

}

class Salad {
    static Vegetables[] salad = new Vegetables[5]; //массив ингридиентов составляют салат


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //наполняем салат(массив)
        salad[0] = new Vegetables("Оливки", 0.5, 195.5);
        salad[1] = new Vegetables("Перец", 1.5, 250.5);
        salad[2] = new Vegetables("Огурец", 3.0, 115.5);
        salad[3] = new Vegetables("Томат", 2.5, 155.5);
        salad[4] = new Vegetables("Масло", 0.3, 35.5);
//Пока условие истинно
        while (true) {
            int menuParagraph;
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("User Menu:");
            System.out.println("1. Показать ингредиенты ");
            System.out.println("2. Сортировать по отношению калорийность/вес.");
            System.out.println("3. Найти овощи в салате, соответствующие заданному диапазону калорийности.");
            menuParagraph = scanner.nextInt();

            if (menuParagraph == 1) {
                System.out.println(" ");

                System.out.println("Name\t \tWeight\t \tCalories\t \tCalories|Weight");
                for (int i = 0; i < 5; i++) {
                    System.out.println(salad[i].getName() + "\t \t" + salad[i].getWeigth() + "\t \t \t" + salad[i].getCalories() + "\t \t \t \t" + salad[i].getAmount());
                }

            } else if (menuParagraph == 2) {
                System.out.println(" ");

                System.out.println("Name\t \tWeight\t \tCalories\t \tCalories|Weight");
                for (int i = 0; i < 5; i++) {
                    for (int j = i + 1; j < 5; j++) {

                        if (salad[i].getAmount() > salad[j].getAmount()) {
                            Vegetables temp = salad[i];
                            salad[i] = salad[j];
                            salad[j] = temp;
                        }

                    }
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println(salad[i].getName() + "\t \t" + salad[i].getWeigth() + "\t \t \t" + salad[i].getCalories() + "\t \t \t \t " + salad[i].getAmount());
                }
            } else if (menuParagraph == 3) {//принимает диапозон от ч до у
                System.out.println(" ");
                System.out.println("FROM");
                int firstPrice = scanner.nextInt(); //принимаем введенное значение
                System.out.println("TO");
                int secondPrice = scanner.nextInt();
                System.out.println(" ");

                System.out.println("Name\t \tWeight\t \tCalories\t \tCalories|Weight");

                for (int i = 0; i < 5; i++) {

                    if (salad[i].getCalories() <= secondPrice && salad[i].getCalories() >= firstPrice) {
                        System.out.println(salad[i].getName() + "\t \t" + salad[i].getWeigth() + "\t \t \t" + salad[i].getCalories() + "\t \t  \t \t" + salad[i].getAmount());

                    }


                }
            }
        }
    }
}




