public class Task267 {
    public static void main(String[] args) {
        int[] x = {2, 6, 8, 4, 21};
        int[] y = {7, 6, 2, 1, 14};
        int n = 6;
        int xGumar = 0, yGumar = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 7 == 0) {
                xGumar = xGumar + x[i];
            }

        }
        for (int i = 0; i < y.length; i++) {
            if (y[i] % 7 == 0) {
                yGumar = yGumar + y[i];

            }
        }
        System.out.println(xGumar+yGumar);
    }
}