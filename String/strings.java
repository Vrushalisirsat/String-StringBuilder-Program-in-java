import java.util.*;
class strings
{
    public static void main(String args[])
    {
        /*
        String name ="Vrushali";
         System.out.println("Name = " + name);

        // charAt() --> print character of each character in string.
        for(int i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));
        }

        // Method-1 :-   compareTo() function --> compare 2 string
        String name1="om";
        String name2="om";

        if(name1.compareTo(name2) == 0)
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String not are equal");
        }


        //  Method-2 :-  == -> for compare 2 string
        if(name1 == name2)
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("String not are equal");
        }

       //  Method-3 :- 

       if(new String("tony") == new String("tony"))
       {
         System.out.println("String are equal");
       }
       else{
        System.out.println("String are not equal");
       }

      
       // substring :- substring(beg index , end index)
       String sentence = "My name is Vrushali";
       
       String name = sentence.substring(11, sentence.length());
       System.out.println(name);

       name = sentence.substring(0);
       System.out.println(name);

       name = sentence.substring(3,7);
       System.out.println(name);


       // ParseInt Method of Integer class
       String str ="123";
       int number = Integer.parseInt(str);
       System.out.println(number);


       

       //ToString Method of String class

       int number =12301;
       String str = Integer.toString(number);
       System.out.println(str.length());

    

    // Q. Take an array of String input from the user & find the cumulative (combined) length of all those strings.

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of string array : ");
    int size=sc.nextInt();

    String arr[]=new String[size];
    int totLength = 0;

    for(int i=0;i<size;i++)
    {
        arr[i] = sc.next();
        totLength += arr[i].length();
    }

    System.out.println(totLength);

   

    // Q. input a string from the user.create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i' .

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str=sc.next();

    String result="";

    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i) == 'e')
        {
            result += 'i';
        }
        else{
            result +=str.charAt(i);
        }
    }

     System.out.println(result);

 */

     // Q. input a email from the user.create a username from the email by deleting the part that comes after '@'. Display that username to the user. 

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
    String email = sc.next();

    String username ="";

    for(int i=0;i<email.length();i++)
    {
        if(email.charAt(i) == '@')
        {
            break;
        }
        else{
            username +=email.charAt(i);
        }
    }

     System.out.println(username);

    }
} 