public class Zavd1 {


    public static void main(String[] args) {
        Thread everySec = new Thread(new Runnable() {
            int second = 1;
            @Override
            public void run() {
                System.out.println(second + " second");
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                second++;
                System.out.println(second + " seconds");
            }
            }
        });
        Thread every5Sec = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("5 seconds have passed");
                }
            }
        });

        everySec.start();
        every5Sec.start();
    }

}
