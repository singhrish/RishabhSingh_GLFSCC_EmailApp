package emailapp_service;

import emailapp_model.Employee;

public interface CredentialService {

    public String emailGenerator(Employee employee, String department) ;

    public String passwordGenerator() ;

    public void displayCredentials(Employee employee, String department) ;
    
}