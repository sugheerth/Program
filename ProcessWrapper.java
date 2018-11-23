
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * $Id$
 * @author gramkumar-0817
 *
 */
public class ProcessWrapper {

	private static final int BUFFER_SIZE = 32768;
	private ProcessBuilder builder;
	private Process process;
	private int exitCode;
	private OutputStream os;
	private boolean isAlive = false;
	
	public ProcessWrapper(ProcessBuilder pb, OutputStream os) {
		this.builder = pb;
		this.os = os;
	}
	
	public int getExitCode() {
		return exitCode;
	}

	public void setExitCode(int exitCode) {
		this.exitCode = exitCode;
	}

	public void start() {
		InputStream is = null;
		try {
			builder.redirectErrorStream(true);
			
			this.process = builder.start();
			isAlive = true;
			is = process.getInputStream();
			int length;
			byte[] buffer = new byte[BUFFER_SIZE];
			while((length = is.read(buffer)) != -1) {
				os.write(buffer, 0, length);
			}
			setExitCode(process.waitFor());
			
		} catch (IOException e) {
                        e.printStackTrace();
                        System.out.println(e + "Error while executing process io exception"); 
		} catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println(e + "Error while executing process for InterruptedException"); 
		} finally {
                         try{
                            if (is != null)
                            {
			     is.close();
                            }
                          }catch (Exception e){
                          e.printStackTrace();
                          System.out.println(e + "Error Occured for closing inputstream");}
                          
                            
			if(process != null) {
				terminateProcess();
			}
			isAlive = false;
		}	
	}	
	
	public boolean isAlive() {
		return isAlive;
	}
	
	public void terminateProcess() {
		if(this.process != null) {
			process.destroy();
		}
	}
}

