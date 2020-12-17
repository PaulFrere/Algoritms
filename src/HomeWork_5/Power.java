package HomeWork_5;

public class Power {
    public static void main(String[] args) {
        System.out.println(recPower(18, 9));
    }
    static int recPower(int a, int b) {
        if (b == 1) {
            return a;
        }

        if (b == 0) {
            return 1;
        }
        return recPower(a, b - 1) * a;
    }
}
