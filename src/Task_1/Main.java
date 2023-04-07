package Task_1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(3,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);

        // Код работает, но не вывод дробную часть это связано с тем,
        // мы указывали параметр Типа Integer
        // Если изменить код:
        // BinaryOperator<Double> devide = (x, y) -> x / y;
        // Consumer<Double> println = System.out::println;
        // double c = calc.devide.apply((double) a, (double) b);
        // то всё заработает, но другие Integer считать не будет

    }
}