package org.cdit.cmo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by admin on 07/04/18.
 */
public class BCryptPass {
    public static void main(String[] args) {
        BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
        String r = pe.encode("raj");
        System.out.println(r);

    }
}
