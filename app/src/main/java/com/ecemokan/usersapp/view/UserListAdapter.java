package com.ecemokan.usersapp.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ecemokan.usersapp.R;
import com.ecemokan.usersapp.model.UserModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder>{

    private List<UserModel> users;

    public UserListAdapter(List<UserModel> users){
        this.users=users;
    }

    public void updateUsers(List<UserModel> newUsers)
    {
        users.clear();
        users.addAll(newUsers);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.bind(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageView)
        ImageView userImage;

        @BindView(R.id.userName)
        TextView userName;

        @BindView(R.id.userUrl)
        TextView userUrl;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        void bind(UserModel user){
            userName.setText(user.getLogin());
            userUrl.setText(user.getHtmlUrl());
        }
    }
}
