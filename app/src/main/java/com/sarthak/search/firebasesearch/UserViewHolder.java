package com.sarthak.search.firebasesearch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * View holder class for User Recycler adapter.
 *
 * Displays the user details in each row of RecyclerView.
 */

public class UserViewHolder extends RecyclerView.ViewHolder {

    private TextView mName, mId;
    private CircleImageView mProfileImage;

    UserViewHolder(View itemView) {
        super(itemView);

        mName = itemView.findViewById(R.id.users_name);
        mId = itemView.findViewById(R.id.users_status);
        mProfileImage = itemView.findViewById(R.id.user_image);
    }

    /**
     * Bind data from 'User' to respective position in RecyclerView.
     *
     * @param user is the user details to set in every row
     */
    public void bindData(final Context context, final User user) {

        mName.setText(user.username);
        mId.setText(user.status);

        Picasso.with(context)
                .load(user.thumb_image)
                .placeholder(R.drawable.default_profile_picture)
                .into(mProfileImage);
    }
}
