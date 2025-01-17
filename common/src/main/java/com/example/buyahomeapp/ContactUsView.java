package com.example.buyahomeapp;

import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;

public class ContactUsView extends Form {

    public ContactUsView (Form mainForm) {
        super("Contact", new BorderLayout());

        // Example content for the Search page
        Label searchLabel = new Label("Contact Us!");
        this.addComponent(BorderLayout.CENTER, searchLabel);

        // Add the bottom navigation bar
        this.addComponent(BorderLayout.SOUTH, new BottomNavBar(mainForm));
    }
}
