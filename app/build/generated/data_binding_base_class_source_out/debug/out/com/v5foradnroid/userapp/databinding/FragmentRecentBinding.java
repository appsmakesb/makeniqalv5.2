// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.v5foradnroid.userapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRecentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout lytRoot;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  private FragmentRecentBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout lytRoot,
      @NonNull RecyclerView recyclerView, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
    this.rootView = rootView;
    this.lytRoot = lytRoot;
    this.recyclerView = recyclerView;
    this.swipeRefreshLayout = swipeRefreshLayout;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRecentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRecentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_recent, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRecentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout lytRoot = (LinearLayout) rootView;

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.swipeRefreshLayout;
      SwipeRefreshLayout swipeRefreshLayout = ViewBindings.findChildViewById(rootView, id);
      if (swipeRefreshLayout == null) {
        break missingId;
      }

      return new FragmentRecentBinding((LinearLayout) rootView, lytRoot, recyclerView,
          swipeRefreshLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
