// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v5foradnroid.userapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginPageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout call;

  @NonNull
  public final TextView error;

  @NonNull
  public final LinearLayout facebook;

  @NonNull
  public final TextView forgot;

  @NonNull
  public final Button login;

  @NonNull
  public final EditText mobileNumber;

  @NonNull
  public final LinearLayout noad;

  @NonNull
  public final CircleImageView opera;

  @NonNull
  public final EditText password;

  @NonNull
  public final TextView policy;

  @NonNull
  public final Button reg;

  @NonNull
  public final LinearLayout telegram;

  @NonNull
  public final LinearLayout whatsapp;

  private ActivityLoginPageBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout call,
      @NonNull TextView error, @NonNull LinearLayout facebook, @NonNull TextView forgot,
      @NonNull Button login, @NonNull EditText mobileNumber, @NonNull LinearLayout noad,
      @NonNull CircleImageView opera, @NonNull EditText password, @NonNull TextView policy,
      @NonNull Button reg, @NonNull LinearLayout telegram, @NonNull LinearLayout whatsapp) {
    this.rootView = rootView;
    this.call = call;
    this.error = error;
    this.facebook = facebook;
    this.forgot = forgot;
    this.login = login;
    this.mobileNumber = mobileNumber;
    this.noad = noad;
    this.opera = opera;
    this.password = password;
    this.policy = policy;
    this.reg = reg;
    this.telegram = telegram;
    this.whatsapp = whatsapp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.call;
      LinearLayout call = ViewBindings.findChildViewById(rootView, id);
      if (call == null) {
        break missingId;
      }

      id = R.id.error;
      TextView error = ViewBindings.findChildViewById(rootView, id);
      if (error == null) {
        break missingId;
      }

      id = R.id.facebook;
      LinearLayout facebook = ViewBindings.findChildViewById(rootView, id);
      if (facebook == null) {
        break missingId;
      }

      id = R.id.forgot;
      TextView forgot = ViewBindings.findChildViewById(rootView, id);
      if (forgot == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.mobile_number;
      EditText mobileNumber = ViewBindings.findChildViewById(rootView, id);
      if (mobileNumber == null) {
        break missingId;
      }

      id = R.id.noad;
      LinearLayout noad = ViewBindings.findChildViewById(rootView, id);
      if (noad == null) {
        break missingId;
      }

      id = R.id.opera;
      CircleImageView opera = ViewBindings.findChildViewById(rootView, id);
      if (opera == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.policy;
      TextView policy = ViewBindings.findChildViewById(rootView, id);
      if (policy == null) {
        break missingId;
      }

      id = R.id.reg;
      Button reg = ViewBindings.findChildViewById(rootView, id);
      if (reg == null) {
        break missingId;
      }

      id = R.id.telegram;
      LinearLayout telegram = ViewBindings.findChildViewById(rootView, id);
      if (telegram == null) {
        break missingId;
      }

      id = R.id.whatsapp;
      LinearLayout whatsapp = ViewBindings.findChildViewById(rootView, id);
      if (whatsapp == null) {
        break missingId;
      }

      return new ActivityLoginPageBinding((LinearLayout) rootView, call, error, facebook, forgot,
          login, mobileNumber, noad, opera, password, policy, reg, telegram, whatsapp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}