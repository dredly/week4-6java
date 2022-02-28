public class BufferTest {
    public static void main(String[] args) throws InterruptedException {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        System.out.println(b);
        p.start();
        c.start();
        p.join();
        c.join();
        System.out.println(b);
    }
}
