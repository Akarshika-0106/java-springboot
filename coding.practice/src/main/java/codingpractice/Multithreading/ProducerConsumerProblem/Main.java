package codingpractice.Multithreading.ProducerConsumerProblem;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);

        Thread producerThread = new Thread(() -> {
            try{
                for(int i=1; i<=6; i++){
                    sharedResource.produce(i);
                }
            }catch (Exception e){
                //handle exception
            }

        });

        Thread consumerThread = new Thread(() -> {
            try{
                for(int i=1; i<=6; i++){
                    sharedResource.consume();
                }
            }catch (Exception e){
                //handle exception
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
