package test;

import org.junit.Test;

import java.util.UUID;
import java.util.concurrent.*;

public class UUIDTest {

    @Test
    public void test1() {

        //CountDownLatch
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.nameUUIDFromBytes("peking".getBytes()));


        //FutureTask
    }

    @Test
    public void test2() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("===============");
            }
        });


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            try {
                System.out.println("A:" + Thread.currentThread() + " 1");
                cyclicBarrier.wait();
                System.out.println("A:" + Thread.currentThread() + " 2");
                cyclicBarrier.wait();
                System.out.println("A:" + Thread.currentThread() + " 3");
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println("B:" + Thread.currentThread() + " 1");
                cyclicBarrier.wait();
                System.out.println("B:" + Thread.currentThread() + " 2");
                cyclicBarrier.wait();
                System.out.println("B:" + Thread.currentThread() + " 3");
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        executorService.shutdown();
    }
}
