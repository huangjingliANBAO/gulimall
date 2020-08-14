package com.hd.gulimall.coupons.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.coupons.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-14 10:03:37
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

