package Kata;

public class IPAdresses {
	public static long ipsBetween(String start, String end) {
		return ipToLong(end)-ipToLong(start);
	}
	
	public static long ipToLong(String ipAddress) {

	    String[] ipAddressInArray = ipAddress.split("\\.");

	    long result = 0;
	    for (int i = 0; i < ipAddressInArray.length; i++) {
	        int power = 3 - i;
	        int ip = Integer.parseInt(ipAddressInArray[i]);
	        result += ip * Math.pow(256, power);
	    }
	    return result;
	  }
	
	public static void main(String[] a) {
		ipsBetween("10.0.0.0", "10.0.0.50" );
		ipsBetween("20.0.0.10", "20.0.1.0") ;
	}

}
