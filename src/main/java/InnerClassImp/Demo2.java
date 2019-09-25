package InnerClassImp;

/**
 * start 和 run 区别
 * 1.start：告诉jvm启动一个线程，并在线程内调用run方法
 * 2.run：未使用start情况下，当做普通的方法按顺序执行
 */
public class Demo2 {

    public static void main(String[] args) {
        //创建2个Thread
        Thread t1= new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("线程t1 i:"+i);
                }
            }
        });

        Thread t2 =new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("线程t2 i:"+i);
                }
            }
        });

        // 以start方式调用run
        t1.start();
        t2.start();

        // 直接调run
        t1.run();
        t2.run();
    }
}
