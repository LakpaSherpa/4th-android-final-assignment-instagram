package com.pasangsherpa.instagram.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.pasangsherpa.instagram.models.PostModel;
import com.pasangsherpa.instagram.R;
import com.pasangsherpa.instagram.models.StoryModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btmNav;
//    Fragment selectedFragment = null;

    public static List<PostModel> listPosts = new ArrayList<>();
    public static List<StoryModel> listStories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNav = findViewById(R.id.nav_view);

        getSupportActionBar().hide();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_add, R.id.navigation_liked, R.id.navigation_profile
        ).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(btmNav, navController);


        listPosts.add(new PostModel("1","Cristiano Ronaldo", "i am a  Portuguese top palyer!", R.drawable.post5, R.drawable.post6));
        listPosts.add(new PostModel("2","taylor_swift", " im a american Singer", R.drawable.post7, R.drawable.post8));
        listPosts.add(new PostModel("3","messi", "i mam   a most popular football player!", R.drawable.post, R.drawable.profilepic));
        listPosts.add(new PostModel("4","selena_gomez", "I am a stage performer.", R.drawable.profilepic2, R.drawable.profilepic2));


        listStories.add(new StoryModel("1","Tom cruise", R.drawable.post1, 0));
        listStories.add(new StoryModel("Virat Kohli", R.drawable.post3));
        listStories.add(new StoryModel("1","cristiano_ronaldo  ", R.drawable.post1, 0));
        listStories.add(new StoryModel("Alastair Cook", R.drawable.post7));

    }




}
