package org.spring.mybatis.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.spring.mybatis.dto.UserDto;

import java.util.List;

@Mapper //매퍼 설정 <-> xml
public interface UserRepository {

    //xml에서 maaper로 연결된 query를 가져온다
    void userInsert(UserDto userDto);


    @Insert("insert into User(email,password,name)" +
            " values(#{email},#{password},#{name})")
    void userInsert2(UserDto userDto);

    List<UserDto> userList();
}
