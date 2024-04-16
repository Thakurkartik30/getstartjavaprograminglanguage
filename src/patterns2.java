public class patterns2 {

    public static void HollowRectangle(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {

                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void inverted_half_rotated_pyramid(int n) {
        for (int i = 1; i <= n; i++) {   // outer loop for lines
            for (int j = 1; j <= n - i; j++) {   // iner loop for space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_number(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void ero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // second half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollow_rhombus(int n) {
        for (int i=1; i<=n; i++) {
            // for spaces
            for (int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            // for hollow rectangle

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {


                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void diamond (int n) {
        // first half
        for (int i =1; i<=n ;i++) {
            // for space
            for (int j =1 ;j<=n-i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j =1 ; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for (int i = n;i>=1;i--) {
            // for space
            for (int j =1 ;j<=n-i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j =1 ; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        //  inverted_half_rotated_pyramid(7);
        //   inverted_half_rotated_pyramid(5);

        // Inverted_half_pyramid_with_number
        //  inverted_half_pyramid_with_number(6);

        //floyds triangle
        // floyds_triangle(5);


        // 0-1 Triangle
        //   ero_one_triangle(5);


        // butterfly(4);

        // solid rhombus
        //  solid_rhombus(7);

        diamond(3);


        // hollow rhombus
       // hollow_rhombus(5);


    }
}