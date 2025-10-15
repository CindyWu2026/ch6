public class Ch6
{
    public static String ppap(String str)
    {
        int i=str.indexOf(",");
        String first=str.substring(9,i);
        String second=str.substring(i+11,str.length());
        return "Uh! "+first+" "+second;
    }
    public static void main(String[] args)
     {
         //String msg="I have a pointer, I have a null";
         //String msg=",.:;()[]{}!@#$%^&*";
         System.out.print(pigLatin("car"));
         
     }
    public static boolean isPalindrome(String str)
    {
        String pal="";
        for(int i=0;i<str.length();i++)
        {
            pal+=str.substring(i,i+1);
        }
        if(pal.equals(str))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String convertToBinary(int num)
    {
        String ans="";
        if(num<2)
        {
            ans=ans+num;
        }
        else
        {
            while(num>1)
            {
                ans=num%2+ans;
                num=num/2;
            }
            ans=1+ans;
        }
        return ans;
    }
    public static String pigLatin(String msg)
    {
        String ans="";
        if(msg.length()<-2)
        {
            ans+=msg;
        }
        else
        {
            ans=ans+ msg.substring(1,msg.length())+msg.substring(0,1)+"ay";
        }
        return ans;
    }
}