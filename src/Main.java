import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //TODO #1
        /*method(1,3,5,7,9,111,555,9999,55,65,65);*/

        /*int[] array = {1,2,3,4,5};
        varargsMethod(array); //же varargsMethod(1, 2, 3, 4, 5); жазган туура.*/
        //TODO #3
        //summaMethod(10, 20, 30);
        //TODO #3 foreach
       System.out.println(sumMethod(10,20,30));


    }

    //TODO #1
    /*static void method(int...varargs){

    }*/

    //TODO varargs
  /*  static void varargsMethod (int...number){
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }*/
    //TODO #3 fori sandardyn summasyn 4ygar
    /*static void summaMethod(int... numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            counter += numbers[i];
        }
        System.out.println(counter);
    }*/



    //TODO #3 foreach чыгарганы
    static int sumMethod(int... numbers) {
        int count = 0;
        for (int arr : numbers){
        count = count + arr;

        }return count;
    }
}