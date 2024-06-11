package thread;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ExtendedThread extends Thread {
	private static Logger logger = Logger.getLogger(Thread.class.getName());
	//private Long sleepTime;
	private boolean condition = true;
	public ExtendedThread(long sleepTime) {
		super();
		//this.sleepTime  = sleepTime;
	}
	
	public void setCondition(boolean condition) {
		this.condition = condition;
	}
	
	public void run() {
		/*logger.log(Level.INFO,"current thread"+Thread.currentThread().getName());
		logger.log(Level.INFO,"proprity"+Thread.currentThread().getPriority());
		logger.log(Level.INFO,"state"+Thread.currentThread().getState().toString());
		logger.log(Level.INFO, "Going to sleep "+this.getName());*/

		while(condition ) {
			/*
			 * try { Thread.sleep(sleepTime); } catch (InterruptedException e) { }
			 */
			logger.log(Level.INFO, "After sleep " +this.getName());			
		}
		

	}
}
