package com.hd.gulimall.coupons.dao;

import com.hd.gulimall.coupons.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-14 10:03:37
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
