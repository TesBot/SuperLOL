package app_superlol.alex.com.myapplication.fragment;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;

import app_superlol.alex.com.myapplication.R;
import app_superlol.alex.com.myapplication.activity.MainActivity;
import app_superlol.alex.com.myapplication.adapter.ContentFragmentAdapter;
import app_superlol.alex.com.myapplication.base.BaseFragment;
import app_superlol.alex.com.myapplication.base.BasePager;
import app_superlol.alex.com.myapplication.pager.HerosPager;
import app_superlol.alex.com.myapplication.pager.ItemsPager;
import app_superlol.alex.com.myapplication.pager.MePager;
import app_superlol.alex.com.myapplication.pager.NewsCenterPager;
import app_superlol.alex.com.myapplication.utils.LogUtil;
import app_superlol.alex.com.myapplication.view.NoScrollViewPager;

/**
 * Created by Jhin on 2017/5/30 0030.
 */

public class ContentFragment extends BaseFragment {

    @ViewInject(R.id.rg_main)
    private RadioGroup rg_main;

    @ViewInject(R.id.viewpager)
    private NoScrollViewPager viewpager;

    /**
     * 五个页面的集合
     */
    private ArrayList<BasePager> basePagers;

    @Override
    public View initView() {
        LogUtil.e("正文Fragment视图被初始化");

        View view = View.inflate(context, R.layout.content_fragment, null);

        //把视图注入到框架中，让此类和View关联起来
        x.view().inject(ContentFragment.this, view);
        return view;

    }

    @Override
    public void initData() {
        super.initData();

        //初始化各个页面
        basePagers = new ArrayList<>();
        basePagers.add(new NewsCenterPager(context));
        basePagers.add(new HerosPager(context));
        basePagers.add(new MePager(context));
        basePagers.add(new ItemsPager(context));

        //设置默认选中
        rg_main.check(R.id.rb_home);

        //设置ViewPager适配器
        viewpager.setAdapter(new ContentFragmentAdapter(basePagers));

        //监听radiogroup
        rg_main.setOnCheckedChangeListener(new MyOnCheckedChangeListener());

        //监听某个页面被选中，初始化对应的页面数据
        viewpager.addOnPageChangeListener(new MyOnPageChangeListener());
        basePagers.get(0).initData();

    }

    private class MyOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i){
                case R.id.rb_home:
                    viewpager.setCurrentItem(0);
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_FULLSCREEN);
                    break;
                case R.id.rb_heros:
                    viewpager.setCurrentItem(1);
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_FULLSCREEN);
                    break;
                case R.id.rb_items:
                    viewpager.setCurrentItem(2);
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_FULLSCREEN);
                    break;
                case R.id.rb_me:
                    viewpager.setCurrentItem(3);
                    isEnableSlidingMenu(SlidingMenu.TOUCHMODE_FULLSCREEN);
                    break;

            }
        }
    }

    /**
     * 根据传入的参数设置是否左滑SlidingMenu
     *
     * @param touchmodeFullscreen
     */
    private void isEnableSlidingMenu(int touchmodeFullscreen) {
        MainActivity mainActivity = (MainActivity) context;
        mainActivity.getSlidingMenu().setTouchModeAbove(touchmodeFullscreen);
    }

    private class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
//            调用被选中页面的initDate方法
            basePagers.get(position).initData();

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
