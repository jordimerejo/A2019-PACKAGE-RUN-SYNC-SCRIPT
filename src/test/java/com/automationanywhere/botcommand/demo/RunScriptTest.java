package com.automationanywhere.botcommand.demo;

import com.automationanywhere.botcommand.data.Value;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RunScriptTest {

    RunScript command = new RunScript();

    @DataProvider(name = "cimages")
    public Object[][] dataTobeTested(){

        return new Object[][]{
                {"c:\\test.bat","\"Myvar 1 | my var 2\""}
        };
    }

    @Test(dataProvider = "cimages")
    public void imageBlurTests(String scriptPath, String result){
        Value<String> d = command.action(scriptPath);
        String output = (String)d.get();
        //System.out.println("Debug:"+output);
        assertEquals(output,result);
    }
}
