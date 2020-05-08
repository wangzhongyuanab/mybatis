package plugin;

import java.util.HashMap;
import java.util.Map;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要往期视频的同学可以加木兰老师的QQ：2746251334
 * author：鲁班学院-商鞅老师
 */
public class PageUtil {

    private int page;

    private  int limit;

    private  int count;

    private  int start;

    public PageUtil(){
    }

    public PageUtil(int page, int limit){
        this.page = page;
        this.limit = limit;
        this.start = (page-1)*limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public static void main(String[] args) {
        Map<String, PageUtil> map = new HashMap<>();
        PageUtil pageUtil = new PageUtil();
        pageUtil.setPage(1);
        map.put("key",pageUtil);
        //调用逻辑修改map
        方法1(map);
        //直接使用原来对象
        System.out.println(pageUtil.getPage());
    }

    public static void  方法1(Map<String, PageUtil> map){
        map.get("key").setPage(2);
    }

}
