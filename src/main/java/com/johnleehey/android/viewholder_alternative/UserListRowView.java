package com.johnleehey.android.viewholder_alternative;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

/**
 * A subclass of RelativeLayout, but can really extend any
 * View.  In general, it's better practice to keep the super
 * the same type as the root of your xml, so that you're able
 * to later utilize the <merge> tag.
 */
public class UserListRowView extends RelativeLayout {

    private User user;

    public UserListRowView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.view_user_list_row, this, true);


    }


    public void setUser(User user) {
        this.user = user;
    }
}
