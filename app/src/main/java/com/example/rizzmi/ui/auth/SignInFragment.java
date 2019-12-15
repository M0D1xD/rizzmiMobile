package com.example.rizzmi.ui.auth;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rizzmi.R;
import com.example.rizzmi.model.api.RegResponse;
import com.example.rizzmi.model.api.Credentials;
import com.example.rizzmi.service.ApiServices;
import com.example.rizzmi.service.RetrofitInstance;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment {

    private static final String TAG = "SignInFragment";
    private Call<RegResponse> loginCall;
    private TextInputEditText et_email;
    private TextInputEditText et_password;


    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ApiServices mService = RetrofitInstance.getService();
        initViews(view);

        view.findViewById(R.id.tv_sign_up).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_sign_up));
        view.findViewById(R.id.btn_login).setOnClickListener(v -> {


            if (TextUtils.isEmpty(et_email.getText()))
                return;

            if (TextUtils.isEmpty(et_password.getText()))
                return;

            Credentials credentials = new Credentials(et_email.getText().toString(), et_password.getText().toString());


            loginCall = mService.login(credentials);
            loginCall.enqueue(new Callback<RegResponse>() {
                @Override
                public void onResponse(Call<RegResponse> call, Response<RegResponse> response) {
                    Log.d(TAG, "onResponse: " + response.body().toString());
                }

                @Override
                public void onFailure(Call<RegResponse> call, Throwable t) {
                    Log.d(TAG, "onFailure: " + t.getMessage());
                }
            });

        });
    }

    private void initViews(View view) {
        et_email = view.findViewById(R.id.et_email);
        et_password = view.findViewById(R.id.et_password);

    }
}
