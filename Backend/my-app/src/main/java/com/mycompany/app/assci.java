public class assc {
 
    public static String main(String[] args,String s)
    {
        String m = "Sairam" , c = "upper" ;
        int flag , shift = 2;
        String result = "";
        
        for(int i=0;i<m.length();i++){
        
        	if( (int)m.charAt(i) >= 32 && (int)m.charAt(i) <= 126 )
        		result = result + (int)m.charAt(i) + " ";
        }
        
        System.out.println(m+" is converted to "+result);
        

		return result;
}
}
