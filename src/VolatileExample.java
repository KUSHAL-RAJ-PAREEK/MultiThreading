
class ShareObj{
    private volatile boolean flag = false;

    public void setFlagTrue(){
        flag = true;
    }

    public void printIfFlagTrue(){
        while(!flag){
            // do nothing
        }

        System.out.println("Flag is true !");
    }
}

public class VolatileExample {

    public static void main(String[] args) {
        ShareObj sharedObj = new ShareObj();

        Thread writeThread = new Thread(() ->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(() ->{
            sharedObj.printIfFlagTrue();
        });

        writeThread.start();
        readerThread.start();
    }
}
