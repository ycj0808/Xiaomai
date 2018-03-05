package com.topschool.xm.dao.orderfood;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.topschool.xm.model.scratchcard.Brand;
import org.springframework.stereotype.Component;


/**
 * @author 小强
 */
@Component
public interface BrandDao {

    int insert(@Param("pojo") Brand pojo);

    int insertList(@Param("pojos") List< Brand> pojo);

    List<Brand> select(@Param("pojo") Brand pojo);

    Brand selectById(long id);

    Brand selectTodaySelect();

    int update(@Param("pojo") Brand pojo);

}
