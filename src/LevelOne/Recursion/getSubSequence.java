package LevelOne.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getSubSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();
        ArrayList<String> res = gss(s);
        System.out.println(res);
    }
    public static ArrayList<String> gss(String s){
        if(s.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        ArrayList<String> rss = gss(ros);

        ArrayList<String> myss = new ArrayList<>();

        for(String ans:rss){
            myss.add(""+ans);
        }
        for(String ans:rss){
            myss.add(ch+ans);
        }
        return myss;
    }
}
