package com.sskjdata.wms.vo;

import com.sskjdata.wms.utils.ConstantsUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

/**
 * @Description
 * @Date 2021/1/15 16:14
 * @Created by meijunjie
 */
//返回数据
public class R extends HashMap<String,Object> {

    private static final long serialVersionUID = 1L;

    public R() {
        put("code", "001");
    }

    /**
     * 请求结果信息
     *
     * @param code 响应码
     * @param data 响应数据
     * @param msg  相信信息说明
     */
    private R(String code, Object data, String msg) {

        setProduct(data);
        setCode(code);
        setMsg(msg);
    }

    /**
     * 请求失败
     *
     * @return
     */
    public static R error() {
        return newInstance(ConstantsUtil.CommonCode.ERROR_CODE, "", ConstantsUtil.CommonMessage.ERROR_MESSAGE);
    }

    /**
     * 请求失败
     *
     * @param msg 自定义异常信息
     * @return
     */
    public static R error(String msg) {
        return newInstance(ConstantsUtil.CommonCode.ERROR_CODE, "", msg);
    }

    /**
     * 请求失败
     *
     * @param code 自定义异常编码
     * @param msg  自定义异常信息
     * @return
     */
    public static R error(String code, String msg) {
        return newInstance(code, "", msg);
    }

    /**
     * 请求成功
     *
     * @param data 响应数据
     * @return
     */
    public static R success(Object data) {
        return newInstance(ConstantsUtil.CommonCode.SUCCESS_CODE, data, ConstantsUtil.CommonMessage.SUCCESS_MESSAGE);
    }

    /**
     * 请求结果,errMsg不为空则返回请求失败，errMsg为空则返回成功，
     *
     * @param errMsg 错误消息
     * @param data   结果数据
     * @return
     */
    public static R restul(String errMsg, Object data) {
        if (StringUtils.isNotBlank(errMsg)) {
            return error(errMsg);
        } else {
            return success(data);
        }
    }


    /**
     * 请求成功
     *
     * @return
     */
    public static R success() {
        return newInstance(ConstantsUtil.CommonCode.SUCCESS_CODE, "", ConstantsUtil.CommonMessage.SUCCESS_MESSAGE);
    }

    /**
     * 自定义结果信息
     *
     * @param key   属性名称
     * @param value 结果数据
     * @return
     */
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    /**
     * 设置响应结果状态码
     *
     * @param code 请求结果状态码
     * @return
     */
    public R setCode(String code) {
        put("code", code);
        return this;
    }

    /**
     * 设置响应数据
     *
     * @param data 结果数据
     * @return
     */
    public R setProduct(Object data) {
        put("product", data);
        return this;
    }

    /**
     * 设置响应结果信息
     *
     * @param msg 请求结果信息说明
     * @return
     */
    public R setMsg(String msg) {
        if (null == msg) {
            put("msg", "");
        } else {
            put("msg", msg);
        }
        return this;
    }

    public static R newInstance(String code, Object data, String msg) {
        return new R(code, data, msg);
    }

}
