package app_superlol.alex.com.myapplication.menudetailpager;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.viewpagerindicator.TabPageIndicator;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import app_superlol.alex.com.myapplication.R;
import app_superlol.alex.com.myapplication.activity.MainActivity;
import app_superlol.alex.com.myapplication.base.MenuDetailBasePager;
import app_superlol.alex.com.myapplication.domain.NewsBean;
import app_superlol.alex.com.myapplication.menudetailpager.tabdetailpager.TabDetailPager;

/**
 * Created by Jhin on 2017/6/2 0002.
 * 新闻详情页面
 */

public class NewsMenuDetailPager extends MenuDetailBasePager {

    @ViewInject(R.id.tabPageIndicator)
    private TabPageIndicator tabPageIndicator;

    @ViewInject(R.id.viewpager)
    private ViewPager viewPager;

    private List<NewsBean.DataBean.ChildrenBean> children;
    private ArrayList<TabDetailPager> tabDetailPagers;

    public NewsMenuDetailPager(Context context, NewsBean.DataBean dataBean) {
        super(context);

        children = dataBean.getChildren();
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.newsmenu_detail_pager,null);
        x.view().inject(this,view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();

        tabDetailPagers = new ArrayList<>();
        for(int i=0; i<children.size(); i++){
            tabDetailPagers.add(new TabDetailPager(context,children.get(i)));
        }
        //设置Viewpager适配器
        viewPager.setAdapter(new MyNewsMenuDetailPagerAdapter());

        //ViewPager和TabPageIndicator关联
        tabPageIndicator.setViewPager(viewPager);

        //注意监听页面变化，用TabPageIndicator来监听页面
        tabPageIndicator.setOnPageChangeListener(new MyOnPageChangeListener());

    }

    class MyOnPageChangeListener implements ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
//            if (position == 0){
                //当前是北京，菜单可以全屏滑动
                isEnableSlidingMenu(SlidingMenu.TOUCHMODE_FULLSCREEN);
//            }else{
//                isEnableSlidingMenu(SlidingMenu.TOUCHMODE_NONE);
//            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

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

    class MyNewsMenuDetailPagerAdapter extends PagerAdapter{
        @Override
        public CharSequence getPageTitle(int position) {
            return children.get(position).getTitle();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            TabDetailPager tabDetailPager = tabDetailPagers.get(position);
            View rootview = tabDetailPager.rootView;
            tabDetailPager.initData();
            container.addView(rootview);
            return rootview;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public int getCount() {
            return tabDetailPagers.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }
    }
}
