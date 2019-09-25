package thread;

/**
 * 使用Thread创建线程
 */
public class ThreadDemo extends Thread {

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        // do something
        doSomething();

    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        // 启动线程
        t1.start();
    }

    private void doSomething() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("i:"+i);
        }
    }


}
