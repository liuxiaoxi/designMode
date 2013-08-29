package com.lxx.prototype;

import java.io.Serializable;

/**
 * 
 * @description:金箍棒类 
 * @author： lxx.sking
 * @created: 2013-7-31 上午10:42:11 
 * @version：$Id$ 
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,Ltd.All Rights Reserved.
 */
public class GoldRingedStaff implements Serializable {
    private float height = 100.0f;
    private float diameter = 10.0f;
    /**
     * 增长行为，每次调用长度和半径增加一倍
     */
    public void grow(){
        this.diameter *= 2;
        this.height *= 2;
    }
    /**
     * 缩小行为，每次调用长度和半径减少一半
     */
    public void shrink(){
        this.diameter /= 2;
        this.height /= 2;
    }
}