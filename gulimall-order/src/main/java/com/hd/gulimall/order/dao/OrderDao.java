package com.hd.gulimall.order.dao;

import com.hd.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-12 21:00:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
