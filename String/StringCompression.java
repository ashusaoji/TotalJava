package TotalJava.String;

public class StringCompression {
    public static void main(String[] args){
        java.lang.StringBuilder str = new java.lang.StringBuilder("aaabbcccdd");
        System.out.println(compressString(str));
    }

    private static java.lang.StringBuilder compressString(java.lang.StringBuilder str) {
        java.lang.StringBuilder compStr = new java.lang.StringBuilder("");
        for (int i = 0; i < str.length() ; i++) {
            Integer count = 1 ;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            compStr.append(str.charAt(i));
            if(count>1){
                compStr.append(count);
            }
        }
        return compStr;
    }
}
