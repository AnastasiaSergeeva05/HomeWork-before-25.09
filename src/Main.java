public class Main {
    public static void main(String[] args) {
// Homework - 1
        //  Exercise 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
//Exercise 2
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }
//Exercise 3
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }

//Exercise 4
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }

// Homework - 2
//Exercise 1
        for (int d = 1906; d < 2096; d = d + 4) {
            System.out.println(d + " год является високосным");
        }

//Exercise 2
        for (int c = 7; c <= 98; c = c + 7) {
            System.out.print(c + " ");
        }

        // Exercise 3
        int number = 1;
        System.out.print(number + " ");
        for (int e = 0; e < 9; e++) {
            number = number * 2;
            System.out.print(number + " ");
        }
// Homework - 3
        //Exercise 1
        int contribution = 29000;
        int sum = 0;
        for (int i = 0; i <= 12; i++) {
            sum = sum + contribution;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + sum + " рублей.");
        }
        //Exercise 2
        double percent = 0.01;
        double sum1 = 0;
        for (int i = 1; i <= 12; i++) {
            sum1 = (sum1 + contribution) * (1 + percent);
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + sum1 + " рублей.");
        }


    }
}

