package emailapp_main;

import java.util.Scanner;

import javax.security.auth.login.CredentialException;

import emailapp_model.Employee;
import emailapp_service.CredentialService;
import emailapp_service.credentialServiceImpl;

public class EmailApp {

    public static void main(String[] args) {
        CredentialService service = new credentialServiceImpl() ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the First Name");
        String firstName = sc.next();

        System.out.println("Enter the Last Name");
        String lastName = sc.next();

        Employee employee = new Employee(firstName, lastName);
   
        String dept = null ;

        service.passwordGenerator();

        System.out.println("Please enter the Department : ");
        System.out.println("Press 1 for Technical.");
        System.out.println("Press 2 for Admin.");
        System.out.println("Press 3 for Sales.");
        System.out.println("Press 4 for Human Resources.");

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt() ;

        switch(choice)
        {
            case 1 :
                dept = "Tech" ;
                break ;

            case 2 :
                dept = "Admin" ;
                break ;

            case 3 :
                dept = "Sales" ;  
                break ;

            case 4 :
                dept = "HR" ; 
                break ; 
            
                default:
                System.out.println("Please enter correct choice : ");
                break ;
        }
        service.emailGenerator(employee, dept) ;
        service.displayCredentials(employee, dept);
    } 
}