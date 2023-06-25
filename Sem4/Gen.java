// В этом классе метод MVP и принцип SOLID не реализованы. Задача задания была другая



package Sem4;
public class Gen<I, S, D, F> {
    public I ob1; // можно без паблик
    public S ob2;
    public D ob3;
    public F ob4;

    public Gen(I o1, S o2, D o3, F o4) {// можно без паблик
        this.ob1 = o1;// можно так
        ob2 = o2; // а можно  и так
        ob3 = o3;
        ob4 = o4;
    }

    I GetOb1() {
        return ob1;
    }
    S GetOb2() {
        return ob2;
    }
    D GetOb3() {
        return ob3;
    }
    F GetOb4() {
        return ob4;
    }
    public void ShowType() {
        System.out.println("Тип I - Это " + ob1.getClass().getSimpleName());// можно так
        System.out.println("Тип S - Это " + ob2.getClass().getSimpleName());
        System.out.println("Тип D - Это " + ob3.getClass().getName());// а можно и так
        System.out.println("Тип F - Это " + ob4.getClass().getName());
    }
}