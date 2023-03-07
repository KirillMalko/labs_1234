import java.util.Scanner;


class Coffee {
    private String name;
    private double weigth;
    private String condition;
    private double price;

    public Coffee(String n, double w, String con, double p) {
        this.name = n;
        this.weigth = w;
        this.condition = con;
        this.price = p;
    }


    public String getName() {
        return this.name;
    }

    public double getWeigth() {
        return this.weigth;
    }

    public String getCondition() {
        return this.condition;
    }

    public double getPrice() {
        return this.price;
    }

    public int getAmount() {
        return (int) Math.ceil((this.weigth / this.price) * 100);
    }

}

class Track {
    static Coffee[] nums = new Coffee[5];
//    static Coffee[] sortNums = new Coffee[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nums[0] = new Coffee("Arabica", 0.5, "B", 15.5);
        nums[1] = new Coffee("Robusta", 1.5, "IB", 25.5);
        nums[2] = new Coffee("Latte", 3.0, "IC", 15.5);
        nums[3] = new Coffee("Cappuc", 5.5, "G", 15.5);
        nums[4] = new Coffee("Doppio", 1.5, "IB", 35.5);

        while (true) {
            int menuParagraph;
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("User Menu:");
            System.out.println("1. Show all coffees");
            System.out.println("2. Sort by price of weight");
            System.out.println("3. search for products by price in the range");
            menuParagraph = scanner.nextInt();

            if (menuParagraph == 1) {
                System.out.println("B - coffee beans");
                System.out.println("IB - instant coffee in bags ");
                System.out.println("IC - instant coffee in cans");
                System.out.println("G - ground coffee ");
                System.out.println(" ");

                System.out.println("Name\t \tWeight\t \tCondition\t \tPrice\t \tPrice|Weight");
                for (int i = 0; i < 5; i++) {
                    System.out.println(nums[i].getName() + "\t \t" + nums[i].getWeigth() + "\t \t \t" + nums[i].getCondition() + "\t \t \t \t" + nums[i].getPrice() + "\t \t" + nums[i].getAmount());
                }

            } else if (menuParagraph == 2) {
                System.out.println("B - coffee beans");
                System.out.println("IB - instant coffee in bags ");
                System.out.println("IC - instant coffee in cans");
                System.out.println("G - ground coffee ");
                System.out.println(" ");

                System.out.println("Name\t \tWeight\t \tCondition\t \tPrice\t \tPrice|Weight");
                for (int i = 0; i < 5; i++) {
                    for (int j = i + 1; j < 5; j++) {

                        if (nums[i].getAmount() > nums[j].getAmount()) {
                            Coffee temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                        }

                    }
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println(nums[i].getName() + "\t \t" + nums[i].getWeigth() + "\t \t \t" + nums[i].getCondition() + "\t \t \t \t" + nums[i].getPrice() + "\t \t" + nums[i].getAmount());
                }
            } else if (menuParagraph == 3) {
                System.out.println("B - coffee beans");
                System.out.println("IB - instant coffee in bags ");
                System.out.println("IC - instant coffee in cans");
                System.out.println("G - ground coffee ");
                System.out.println(" ");
                System.out.println("FROM");
                int firstPrice = scanner.nextInt();
                System.out.println("TO");
                int secondPrice = scanner.nextInt();
                System.out.println(" ");

                System.out.println("Name\t \tWeight\t \tCondition\t \tPrice\t \tPrice|Weight");

                for (int i = 0; i < 5; i++) {

                    if (nums[i].getPrice() <= secondPrice && nums[i].getPrice() >= firstPrice) {
                        System.out.println(nums[i].getName() + "\t \t" + nums[i].getWeigth() + "\t \t \t" + nums[i].getCondition() + "\t \t \t \t" + nums[i].getPrice() + "\t \t" + nums[i].getAmount());

                    }


                }
            }
        }
    }
}




