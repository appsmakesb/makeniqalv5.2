// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v5foradnroid.userapp.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NewUidiOneBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView bkPar;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final CircleImageView hmNew;

  @NonNull
  public final ImageView livePayId;

  @NonNull
  public final ImageView nagPer;

  @NonNull
  public final ImageView rocPar;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final ImageView upayPer;

  private NewUidiOneBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bkPar,
      @NonNull ConstraintLayout constraintLayout2, @NonNull CircleImageView hmNew,
      @NonNull ImageView livePayId, @NonNull ImageView nagPer, @NonNull ImageView rocPar,
      @NonNull TextView textView10, @NonNull ImageView upayPer) {
    this.rootView = rootView;
    this.bkPar = bkPar;
    this.constraintLayout2 = constraintLayout2;
    this.hmNew = hmNew;
    this.livePayId = livePayId;
    this.nagPer = nagPer;
    this.rocPar = rocPar;
    this.textView10 = textView10;
    this.upayPer = upayPer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NewUidiOneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewUidiOneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.new_uidi_one, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewUidiOneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bk_par;
      ImageView bkPar = ViewBindings.findChildViewById(rootView, id);
      if (bkPar == null) {
        break missingId;
      }

      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.hm_new;
      CircleImageView hmNew = ViewBindings.findChildViewById(rootView, id);
      if (hmNew == null) {
        break missingId;
      }

      id = R.id.live_payId;
      ImageView livePayId = ViewBindings.findChildViewById(rootView, id);
      if (livePayId == null) {
        break missingId;
      }

      id = R.id.nag_per;
      ImageView nagPer = ViewBindings.findChildViewById(rootView, id);
      if (nagPer == null) {
        break missingId;
      }

      id = R.id.roc_par;
      ImageView rocPar = ViewBindings.findChildViewById(rootView, id);
      if (rocPar == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.upay_per;
      ImageView upayPer = ViewBindings.findChildViewById(rootView, id);
      if (upayPer == null) {
        break missingId;
      }

      return new NewUidiOneBinding((ConstraintLayout) rootView, bkPar, constraintLayout2, hmNew,
          livePayId, nagPer, rocPar, textView10, upayPer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}