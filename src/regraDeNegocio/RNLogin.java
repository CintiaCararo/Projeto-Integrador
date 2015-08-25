/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraDeNegocio;

import persistencia.PersLogin;
import valueObject.VOLogin;

/**
 *
 * @author mateus
 */
public class RNLogin {

    private VOLogin voLogin;

    public RNLogin() {
    }

    public RNLogin(VOLogin voLogin) {
        this.voLogin = voLogin;
    }

    public boolean validar() {
        if (voLogin.getLogin().equals("")){
            return false;
        }
        PersLogin persLogin = new PersLogin(voLogin);
        return persLogin.verificarLogin();
    }
}
