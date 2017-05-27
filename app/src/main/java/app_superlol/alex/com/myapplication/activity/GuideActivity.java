package app_superlol.alex.com.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import app_superlol.alex.com.myapplication.R;
import app_superlol.alex.com.myapplication.SplashActivity;
import app_superlol.alex.com.myapplication.utils.CacheUtils;

public class GuideActivity extends Activity {

    private ViewPager viewpager;
    private Button btn_start_main;
    private ArrayList<ImageView> imageViews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        viewpager = (ViewPager) findViewById(R.id.viewpager);
        btn_start_main = (Button) findViewById(R.id.btn_start_main);

        int[] ids = new int[]{
                R.drawable.guide_1,
                R.drawable.guide_2,
                R.drawable.guide_3,
        };

        //背景图依次添加到集合
        imageViews = new ArrayList<>();
        for(int i=0;i<ids.length; i++){
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(ids[i]);
            imageViews.add(imageView);
        }

        //设置viewpager适配器
        viewpager.setAdapter(new MyPagerAdapter());

        //设置viewpager的监听
        viewpager.addOnPageChangeListener(new MyOnPageChangeListener());

        //设置按钮的点击事件
        btn_start_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //保存进入过主界面的状态
                CacheUtils.putBoolean(GuideActivity.this, SplashActivity.START_MAIN,true);

                //跳转到主界面
                Intent intent = new Intent(GuideActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    /**
     * 内部类，viewpager适配器
     */
    class MyPagerAdapter extends PagerAdapter {

        //返回总个数
        @Override
        public int getCount() {
            return imageViews.size();
        }

        /**
         * 得到view
         * @param container   ViewPager
         * @param position   当前要创建的页面位置
         * @return
         */
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = imageViews.get(position);
            //添加到容器
            container.addView(imageView);

            return imageView;
        }

        /**
         * 销毁
         * @param container
         * @param position
         * @param object
         */
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }
    }

    /**i
     * Viewpager的监听
     */
    private class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            //如果到最后一个页面，显示下一步按钮
            if(position == imageViews.size()-1){
                btn_start_main.setVisibility(View.VISIBLE);
            }else{
                btn_start_main.setVisibility(View.GONE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
