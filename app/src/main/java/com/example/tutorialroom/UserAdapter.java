package com.example.tutorialroom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    List<User> users;
    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row,parent,false );
         return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( UserAdapter.ViewHolder holder, int position) {
        holder.firstName.setText(users.get(position).getFirstname());
        holder.lastname.setText(users.get(position).getLastname());
        holder.email.setText(users.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView firstName;
        public TextView lastname;
        public TextView email;
        public ViewHolder( View itemView) {
            super(itemView);
            firstName = itemView.findViewById(R.id.first_name);
            lastname =itemView.findViewById(R.id.last_name);
            email=itemView.findViewById(R.id.email);
        }
    }
}
