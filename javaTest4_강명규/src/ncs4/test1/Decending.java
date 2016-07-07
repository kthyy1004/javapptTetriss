package ncs4.test1;

public class Decending implements java.util.Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
	
		
		return arg0.toString().compareTo(arg1.toString()) > 0? -1 : 1;
	
	}

}
