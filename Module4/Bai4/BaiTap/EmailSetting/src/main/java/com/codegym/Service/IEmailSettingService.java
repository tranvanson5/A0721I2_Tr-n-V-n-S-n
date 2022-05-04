package com.codegym.Service;

import com.codegym.model.EmailSetting;

import java.util.List;

public interface IEmailSettingService {
    List<EmailSetting> findAll();
    EmailSetting finById(int id);
    void save(EmailSetting emailSetting);
    void delete(int id);
}
