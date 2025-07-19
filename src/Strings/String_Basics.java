package Strings;

public class String_Basics {
    public static void main(String[] args) {
        char x = 'a';    // use single inverted comma in case of char
        String s = "Ishan"; // sequence of characters
        System.out.println(s);

        String a = new String("Ishan"); // object of string is created and  allocated to heap a is reference variable
        String b = new String("Ishan"); //object of string is created and  allocated to heap and b is refering to this space
        String c = "Ishan";
        String d = "Ishan";
        String e = "isHaN";
        System.out.println(a==b);//comparing the references not the string
        System.out.println(c==d);

        // methods on string

        System.out.println(a.length());
        System.out.println(a.charAt(4));
        System.out.println(c.equals(d));
        System.out.println(c.equals(e));
        System.out.println(c.equalsIgnoreCase(e));
    }
}
