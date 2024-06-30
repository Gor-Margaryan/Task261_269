public class Task264 {
    public static void main(String[] args) {
        int [] x = {2, 6, 8,4};
        int [] y = {7, 6, 2,1};
        int n = 6;

        int x_qanak = 0, y_qanak = 0;


        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                x_qanak++;
            }


        }
        System.out.println(x_qanak);


        for (int i = 0; i < y.length; i++) {
            if (y[i] < 0) {

                y_qanak++;
            }

        }
        System.out.println(y_qanak);


        System.out.println(x_qanak+y_qanak );

    }
}
