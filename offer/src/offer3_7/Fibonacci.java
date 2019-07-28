package offer3_7;

/**
 * 〈一句话功能简述〉<br>
 * 〈斐波那契数列〉
 *
 * @author CJW
 * @create 2019/7/28
 * @since 1.0.0
 */
public class Fibonacci {



    public int Fibonacci_1(int n) {
        if (n <= 1)
            return n;
        int[] fib = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
        return fib[n];
    }
}