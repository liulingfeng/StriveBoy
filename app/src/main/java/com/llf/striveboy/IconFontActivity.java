package com.llf.striveboy;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by llf on 2016/6/23.
 * 使用图标字体，很大程度上减小app的大小
 * 具体用法参考http://www.iconfont.cn/help/iconuse.html
 *
 * 一定要注意Android Studio中的assets文件要建在main之下，而不是res下面。
 */
public class IconFontActivity extends Activity{
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iconfont);

        tv = (TextView)findViewById(R.id.like);
        Typeface iconfont = Typeface.createFromAsset(getAssets(), "iconfont.ttf");
        tv.setTypeface(iconfont);
        tv.setTextColor(getResources().getColor(R.color.colorAccent));
        tv.setTextSize(60);
    }
}
