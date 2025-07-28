package Vvedenie;

import java.math.BigInteger;
import static java.lang.Long.MAX_VALUE;
import static java.math.BigInteger.valueOf;

public class Task_1_2_14 {
    public static BigInteger maxLongSqr() {
        return valueOf(MAX_VALUE).pow(2);
    }
    public static void main(String[] args) {
        System.out.println("Возвращаемое значение функции MaxLongSqr: " + Task_1_2_14.maxLongSqr());
    }
}