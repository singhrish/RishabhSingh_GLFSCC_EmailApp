package emailapp_service;

import java.util.Random;

import emailapp_model.Employee;

public class credentialServiceImpl implements CredentialService {


    @Override
    public String passwordGenerator() {
        String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "01223456789";
        String symbols = "~!@#$%^&*()_+=-<,|>./" ;
        String values = capChars + smallChars + numbers + symbols ;

        Random random = new Random() ;
        char [] password = new char[8];

        for (int i = 0 ; i < 8 ; i++ )
        {
            int randomNumber = random.nextInt(values.length()) ;
            password[i] = values.charAt(randomNumber);
        }
        return new String(password);
    }

    @Override
    public String emailGenerator(Employee employee, String department) {
        return ( employee.getFirstName() + 
                 employee.getLastName()).toLowerCase() +
                 "@" +
                 department + 
                 ".xyz.com" ;
    }

    @Override
    public void displayCredentials(Employee employee, String department) {
        // TODO Auto-generated method stub
        System.out.println(
            "Dear, " + 
            employee.getFirstName() + " " +
            employee.getLastName() + " " +
            "your generated Credentials are : " ) ;

            System.out.println("Email : " + emailGenerator(employee, department));
            System.out.println("Password : " + passwordGenerator());
        }

    
}
