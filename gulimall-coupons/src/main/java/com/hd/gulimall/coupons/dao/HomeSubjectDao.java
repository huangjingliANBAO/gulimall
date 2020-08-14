package com.hd.gulimall.coupons.dao;

import com.hd.gulimall.coupons.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-14 10:03:37
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
