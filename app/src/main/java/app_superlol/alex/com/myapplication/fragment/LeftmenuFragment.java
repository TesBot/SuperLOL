package app_superlol.alex.com.myapplication.fragment;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import org.xutils.common.util.DensityUtil;

import java.util.List;

import app_superlol.alex.com.myapplication.R;
import app_superlol.alex.com.myapplication.activity.MainActivity;
import app_superlol.alex.com.myapplication.base.BaseFragment;
import app_superlol.alex.com.myapplication.domain.NewsBean;
import app_superlol.alex.com.myapplication.pager.NewsCenterPager;
import app_superlol.alex.com.myapplication.utils.LogUtil;

/**
 * Created by Jhin on 2017/5/30 0030.
 */

public class LeftmenuFragment extends BaseFragment{


    private List<NewsBean.DataBean> data;

    private ListView listView;
    private LeftmenuFragmentAdapter adapter;
    //点击的位置
    private int prePosition;

    @Override
    public View initView() {
        LogUtil.e("左侧菜单视图被初始化");
        listView = new ListView(context);
        listView.setPadding(0, DensityUtil.dip2px(200),0,0);
        listView.setDividerHeight(0);
        listView.setCacheColorHint(Color.TRANSPARENT);
        //设置按下item不变色
        listView.setSelector(android.R.color.transparent);


        //设置item点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //记录点击位置
                prePosition = position;
                adapter.notifyDataSetChanged(); //getCount（） --》getView()
                //把左侧菜单关闭
                MainActivity mainActivity = (MainActivity) context;
                mainActivity.getSlidingMenu().toggle(); //关-》开；开-》关
                //切换到对应的详情页面：
                switchPager(prePosition);

            }
        });
        return listView;
    }

    private void switchPager(int prePosition) {
        MainActivity mainActivity = (MainActivity) context;
        ContentFragment contentFragment = mainActivity.getContentFragment();
        NewsCenterPager newsCenterPager = contentFragment.getNewsCenterPager();
        newsCenterPager.swichPager(prePosition);

    }


    @Override
    public void initData() {
        super.initData();


    }

    /**
     * 接收数据
     * @param data
     */
    public void setData(List<NewsBean.DataBean> data) {
        this.data = data;
        for(int i=0; i<data.size();i++){

            LogUtil.e("title== "+data.get(i).getTitle());
        }

        //设置适配器（在这里设置肯定有数据）
        adapter = new LeftmenuFragmentAdapter();
        listView.setAdapter(adapter);

        //设置默认的页面
        switchPager(prePosition);
    }

    private class LeftmenuFragmentAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            TextView textView = (TextView) View.inflate(context, R.layout.item_leftmenu,null);
            textView.setText(data.get(position).getTitle());
            LogUtil.e(data.get(position).getTitle());
            if (position == prePosition){
                //红色
                textView.setEnabled(true);
            }
            else{
                textView.setEnabled(false);
            }
            return textView;
        }
    }
}
