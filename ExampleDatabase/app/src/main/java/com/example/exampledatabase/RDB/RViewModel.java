package com.example.exampledatabase.RDB;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class RViewModel extends AndroidViewModel {
    RRepository rRepository;
    LiveData<List<RTable>> list;
    public RViewModel(@NonNull Application application) {
        super(application);
        rRepository = new RRepository(application);
        list = rRepository.readAllData();
    }
    /*this method is to insert the data*/
    public void insert(RTable rTable){
        rRepository.insert(rTable);
    }
    /*this method is to read the data*/
    public LiveData<List<RTable>> readData(){
        return list;
    }
    /*this method is to update the data*/
    public void update(RTable rTable){
        rRepository.update(rTable);
    }
    /*this method is to delete the data*/
    public void delete(RTable rTable){
        rRepository.delete(rTable);
    }
}
