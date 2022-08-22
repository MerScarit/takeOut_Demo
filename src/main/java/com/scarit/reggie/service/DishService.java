package com.scarit.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scarit.reggie.dto.DishDto;
import com.scarit.reggie.entity.Dish;
import org.springframework.transaction.annotation.Transactional;

public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，要同是操作两张表dish，dishFlavor
    public void saveWithFlavor(DishDto dishDto);

    //更新菜品数据,同时插入菜品对应的口味数据
    public void updateWithFlavor(DishDto dishDto);

    //根据id查询菜品信息及其对应口味信息
    public DishDto getByIdWithFlavor(Long id);



    //根据id删除
    public void delete(Long id);

}
