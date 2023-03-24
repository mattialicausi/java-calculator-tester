package calculator.tester;

public interface Calculator {

    //metodi
    public static float add(float n1, float n2) throws IllegalArgumentException {

        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException("Cannot put negative value ");
        }

        return n1 + n2;
    }

    public static float subtract(float n1, float n2) throws IllegalArgumentException {

        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException("Cannot put negative value ");
        }

        return n1 - n2;
    }

    public static float divide(float n1, float n2) throws IllegalArgumentException {

        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException("Cannot put negative value ");
        }

        return n1 / n2;
    }

    public static float multiply(float n1, float n2) throws IllegalArgumentException {

        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException("Cannot put negative value ");
        }

        return n1 * n2;
    }

}
