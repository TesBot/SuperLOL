package app_superlol.alex.com.myapplication.menudetailpager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import org.xutils.x;

import app_superlol.alex.com.myapplication.R;
import app_superlol.alex.com.myapplication.base.MenuDetailBasePager;

/**
 * Created by Jhin on 2017/6/2 0002.
 * 详情页面
 */

public class MyFriendDetailPager extends MenuDetailBasePager {


    public MyFriendDetailPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.myfriend_detail_pager,null);
        x.view().inject(this,view);

        return view;
    }

    @Override
    public void initData() {
        super.initData();


    }
}
