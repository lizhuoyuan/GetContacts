package li.zhuoyuan.getcontacts;

import java.util.Comparator;

/**
 * Created by 卓原 on 2016/8/3.
 * email: zhuoyuan93@gmail.com
 * 排序功能,定义排序的规则。 这里是根据姓名的第一个字符以小到大来排序的
 */

public class SortComparator implements Comparator {


    @Override
    public int compare(Object o, Object t1) {
        String a1 = (String) ((Contact) o).getName().subSequence(0, 1);
        String a2 = (String) ((Contact) t1).getName().subSequence(0, 1);
        return a1.compareTo(a2);
    }

}
