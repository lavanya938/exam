
public class prime {

    public static void main(String[] args) {

        int num = 34;

        System.out.println(isPrime(num) ? "Prime" : "Not Prime");

    }

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;

    }

}
