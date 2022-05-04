package com.codegym.Service;

import com.codegym.model.EmailSetting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailSettingService implements IEmailSettingService{
    private static Map<Integer,EmailSetting> map=new HashMap<>();
    static {
        map.put(1,new EmailSetting(1,"Vietnamese",25,true,"1111"));
    }
    @Override
    public List<EmailSetting> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public EmailSetting finById(int id) {
        return map.get(id);
    }

    @Override
    public void save(EmailSetting emailSetting) {
        map.put(emailSetting.getId(),emailSetting);
    }

    @Override
    public void delete(int id) {

    }
}
