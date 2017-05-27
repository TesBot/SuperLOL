package app_superlol.alex.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.RelativeLayout;

import app_superlol.alex.com.myapplication.activity.GuideActivity;
import app_superlol.alex.com.myapplication.activity.MainActivity;
import app_superlol.alex.com.myapplication.utils.CacheUtils;

public class SplashActivity extends Activity {

    public static final String START_MAIN = "start_main";

    private RelativeLayout rl_splash_root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        rl_splash_root = (RelativeLayout) findViewById(R.id.rl_splash_root);

        //添加动画，渐变
        AlphaAnimation aa = new AlphaAnimation(0,1);
        aa.setFillAfter(true);
        AnimationSet set = new AnimationSet(false);
        set.addAnimation(aa);
        set.setDuration(2500); // 持续时间2.5s

        rl_splash_root.startAnimation(set);

        set.setAnimationListener(new MyAnimationListener());

    }

    /**
     * 内部类：放映动画后的监听
     */
    class MyAnimationListener implements Animation.AnimationListener {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            //判断是否曾经进入过主界面
            boolean isStartMain = CacheUtils.getBoolean(SplashActivity.this,START_MAIN);
            Intent intent;

            //如果进入过，则直接进主页面，没有则进入引导界面
            if(isStartMain) {
                intent = new Intent(SplashActivity.this, MainActivity.class);
            }else{
                //引导界面
                intent = new Intent(SplashActivity.this, GuideActivity.class);
            }
            startActivity(intent);

            //关闭闪屏
            finish();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
}
