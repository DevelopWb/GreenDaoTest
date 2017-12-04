package com.greendaotest1204;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.greendaotest1204.bean.A;
import com.greendaotest1204.bean.B;
import com.greendaotest1204.utils.DaoUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaoUtils daoUtils = new DaoUtils(this);
        daoUtils.insertMultEntity(getTransportRecordData());
        ArrayList<A> arrayList = daoUtils.listAll();
        arrayList.size();

    }

    /**
     * 测试数据
     *
     * @return
     */
    private ArrayList<A> getTransportRecordData() {
        ArrayList<A> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A bean = new A();
            bean.setTransportDescriptions(getTransportDesData());
            bean.setTransportType("顺丰");
            bean.setTransportNo("110121211000200" + i);
            bean.setTransportPeople("王**");
            bean.setTransportPeopleMobile("1531181****");
            bean.setTransportTime("2017-11-20 14:21:30");
            bean.setTransportInfo("多送点香菜");
            bean.setPetName("王司令");
            bean.setMobile("18888888888");
            bean.setAddress("北京市海淀区***");
            bean.setResidualIntegral(i + "");
            bean.setRelayBoxNo("168712357164563");
            bean.setOperatingPeople("文员1");
            bean.setOperateTime("2017-11-20 14:22:46");
            bean.setNoteInfo(".dlkfj");
            arrayList.add(bean);
        }

        return arrayList;
    }

    /**
     * 测试数据
     *
     * @return
     */
    private ArrayList<B> getTransportDesData() {
        ArrayList<B> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            B bean  = new B();
            bean.setTime("2017-12-4 11:11:11"+"---------"+i);
            bean.setDescription("测试数据");
            arrayList.add(bean);
        }
        return  arrayList;
    }
}
