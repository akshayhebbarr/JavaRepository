class DispOverloading2
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
       System.out.println(c );
    }
    public static void main(String args[])
    {
        DispOverloading2 obj = new DispOverloading2();
        obj.disp('M');
        obj.disp('O');
        obj.disp('N');
        obj.disp('A');
        obj.disp('L');
        obj.disp('I');
        }
}