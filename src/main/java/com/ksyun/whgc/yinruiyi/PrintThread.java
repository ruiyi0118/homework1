package com.ksyun.whgc.yinruiyi;

public class PrintThread implements Runnable {
    private String id;
    private Object prev;
    private Object self;

    public PrintThread(String id, Object prev, Object self) {
        this.id = id;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 5;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(id);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
