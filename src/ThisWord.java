public class ThisWord {
    public static void main(String[] args) {
        Human firstHuman = new Human();
        firstHuman.setAge(18);
        firstHuman.setName("Адам");
        firstHuman.getInfo();
    }
}

class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("Имя: " + name + " Возраст: " + age);
    }
}