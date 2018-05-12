package main;

public class LoopSample {

    static String[] array = new String[]{"a","b","c","d","e"};
    static int[] arrayInt = new int[]{2,4,6,8,10};

    public static void main(String[] args) {
        String[] str = new String[2];

        String aaa = str[0];

        str[0].concat("abc");
        aaa.concat("abc");

    }

    private static void loop1() {

        System.out.println("Loopその1");

        // 標準for
        for (int i = 0 ; i < array.length; i++) {
            String value = array[i];
            System.out.println("value = " + value);
        }

        for (int i = 0 ; i < arrayInt.length; i++) {
            int value = arrayInt[i];
            System.out.println("value = " + value);
        }


     // 標準for
        for (int i = array.length - 1 ; i >= 0; i--) {
            String value = array[i];
            System.out.println("value = " + value);
        }

        for (int i = 0 ; i < array.length; i = i + 2) {
            String value = array[i];
            System.out.println("value = " + value);
        }


    }

    private static void loop2() {

        System.out.println("Loopその2");
        // 拡張for
        String value;
        for (String value : array) {
            System.out.println("value = " + value);
        }

        for (int value : arrayInt) {
            System.out.println("value = " + value);
        }
    }
}
