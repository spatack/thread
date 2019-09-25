package InnerClassImp;

/**
 * 在Tread内部实现runnable
 */
public class Demo1 {

    public static void main(String[] args) {
        // 在Thread内部实现runnable
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("do something");
            }
        });
        t1.start();
    }
}
