package com.java.overloading;
class DisplayOverloading
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
       System.out.println(c);
    }
    public static void main(String args[])
    {
       DisplayOverloading obj = new DisplayOverloading();
        obj.disp('A');
        obj.disp('K');
        obj.disp('S');
        obj.disp('H');
        obj.disp('A');
        obj.disp('Y');
        obj.disp(2);
        }
}