package com.iuroc.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.iuroc.demo.model.User;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM `user` WHERE `id` = #{id}")
    User selectById(int id);

    @Select("SELECT * FROM `user` WHERE `name` = ${name}")
    User selectByName(String name);

    @Insert("INSERT INTO `user` (`name`, `age`) VALUES (#{name}, #{age})")
    void insert(User user);

    @Delete("DELETE FROM `user` WHERE `id` = #{id}")
    void deleteById(int id);

    @Update("UPDATE `user` SET `name` = #{user.name}, `age` = #{user.age} WHERE `id` = #{user.id}")
    void update(User user);

    @Update("UPDATE `user` SET `name` = #{name} WHERE `id` = #{id}")
    void updateName(String name, int id);

    @Update("UPDATE `user` SET `age` = #{age} WHERE `id` = #{id}")
    void updateAge(int age, int id);
}
