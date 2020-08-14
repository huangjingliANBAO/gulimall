package com.hd.gulimall.order.dao;

import com.hd.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-12 21:00:54
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
