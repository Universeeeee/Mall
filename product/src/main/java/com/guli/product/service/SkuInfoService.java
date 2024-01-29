package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author csy
 * @email Yixxxiu@gmail.com
 * @date 2024-01-26 17:06:56
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

