package cn.kgc.controller;

import cn.kgc.service.CategoryService;
import cn.kgc.service.DetailService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class DetailController {
    @Resource
    private DetailService detailService;

    @Resource
    private CategoryService categoryService;

    @RequestMapping("/findAll.do")
    public PageInfo<Map<String, Object>> findAll(@RequestParam(defaultValue = "1", required = false) Integer pageNo,
                                                 @RequestParam(defaultValue = "", required = false) String title,
                                                 @RequestParam(defaultValue = "", required = false) Integer categoryId) {

        return detailService.findAll(pageNo, title, categoryId);
    }

    @RequestMapping("/findAllCategory.do")
    public List<Map<String, Object>> findAllCategory() {

        return categoryService.findAllCategory();
    }
}
