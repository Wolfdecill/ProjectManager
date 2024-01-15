/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author USER-PC
 */
public class Service_Implementation implements Service_Interface {

    @Override
    public boolean loginUser(String username, String password) {
    //Temporary
    if(username.equalsIgnoreCase("Wolfdecill") && password.equalsIgnoreCase("1")){
    return true;
    }
    
    
    return false;
    }

    @Override
    public boolean registerUser(String username, String password) {
    
        
    return false;
    }
    
}
