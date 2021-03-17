import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // State
        NameState state = NameState.S0;

        // Getting user input
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter variable name:");
        String variableName = myObj.nextLine();

        // Checking if var name starts correctly
        if(!Character.isLetter(variableName.charAt(0)) && variableName.charAt(0) != 95){
            System.out.println("Variable name must start with a letter or an underscore!");
            System.exit(0);
        }

        // Verifies length
        if(variableName.length() <= 31){

            // Verifies if variable name has restricted characters or if the name is a reserved word
            for(int i = 0; i < variableName.length(); i++){
                if(!Character.isLetter(variableName.charAt(i)) && !Character.isDigit(variableName.charAt(i)) && variableName.charAt(i) != 95){
                    System.out.println("Character must be a number, a letter or an underscore!");
                    System.exit(0);
                }else {
                    state = state.nextState(variableName.charAt(i));
                    if(state.isOver()){
                        System.out.println("You used a reserved name!");
                        System.exit(0);
                    }
                }
            }
        }else{
            System.out.println("Number of characters reached!");
            System.exit(0);
        }
        System.out.println("Variable name accepted!");
    }
}


