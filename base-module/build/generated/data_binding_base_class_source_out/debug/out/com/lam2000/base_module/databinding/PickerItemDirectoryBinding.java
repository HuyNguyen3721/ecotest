// Generated by view binder compiler. Do not edit!
package com.lam2000.base_module.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.lam2000.base_module.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PickerItemDirectoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivDirCover;

  @NonNull
  public final AppCompatTextView tvDirCount;

  @NonNull
  public final AppCompatTextView tvDirName;

  private PickerItemDirectoryBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivDirCover,
      @NonNull AppCompatTextView tvDirCount, @NonNull AppCompatTextView tvDirName) {
    this.rootView = rootView;
    this.ivDirCover = ivDirCover;
    this.tvDirCount = tvDirCount;
    this.tvDirName = tvDirName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PickerItemDirectoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PickerItemDirectoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.picker_item_directory, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PickerItemDirectoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_dir_cover;
      ImageView ivDirCover = rootView.findViewById(id);
      if (ivDirCover == null) {
        break missingId;
      }

      id = R.id.tv_dir_count;
      AppCompatTextView tvDirCount = rootView.findViewById(id);
      if (tvDirCount == null) {
        break missingId;
      }

      id = R.id.tv_dir_name;
      AppCompatTextView tvDirName = rootView.findViewById(id);
      if (tvDirName == null) {
        break missingId;
      }

      return new PickerItemDirectoryBinding((LinearLayout) rootView, ivDirCover, tvDirCount,
          tvDirName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
