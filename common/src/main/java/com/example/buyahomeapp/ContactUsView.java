package com.example.buyahomeapp;

import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.Style;

public class ContactUsView extends Form {

    public ContactUsView (Form mainForm) {
        super("Contact", new BorderLayout());

        // Example content for the Search page
        Label contactLabel = new Label("Contact Us!");

        Style style = new Style();
        style.setBgColor(0xFFFFFF); // White background
        style.setBgTransparency(200); // Semi-transparent background

        style.setPadding(5, 5, 5, 5);
        contactLabel.setUnselectedStyle(style);
        contactLabel.setSelectedStyle(style);
        this.addComponent(BorderLayout.CENTER, contactLabel);

        // Add the bottom navigation bar
        this.addComponent(BorderLayout.SOUTH, new BottomNavBar(mainForm));
    }
}
