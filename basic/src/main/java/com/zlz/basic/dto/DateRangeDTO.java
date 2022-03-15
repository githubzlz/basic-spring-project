package com.zlz.basic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhulinzhong
 * @date 2022-03-14 18:04:15
 */
@Data
@AllArgsConstructor
public class DateRangeDTO {

    private Long start;

    private Long end;
}
