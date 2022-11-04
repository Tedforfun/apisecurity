package edu.nyit.apiproxy.dao;

import edu.nyit.apiproxy.entity.BlockList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangtao
 * @date 2022/11/3 18:27
 */
@Mapper
@Repository
public interface ApiMapper {

    /**
     * 获取所有的黑名单内容
     * @return
     */
    List<BlockList> queryAllBlockList();
}
