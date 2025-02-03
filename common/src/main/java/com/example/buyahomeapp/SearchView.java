package com.example.buyahomeapp;

import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.Style;



public class SearchView extends Form {

    public SearchView (Form mainForm) {
        super("Search", new BorderLayout());



        // Example content for the Search page
        Label searchLabel = new Label("Search for Homes!");

        Style style = new Style();
        style.setBgColor(0xFFFFFF); // White background
        style.setBgTransparency(200); // Semi-transparent background

        style.setPadding(5, 5, 5, 5);
        searchLabel.setUnselectedStyle(style);
        searchLabel.setSelectedStyle(style);
        this.addComponent(BorderLayout.CENTER, searchLabel);

        //showURLInBox("https://recolorado.com");

        // Add the bottom navigation bar
        this.addComponent(BorderLayout.SOUTH, new BottomNavBar(mainForm));
    }

    public void showURLInBox(String url) {
        Form browserForm = new Form("View Content", new BorderLayout());

        // Create the browser component
        BrowserComponent browser = new BrowserComponent();
        browser.setURL(url); // Load the URL

        // Add the browser to the form
        browserForm.add(BorderLayout.CENTER, browser);

        // Show the form
        browserForm.show();
    }
}
