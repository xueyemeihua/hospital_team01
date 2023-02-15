package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.News;

import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-11:45
 */
public interface NewsMapper {

    int addNews(News news);
    List<News> getNewsByNewsstate();
    News getNewsByNewsid(int newsid);
    int updateNews(News news);


}
