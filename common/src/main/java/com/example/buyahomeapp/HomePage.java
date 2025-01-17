package com.example.buyahomeapp;

import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.Style;

public class HomePage extends Form {

    public HomePage(Form mainForm) {
        super("Home", new BorderLayout());

        // Create a TextArea with multi-line content
        TextArea homeText = new TextArea(
                "Welcome to Buy a Home Colorado!\n\n" +
                        "We are a real estate company dedicated to helping you find your perfect home in beautiful Colorado.\n" +
                        "Explore listings, search properties, and get expert guidance from our team of professionals.\n\n" +
                        "Contact us to get started today!"
        );

        // Make it non-editable (like a label)
        homeText.setEditable(false);
        homeText.setRows(6); // Set the number of visible rows
        homeText.setColumns(30); // Set the number of visible columns (width)

        // Style the TextArea to look more like a Label (opaque white background, black text)
        Style textStyle = homeText.getAllStyles();
        textStyle.setBgColor(0xFFFFFF); // Set background color to white
        textStyle.setBgTransparency(200); // Make it semi-opaque
        textStyle.setFgColor(0x000000); // Set text color to black
        textStyle.setAlignment(Component.CENTER); // Center align the text
        textStyle.setPadding(5, 5, 5, 5); // Add padding around the text

        // Optionally, add a scrollable area if the content is large
        homeText.setScrollVisible(true); // Allow scrolling for long text

        // Add the TextArea to the center of the form
        this.addComponent(BorderLayout.CENTER, homeText);


        // Add the bottom navigation bar
        this.addComponent(BorderLayout.SOUTH, new BottomNavBar(mainForm));
    }


}
