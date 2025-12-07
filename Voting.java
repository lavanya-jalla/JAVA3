public class Voting {
    static void validate(int age) throws InvalidAgeException{

        if(age<18){
            throw new InvalidAgeException("UMDER AGE");
        }
        else{
            System.out.println("YOU ARE ELIGIBLE FOR VOTE");
        }
        
    }
    public static void main(String[] args) {
        try {
            
            validate(21);
            validate(16);
        } catch (Exception e) {
            System.err.println("Under Age");
        }
    }
    
}
