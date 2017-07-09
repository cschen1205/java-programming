package com.github.cschen1205.jp.chap10;

/**
 * Created by memeanalytics on 9/7/17.
 */
public class Q04 {
    public static int neg(int a) {
        if ( a== 0) return  a;
        int d = a > 0 ? -1 : 1;
        int count = a;
        int result = 0;
        while(count > 0){
            count += d;
            result += d;
        }
        return result;
    }

    public static int minus(int a,int b) {
        return a + neg(b);
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        int iters = max(a, b);
        int f = min(a, b);
        int result = a;
        for(int i=1; i < iters; ++i) {
            result += f;
        }
        return result;

    }

    public static int divide(int a, int b) {
        boolean diffSign = multiply(a, b) < 0;
        if (b == 0) {
            throw new RuntimeException();
        }
        if(b < 0) b = neg(b);
        if(a < 0) a = neg(a);
        int result = 0;
        for(int i=0; i < a; i += b) {
            result++;
        }
        if(diffSign) result = neg(result);
        return result;
    }

    public static int min(int a, int b) {
        return max(a, b) == a ? b : a;
    }
    public static int max(int a, int b) {
        int b_minus_a = minus(b, a);

        int sign = 1-Math.abs((b_minus_a & (1 << 31)) >> 31);
        System.out.println(sign);
        return a + b_minus_a * sign;
    }


}
