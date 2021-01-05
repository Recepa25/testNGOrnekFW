package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class D26_AmazonSatirSutunSayisi {

    @Test

    public void satirSayisi(){

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.enaltaGit();





        ReusableMethods.waitFor(5);
        Driver.closeDriver();




    }






}
