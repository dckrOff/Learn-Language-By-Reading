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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.siyovush.learnlanguagebyreading.R;

public final class FragmentReadBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final TextView current;

  @NonNull
  public final ImageView next;

  @NonNull
  public final ImageView previous;

  @NonNull
  public final TextView textView;

  @NonNull
  public final Toolbar toolbar;

  private FragmentReadBinding(@NonNull ConstraintLayout rootView, @NonNull AppBarLayout appbar,
      @NonNull TextView current, @NonNull ImageView next, @NonNull ImageView previous,
      @NonNull TextView textView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.current = current;
    this.next = next;
    this.previous = previous;
    this.textView = textView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentReadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentReadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_read, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentReadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      AppBarLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.current;
      TextView current = ViewBindings.findChildViewById(rootView, id);
      if (current == null) {
        break missingId;
      }

      id = R.id.next;
      ImageView next = ViewBindings.findChildViewById(rootView, id);
      if (next == null) {
        break missingId;
      }

      id = R.id.previous;
      ImageView previous = ViewBindings.findChildViewById(rootView, id);
      if (previous == null) {
        break missingId;
      }

      id = R.id.text_view;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentReadBinding((ConstraintLayout) rootView, appbar, current, next, previous,
          textView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}