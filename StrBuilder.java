

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("lavanya");
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));
        // sb.setCharAt(1,'r');
        // System.out.println(sb);
        // sb.insert(0, 'K');
        // System.out.println(sb);
        // sb.delete(3, 4);
        // System.out.println(sb);
        // sb.append("h");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
            


        }
        System.out.println(sb);

    }
    
}
