package com.larkmidtable.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.larkmidtable.admin.entity.JobDatasource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * jdbc数据源配置表数据库访问层
 *
 * @author zhouhongfa@gz-yibo.com
 * @version v1.0
 * @since 2019-07-30
 */
@Mapper
public interface JobDatasourceMapper extends BaseMapper<JobDatasource> {
    int update(JobDatasource datasource);

    JobDatasource getDataSourceById(Long id);

    List<JobDatasource> findDataSourceName();

}
