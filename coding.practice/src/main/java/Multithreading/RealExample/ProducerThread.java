package Multithreading.RealExample;

public class ProducerThread implements Runnable{

    private SharedResource sharedResource;

    public ProducerThread(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    public void run(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            //handle exception here
        }
        sharedResource.addItem();
    }
}
