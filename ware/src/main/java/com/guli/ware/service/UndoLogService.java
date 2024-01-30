package com.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author csy
 * @email Yixxxiu@gmail.com
 * @date 2024-01-29 18:02:31
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

