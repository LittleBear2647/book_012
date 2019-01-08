package cn.kgc.service;

import cn.kgc.vo.Detail;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DetailService {
    public PageInfo<Map<String, Object>> findAll(Integer pageNo, String title, Integer categoryId);
}
