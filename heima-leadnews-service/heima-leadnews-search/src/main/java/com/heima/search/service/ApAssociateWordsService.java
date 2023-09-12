/**
 * 1. @ClassName ApAssociateWordsService
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/12 15:43
 */
package com.heima.search.service;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     联想词
     @param userSearchDto
     @return
     */
    ResponseResult findAssociate(UserSearchDto userSearchDto);

}
