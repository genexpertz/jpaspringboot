package org.cdit.cmo.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 07/04/18.
 */

public interface LoginRepo extends JpaRepository<LoginDetails, String> {
    Object findByLoginName(String loginName);
}
