package org.cdit.cmo;

import org.cdit.cmo.user.UserDemog;
import org.cdit.cmo.user.UserRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by admin on 07/04/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepoTest {

    @Autowired
    UserRepo userRepo;

    @Test
    public void testUserCreation(){
        java.util.Date udt = new java.util.Date();
        Date dt =new Date(udt.getTime());
        UserDemog ug = new UserDemog("Ram",dt,43 );
        userRepo.save(ug);
    }


    @Test
    public void testFindUserByAge(){
        UserDemog ug = userRepo.findByAge(43);
        Assert.assertNotNull(ug);
        System.out.println("U name:" + ug.getName());
    }


    @Test
    public void testFindByNameLike(){

        List<UserDemog> uList = userRepo.findByNameLike("Raj%");
        Assert.assertTrue(uList.size() > 1);
        uList.stream().forEach(e -> { System.out.println(e.getName());});
    }

    @Test
    public void testSearchByName(){
        List<UserDemog> uList = userRepo.searchByName("Raj%");
        Assert.assertTrue(uList.size() > 1);
        uList.stream().forEach(e -> { System.out.println(e.getName());});
    }
}
