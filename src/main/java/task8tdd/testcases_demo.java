package task8tdd;

public class testcases_demo {
	public String valid_string(String str) {
		String m="";
		for(int i=0;i<2;i++) {
			if(str.charAt(i)!='A') {
				m=m+str.charAt(i);
				
			
			}
		}
		m=m+str.substring(2);
		return m;
		
	}
	

}
