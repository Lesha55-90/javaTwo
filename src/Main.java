public class Main {
    public static void main(String[] args) {
        int price = 9790;            // стоимость билета
        short bonusRuble = 20;       // кол-во рублей для одной бонусной мили

        int bonus = price / bonusRuble; // кол-во бонусных миль

        System.out.println(" Итоговое количество бонусных миль: " + bonus);

    }
}
