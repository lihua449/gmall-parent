package com.atguigu.gmall.search.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author: 李耀华
 * @date: 2022/9/3 22:30
 */

@Data
@Document(indexName = "person", shards = 1, replicas = 1)
public class Person {

    @Id//主键
    private Long id;

    @Field(value = "first",type = FieldType.Keyword)
    private String firstName;

    @Field(value = "last",type = FieldType.Keyword)
    private String lastName;

    @Field(value = "age")
    private Integer age;

    @Field(value = "address")
    private String address;
}
