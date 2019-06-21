package com.thaliees.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.thaliees.recyclerview.Model.TechnologyModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected RecyclerView recyclerView;
    protected TechnologyAdapter adapter;
    protected RecyclerView.LayoutManager layoutManager;
    protected List<TechnologyModel> technologyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize our data
        initList();
        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView_container);
        // The RecyclerView.LayoutManager defines how elements are laid out.
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // Initialize our Adapter, and passed our list of data
        adapter = new TechnologyAdapter(technologyList);
        // Set our adapter as the adapter for RecyclerView
        recyclerView.setAdapter(adapter);
    }

    private void initList(){
        technologyList = new ArrayList<>();

        // Initialize dataset.
        // (This data would usually come from a local content provider or remote server)
        // For example, we will obtain 8 data of the TechnologyModel type
        TechnologyModel technology = new TechnologyModel("im_android_studio", "Android Studio", "Is the official Integrated Development Environment (IDE) for Android app development, based on IntelliJ IDEA . On top of IntelliJ's powerful code editor and developer tools, Android Studio offers even more features that enhance your productivity when building Android apps.");
        technologyList.add(technology);
        technology = new TechnologyModel("im_asp_net", "Asp.net", "ASP.NET is an open source web framework, created by Microsoft, for building modern web apps and services that run on macOS, Linux, Windows, and Docker.");
        technologyList.add(technology);
        technology = new TechnologyModel("im_java", "JAVA", "Is a programming language that produces software for multiple platforms. When a programmer writes a Java application, the compiled code (known as bytecode) runs on most operating systems (OS), including Windows, Linux and Mac OS. Java derives much of its syntax from the C and C++ programming languages.");
        technologyList.add(technology);
        technology = new TechnologyModel("im_laravel", "Laravel", "Is an open source framework for developing web applications and services with PHP 5 and PHP 7. It attempts to eliminate the pain of development by facilitating common tasks that are used in most web projects, such as authentication, routing, sessions, and caching. Laravel aims to make the development process pleasant for the developer without sacrificing the functionality of the application.");
        technologyList.add(technology);
        technology = new TechnologyModel("im_mongodb", "MongoDB", "Is a document database with the scalability and flexibility that you want with the querying and indexing that you need.");
        technologyList.add(technology);
        technology = new TechnologyModel("im_sqlserver", "SQLServer", "Is a relational database management system, or RDBMS, developed and marketed by Microsoft.");
        technologyList.add(technology);
        technology = new TechnologyModel("im_xcode", "Xcode", "Is the official Integrated Development Environment (IDE) for macOS app development, which contains a set of tools created by Apple for the development of software for macOS, iOS, watchOS and tvOS.");
        technologyList.add(technology);
    }
}
