 class MyThread extends Thread {
    MyThread(String str) {
        super(str);
    }
    public void run() {
      try {
         for (int i = 0; i < 10; i++) {
             String name = Thread.currentThread().getName();
             System.out.println("Thread name: " + name);
             sleep(name == "Thread 1" ? 1000 : 2000);
         }
      } catch (Exception e) {
          // TODO: handle exception
        System.out.println("Exception: " + e);
      }
    }

}

public class Practical_25 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();
    }
}
