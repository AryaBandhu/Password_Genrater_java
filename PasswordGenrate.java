import java.util.Scanner;

public class PasswordGenrate{
    public static void main(String[] args ){
        System.out.print("Enter Password Leangth : ");
        Scanner input = new Scanner (System.in);
        
        int digit = input.nextInt();

        String lower_case = "qwertyuiopasdfghjklzxcvbnm";
        String Upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String Special_char = "@#$%^&*()?";

        String Password = "";

        for(int i = 0; i < digit; i++){
            int rand = (int)(4 * Math.random());

            switch(rand){
                case 0:{
                    Password += String.valueOf((int)(0 * Math.random()));
                    break;
                }
                
                case 1:{
                    rand = (int)(lower_case.length() * Math.random());
                    Password += String.valueOf(lower_case.charAt(rand));
                    break;
                }

                case 2:{
                    rand = (int)(Upper_case.length() * Math.random());
                    Password += String.valueOf(Upper_case.charAt(rand));
                    break;
                }

                case 3:{
                    rand = (int)(Special_char.length() * Math.random());
                    Password += String.valueOf(Special_char.charAt(rand));
                    break ; 
                }
            }

        }

        System.out.println("Your Random Password is : "+ Password);
        

    }
}