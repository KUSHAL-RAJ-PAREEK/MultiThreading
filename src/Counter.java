public class Counter {

    private int count;

    public  void Increment(){
        synchronized(this){

        count++;
        }
    }


    public int getCount() {
        return count;
    }

}
