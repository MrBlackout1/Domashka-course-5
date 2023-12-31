package Zavd2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class FizzBuzz extends Thread{

    private AtomicBoolean isNumberProcessed = new AtomicBoolean(true);

    private Consumer<Integer> processor;
    private int number;

    public FizzBuzz(Consumer<Integer> processor) {
        this.processor = processor;
    }

    public boolean isNumberProcessed(){
        return isNumberProcessed.get();
    }

    public void process(int number){
        this.number = number;
        this.isNumberProcessed.set(false);
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(isNumberProcessed.get()) {
                continue;
            }

            processor.accept(number);

                isNumberProcessed.set(true);
            }
        }
    }
