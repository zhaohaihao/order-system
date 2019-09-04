package com.zhh.order.system.util;

import com.zhh.order.system.vo.ResultVO;

/**
 * @author zhh
 * @description 返回结果VO辅助类
 * @date 2019-09-05 01:07
 */
public class ResultVOUtil {

    /**
     * 成功(无返回数据)
     *
     * @return
     */
    public static ResultVO success() {
        return success(null);
    }

    /**
     * 成功(返回数据)
     *
     * @param object 返回数据
     * @return
     */
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    /**
     * 失败
     *
     * @param code 响应码
     * @param msg  响应信息
     * @return
     */
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
