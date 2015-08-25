/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import valueObject.VOLogin;

/**
 *
 * @author mateus
 */
public class PersLogin extends PGConnection {

    private VOLogin voLogin;

    public PersLogin(VOLogin voLogin) {
        this.voLogin = voLogin;
    }

    public boolean verificarLogin() {
        boolean result = false;

        conectar();

        try {
            PreparedStatement st = getDb().prepareStatement("SELECT * FROM LOGIN WHERE LOGIN_NOME = ?");
            st.setString(1, voLogin.getLogin());
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                if (rs.getString(rs.findColumn("LOGIN_NOME")).equals(voLogin.getLogin())) {
                    result = true;
                }
            }

            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(PGConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        desconectar();
        return result;
    }
}
