package org.pms.orm.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jaliya on 8/1/17.
 */


@Entity
@Table(name="login")
public class Login implements Serializable {

    private static final long serialVersionUID = -7988799579036225137L;

    @Id
    private String login_id;

    @Column
    private String username;

    @Column
    private String password;

    public Login() {
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }
}
