package ru.seet61.spring.interaction;

import org.springframework.web.client.RestTemplate;

/**
 * Основа приложения для запуска
 * Created by seet on 12.12.16.
 */
public class Application {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
        System.out.println("Name: " + page.getName());
        System.out.println("About: " + page.getAbout());
        System.out.println("Phone: " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());
    }
}
