package PasswordStrengthValidator;

public interface SecurityUtils {
    public static boolean checkPassword(String s){
        if(s == null || s.length()<8){
            return false;
        }
        boolean hasUpperCase=false;
        boolean hasLowerCase=false;
        boolean hasDigits=false;
        boolean hasSpecial=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                hasUpperCase=true;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                hasLowerCase=true;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                hasDigits=true;
            }
            else{
                hasSpecial=true;
            }
        }
        return hasLowerCase && hasUpperCase && hasDigits && hasSpecial;
    }
}