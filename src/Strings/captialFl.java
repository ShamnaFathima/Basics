package Strings;

public class captialFl {
    public static void main(String[] args) {
        String str="hello world";
        String[] str1=str.split(" ");
        String result="";
        for (String words:str1) {
            int len=str.length();
            if(len==1){
                result+=Character.toUpperCase(words.charAt(0))+" ";
            }else{
                char first=Character.toUpperCase(words.charAt(0));
                char last=Character.toUpperCase(words.charAt(len-1));
                String middle=str.substring(1,len-1);
                result+=first+middle+last+" ";
            }
        }
        System.out.println(result.trim());
    }
}
