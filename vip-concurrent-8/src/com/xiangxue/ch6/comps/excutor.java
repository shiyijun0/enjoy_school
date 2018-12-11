package com.xiangxue.ch6.comps;

import java.util.concurrent.*;

public class excutor {
    private  static  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static class callable implements Callable<String>{
        private String name;

        public callable(String name) {
            this.name = name;
        }

        @Override
        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName()+"***callable******"+name);
            return Thread.currentThread().getName()+"*********"+name;
        }
    }

    private static class runnable implements Runnable{
        @Override
        public void run() {
            Thread.currentThread().setName("先垫付");
            System.out.println(Thread.currentThread().getName()+"***runalble******"+name);
        }


    }

    public static void main(String[] args) throws Exception {
        excutor excutor=new excutor();
        excutor.setName("士大夫");
        FutureTask<String> futureTask=new FutureTask<String>(new callable("的风格"));
Thread thread=new Thread(futureTask,"线程cal");
thread.start();
        System.out.println("******8"+futureTask.get());

        System.out.println("&&&&&&&&线程池&&&&&&&&&&&&&");
        ExecutorService executorService=Executors.newFixedThreadPool(10);
      Future<String> future= executorService.submit(new callable("总线程"));
        System.out.println(future.get()+")))))))))))))))");

         executorService.shutdown();

         ExecutorService executorService1=Executors.newFixedThreadPool(10);
         executorService1.execute(new runnable());
         executorService1.shutdownNow();

    }
}
