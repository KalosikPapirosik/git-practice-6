class Main {
    static final String VERSION = "1.0";

    public static void main(String[] args) {
        System.out.println("Практическая работа №6. Ветвление.");
        System.out.println("Версия программы: " + VERSION);
        System.out.print("Это добавлено в ветке main");
        System.out.println();
        System.out.println("Сумма 2 и 3 = " + sum(2, 3));
        System.out.print("Числа от 1 до 5: ");
        printNumbers(5);
        System.out.println("Аргументов командной строки: " + args.length);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}