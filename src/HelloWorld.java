public class HelloWorld {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Adjusted Hello World from the thread");
        }
    }

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
    }
}
