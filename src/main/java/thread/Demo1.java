package thread;

/**
 * 使用Thread创建线程
 */
public class Demo1 extends Thread {

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        // do something
        doSomething();

    }

    public static void main(String[] args) {
        Demo1 t1 = new Demo1();
        // 启动线程
        t1.start();
    }

    private void doSomething() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("i:"+i);
        }
    }


}
