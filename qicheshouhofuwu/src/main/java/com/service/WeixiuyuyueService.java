package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiuyuyueEntity;
import java.util.Map;

/**
 * 维修预约 服务类
 */
public interface WeixiuyuyueService extends IService<WeixiuyuyueEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}