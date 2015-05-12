package com.johnleehey.android.viewholder_alternative;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.DateFormat;

/**
 * A subclass of RelativeLayout, but can really extend any
 * View.  In general, it's better practice to keep the super
 * the same type as the root of your xml, so that you're able
 * to later utilize the <merge> tag.
 */
public class UserListRowView extends RelativeLayout {

    private TextView tv_userName;
    private TextView tv_jobTitle;
    private TextView tv_userDateOfBirth;

    public UserListRowView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the view into this object
        inflater.inflate(R.layout.view_user_list_row, this, true);

        tv_userName = (TextView) findViewById(R.id.user_name);
        tv_jobTitle = (TextView) findViewById(R.id.user_title);
        tv_userDateOfBirth = (TextView) findViewById(R.id.user_age);
    }

    /**
     * Set the data for the view, and populate the
     * children views with the model text.
     *
     * @param user the User object to populate this view's children with
     */
    public void setUser(User user) {
        tv_userName.setText(user.name);
        tv_jobTitle.setText(user.jobTitle);
        tv_userDateOfBirth.setText(
                DateFormat.getDateInstance(DateFormat.MEDIUM)
                        .format(user.dateOfBirth.getTime()));
    }
}
