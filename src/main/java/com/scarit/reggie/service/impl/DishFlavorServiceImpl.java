package com.scarit.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scarit.reggie.entity.DishFlavor;
import com.scarit.reggie.mapper.DishFlavorMappper;
import com.scarit.reggie.service.DishFlavorService;
import com.scarit.reggie.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMappper, DishFlavor> implements DishFlavorService {
}
