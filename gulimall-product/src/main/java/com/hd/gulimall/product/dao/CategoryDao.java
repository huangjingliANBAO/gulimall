package com.hd.gulimall.product.dao;

import com.hd.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-13 08:37:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
