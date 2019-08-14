package com.kyne.dao;

import com.kyne.pojo.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);
//对于createTIme和UpdateTime 交给数据库处理 now()函数(MySQL)
    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}