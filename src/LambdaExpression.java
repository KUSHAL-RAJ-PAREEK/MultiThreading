public class LambdaExpression {

    public static void main(String[] args) {

//        Runnable r = () -> System.out.println("hello");
        Thread t1 = new Thread(() -> System.out.println("hello"));

        t1.start();
    }


}
