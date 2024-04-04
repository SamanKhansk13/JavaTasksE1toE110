package org.example.e99;

public class E99StringManipulations {
    public static void main(String[] args) {
  /*
        // Using StringBuilder
        String strOriginal="RACEcar";
        String strOrgLower=strOriginal.toLowerCase();
        StringBuilder str=new StringBuilder(strOrgLower);
        str.reverse();
        String reversedStr=str.toString();
        if (strOrgLower.equals(reversedStr)){
            System.out.println("The word is palindrome");
        }else {
            System.out.println("This word is not palindrome");
        }
   */

        // Using string
        String strOriginal1 = "Bob";
        String strOrgLower1 = strOriginal1.toLowerCase().replace(" ","");
        //System.out.println(strOrgLower1);
        Boolean isPalindrome=true;
        String rev="";
        for (int i = strOrgLower1.length()- 1; i >= 0; i--) {
            //System.out.println(i);
            rev=rev + strOrgLower1.charAt(i);
        }
       // System.out.println(rev);
        if (strOrgLower1.equals(rev)){
                System.out.println("In:"+ isPalindrome);
        }else {
                System.out.println("In:"+ !isPalindrome);
        }
}

}


