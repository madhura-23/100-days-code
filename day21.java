public class day21{
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String t="";
        for(String st:str){
            StringBuilder m=new StringBuilder(st);
            t+=m.reverse().toString();
            t+=" ";
        }
        return t.trim();
    }
}

    

