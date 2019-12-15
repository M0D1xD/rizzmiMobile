package com.example.rizzmi.ui.auth;


import android.os.Bundle;

import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rizzmi.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {
    private Unbinder unbinder;

    @BindView(R.id.et_first_name)
    TextInputEditText et_first;
    @BindView(R.id.et_last_name)
    TextInputEditText et_last;
    @BindView(R.id.et_password)
    TextInputEditText et_password;
    @BindView(R.id.et_phone)
    TextInputEditText et_phone;
    @BindView(R.id.cb_agree)
    AppCompatCheckBox cb_agree;
    @BindView(R.id.tv_sign_in)
    TextView tv_sign_in;
    @BindView(R.id.btn_sign_up)
    MaterialButton btn_sign_up;


    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        unbinder = ButterKnife.bind(this, view);


        btn_sign_up.setOnClickListener(v -> {

        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.tv_sign_in)
    void SignIn(View view) {
        view.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_sign_in));
    }
}
