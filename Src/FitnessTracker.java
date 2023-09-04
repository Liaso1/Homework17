import java.util.Calendar;

class FitnessTracker {
    private String name;
    private String surname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private long phone;
    private int weight;
    private String pressure;
    private int steps;
    private int age;

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, long phone) {
        this.name = name;
        this.surname = null;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.age = 2020 - birthYear;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }
    public void printAccountInfo() {
        System.out.println("Ім'я: " + name);
        if (surname != null) {
            System.out.println("Прізвище: " + surname);
        }
        System.out.println("Дата народження: " + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("Вік: " + age);
        System.out.println("Емейл: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Вага: " + weight);
        System.out.println("Тиск: " + pressure);
        System.out.println("Кількість кроків за день: " + steps);
        System.out.println();
    }
}
