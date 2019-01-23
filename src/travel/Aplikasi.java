/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Indra F
 */
public class Aplikasi {
        
    ArrayList<kendaraan> dbPetugas = new ArrayList<kendaraan>();

    Scanner logS;
    
    public void mainMenu(){
        
        Scanner sc = new Scanner(System.in);
        this.logS = sc;
        int log=0;
        do{
           // menuAwal(); 
        }while(log!=0);
            
    }
}
