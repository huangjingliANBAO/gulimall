package com.hd.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-12 21:00:54
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

