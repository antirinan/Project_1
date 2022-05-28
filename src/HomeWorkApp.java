public class HomeWorkApp {

    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        if (a+b >= 0) {
            System.out.println("The amount is positive, summa pologitelnaya"); //у меня не выводит в результат кириллицу, поэтому написала на английском и с тренслите
        }
        if (a+b < 0) {
            System.out.println("The amount is negative, summa otritsatelnaya");
        }
    }
    public static void printColor() {
        int value = 45;
        if (value <= 0) {
            System.out.println("red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("yellow");
        }
        if (value > 100) {
            System.out.println("green");
        }
    }
        public static void compareNumbers() {
            int a = 23;
            int b = 32;
            if (a >= b) {
                System.out.println("a >= b");
            }
            if (a < b) {
                System.out.println("a < b");
            }
    }
}
