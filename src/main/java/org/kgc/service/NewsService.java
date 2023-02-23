package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.NewsMapper;
import org.kgc.pojo.News;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-11:59
 */
public class NewsService implements NewsMapper{



    @Override
    public int addNews(News news) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        NewsMapper mapper = session.getMapper(NewsMapper.class);
        int i = mapper.addNews(news);
        if(i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        session.close();
        return i;
    }


    @Override
    public List<News> getNewsByNewsstate() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        NewsMapper mapper = session.getMapper(NewsMapper.class);
        List<News> newsByNewsstate = mapper.getNewsByNewsstate();
        session.close();
        return newsByNewsstate;
    }

    @Override
    public News getNewsByNewsid(int newsid) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        NewsMapper mapper = session.getMapper(NewsMapper.class);
        News newsByNewsid = mapper.getNewsByNewsid(newsid);
        session.close();
        return newsByNewsid;
    }

    @Override
    public int updateNews(News news) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        NewsMapper mapper = session.getMapper(NewsMapper.class);
        int i = mapper.updateNews(news);
        if(i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        session.close();
        return i;
    }
}
