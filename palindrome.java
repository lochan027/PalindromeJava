public class palindrome
{
    public static void main(String[] args) {
        System.out.println(isPalindrome("mam"));
    }

    public static boolean isPalindrome(String str)
    {
        int len = str.length();
        if(str == null || len == 1)
        {
            return true;
        }
        if((str.charAt(0)) != (str.charAt(len-1)) )
            return false;
        return isPalindrome(str.substring(0, len-2));
    }

}