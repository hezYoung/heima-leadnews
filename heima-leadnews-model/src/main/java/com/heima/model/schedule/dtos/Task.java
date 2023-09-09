/**
 * 1. @ClassName Task
 * 2. @Description TODO
 * 3. @Author Young
 * 4. @Date 2023/9/9 21:39
 */
package com.heima.model.schedule.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Task implements Serializable {

    /**
     * 任务id
     */
    private Long taskId;
    /**
     * 类型
     */
    private Integer taskType;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 执行id
     */
    private long executeTime;

    /**
     * task参数
     */
    private byte[] parameters;

}