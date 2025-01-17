package com.example.buyahomeapp;

import com.codename1.ui.*;
import com.codename1.ui.layouts.FlowLayout;

public class BottomNavBar extends Container {

    public BottomNavBar(Form mainForm) {
        // Create a container for the bottom navigation
        super(new FlowLayout(Component.CENTER));

        // Create the Home Button
        Button homeButton = new Button("Home");
        homeButton.setIcon(FontImage.createMaterial(FontImage.MATERIAL_HOME, homeButton.getStyle()));
        homeButton.addActionListener(e -> {
            // Navigate to the Home page
            new HomePage(mainForm).show();
        });

        // Create the Search Button
        Button searchButton = new Button("Search");
        searchButton.setIcon(FontImage.createMaterial(FontImage.MATERIAL_SEARCH, searchButton.getStyle()));
        searchButton.addActionListener(e -> {
            // Navigate to the Search page
            new SearchView(mainForm).show();
        });

        // Create the About Button
        Button aboutButton = new Button("About");
        aboutButton.setIcon(FontImage.createMaterial(FontImage.MATERIAL_INFO, aboutButton.getStyle()));
        aboutButton.addActionListener(e -> {
            // Navigate to the About page
            new AboutUsView(mainForm).show();
        });

        // Create the Contact Button
        Button contactButton = new Button("Contact");
        contactButton.setIcon(FontImage.createMaterial(FontImage.MATERIAL_CONTACT_MAIL, contactButton.getStyle()));
        contactButton.addActionListener(e -> {
            // Navigate to the Contact page
            new ContactUsView(mainForm).show();
        });

        // Add all buttons to the container
        this.add(homeButton);
        this.add(searchButton);
        this.add(aboutButton);
        this.add(contactButton);
    }
}
