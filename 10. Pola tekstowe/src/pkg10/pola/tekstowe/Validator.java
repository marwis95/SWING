/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pola.tekstowe;

/**
 *
 * @author Dell E5510
 */
public class Validator {
    private static final String login = "marwis95";
    private static final String pass = "1234";
    
    public static boolean auth(String l, String p){
        if(Validator.login.equals(l) && Validator.pass.equals(p)){
            return true;
        }else{
            return false;
        }
    }
    
}
