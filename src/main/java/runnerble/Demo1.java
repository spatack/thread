package runnerble;

/**
 * 实现 Runnable接口 来启动线程
 */
public class Demo1 implements Runnable {


    public void run() {
        doSomething();
    }

    private void doSomething() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("i:"+i);
        }
    }

    public static void main(String[] args) {
        // 创建一个 Thread 实例 和 Runnable实例，runnableDemo作为参数传入Thread构造方法
        Thread t1 = new Thread(new Demo1());
        // 启动线程
        t1.start();

        // 创建多个线程实例，并启动线程
        Thread t2 = new Thread(new Demo1());
        Thread t3 = new Thread(new Demo1());
        Thread t4 = new Thread(new Demo1());
        t2.start();
        t3.start();
        t4.start();

    }
}
