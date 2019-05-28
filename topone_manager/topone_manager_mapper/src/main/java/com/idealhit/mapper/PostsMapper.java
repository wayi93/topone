package com.idealhit.mapper;

import com.idealhit.pojo.Posts;
import com.idealhit.pojo.PostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostsMapper {
    int countByExample(PostsExample example);

    int deleteByExample(PostsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Posts record);

    int insertSelective(Posts record);

    List<Posts> selectByExampleWithBLOBs(PostsExample example);

    List<Posts> selectByExample(PostsExample example);

    Posts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByExampleWithBLOBs(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByExample(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKeyWithBLOBs(Posts record);

    int updateByPrimaryKey(Posts record);
}