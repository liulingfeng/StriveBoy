package com.llf.striveboy;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Dialog mDialog = null;
    private TextView tv_1,tv_2,tv_3,tv_4,tv_5,tv_6,tv_7,tv_8,tv_9,tv_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_1 = (TextView)findViewById(R.id.tv_1);
        tv_2 = (TextView)findViewById(R.id.tv_2);
        tv_3 = (TextView)findViewById(R.id.tv_3);
        tv_4 = (TextView)findViewById(R.id.tv_4);
        tv_5 = (TextView)findViewById(R.id.tv_5);
        tv_6 = (TextView)findViewById(R.id.tv_6);
        tv_7 = (TextView)findViewById(R.id.tv_7);
        tv_9 = (TextView)findViewById(R.id.tv_9);
        tv_8 = (TextView)findViewById(R.id.tv_8);
        tv_10 = (TextView)findViewById(R.id.tv_10);
        init();
    }

    private void init(){
        //SpannableString其实和String一样，都是一种字符串类型
        SpannableString spannableString = new SpannableString("设置文字的前景色为蓝色");
        //设置前景色
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#0000ff"));
        /**
         * 最后一个参数有多种可取值
         * Spanned.SPAN_INCLUSIVE_EXCLUSIVE 从起始下标到终了下标，包括起始下标
         * Spanned.SPAN_INCLUSIVE_INCLUSIVE 从起始下标到终了下标，同时包括起始下标和终了下标
         * Spanned.SPAN_EXCLUSIVE_EXCLUSIVE 从起始下标到终了下标，但都不包括起始下标和终了下标
         * Spanned.SPAN_EXCLUSIVE_INCLUSIVE 从起始下标到终了下标，包括终了下标
         * SpannableStringBuilder可以实现SpannableString的拼接,实现各种风格效果的SpannableString拼接
         */
        spannableString.setSpan(foregroundColorSpan,9,spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_1.setText(spannableString);

        SpannableString spannableString_2 = new SpannableString("设置文字的背景色为蓝色");
        //设置背景色
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.parseColor("#0000ff"));
        spannableString_2.setSpan(backgroundColorSpan,9,spannableString_2.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_2.setText(spannableString_2);

        SpannableString spannableString_3 = new SpannableString("我登上了山顶上又下去了");
        RelativeSizeSpan sizeSpan01 = new RelativeSizeSpan(1.2f);
        RelativeSizeSpan sizeSpan02 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan03 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan04 = new RelativeSizeSpan(1.8f);
        RelativeSizeSpan sizeSpan05 = new RelativeSizeSpan(1.9f);
        RelativeSizeSpan sizeSpan06 = new RelativeSizeSpan(2.0f);
        RelativeSizeSpan sizeSpan07 = new RelativeSizeSpan(1.9f);
        RelativeSizeSpan sizeSpan08 = new RelativeSizeSpan(1.8f);
        RelativeSizeSpan sizeSpan09 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan10 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan11 = new RelativeSizeSpan(1.2f);
        spannableString_3.setSpan(sizeSpan01, 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan02, 1, 2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan03, 2, 3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan04, 3, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan05, 4, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan06, 5, 6, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan07, 6, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan08, 7, 8, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan09, 8, 9, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan10, 9, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_3.setSpan(sizeSpan11, 10, 11, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_3.setText(spannableString_3);

        SpannableString spannableString_4 = new SpannableString("来条删除线");
        //删除线
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        spannableString_4.setSpan(strikethroughSpan, 2, spannableString_4.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_4.setText(spannableString_4);

        SpannableString spannableString_5 = new SpannableString("来条下滑线");
        //下划线
        UnderlineSpan underlineSpan = new UnderlineSpan();
        spannableString_5.setSpan(underlineSpan, 2, spannableString_5.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_5.setText(spannableString_5);

        SpannableString spannableString_6 = new SpannableString("为文字设置上标");
        //设置上标
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        spannableString_6.setSpan(superscriptSpan,5,spannableString_6.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_6.setText(spannableString_6);

        SpannableString spannableString_7 = new SpannableString("为文字设置下标");
        //设置下标
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        spannableString_7.setSpan(subscriptSpan,5,spannableString_6.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_7.setText(spannableString_7);

        SpannableString spannableString_8 = new SpannableString("为文字设置粗体、斜体风格");
        //设置文字样式
        StyleSpan styleSpan_B  = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan_I  = new StyleSpan(Typeface.ITALIC);
        spannableString_8.setSpan(styleSpan_B, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString_8.setSpan(styleSpan_I, 8, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_8.setHighlightColor(Color.parseColor("#36969696"));
        tv_8.setText(spannableString_8);

        SpannableString spannableString_9 = new SpannableString("在文本中添加表情（表情）");
        Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher);
        drawable.setBounds(0, 0, 42, 42);
        ImageSpan imageSpan = new ImageSpan(drawable);
        spannableString_9.setSpan(imageSpan, 6, 8, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv_9.setText(spannableString_9);

        SpannableString spannableString_10 = new SpannableString("为文字设置超链接");
        URLSpan urlSpan = new URLSpan("http://www.jianshu.com/users/dbae9ac95c78");
        spannableString_10.setSpan(urlSpan, 5, spannableString_10.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        //使用URLSpan的文本如果想真正实现点击作用，必须为TextView设置setMovementMethod方法
        tv_10.setMovementMethod(LinkMovementMethod.getInstance());
        //控制点击时的背景色
        tv_10.setHighlightColor(Color.parseColor("#36969696"));
        tv_10.setText(spannableString_10);

        /**
         * 除此之外，还有MaskFilterSpan可以实现模糊和浮雕效果，RasterizerSpan可以实现光栅效果
         */

    }

    public void pop(View v){
        if(mDialog == null) {
            onCreateDialog().show();
        }else{
            mDialog.show();
        }
    }

    public Dialog onCreateDialog() {
        mDialog = new Dialog(MainActivity.this, R.style.BottomDialog);
        mDialog.setContentView(R.layout.view_dialog);
        mDialog.setCanceledOnTouchOutside(true); // 外部点击取消
        // 设置宽度为屏宽, 靠近屏幕底部。
        Window window = mDialog.getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.gravity = Gravity.BOTTOM; // 紧贴底部
        lp.width = WindowManager.LayoutParams.MATCH_PARENT; // 宽度持平
        lp.windowAnimations = R.style.window_anim;
        window.setAttributes(lp);
        return mDialog;
    }

    @Override
    protected void onStop() {
        super.onStop();

        if(mDialog.isShowing())
            mDialog.cancel();
        mDialog = null;
    }
}
