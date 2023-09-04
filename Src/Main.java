public class Main {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Джастін", 25, 12, 1971, "trudeau@canada.ca", 123456789L);
        user1.setSurname("Трюдо");
        user1.setWeight(85);
        user1.setPressure("120/80");
        user1.setSteps(11200);

        FitnessTracker user2 = new FitnessTracker("Джо", 20, 11, 1942, "potus@usa.com", 987654321L);
        user2.setSurname("Байден");
        user2.setWeight(81);
        user2.setPressure("190/130");
        user2.setSteps(3000);

        FitnessTracker user3 = new FitnessTracker("Анджей", 16, 5, 1972, "duda@poczta.pl", 111222333L);
        user3.setSurname("Дуда");
        user3.setWeight(80);
        user3.setPressure("121/82");
        user3.setSteps(12000);

        System.out.println("Дані користувача 1:");
        user1.printAccountInfo();

        System.out.println("Дані користувача 2:");
        user2.printAccountInfo();

        System.out.println("Дані користувача 3:");
        user3.printAccountInfo();

        user1.setSurname("Нове прізвище");
        user1.setWeight(90);
        user1.setPressure("130/85");
        user1.setSteps(12000);

        user2.setSurname("Нове прізвище 2");
        user2.setWeight(75);
        user2.setPressure("125/75");
        user2.setSteps(8000);

        System.out.println("Оновлені дані користувача 1:");
        user1.printAccountInfo();

        System.out.println("Оновлені дані користувача 2:");
        user2.printAccountInfo();
    }
}
