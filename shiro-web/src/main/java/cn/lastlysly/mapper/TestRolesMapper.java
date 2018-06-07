package cn.lastlysly.mapper;

import cn.lastlysly.pojo.TestRoles;
import cn.lastlysly.pojo.TestRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestRolesMapper {
    long countByExample(TestRolesExample example);

    int deleteByExample(TestRolesExample example);

    int insert(TestRoles record);

    int insertSelective(TestRoles record);

    List<TestRoles> selectByExample(TestRolesExample example);

    int updateByExampleSelective(@Param("record") TestRoles record, @Param("example") TestRolesExample example);

    int updateByExample(@Param("record") TestRoles record, @Param("example") TestRolesExample example);
}