package ru.seet61.spring.interaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Для начала, вы создаете класс, который содержит необходимую вам информацию. Если вам нужно знать название Pivotal,
 * номер телефона, URL web-сайта и информацию о pivotalsoftware, то ниже представленный класс как раз то, что вам нужно
 * Created by seet on 12.12.16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {
    private String name;
    private String about;
    private String phone;
    private String website;

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }
}
