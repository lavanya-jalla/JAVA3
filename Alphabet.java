public class Alphabet {
    int n=5;
    char ch='A';
    public void cal(){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();

        }

    }
    
}
class Test{
    public static void main(String[] args) {
        
    
    Alphabet obj=new Alphabet();
    obj.cal();

}
}
