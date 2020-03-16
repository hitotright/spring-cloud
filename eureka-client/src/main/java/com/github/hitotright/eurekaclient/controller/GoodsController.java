package com.github.hitotright.eurekaclient.controller;

import com.github.hitotright.eurekaclient.entity.Goods;
import com.github.hitotright.eurekaclient.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品表(Goods)表控制层
 *
 * @author makejava
 * @since 2020-03-16 14:35:32
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public Goods selectOne(@PathVariable Integer id) {
        return this.goodsService.queryById(id);
    }

}