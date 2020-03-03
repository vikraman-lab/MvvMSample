package com.example.mvvmsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmsample.databinding.PlaceItemBinding;

import java.util.List;

public class PlaceAdaptert extends RecyclerView.Adapter<PlaceAdaptert.MyViewHolder> {
    private List<NicePlaceModel> mNicePlaceModelList;
    private Context mContext;

    public PlaceAdaptert(MainActivity mainActivity, List<NicePlaceModel> nicePlaceModelList) {
        this.mContext=mainActivity;
        this.mNicePlaceModelList=nicePlaceModelList;
    }

    @NonNull
    @Override
    public PlaceAdaptert.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        PlaceItemBinding itemBinding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.place_item,parent,false);
        return new MyViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdaptert.MyViewHolder holder, int position) {
       NicePlaceModel nicePlaceModel=mNicePlaceModelList.get(position);
       holder.placeItemBinding.setNicemodel(nicePlaceModel);

    }

    @Override
    public int getItemCount() {
        return mNicePlaceModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public PlaceItemBinding placeItemBinding;
        public MyViewHolder(PlaceItemBinding placeItemBinding) {
            super(placeItemBinding.getRoot());
            this.placeItemBinding=placeItemBinding;
        }

    }
}
