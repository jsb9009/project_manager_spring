package org.pms.core.util;

import org.pms.orm.model.Employee;
import org.springframework.stereotype.Component;

/**
 * Created by jaliya on 8/17/17.
 */

@Component
public class LoggedUser {
    public static Employee loggedEmployee;

    public static Employee getLoggedEmployee() {

        return loggedEmployee;
    }

    public static void setLoggedEmployee(Employee loggedEmployee) {

        LoggedUser.loggedEmployee = loggedEmployee;
    }
}
