import com.ksyun.whgc.yinruiyi.PrintThread;

public class TestPrintThread {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        PrintThread pa = new PrintThread("A", c, a);
        PrintThread pb = new PrintThread("B", a, b);
        PrintThread pc = new PrintThread("C", b, c);

        Thread t1 = new Thread(pa);
        Thread t2 = new Thread(pb);
        Thread t3 = new Thread(pc);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
