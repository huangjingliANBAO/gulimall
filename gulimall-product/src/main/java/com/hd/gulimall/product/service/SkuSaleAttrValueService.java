package com.hd.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.utils.PageUtils;
import com.hd.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author hd
 * @email 2368046759@qq.com
 * @date 2020-08-13 08:37:33
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

