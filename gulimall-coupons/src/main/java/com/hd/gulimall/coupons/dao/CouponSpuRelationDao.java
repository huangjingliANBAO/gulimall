package com.hd.gulimall.coupons.dao;

import com.hd.gulimall.coupons.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-14 10:03:37
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
