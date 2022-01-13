package Lesson0_PracticeGUI.Login_System;

import java.util.HashMap;
import java.util.Map;

public class IdAndPasswords {

    Map<String, String> loginInfo = new HashMap<>();

    IdAndPasswords(){
        loginInfo.put("Bro", "pizza");
        loginInfo.put("Cola", "drink");
        loginInfo.put("Burger", "king");
    }

    protected Map getLoginInfo(){
        return loginInfo;
    }
}
