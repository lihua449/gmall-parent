package com.atguigu.gmall.search.repository;

import com.atguigu.gmall.search.bean.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: 李耀华
 * @date: 2022/9/3 22:46
 */
@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
}
