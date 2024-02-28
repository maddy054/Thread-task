package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableThread implements Runnable {
	private static Logger logger = Logger.getLogger("myLogger");
	private long sleepTime;
	private boolean condition = true;
	public RunnableThread(long millis) {
		super();
		this.sleepTime = millis;
	}
	
	public void setCondition(boolean condition) {
		this.condition =  condition;
	}
	public void run() {
		/*
		 * logger.log(Level.INFO,Thread.currentThread().getName());
		 * logger.log(Level.INFO,"" +Thread.currentThread().getPriority());
		 * logger.log(Level.INFO,Thread.currentThread().getState().toString());
		 * logger.log(Level.INFO, "Going to sleep "+Thread.currentThread().getName());
		 */
		
		while(condition) {
			/*
			 * try { Thread.sleep(sleepTime); } catch (InterruptedException e) { }
			 */
			logger.log(Level.INFO, "After sleep "+Thread.currentThread().getName());
		}
	}
	
}
