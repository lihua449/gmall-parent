package com.atguigu.gmall.search;

import com.atguigu.gmall.search.bean.Person;
import com.atguigu.gmall.search.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: 李耀华
 * @date: 2022/9/3 22:51
 */

@SpringBootTest
public class EsTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    public void saveTest(){
        Person person = new Person();
        person.setId(1L);
        person.setFirstName("小蓝");
        person.setLastName("娴娴");
        person.setAge(18);
        person.setAddress("重庆市");

        personRepository.save(person);

        System.out.println("完成......");
    }
}
