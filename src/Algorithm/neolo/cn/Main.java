package Algorithm.neolo.cn;

/**
 *  64 位整数，及其算术运算符 ( long )；
  16 位整数，及其算术运算符 ( short )；
  16 位字符，及其算术运算符 ( char )；
  8 位整数，及其算术运算符 ( byte )；
  32 位单精度实数，及其算术运算符 ( float )
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println(sqrt(9));
//        Math.sqrt(9);
        System.out.println(StrictMath.sqrt(9));
    }





    public static double sqrt(double c){
        if (c< 0)
            return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t-c/t)>err *t )
            t= (c/t + t)/2.0;
        return t;
    }

    /**
     * 计算两个非负整数 p 和 q 的最大公约数：若
     q 是 0，则最大公约数为 p。否则，将 p 除以
     q 得到余数 r，p 和 q 的最大公约数即为 q 和
     r 的最大公约数(最大公约数)欧几里得算法求最大
     公约数
     * @param p
     * @param q
     * @return
     */
    public static int qcd(int p,int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return qcd(q,r);
    }
}
