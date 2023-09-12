/**
 * 1. @ClassName ApUserSearchController
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/12 14:58
 */
package com.heima.search.controller.v1;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.search.pojos.ApUserSearch;
import com.heima.search.service.ApUserSearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/history")
public class ApUserSearchController{


    @Autowired
    private ApUserSearchService apUserSearchService;

    @PostMapping("/load")
    public ResponseResult findUserSearch() {
        List<ApUserSearch> userSearch = apUserSearchService.findUserSearch();
        return ResponseResult.okResult(userSearch);
    }


}