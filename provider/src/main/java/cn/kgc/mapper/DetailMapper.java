package cn.kgc.mapper;

import cn.kgc.vo.Detail;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DetailMapper {
    public List<Map<String, Object>> findAll(@Param("title") String title, @Param("categoryId") Integer categoryId);
}
