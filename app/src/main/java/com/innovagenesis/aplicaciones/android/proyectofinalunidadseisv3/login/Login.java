package com.innovagenesis.aplicaciones.android.proyectofinalunidadseisv3.login;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.innovagenesis.aplicaciones.android.proyectofinalunidadseisv3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment {

   private OnLoginListener listener;

    public interface OnLoginListener{
        void login(String username);
    }


    public Login() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            listener = (OnLoginListener) context;

        }catch (ClassCastException ex){
            throw new ClassCastException("El contexto debe implementar la interfaz OnLoginListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextInputLayout userName = (TextInputLayout) view.findViewById(R.id.userNameLogin);
        TextInputLayout userPass = (TextInputLayout) view.findViewById(R.id.userNamePass);

        view.findViewById(R.id.ingresarLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickLogin();
            }
        });
    }

    private void onClickLogin() {
    }
}
