package app_superlol.alex.com.myapplication.utils;

/**
 * Created by Jhin on 2017/6/1 0001.
 */

public class Constants {
    /**
     * 联网请求的url
     */
    public static final String BASE_URL = "http://119.29.73.130:8080/superLOLAPI";

    /**
     * 新闻中心的网络地址
     */
    public static final String NEWCSCENTER_PAGER_URL = BASE_URL+"/static/categories.json";

    public static final String HEROS_PAGER_URL = BASE_URL+"/static/heros/list_1.json";

    public static final String HEROS_IMAGES_URL="http://ossweb-img.qq.com/images/lol/img/champion/";

    public static final String ITEMS_PAGER_URL=BASE_URL+"/static/items/list_1.json";

    public static final String ITEMS_IMAGES_URL = "http://ossweb-img.qq.com/images/lol/img/item/";

    public static final String AREA_INFO_URL = BASE_URL+"/static/areaInfo.json";


    /**
     * 个人信息Base地址
     */
    public static final String DAIWAN_BASE_URL = "http://lingjuewang.com/LOLWEBAPI";

    public static final String API_TOKEN = "B8482-44B8B-84928-88988";

    public static final String USER_AREA = DAIWAN_BASE_URL+"/UserArea?name=";

    public static final String USER_EXTINFO = DAIWAN_BASE_URL+"/UserExtInfo?qquin=";

    public static final String USERKDA = DAIWAN_BASE_URL+"/UserKDA?areaid=";

    public static final String USERHONOR = DAIWAN_BASE_URL+"/UserHonor?areaid=";
}
