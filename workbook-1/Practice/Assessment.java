package Practice;

public class Assessment {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            if (i == 2) {

                continue;

            }

            System.out.print(i + " ");


        }
        int x = 5;

        System.out.println(x++);


        int y = 9;

        if (y++ < 10) {

            System.out.println("Low");

        } else {

            System.out.println("High");

        }
        int t = 5;

        int z = ++t;

        System.out.println(z);

        int p = 10;

        if (p < 5 ) {

            System.out.println("Low");

        } else if (p < 15) {

            System.out.println("Medium");

        } else {

            System.out.println("High");

        }
        int i = 10;

        while (i > 0) {

            System.out.print(i + " ");

            i -= 2;

        }
        String s1 = "Java";

        String s2 = "Java";

        String s3 = new String("Java");

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));

    }




}




