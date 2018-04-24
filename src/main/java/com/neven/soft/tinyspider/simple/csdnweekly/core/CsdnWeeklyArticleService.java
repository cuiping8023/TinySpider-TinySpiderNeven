package com.neven.soft.tinyspider.simple.csdnweekly.core;

import java.util.List;

/**
 * 文章数据service
 * Created by Neven on 2017/3/11.
 */
public interface CsdnWeeklyArticleService {
    /**
     * 根据期号获取文章列表
     *
     * @param stage 期号
     * @return 文章列表
     */
    List<CsdnWeeklyArticleEntity> forWeekly(Integer stage) throws Exception;
}
