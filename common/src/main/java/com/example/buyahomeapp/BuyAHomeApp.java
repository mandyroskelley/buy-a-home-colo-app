package com.example.buyahomeapp;

import com.codename1.io.Log;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.ui.layouts.BorderLayout;

import java.io.IOException;

public class BuyAHomeApp {

    private Form mainForm;

    public void init(Object context) {
        // Initialize resources and the main form
        mainForm = new Form("Buy a Home Colorado", new BorderLayout());
    }

    public void initForm() {
        // Initialize resources and the main form
        mainForm = new Form("Buy a Home Colorado", new BorderLayout());
    }

    private void initTheme() {
        String themeFileName = "/theme";
        try {
            Resources theme = Resources.openLayered(themeFileName);
            UIManager.getInstance().addThemeProps(theme.getTheme(theme.getThemeResourceNames()[0]));
        }catch(IOException e){
            Log.e(e);
        }
        Form currForm = Display.getInstance().getCurrent();
        if (currForm != null) {
            currForm.refreshTheme();
        }
    }

    public void start() {
        initTheme();
        // Create the main form
        initForm();

        new HomePage(mainForm).show();
    }

    public void stop() {
        // Code to stop app if needed
    }

    public void destroy() {
        // Code to clean up resources if needed
    }
}
