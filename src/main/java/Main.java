import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // States
        ReservedNameSM reservedState = ReservedNameSM.S0;
        NamingRulesSM namingState = NamingRulesSM.Start;

        // Getting user input
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter variable name:");
        String variableName = myObj.nextLine();

        // Verifies length
        if(variableName.length() <= 31){
            // Verifies if variable name has restricted characters or if the name is a reserved word
            for(int i = 0; i < variableName.length(); i++){
                reservedState = reservedState.nextState(variableName.charAt(i));
                namingState = namingState.nextState(variableName.charAt(i));
                if(namingState.isOver()){
                    System.out.println("Naming conventions not followed!");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("Number of characters reached!");
            System.exit(0);
        }
        if(reservedState.isOver()){
            System.out.println("You used a reserved name!");
        }else {
            System.out.println("Variable name accepted!");
        }
        myObj.close();
    }
}


