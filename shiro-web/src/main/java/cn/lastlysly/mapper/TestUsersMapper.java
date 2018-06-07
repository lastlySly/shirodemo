package cn.lastlysly.mapper;

import cn.lastlysly.pojo.TestUsers;
import cn.lastlysly.pojo.TestUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestUsersMapper {
    long countByExample(TestUsersExample example);

    int deleteByExample(TestUsersExample example);

    int insert(TestUsers record);

    int insertSelective(TestUsers record);

    List<TestUsers> selectByExample(TestUsersExample example);

    int updateByExampleSelective(@Param("record") TestUsers record, @Param("example") TestUsersExample example);

    int updateByExample(@Param("record") TestUsers record, @Param("example") TestUsersExample example);
}