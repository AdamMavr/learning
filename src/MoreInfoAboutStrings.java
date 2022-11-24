// есть 2 типа объектов - изменяемые и неизменяемые
// при конкатенации строк каждый раз создаются новые строки, что расходует много памяти. для этого есть stringbuilder. append - добавление строки

public class MoreInfoAboutStrings {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("hello");
        x.append(" GROBA").append(" HABRGA");
        System.out.println(x.toString());
        System.out.print("prop | ");
        System.out.printf("%.2f prop %s grob %20d", 10.5, "kak", 10);
    }
}