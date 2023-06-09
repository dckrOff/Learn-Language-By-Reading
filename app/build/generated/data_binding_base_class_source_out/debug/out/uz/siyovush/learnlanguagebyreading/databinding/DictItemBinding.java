// Generated by view binder compiler. Do not edit!
package uz.siyovush.learnlanguagebyreading.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import uz.siyovush.learnlanguagebyreading.R;

public final class DictItemBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView word;

  private DictItemBinding(@NonNull TextView rootView, @NonNull TextView word) {
    this.rootView = rootView;
    this.word = word;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static DictItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DictItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dict_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DictItemBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView word = (TextView) rootView;

    return new DictItemBinding((TextView) rootView, word);
  }
}
