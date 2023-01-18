public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1 - 2");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        int i = 0;
        for (; i < 3; i++) {
            System.out.print(box[i]);
            if (i != box.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        double[] distance = {1.57, 7.654, 9.986};
        int a = 0;
        for (; a < distance.length; a++) {
            System.out.print(distance[a]);
            if (a != distance.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        int[] numbers = {21, 37, 49, 51};
        int b = 0;
        for (; b < numbers.length; b++) {
            System.out.print(numbers[b]);
            if (b != numbers.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();

    }

    public static void task2() {
        System.out.println("Задача 3");
        int[] box1 = new int[3];
        box1[0] = 1;
        box1[1] = 2;
        box1[2] = 3;
        for (int i = box1.length - 1; i >= 0; i--) {
            box1[i] = i + 1;
            System.out.print(box1[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        double[] distance1 = {1.57, 7.654, 9.986};
        for (int a = distance1.length - 1; a >= 0; a--) {
            System.out.print(distance1[a]);
            if (a != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        int[] numbers1 = {21, 37, 49, 51};
        for (int b = numbers1.length - 1; b >= 0; b--) {
            System.out.print(numbers1[b]);
            if (b != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 4");
        int[] box2 = new int[3];
        box2[0] = 1;
        box2[1] = 2;
        box2[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (box2[i] % 2 != 0) {
                System.out.println(box2[i] + 1);
            } else {
                System.out.println(box2[i]);
            }
        }
    }
    }

