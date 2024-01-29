package com.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author csy
 * @email Yixxxiu@gmail.com
 * @date 2024-01-29 17:55:24
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

