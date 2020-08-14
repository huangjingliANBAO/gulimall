package com.hd.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-12 21:00:54
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

