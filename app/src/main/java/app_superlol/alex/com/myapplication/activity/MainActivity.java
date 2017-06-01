package app_superlol.alex.com.myapplication.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import app_superlol.alex.com.myapplication.R;
import app_superlol.alex.com.myapplication.fragment.ContentFragment;
import app_superlol.alex.com.myapplication.fragment.LeftmenuFragment;
import app_superlol.alex.com.myapplication.utils.DensityUtil;

public class MainActivity extends SlidingFragmentActivity {

    private static final String MAIN_CONTENT_TAG = "main_content_tag";
    private static final String LEFTMENU_TAG = "leftmenu_tag";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // 设置没有标题

        initSlidingMenu();
        
        //初始化Fragment
        initFragment();
    }

    private void initFragment() {
        //得到FragmentManager
        FragmentManager fm = getSupportFragmentManager();
        //开启事务
        FragmentTransaction ft = fm.beginTransaction();
        //替换
        ft.replace(R.id.fl_main_content,new ContentFragment(),MAIN_CONTENT_TAG);//主页
        ft.replace(R.id.fl_leftmenu,new LeftmenuFragment(),LEFTMENU_TAG);//左侧菜单
        //提交
        ft.commit();

    }

    private void initSlidingMenu() {
        //主页面
        setContentView(R.layout.activity_main);

        //设置左侧菜单
        setBehindContentView((R.layout.activity_leftmenu));

        //设置显示的模式：左侧+主页；左侧+右侧+主页；右侧+主页
        SlidingMenu slidingMenu = getSlidingMenu();
        slidingMenu.setMode(SlidingMenu.LEFT);

        //设置滑动的模式; 滑动边缘；全品滑动；不可滑动
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        //设置主页占据宽度
        slidingMenu.setBehindOffset(DensityUtil.dip2px(MainActivity.this,200));

    }
}
