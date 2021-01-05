package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;


public class AmazonPage {


   public AmazonPage(){


        PageFactory.initElements(Driver.getDriver(),this);


    }

public void enaltaGit(){
    Actions actions=new Actions(Driver.getDriver());
    actions.sendKeys(Keys.END).perform();
}


}
