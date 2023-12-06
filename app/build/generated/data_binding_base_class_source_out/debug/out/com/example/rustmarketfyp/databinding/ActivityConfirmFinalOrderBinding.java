// Generated by view binder compiler. Do not edit!
package com.example.rustmarketfyp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rustmarketfyp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityConfirmFinalOrderBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button confirmFinalOrderBtn;

  @NonNull
  public final EditText shippmentAddress;

  @NonNull
  public final EditText shippmentCity;

  @NonNull
  public final EditText shippmentName;

  @NonNull
  public final EditText shippmentPhoneNumber;

  @NonNull
  public final TextView txt;

  private ActivityConfirmFinalOrderBinding(@NonNull RelativeLayout rootView,
      @NonNull Button confirmFinalOrderBtn, @NonNull EditText shippmentAddress,
      @NonNull EditText shippmentCity, @NonNull EditText shippmentName,
      @NonNull EditText shippmentPhoneNumber, @NonNull TextView txt) {
    this.rootView = rootView;
    this.confirmFinalOrderBtn = confirmFinalOrderBtn;
    this.shippmentAddress = shippmentAddress;
    this.shippmentCity = shippmentCity;
    this.shippmentName = shippmentName;
    this.shippmentPhoneNumber = shippmentPhoneNumber;
    this.txt = txt;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityConfirmFinalOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityConfirmFinalOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_confirm_final_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityConfirmFinalOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirm_final_order_btn;
      Button confirmFinalOrderBtn = ViewBindings.findChildViewById(rootView, id);
      if (confirmFinalOrderBtn == null) {
        break missingId;
      }

      id = R.id.shippment_address;
      EditText shippmentAddress = ViewBindings.findChildViewById(rootView, id);
      if (shippmentAddress == null) {
        break missingId;
      }

      id = R.id.shippment_city;
      EditText shippmentCity = ViewBindings.findChildViewById(rootView, id);
      if (shippmentCity == null) {
        break missingId;
      }

      id = R.id.shippment_name;
      EditText shippmentName = ViewBindings.findChildViewById(rootView, id);
      if (shippmentName == null) {
        break missingId;
      }

      id = R.id.shippment_phone_number;
      EditText shippmentPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (shippmentPhoneNumber == null) {
        break missingId;
      }

      id = R.id.txt;
      TextView txt = ViewBindings.findChildViewById(rootView, id);
      if (txt == null) {
        break missingId;
      }

      return new ActivityConfirmFinalOrderBinding((RelativeLayout) rootView, confirmFinalOrderBtn,
          shippmentAddress, shippmentCity, shippmentName, shippmentPhoneNumber, txt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
