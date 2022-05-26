package com.zlz.basic.trace;

/**
 * @author zhulinzhong
 * @date 2022-03-07 20:07:40
 */
public class TraceContext {

    private TraceContext() {
    }

    public static final ThreadLocal<Trace> TRACE = new ThreadLocal<>();

    /**
     * 请求开始获取并保存用户信息
     * @param trace
     */
    public static void init(Trace trace) {
        TRACE.set(trace);
    }

    /**
     * TraceId
     * @return
     */
    public static Long getTraceId() {
        Trace trace = TRACE.get();
        if (null == trace) {
            return null;
        }
        return trace.getTraceId();
    }

    /**
     * 用户id
     * @return
     */
    public static Long getUserId() {
        Trace trace = TRACE.get();
        if (null == trace) {
            return 10086L;
        }
        return trace.getUserId();
    }

    /**
     * 请求完成销毁用户信息
     */
    public static void destroy() {
        TRACE.remove();
    }

}
