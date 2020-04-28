public class DeadLockProgram {
static Object ObjectLock1 = new Object();
    static Object ObjectLock2 = new Object();
  private static class ThreadName1 extends Thread {
      public void run() {
         synchronized (ObjectLock1) {
         System.out.println("Thread 1: Has  ObjectLock1");
           
           
            try { 
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1: Waiting for ObjectLock 2");
            
             
            synchronized (ObjectLock2) {
               System.out.println("Thread 1: No DeadLock");
            }
         }
      }
   }
   private static class ThreadName2 extends Thread {
      public void run() {
         synchronized (ObjectLock2) {
            System.out.println("Thread 2: Has  ObjectLock2");
            
           
            try { 
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2: Waiting for ObjectLock 1");
            
              
            synchronized (ObjectLock1) {
               System.out.println("Thread 2: No DeadLock");
            }
         }
      }
   }
