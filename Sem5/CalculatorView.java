package Sem5;
// 1. Этот класс используется для ввода - вывода данных, взаимодействия с "внешним" миром.
// В других классах такого функционала нет. 
//Следовательно можно сказать что тут работает 1 й принцип - принцип единственной отвертственности.
// 2. Если нам понадобится расширить функционал, то мы добавим создадим новый метод, создадим ноывый запрос.
// Не внося изменений в существющий функционал. Как я и сделал с запросом мат операнда.
///Это второй принцияп - открытости/закрытости.
// 3. Интерфейсов нет, но класс несет свой специфилизированный фунционал (запрос данных - вывод результата).
//Так что можно увидеть 4й принцип - принцип разделения ответственности..




import java.util.Scanner;
// Подлучение данных из презенртера и вывод полученного результата
public class CalculatorView {
    public void displayResult(int result) {
System.out.println("Результат: " + result);

}

// Получив запрос от Презентера - запрашиваем данные у пользователя и передаем Презентеру
public int getUserInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int input = scanner.nextInt();
    //scanner.close();
    return input;
    
}   
// Получив запрос от Презентера - запрашиваем данные у пользователя и передаем Презентеру
public char getUserOper() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите математическую операция которую хотите выполнить: + или - или * или / .");
    System.out.print("Ваш выбор: ");
    char op = scanner.next().charAt(0);
    //scanner.close();
    return op;
    
}   

}

