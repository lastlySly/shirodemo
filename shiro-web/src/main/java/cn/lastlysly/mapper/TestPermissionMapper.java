package cn.lastlysly.mapper;

import cn.lastlysly.pojo.TestPermission;
import cn.lastlysly.pojo.TestPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestPermissionMapper {
    long countByExample(TestPermissionExample example);

    int deleteByExample(TestPermissionExample example);

    int insert(TestPermission record);

    int insertSelective(TestPermission record);

    List<TestPermission> selectByExample(TestPermissionExample example);

    int updateByExampleSelective(@Param("record") TestPermission record, @Param("example") TestPermissionExample example);

    int updateByExample(@Param("record") TestPermission record, @Param("example") TestPermissionExample example);
}