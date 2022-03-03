package com.zlz.basic.enums;

/**
 * 是否删除
 *
 * @author peeterZ
 * @version 2.0 CreateTime:2021-02-04 11:08
 */
public enum DeletedStatusEnum {
    /**
     * 已删除
     */
    DELETED(1, "已删除"),
    /**
     * 未删除
     */
    NOT_DELETED(0, "未删除");

    private Integer code;
    private String name;

    private DeletedStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
