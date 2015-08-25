/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import valueObject.VOLogin;

/**
 *
 * @author mateus
 */
public class PersLogin {

    private VOLogin voLogin;

    public PersLogin() {
    }

    public PersLogin(VOLogin voLogin) {
        this.voLogin = voLogin;
    }

    public boolean verificarLogin() {
        System.out.println("login:" + voLogin.getLogin());
        return true;
    }
}
