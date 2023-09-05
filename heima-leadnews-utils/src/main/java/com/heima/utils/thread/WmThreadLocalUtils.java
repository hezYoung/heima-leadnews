/**
 * 1. @ClassName WmThreadLocalUtil
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/5 11:13
 */
package com.heima.utils.thread;

import com.heima.model.wemedia.pojos.WmUser;

public class WmThreadLocalUtils {

    private final static ThreadLocal<WmUser> WM_USER_THREAD_LOCAL = new ThreadLocal<>();

    /**
     * 添加用户
     * @param wmUser
     */
    public static void  setUser(WmUser wmUser){
        WM_USER_THREAD_LOCAL.set(wmUser);
    }

    /**
     * 获取用户
     */
    public static WmUser getUser(){
        return WM_USER_THREAD_LOCAL.get();
    }

    /**
     * 清理用户
     */
    public static void clear(){
        WM_USER_THREAD_LOCAL.remove();
    }
}