package com.example.AOD.util;

import java.util.List;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

@Component
public class ChromeDriverProvider {

    private String driver_path = "C:\\Users\\kokyungwoo\\Desktop\\chromedriver-win64\\chromedriver.exe";
    //private String driver_path = "C:\\chromedriver-win64\\chromedriver.exe"; 디버깅용
    private final String driver_id = "webdriver.chrome.driver";

    @Getter
    private WebDriver driver;

    public ChromeDriverProvider() {
    }

    public WebDriver getDriver() {
        System.setProperty(driver_id, driver_path);
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); 네이버 로그인 할라면 창 띄워서 하는 방법밖에 없음..
        options.setExperimentalOption("excludeSwitches", List.of("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        return new ChromeDriver(options);
    }




}
