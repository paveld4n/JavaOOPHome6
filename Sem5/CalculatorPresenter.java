package Sem5;
// 1. Этот класс используется для связи Вьюера с моделью. Получив из main запрос на выполнение прораммы
//класс запрашивает данные у вьюера и перезает их в модель.
// В других классах такого функционала нет. 
//Следовательно можно сказать что тут работает 1 й принцип - принцип единственной отвертственности.
// 2. Если нам понадобится расширить функционал, то мы добавим создадим новый метод (дополнил ваш класс методом choice ), 
// создадим ноывый запрос.
// Не внося изменений в существющий функционал.
///Это второй принцияп - открытости/закрытости.
// 3. Интерфейсов нет, но класс несет свой специфилизированный фунционал.
//Так что можно увидеть 4й принцип - принцип разделения ответственности..



public class CalculatorPresenter {
    private CalculatorModel model;
private CalculatorView view;

public CalculatorPresenter(CalculatorModel model, CalculatorView view) { // связи с вьюером и моделью.
    // ели надо будет приятнуть еще один класс - добавим, не изменя существующий
    this.model = model;
    this.view = view;
}
// запрашиваем у вьюера  (клиета) данные об операции и переходим в модель
// получаем из модели результат и переходим во вьюер, где выводим результат в консоль.

public void choice() { // запрашиваем у вьюера  (клиета) данные об операции и переходим в модель
    char oper = view.getUserOper();
    switch (oper){
            case '+':
                onAddButtonClicked();
                break;
            case '-':
                onSubtracButtonClicked();
                break;
            case '*':
                onMultipButtonClicked();
                break;
            case '/':
                onDivisButtonClicked();
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                choice();
    }           
}
public void onAddButtonClicked() {
    int number1 = view.getUserInput();
    int number2 = view.getUserInput();

    model.add(number1, number2);
    int result = model.getResult();

    view.displayResult(result);
}

public void onSubtracButtonClicked() {
    int number1 = view.getUserInput();
    int number2 = view.getUserInput();

    model.subtrac(number1, number2);
    int result = model.getResult();

    view.displayResult(result);
}
public void onMultipButtonClicked() {
    int number1 = view.getUserInput();
    int number2 = view.getUserInput();

    model.multip(number1, number2);
    int result = model.getResult();

    view.displayResult(result);
}
public void onDivisButtonClicked() {
    int number1 = view.getUserInput();
    int number2 = view.getUserInput();

    model.divis(number1, number2);
    int result = model.getResult();

    view.displayResult(result);
}
}
