package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Leaveword;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-10:22
 */
public interface LeavewordMapper {

//添加留言
    int addLeaveWord(Leaveword leaveword);

}