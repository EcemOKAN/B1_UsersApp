package com.ecemokan.usersapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ecemokan.usersapp.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class ListViewModel extends ViewModel {
    public MutableLiveData<List<UserModel>> users= new MutableLiveData<List<UserModel>>();
    public MutableLiveData<Boolean> userLoadError = new MutableLiveData<Boolean>();
    public MutableLiveData<Boolean> loading = new MutableLiveData<Boolean>();

    public void refresh(){
        fetchUsers();
    }

    private void fetchUsers() {
        UserModel user1= new UserModel("mojombo",1,"https://github.com/mojombo","");
        UserModel user2= new UserModel("mojombo",1,"https://github.com/mojombo","");
        UserModel user3= new UserModel("mojombo",1,"https://github.com/mojombo","");

        List<UserModel> list =new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        users.setValue(list);
        userLoadError.setValue(false);
        loading.setValue(false);
    }
}
