package org.kgc.mapper;

import org.kgc.pojo.Stafinfo;
import java.util.List;

public interface StafinfoMapper {
    //多条件查询
    List<Stafinfo> selectByCondition(Stafinfo stafinfo);
}
