package com.hhh.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.common.utils.PageUtils;
import com.hhh.common.utils.Query;

import com.hhh.mall.product.dao.CategoryDao;
import com.hhh.mall.product.entity.CategoryEntity;
import com.hhh.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查询所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        // 组装父子结构
        // 1. 找到所有1级分类
        List<CategoryEntity> level1 = entities.stream().filter(entity -> entity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildren(menu, entities));
                    return menu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0: menu1.getSort())  - (menu2.getSort() == null ? 0: menu2.getSort());
                })
                .collect(Collectors.toList());


        return level1;
    }

    // 查询子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream().filter(menu -> menu.getParentCid() == root.getCatId())
                .map(entity -> {
                    entity.setChildren(getChildren(entity, all));
                    return entity;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0: menu1.getSort())  - (menu2.getSort() == null ? 0: menu2.getSort());
                })
                .collect(Collectors.toList());
    }
}