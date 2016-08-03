package li.zhuoyuan.getcontacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

/**
 * Created by 帅裂苍穹的卓原 on 2016/8/3 15:58 .
 * email: zhuoyuan93@gmail.com
 * 获取通讯录的联系人姓名，电话，email ，头像 并根据姓名首字母排序
 */

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getName();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_item);
        List<Contact> list = GetPeople.getInstance().getpeople(MainActivity.this);
        listView.setAdapter(new MyAdapter(this, list));
        Log.i(TAG, "onCreate: " + list.toString());
    }

}
