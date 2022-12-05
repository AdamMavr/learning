// есть 2 типа объектов - изменяемые и неизменяемые
// при конкатенации строк каждый раз создаются новые строки, что расходует много памяти. для этого есть stringbuilder. append - добавление строки
// printf/format: %s - String, %d - int; %f - float/double. между % и d можно вставить число которое будет обозначать количество символов между ними. может быть отрицательным
// также можно определять количество символов после запятой таким образом: %.2f, где 2 это количество символов после запятой

public class MoreInfoAboutStrings {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("hello");
        x.append(" GROBA").append(" HABRGA");
        System.out.println(x.toString());
        System.out.print("prop | ");
        System.out.printf("%.2f prop %s grob %20d", 10.5, "kak", 10);
    }
}