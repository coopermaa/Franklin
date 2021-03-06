package com.tanyayuferova.franklin.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tanyayuferova.franklin.FranklinApplication;
import com.tanyayuferova.franklin.R;

import ru.terrakok.cicerone.Router;

/**
 * Created by Tanya Yuferova on 3/18/2018.
 */

public class SettingsFragment extends Fragment {
    public static final String SCREEN_KEY = "SETTINGS_FRAGMENT_SCREEN_KEY";
    private Router router = FranklinApplication.INSTANCE.getRouter();

    public static SettingsFragment newInstance(Object data) {
        SettingsFragment fragment = new SettingsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        Toolbar toolbar = root.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                router.exit();
            }
        });
        return root;
    }
}
