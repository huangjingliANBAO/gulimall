package com.hd.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-13 08:37:33
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

