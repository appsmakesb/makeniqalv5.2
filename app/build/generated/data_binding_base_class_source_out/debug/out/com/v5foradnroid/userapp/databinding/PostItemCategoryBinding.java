// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v5foradnroid.userapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PostItemCategoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageViewCategoryIcon;

  @NonNull
  public final TextView textViewCategoryName;

  private PostItemCategoryBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView imageViewCategoryIcon, @NonNull TextView textViewCategoryName) {
    this.rootView = rootView;
    this.imageViewCategoryIcon = imageViewCategoryIcon;
    this.textViewCategoryName = textViewCategoryName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PostItemCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PostItemCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.post_item_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PostItemCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewCategoryIcon;
      ImageView imageViewCategoryIcon = ViewBindings.findChildViewById(rootView, id);
      if (imageViewCategoryIcon == null) {
        break missingId;
      }

      id = R.id.textViewCategoryName;
      TextView textViewCategoryName = ViewBindings.findChildViewById(rootView, id);
      if (textViewCategoryName == null) {
        break missingId;
      }

      return new PostItemCategoryBinding((LinearLayout) rootView, imageViewCategoryIcon,
          textViewCategoryName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}