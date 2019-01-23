/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelcontrol;

import travelmodel.data_model_login;
/**
 *
 * @author Indra F
 */
public class controllogin {
    boolean succes = false;
    data_model_login contrologin = new data_model_login();

    public boolean login(String user, String pass) {
        if (contrologin.masuk(user, pass)) {
            succes = true;
            System.out.println("login berhasil");
        }
        return succes;
    }
}
