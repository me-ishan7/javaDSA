package Searching;
import java.util.Scanner;
public class SearchStrings {
    public static void main(String[] args){
        char target = 'a';
        String name = "Ishan";
        boolean ans = search(name,target);
        System.out.println(ans);
    }
    public static boolean search(String name,char target){
        if(name.length() == 0 ) return false;
        for(int i = 0;i<name.length();i++){
            if(name.charAt(i) == target) return true ;
        }
        return false;
    }
}
