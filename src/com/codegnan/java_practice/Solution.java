package com.codegnan.java_practice;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

public static boolean palindrome(String str){
	
	if(str == null){
        return false;
    }else{
        if(str.length()== 0){
            return false;
        }
    }
	
    int i= 0;
    int j= str.length()-1;
    
    
    
    while(i<j){
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }else{
            i+=1;
            j-=1;
        }
        
    }
    return true;
}
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        boolean res = palindrome(input.next());
        
        if(res == true){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
