package Zavd2;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzz A = new FizzBuzz((n) ->{
            if(n%3==0 && n%5 !=0){
                System.out.println("fizz");
            }
        });
        FizzBuzz B = new FizzBuzz((n) ->{
            if(n%5==0 && n%3!=0){
                System.out.println("buzz");
            }
        });
        FizzBuzz C = new FizzBuzz((n) ->{
            if(n%3==0 && n%5 ==0){
                System.out.println("fizzbuzz");
            }
        });
        FizzBuzz D = new FizzBuzz((n) ->{
            if(n%3!=0 && n%5!=0){
                System.out.println(n);
            }
        });

        List<FizzBuzz> fbs = new ArrayList<>();
        fbs.add(A);
        fbs.add(B);
        fbs.add(C);
        fbs.add(D);

        for (FizzBuzz fb : fbs) {
            fb.start();
        }

        for(int i = 1; i<=20; i++){
            for (FizzBuzz fb : fbs) {
                fb.process(i);
            }
            while(true){
                int processedNumdersCount = 0;
                for (FizzBuzz fb : fbs) {
                    if(fb.isNumberProcessed()){
                        processedNumdersCount++;
                    }
                }
                if (processedNumdersCount == 4){
                    break;
                }
            }
        }
    }

}
