import java.util.*;
public class random {
    static class MyException extends Exception{
        public MyException(String message) {
            super(message);
    }
       static int[] acc = {1001,1002,1003,1004};
       static String[] names = {"name1","name2","name3","name4"};
       static int[] bal = {236,908,9882,2345};

        public MyException() {

        }


        public static void main(String[] args) {
        for(int i = 0; i<4;i++){
            System.out.println("ac no : " + acc[i] + "   holder : " + names[i] + "  balance is :  " + bal[i]);
            try{
                if(bal[i] < 1000){
                    throw new MyException();

                }
            }
            catch(MyException e){
                System.out.println(e);

            }
        }

    }
}}
