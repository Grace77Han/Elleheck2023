package com.example.ellehacks_2023;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ellehacks_2023.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button searchBarButton;
    Button imageSearchButton;
    ImageView image;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
//
//        setSupportActionBar(binding.toolbar);
//
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        searchBarButton = (Button) findViewById(R.id.searchBarButton);
        imageSearchButton = (Button) findViewById(R.id.imageSearchButton);
        image = (ImageView) findViewById(R.id.outputImage);
        searchBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeSearchButtonClicked(v);
            }
        });
        imageSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeImageSearchButtonClicked(v);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    public void computeSearchButtonClicked(View view) {
        String textName = getInputOfTextField(R.id.searchBar);
        RecycleInfo ri = new RecycleInfo();
        String result = ri.getType(textName);
        if(result.equals("blue")) {
            outputDisposalMethod("recycle");
        }
        else if(result.equals("garbage")) {
            outputDisposalMethod("garbage");
        }
        else if(result.equals("green")){
            outputDisposalMethod("organics");
        }
        else {
            outputDisposalMethod("Search failed");
        }
    }

    public void computeImageUploadButtonClicked(View view) {

    }

    public void computeImageSearchButtonClicked(View view) {

    }

    public void outputDisposalMethod(String binType) {
        if(binType.equals("recycle")) {
            ImageView iv = (ImageView) findViewById(R.id.outputImage);
            iv.setImageResource(R.drawable.recyclebin);
        }
        else if (binType.equals("garbage")) {
            ImageView iv = (ImageView) findViewById(R.id.outputImage);
            iv.setImageResource(R.drawable.garbagebin);
        }
        else if (binType.equals("organics")) {
            ImageView iv = (ImageView) findViewById(R.id.outputImage );
            iv.setImageResource(R.drawable.greenbin);
        }
        else {
            ImageView iv = (ImageView) findViewById(R.id.outputImage);
            iv.setImageResource(R.drawable.searchnotfound);
        }
    }
}