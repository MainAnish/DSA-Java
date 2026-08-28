public class recPalin {
    public static void main(String args[])
    {
        String a="MadaM";
        int right=0,left=a.length()-1;
        System.out.println(palin(a,right,left));
    }
    public static boolean palin(String a, int r, int l)
    {
        if (r >= l) {
        return true;
        }
        if(a.charAt(r)==a.charAt(l))
        {
            return palin(a,r+1,l-1);
        }
        else
        {
            return (false);
        }
    }
}
