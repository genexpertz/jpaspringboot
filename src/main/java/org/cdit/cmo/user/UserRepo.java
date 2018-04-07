package org.cdit.cmo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by admin on 07/04/18.
 */

public interface UserRepo extends JpaRepository<UserDemog, Integer> {

    UserDemog findByAge(int age);
    List<UserDemog> findByNameLike(String name);

    @Query("select u from UserDemog u where u.name like %?1%")
    List<UserDemog> searchByName(String name);

}
