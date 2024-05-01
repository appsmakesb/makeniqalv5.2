// Generated by view binder compiler. Do not edit!
package com.v5foradnroid.userapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.v5foradnroid.userapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMaintwoBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton btnAddCart;

  @NonNull
  public final RelativeLayout mainContent;

  @NonNull
  public final BottomNavigationView navigationStore;

  @NonNull
  public final AppBarLayout tabAppbarLayout;

  @NonNull
  public final CoordinatorLayout tabCoordinatorLayout;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final ViewPager viewpagerStore;

  private ActivityMaintwoBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton btnAddCart,
      @NonNull RelativeLayout mainContent, @NonNull BottomNavigationView navigationStore,
      @NonNull AppBarLayout tabAppbarLayout, @NonNull CoordinatorLayout tabCoordinatorLayout,
      @NonNull Toolbar toolbar, @NonNull ViewPager viewpagerStore) {
    this.rootView = rootView;
    this.btnAddCart = btnAddCart;
    this.mainContent = mainContent;
    this.navigationStore = navigationStore;
    this.tabAppbarLayout = tabAppbarLayout;
    this.tabCoordinatorLayout = tabCoordinatorLayout;
    this.toolbar = toolbar;
    this.viewpagerStore = viewpagerStore;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMaintwoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMaintwoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_maintwo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMaintwoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_cart;
      ImageButton btnAddCart = ViewBindings.findChildViewById(rootView, id);
      if (btnAddCart == null) {
        break missingId;
      }

      RelativeLayout mainContent = (RelativeLayout) rootView;

      id = R.id.navigation_store;
      BottomNavigationView navigationStore = ViewBindings.findChildViewById(rootView, id);
      if (navigationStore == null) {
        break missingId;
      }

      id = R.id.tab_appbar_layout;
      AppBarLayout tabAppbarLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabAppbarLayout == null) {
        break missingId;
      }

      id = R.id.tab_coordinator_layout;
      CoordinatorLayout tabCoordinatorLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabCoordinatorLayout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.viewpager_store;
      ViewPager viewpagerStore = ViewBindings.findChildViewById(rootView, id);
      if (viewpagerStore == null) {
        break missingId;
      }

      return new ActivityMaintwoBinding((RelativeLayout) rootView, btnAddCart, mainContent,
          navigationStore, tabAppbarLayout, tabCoordinatorLayout, toolbar, viewpagerStore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}