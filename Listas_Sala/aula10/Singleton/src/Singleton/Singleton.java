package Singleton;

public class Singleton{

	// ---------- Constructor --------------------
	private Singleton() {
	}    // constructor: Application


	// ---------- Operations --------------------
	// For lazy initialization
	public static synchronized Singleton getApplication() {
	
		if (! instanceFlag) {
			return create();
		} else {
			return _theApplication;
		}
	}    // method: getApplication

	private static Singleton create() {
		try{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("Exceção");
		}
		
		_theApplication = new Singleton();
		instanceFlag = true;
		return _theApplication;
	}    // method: create

	protected void finalize() throws Throwable {
		try {
			instanceFlag = false;        // free new singleton instance!
		} finally {
			super.finalize();
		}
	}    // method: finalize
	

	// Others methods protected by singleton-ness would be here
	// …

	// ---------- Attributes --------------------  
	private static Singleton _theApplication = null;
	private static Boolean instanceFlag = false;
	
}
