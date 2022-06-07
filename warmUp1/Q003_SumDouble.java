package warmUp1;

public class Q003_SumDouble {
    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    //sumDouble(1, 2) → 3
    //sumDouble(3, 2) → 5
    //sumDouble(2, 2) → 8

    public static void main(String[] args) {
        System.out.println(sumDouble(7, 7));
        System.out.println(sumDouble(5, 4));
    }

    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        return (a + b) * 2;
    }
}
