package org.intita.testsData;

import org.testng.annotations.DataProvider;

public class LoginTestData {

    @DataProvider(name = "credentialsTestData")
    public Object[][] getData() {
        return new Object[][]{
                {"", "", null},
                {"com@qintita.com", "111", "Невірна електронна пошта або пароль"}
        };
    }
}
