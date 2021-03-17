import java.util.Scanner;

public class Main {
    public enum NameState{
        s0,
        s1,
        s2,
        s3,
        s4
    }
    public static void main(String[] args) {
        NameState state = NameState.s0;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter variable name:");

        String variableName = myObj.nextLine();
        if(variableName.length() <= 31){
            for(int i = 0; i < variableName.length(); i++){
                if(!Character.isLetter(variableName.charAt(i)) && !Character.isDigit(variableName.charAt(i)) && variableName.charAt(i) != 95){
                    System.out.println("Character must be a number, a letter or an underscore!");
                    System.exit(0);
                }
            }
            if(taskMachine()){
                System.out.println("Variable name accepted");
            }else {
                System.out.println("Variable name not accepted");
            }
        }else{
            System.out.println("Number of characters reached!");
            System.exit(0);
        }
    }

    private static boolean taskMachine() {
        return true;
    }

}


