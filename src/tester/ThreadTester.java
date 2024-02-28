package tester;

import java.util.logging.Level;
import java.util.logging.Logger;

import thread.ExtendedThread;
import thread.RunnableThread;
 	
public class ThreadTester {
	public static void main(String... args) {
		Logger logger = Logger.getLogger("myLogger");
		ExtendedThread extendedThread = new ExtendedThread(10000L);
		extendedThread.setName("First extended thread");
		extendedThread.start();
		
		ExtendedThread extThreadTwo = new ExtendedThread(20000L);
		extThreadTwo.setName("second Extended thread");
		extThreadTwo.start();
		
		ExtendedThread extThreadThree = new ExtendedThread(30000L);
		extThreadThree.setName("third Extended thread");
		extThreadThree.start();
		
		ExtendedThread extThreadFour = new ExtendedThread(40000L);
		extThreadFour.setName("fourth Extended thread");
		extThreadFour.start();
		
		ExtendedThread extThreadFive = new ExtendedThread(50000L);
		extThreadFive.setName("fifth Extended thread");
		extThreadFive.start();
		
		RunnableThread threadOne = new RunnableThread(15000);
        Thread runnableThread = new Thread(threadOne);
        runnableThread.setName("Runnable thread one");
        runnableThread.start();
        
        RunnableThread threadTwo = new RunnableThread(25000);
        Thread runnableThreadTwo = new Thread(threadOne);
        runnableThreadTwo.setName("Runnable thread two");
        runnableThreadTwo.start();
        
        
        RunnableThread threadThree = new RunnableThread(35000);
        Thread runnableThreadThree = new Thread(threadThree);
        runnableThreadThree.setName("Runnable thread three");
        runnableThreadThree.start();
        
        RunnableThread threadFour = new RunnableThread(45000);
        Thread runnableThreadFour = new Thread(threadFour);
        runnableThreadFour.setName("Runnable thread four");
        runnableThreadFour.start();
        
        RunnableThread threadFive = new RunnableThread(55000);
        Thread runnableThreadFive = new Thread(threadFive);
        runnableThreadFive.setName("Runnable thread five");
        runnableThreadFive.start();
        
       Long timeOut = 60000L;
        
       try {
		Thread.sleep(timeOut);
		extendedThread.setCondition(false);
		Thread.sleep(timeOut);
		extThreadTwo.setCondition(false);
		Thread.sleep(timeOut);
		extThreadThree.setCondition(false);
		Thread.sleep(timeOut);
		extThreadFour.setCondition(false);
		Thread.sleep(timeOut);
		extThreadFive.setCondition(false);
		Thread.sleep(timeOut);
		threadOne.setCondition(false);
		Thread.sleep(timeOut);
		threadTwo.setCondition(false);
		Thread.sleep(timeOut);
		threadThree.setCondition(false);
		Thread.sleep(timeOut);
		threadFour.setCondition(false);
		Thread.sleep(timeOut);
		threadFive.setCondition(false);
		
	} catch (InterruptedException e) {
	}   
    logger.log(Level.INFO,"Task completed");
	}

}
	