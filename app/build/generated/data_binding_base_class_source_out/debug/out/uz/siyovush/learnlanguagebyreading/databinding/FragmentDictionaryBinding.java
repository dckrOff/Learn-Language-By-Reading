// Generated by view binder compiler. Do not edit!
package uz.siyovush.learnlanguagebyreading.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.siyovush.learnlanguagebyreading.R;

public final class FragmentDictionaryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextView firstLang;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextInputLayout searchBar;

  @NonNull
  public final TextInputEditText searchView;

  @NonNull
  public final TextView secondLang;

  @NonNull
  public final ImageView swapBtn;

  @NonNull
  public final Toolbar toolbar;

  private FragmentDictionaryBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appbar, @NonNull TextView firstLang, @NonNull RecyclerView recyclerView,
      @NonNull TextInputLayout searchBar, @NonNull TextInputEditText searchView,
      @NonNull TextView secondLang, @NonNull ImageView swapBtn, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.firstLang = firstLang;
    this.recyclerView = recyclerView;
    this.searchBar = searchBar;
    this.searchView = searchView;
    this.secondLang = secondLang;
    this.swapBtn = swapBtn;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDictionaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDictionaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dictionary, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDictionaryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      AppBarLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.first_lang;
      TextView firstLang = ViewBindings.findChildViewById(rootView, id);
      if (firstLang == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.search_bar;
      TextInputLayout searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.search_view;
      TextInputEditText searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.second_lang;
      TextView secondLang = ViewBindings.findChildViewById(rootView, id);
      if (secondLang == null) {
        break missingId;
      }

      id = R.id.swap_btn;
      ImageView swapBtn = ViewBindings.findChildViewById(rootView, id);
      if (swapBtn == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentDictionaryBinding((ConstraintLayout) rootView, appbar, firstLang,
          recyclerView, searchBar, searchView, secondLang, swapBtn, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}