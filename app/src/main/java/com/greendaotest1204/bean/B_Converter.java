package com.greendaotest1204.bean;

import com.google.gson.Gson;

import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:wang_sir
 * Time:2017/12/4 11:22
 * Description:This is B_Converter
 */
public class B_Converter implements PropertyConverter<List<B>, String> {
    @Override
    public List<B> convertToEntityProperty(String databaseValue) {
        if (databaseValue == null) {
            return null;
        }
        List<String> list_str = Arrays.asList(databaseValue.split(","));
        List<B> list_transport = new ArrayList<>();
        for (String s : list_str) {
            list_transport.add(new Gson().fromJson(s, B.class));
        }
        return list_transport;
    }

    @Override
    public String convertToDatabaseValue(List<B> arrays) {
        if (arrays == null) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (B array : arrays) {
                String str = new Gson().toJson(array);
                sb.append(str);
                sb.append(",");
            }
            return sb.toString();

        }
    }
}
