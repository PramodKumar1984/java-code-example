package singleton;

import java.io.Serializable;

public class BillSingleTon implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private BillSingleTon() {
		
	}
	private static class BillSingleTonHelper {
		private static final BillSingleTon instance = new BillSingleTon();
	}
	

	public static BillSingleTon getInstance() {
		return BillSingleTonHelper.instance;
	}
	protected Object readResolve() {
		return getInstance();
	}
}
