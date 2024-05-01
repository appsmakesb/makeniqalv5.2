// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v5foradnroid.userapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OfferBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView close;

  @NonNull
  public final Button pass;

  @NonNull
  public final Button pinm;

  private OfferBinding(@NonNull RelativeLayout rootView, @NonNull ImageView close,
      @NonNull Button pass, @NonNull Button pinm) {
    this.rootView = rootView;
    this.close = close;
    this.pass = pass;
    this.pinm = pinm;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OfferBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OfferBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.offer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OfferBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.close;
      ImageView close = ViewBindings.findChildViewById(rootView, id);
      if (close == null) {
        break missingId;
      }

      id = R.id.pass;
      Button pass = ViewBindings.findChildViewById(rootView, id);
      if (pass == null) {
        break missingId;
      }

      id = R.id.pinm;
      Button pinm = ViewBindings.findChildViewById(rootView, id);
      if (pinm == null) {
        break missingId;
      }

      return new OfferBinding((RelativeLayout) rootView, close, pass, pinm);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
