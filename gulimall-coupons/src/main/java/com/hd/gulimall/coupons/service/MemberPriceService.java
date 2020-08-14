package com.hd.gulimall.coupons.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.coupons.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-14 10:03:37
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

