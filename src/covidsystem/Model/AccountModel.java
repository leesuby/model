/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package covidsystem.Model;

/**
 *
 * @author Admin
 */
public class AccountModel {
    String username;
    String password;
    
    public AccountModel(String u,String p){
        username=u;
        password=p;
    }
    
    //public void verify(); check username and password on database
    
    //public int changePassword(); 
}
