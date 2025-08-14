package machine.coding.practice.java.Multithreading.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread thread1 = new Thread(()->{
            for(int i=0; i<200; i++){
                resource.increment();
            }
        });

        Thread thread2 = new Thread(()->{
            for(int i=0; i<200; i++){
                resource.increment();
            }
        });

        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch (Exception e){

        }

        System.out.println(resource.getCounter());

//        Thread thread3 = new Thread(()->{
//            for(int i=0; i<200; i++){
//                resource.increment1();
//            }
//        });
//
//        Thread thread4 = new Thread(()->{
//            for(int i=0; i<200; i++){
//                resource.increment1();
//            }
//        });
//
//        thread3.start();
//        thread4.start();
//
//        try{
//            thread3.join();
//            thread4.join();
//        }catch (Exception e){
//
//        }
//
//        System.out.println(resource.getCounter1());
    }
}
