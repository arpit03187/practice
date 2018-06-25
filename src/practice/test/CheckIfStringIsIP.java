package practice.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class CheckIfStringIsIP {
	
	    public static String[] validIPAddress(String[] ip_array) {
	        
	    	List<String> ipOrNotIp = new ArrayList<>();
	    	
	    	for(int i=0 ; i < ip_array.length; i++) {
	    		if(ip_array[i].matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"))
	    			ipOrNotIp.add("IPv4");
	    		else if(ip_array[i].matches("(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})"))
	    			ipOrNotIp.add("IPv6");
	    		else ipOrNotIp.add("Neither");
	    		
	    	}
	    	
	    	return ipOrNotIp.stream().toArray(String[]::new);
//	    	if(IP.matches("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"))return "IPv4";
//	        if(IP.matches("(([0-9a-fA-F]{1,4}):){7}([0-9a-fA-F]{1,4})"))return "IPv6";
//	        return "Neither";
	    }
	    
	    public static void main(String[] args) {
			
	    	String [] ip_array = {"256.256.256.256", "2001:0db8:0000:0000:0000:ff00:0042:8329"};
	    	System.out.println(validIPAddress(ip_array));
	    	System.out.println(isIpAddress("219.219.219.219"));
	    	System.out.println(isIpAddress("2001:0db8:0000:0000:0000:ff00:0042:8329"));
	    	System.out.println(isIpAddress("256.256.256.256"));
	    	System.out.println(isValidInet4Address("219.219.219.219"));
	    	
		}
	    
	    private static Pattern VALID_IPV4_PATTERN = null;
	    private static Pattern VALID_IPV6_PATTERN = null;
	    private static final String ipv4Pattern = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
	    private static final String ipv6Pattern = "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";

	    static {
	      try {
	        VALID_IPV4_PATTERN = Pattern.compile(ipv4Pattern, Pattern.CASE_INSENSITIVE);
	        VALID_IPV6_PATTERN = Pattern.compile(ipv6Pattern, Pattern.CASE_INSENSITIVE);
	      } catch (PatternSyntaxException e) {
	        //logger.severe("Unable to compile pattern", e);
	      }
	    }

	    /**
	     * Determine if the given string is a valid IPv4 or IPv6 address.  This method
	     * uses pattern matching to see if the given string could be a valid IP address.
	     *
	     * @param ipAddress A string that is to be examined to verify whether or not
	     *  it could be a valid IP address.
	     * @return <code>true</code> if the string is a value that is a valid IP address,
	     *  <code>false</code> otherwise.
	     */
	    public static String isIpAddress(String ipAddress) {

	    	String s = "Neither";
	      Matcher m1 = CheckIfStringIsIP.VALID_IPV4_PATTERN.matcher(ipAddress);
	      Matcher m2 = CheckIfStringIsIP.VALID_IPV6_PATTERN.matcher(ipAddress);
	      if (m1.matches()) {
	        return "IPv4";
	      }
	      
	      if (m2.matches()) {
	      return "IPv6";
	    }
	      
	      return s;
	    }
	    
	    public static boolean isValidInet4Address(String ip)
		{
			String[] groups = ip.split("\\.");

			if (groups.length != 4)
				return false;

			try {
				return Arrays.stream(groups)
							.filter(s -> s.length() > 1 && s.startsWith("0"))
							.map(Integer::parseInt)
							.filter(i -> (i >= 0 && i <= 255))
							.count() == 4;

			} catch(NumberFormatException e) {
				return false;
			}

		}
}
