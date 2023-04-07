package Task_1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);

        // Код не работает, ошибка на ноль делить нельзя
        // можно выкинуть ошибку BinaryOperator<Integer> devide = (x, y) -> {
        //        if (y != 0) return x/y;
        //        else throw new ArithmeticException("На ноль делить нельзя");
        //    };
        // или оставить в качестве ответа число x
        //BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x/ y : x;

    }
}