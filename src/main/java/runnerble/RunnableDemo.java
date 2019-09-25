package runnerble;

/**
 * 实现 Runnable接口 来启动线程
 */
public class RunnableDemo implements Runnable {


    public void run() {
        doSomething();
    }

    void doSomething() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("i:"+i);
        }
    }

    public static void main(String[] args) {
        // 创建一个 Thread 实例 和 Runnable实例，runnableDemo作为参数传入Thread构造方法
        Thread t1 = new Thread(new RunnableDemo());
        // 启动线程
        t1.start();
    }
}
