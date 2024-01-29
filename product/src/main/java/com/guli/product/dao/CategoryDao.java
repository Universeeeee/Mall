package com.guli.product.dao;

import com.guli.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author csy
 * @email Yixxxiu@gmail.com
 * @date 2024-01-26 17:06:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
