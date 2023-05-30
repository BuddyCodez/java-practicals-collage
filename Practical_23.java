
class DivideByZeroEx extends Exception {
    private int ex;

    DivideByZeroEx(int b) {
        ex = b;
    }

    public String toString() {
        return "DivideByZero Exception:  Number is not divided by " + ex;
    }
}

public class Practical_23 {
    static void divide(int a, int b) throws DivideByZeroEx {
        if (b <= 0) {
            throw new DivideByZeroEx(b);
        } else {
            System.out.println("Division : " + a / b);
        }
    }

    public static void main(String arg[]) {
        try {
            divide(10, 0);
        } catch (DivideByZeroEx me) {
            System.out.println(me);
        }
    }
}
