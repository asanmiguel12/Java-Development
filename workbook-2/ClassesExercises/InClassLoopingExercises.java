package ClassesExercises;

public class InClassLoopingExercises {
    public static void main(String[] args) {
        String p = "Hi!";
        while (Math.random() > .05) {
            System.out.println(p);
            }

        int a = 20;
        for (int b = 0; b < a; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }

        String[] fruitsandveggies = {"Tangerines", "Brussel Sprouts", "Apples"};
        for (String i : fruitsandveggies) {
            System.out.println("I love " + (i));
        }

        int [] monkeys = {1,2,3,4,5,6,7,8,9,10};
        int [] reversedmonkeys = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < monkeys.length; i++) {
            reversedmonkeys[i] = monkeys[monkeys.length-i-1];
            if (reversedmonkeys[i] == 1) {
                System.out.println("1 little monkey jumping on the bed, one fell of and bumped his head, mommy called the doctor and the doctor said no more monkeys jumping on the bed");
            }
            System.out.println(reversedmonkeys[i] + " little monkeys jumping on the bed, one fell of and bumped his head, mommy called the doctor and the doctor said no more monkeys jumping on the bed");if (reversedmonkeys[i] == 1) {System.out.println("1 little monkey jumping on the bed, one fell of and bumped his head, mommy called the doctor and the doctor said no more monkeys jumping on the bed");
            }
        }
    }
}