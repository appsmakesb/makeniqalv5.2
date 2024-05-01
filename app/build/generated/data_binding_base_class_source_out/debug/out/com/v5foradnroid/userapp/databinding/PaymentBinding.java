// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.v5foradnroid.userapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PaymentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextInputEditText amount;

  @NonNull
  public final RadioGroup bal;

  @NonNull
  public final TextView band;

  @NonNull
  public final RadioButton bank;

  @NonNull
  public final TextView cba;

  @NonNull
  public final RadioButton drive;

  @NonNull
  public final CircleImageView hm;

  @NonNull
  public final RadioButton main;

  @NonNull
  public final LinearLayout mainlayout;

  @NonNull
  public final TextInputEditText msg;

  @NonNull
  public final TextInputEditText pin;

  @NonNull
  public final Button reg;

  @NonNull
  public final ScrollView scrollview;

  @NonNull
  public final TextInputLayout txtPassword;

  @NonNull
  public final RelativeLayout uitop;

  @NonNull
  public final TextView xc;

  private PaymentBinding(@NonNull LinearLayout rootView, @NonNull TextInputEditText amount,
      @NonNull RadioGroup bal, @NonNull TextView band, @NonNull RadioButton bank,
      @NonNull TextView cba, @NonNull RadioButton drive, @NonNull CircleImageView hm,
      @NonNull RadioButton main, @NonNull LinearLayout mainlayout, @NonNull TextInputEditText msg,
      @NonNull TextInputEditText pin, @NonNull Button reg, @NonNull ScrollView scrollview,
      @NonNull TextInputLayout txtPassword, @NonNull RelativeLayout uitop, @NonNull TextView xc) {
    this.rootView = rootView;
    this.amount = amount;
    this.bal = bal;
    this.band = band;
    this.bank = bank;
    this.cba = cba;
    this.drive = drive;
    this.hm = hm;
    this.main = main;
    this.mainlayout = mainlayout;
    this.msg = msg;
    this.pin = pin;
    this.reg = reg;
    this.scrollview = scrollview;
    this.txtPassword = txtPassword;
    this.uitop = uitop;
    this.xc = xc;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PaymentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PaymentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.payment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PaymentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amount;
      TextInputEditText amount = ViewBindings.findChildViewById(rootView, id);
      if (amount == null) {
        break missingId;
      }

      id = R.id.bal;
      RadioGroup bal = ViewBindings.findChildViewById(rootView, id);
      if (bal == null) {
        break missingId;
      }

      id = R.id.band;
      TextView band = ViewBindings.findChildViewById(rootView, id);
      if (band == null) {
        break missingId;
      }

      id = R.id.bank;
      RadioButton bank = ViewBindings.findChildViewById(rootView, id);
      if (bank == null) {
        break missingId;
      }

      id = R.id.cba;
      TextView cba = ViewBindings.findChildViewById(rootView, id);
      if (cba == null) {
        break missingId;
      }

      id = R.id.drive;
      RadioButton drive = ViewBindings.findChildViewById(rootView, id);
      if (drive == null) {
        break missingId;
      }

      id = R.id.hm;
      CircleImageView hm = ViewBindings.findChildViewById(rootView, id);
      if (hm == null) {
        break missingId;
      }

      id = R.id.main;
      RadioButton main = ViewBindings.findChildViewById(rootView, id);
      if (main == null) {
        break missingId;
      }

      LinearLayout mainlayout = (LinearLayout) rootView;

      id = R.id.msg;
      TextInputEditText msg = ViewBindings.findChildViewById(rootView, id);
      if (msg == null) {
        break missingId;
      }

      id = R.id.pin;
      TextInputEditText pin = ViewBindings.findChildViewById(rootView, id);
      if (pin == null) {
        break missingId;
      }

      id = R.id.reg;
      Button reg = ViewBindings.findChildViewById(rootView, id);
      if (reg == null) {
        break missingId;
      }

      id = R.id.scrollview;
      ScrollView scrollview = ViewBindings.findChildViewById(rootView, id);
      if (scrollview == null) {
        break missingId;
      }

      id = R.id.txtPassword;
      TextInputLayout txtPassword = ViewBindings.findChildViewById(rootView, id);
      if (txtPassword == null) {
        break missingId;
      }

      id = R.id.uitop;
      RelativeLayout uitop = ViewBindings.findChildViewById(rootView, id);
      if (uitop == null) {
        break missingId;
      }

      id = R.id.xc;
      TextView xc = ViewBindings.findChildViewById(rootView, id);
      if (xc == null) {
        break missingId;
      }

      return new PaymentBinding((LinearLayout) rootView, amount, bal, band, bank, cba, drive, hm,
          main, mainlayout, msg, pin, reg, scrollview, txtPassword, uitop, xc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
