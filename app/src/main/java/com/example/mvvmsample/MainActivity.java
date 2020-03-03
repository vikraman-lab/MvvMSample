package com.example.mvvmsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.example.mvvmsample.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
ActivityMainBinding binding;
private List<NicePlaceModel> nicePlaceModelList=new ArrayList<NicePlaceModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        setAdapter();


    }

    private void setAdapter() {
   /*     NicePlaceModel nicePlaceModel=new NicePlaceModel();
        nicePlaceModel.setArea("kay");
        nicePlaceModel.setName("1234");
        nicePlaceModel.setArea("cbe");
        nicePlaceModel.setName("0000");
        nicePlaceModel.setArea("banga");
        nicePlaceModel.setName("11111");
        nicePlaceModelList.add(nicePlaceModel);*/

        PlaceAdaptert placeAdaptert=new PlaceAdaptert(this,nicePlaceModelList);
        binding.recyclerView.setAdapter(placeAdaptert);
    }
}
