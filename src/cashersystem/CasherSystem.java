/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashersystem;

/**
 *
 * @author KazSoftWare
 */
public class CasherSystem {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       LoginPage test=new LoginPage();
       RigsterFrom test2=new RigsterFrom();
       test.setVisible(true);
       test.setSize(900,620);
       test.setResizable(false);
    }
    
}
