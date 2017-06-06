package app_superlol.alex.com.myapplication.menudetailpager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;
import org.xwalk.core.XWalkView;

import app_superlol.alex.com.myapplication.R;
import app_superlol.alex.com.myapplication.base.MenuDetailBasePager;

/**
 * Created by Jhin on 2017/6/2 0002.
 * 详情页面
 */

public class MoreFunctionDetailPager extends MenuDetailBasePager {

    @ViewInject(R.id.xwv_main)
    private XWalkView xwv_main;

    public MoreFunctionDetailPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.morefuction_detail_pager,null);
        x.view().inject(this,view);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        xwv_main.loadUrl("http://www.lolhelper.cn/intro.php");


    }
}
