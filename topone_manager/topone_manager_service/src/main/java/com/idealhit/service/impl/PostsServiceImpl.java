package com.idealhit.service.impl;

import com.idealhit.mapper.PostsMapper;
import com.idealhit.pojo.Posts;
import com.idealhit.pojo.PostsExample;
import com.idealhit.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    PostsMapper postsMapper;

    @Override
    public Posts getPostById(Integer id){

        PostsExample postsExample = new PostsExample();

        // 创建对象 填充条件
        PostsExample.Criteria criteria = postsExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<Posts> postsList = postsMapper.selectByExample(postsExample);

        if(postsList != null){
            return postsList.get(0);
        }

        return null;

    }

}
