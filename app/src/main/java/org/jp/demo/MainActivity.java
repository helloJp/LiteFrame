package org.jp.demo;

import org.jp.liteframe.SupportActivity;
import org.jp.liteframe.utils.Loger;

/**
 * 某日查看大牛的kymjs (https://github.com/kymjs)的KJFrame代码，深深觉得应该给自己来一套。
 * <p/>
 * 所以就把 KJFrame <https://github.com/kymjs/KJFrameForAndroid> 中关于UI部分的内容提取出来了，稍作修改。
 */
public class MainActivity extends SupportActivity {

    private long mTimes;

    @Override
    public void setRootView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initDataFromThread() {
        // super 方法不可省略，否则无法调用threadDataInited
        super.initDataFromThread();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 999999; i++) {
            Loger.debug(" ---- i >>>>" + i);
        }
        long end = System.currentTimeMillis();
        mTimes = end - start;
    }

    @Override
    protected void threadDataInited() {
        Loger.debug(" threadDataInited  ------- >>>" + mTimes);
    }

    @Override
    public void initData() {
        // TODO: 16/2/19 getIntent().getExtra
    }

    @Override
    public void initWidget() {
        // TODO: 16/2/19 init widget
    }
}
