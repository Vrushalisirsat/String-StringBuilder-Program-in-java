import java.util.*;
class stringBuilder
{
    public static void main(String args[])
    {

        /*

        StringBuilder sb=new StringBuilder("Rushali");
        System.out.println(sb);

        //charactor at index 0
        System.out.println(sb.charAt(0));

        //set charactor at index
        sb.setCharAt(0,'r');
        System.out.println(sb);

        //insert charactor at index
        sb.insert(0,'V');
        System.out.println(sb);
         
        sb.insert(5,'a');
        System.out.println(sb);

        //delete the substring/char of a stringbyilder
        sb.delete(3,6);
        System.out.println(sb);



        // append char in stringbuilder
        StringBuilder sb=new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        
        System.out.println(sb);
        System.out.println(sb.length());      //length of string

*/

        // reverse a string in java
        StringBuilder sb=new StringBuilder("HELLO");

        for(int i=0;i<sb.length()/2;i++)
        {
            int front=i;
            int back=sb.length()-1-i;  // 5-1-0=4

            char frontChar=sb.charAt(front);
            char backChar =sb.charAt(back);

            sb.setCharAt(front , backChar);
            sb.setCharAt(back , frontChar);
        }
        System.out.println(sb);
     
    }
}