public class Calculator {
    public int add(int a, int b) {
        //TODO inser your realisation in method add
        return a + b;
    }

    public int dif(int a, int b) {
        //TODO inser your realisation in method dif
        return a - b;
    }

    public int div(int a, int b) {
        //TODO inser your realisation in method div
        if (a == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return a / b;

    }

    public int times(int a, int b) {
        //TODO inser your realisation in method times
        return a * b;
    }

    public int solver(int a, int b, int c, int d, int e) {
        //TODO inser your realisation in method solver
        //(a+b)*c-d/e

        int sum = add(a, b);
        int times = times(sum, c);
        int div = div(d, e);
        int dif = dif(times, div);
        return dif;

    }
}