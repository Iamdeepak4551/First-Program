package com.Deepak;

public class SearchInString {
    static void main(String[] args) {
        String name = "deepak";
        char target = 'p';
        System.out.println(Search(name , target));
    }
    static boolean Search(String str , char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i));
            return true;
        }
        return false;
    }
}
