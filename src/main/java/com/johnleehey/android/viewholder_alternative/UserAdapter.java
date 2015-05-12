package com.johnleehey.android.viewholder_alternative;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Instead of using the ViewHolder pattern, this
 * adapter utilizes a custom view for the User
 * object.
 */
public class UserAdapter extends BaseAdapter {

    public User[] users;

    @Override
    public int getCount() {
        return users == null ? 0 : users.length;
    }

    @Override
    public User getItem(int position) {
        return users[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Inflate the view
        if (convertView == null) {
            convertView = new UserListRowView(parent.getContext());
        }

        // We can now safely cast and set the data
        ((UserListRowView)convertView).setUser(getItem(position));

        return convertView;
    }
}
