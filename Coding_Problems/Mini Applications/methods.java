public class methods {
    public static boolean isAlphaNumeric(String s){
        boolean al = false, num = false;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(!num && !Character.isDigit(c))
                num = true;
            if(!al && !Character.isLetter(c))
                al = true;

        }
        return (al && num);
    }
}