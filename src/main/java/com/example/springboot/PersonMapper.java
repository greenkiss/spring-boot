package com.example.springboot;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PersonMapper {
    @Select("select * from person where id = #{id} ")
    Person selectPerson(int id);
}
