package com.example.buyahomeapp;

import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;

public class SearchView extends Form {

    public SearchView (Form mainForm) {
        super("Search", new BorderLayout());

        // Example content for the Search page
        Label searchLabel = new Label("Search for Homes!");
        this.addComponent(BorderLayout.CENTER, searchLabel);

        // Add the bottom navigation bar
        this.addComponent(BorderLayout.SOUTH, new BottomNavBar(mainForm));
    }
}
