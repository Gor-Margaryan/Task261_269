public class Task261 {
    public static void main(String[] args) {
        // Petqa float kam double liner GITEM
        int [] x = {2, 6, 8,4};
        int [] y = {7, 6, 2,1};
        int n = 6;
        int x_gumar = 0, y_gumar =0;
        int x_qanak = 0, y_qanak = 0;
        int artadryal = 1;

        for (int i = 0; i < x.length; i++) {
            x_gumar = x[i] + x_gumar;
            x_qanak++;

        }
        System.out.println("X-i Mijin Tv. " +x_gumar/x_qanak);


        for (int i = 0; i < y.length; i++) {
            y_gumar= y_gumar + y[i];
            y_qanak++;

        }
        System.out.println("X-i Mijin Tv. " +y_gumar/y_qanak);


        System.out.println("X ev Y Mijin Tv." + (x_gumar/x_qanak) * y_gumar/y_qanak );


    }
}
