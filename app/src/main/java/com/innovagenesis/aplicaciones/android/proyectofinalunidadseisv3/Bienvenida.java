package com.innovagenesis.aplicaciones.android.proyectofinalunidadseisv3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Bienvenida extends Fragment {

    private static final String KEY_USERNAME = "username";
    private String mCurrentUsername = null;

    public static Bienvenida getInstance(String username){

        Bienvenida fragment  = new Bienvenida();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_USERNAME,username);

        fragment.setArguments(bundle);

        return fragment;
    }


    public Bienvenida() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        if (savedInstanceState != null){
            mCurrentUsername = savedInstanceState.getString(KEY_USERNAME,null);
        }
        return inflater.inflate(R.layout.fragment_bienvenida, container, false);
    }

}
