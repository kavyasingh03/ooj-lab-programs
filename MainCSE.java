class PrintInfo {
   static void print() {
        System.out.println("Name: Kavya Singh");
        System.out.println("USN: 1BM23CS146");
    }
}
public class Main {

    static class BMSDisplayThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("BMS College of Engineering");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class CSEDisplayThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("CSE");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintInfo.print();
        Thread bmsThread = new BMSDisplayThread();
        Thread cseThread = new CSEDisplayThread();

        bmsThread.start();
        cseThread.start();
    }
}

