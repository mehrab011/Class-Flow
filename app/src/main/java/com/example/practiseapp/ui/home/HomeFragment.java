package com.example.practiseapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.practiseapp.MainActivity3;
import com.example.practiseapp.MainActivity8;
import com.example.practiseapp.R;
import com.example.practiseapp.ScheduleActivity;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;

    FragmentActivity context;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final Button button1 = root.findViewById(R.id.btn1);
        final Button button2 = root.findViewById(R.id.btn2);
        final Button button3 = root.findViewById(R.id.btn3);
        final Button button4 = root.findViewById(R.id.btn4);


        context = getActivity();
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);





        return root;
    /* binding=FragmentHomeBinding.inflate(getLayoutInflater());
     return binding.getRoot();
    }
    public void onViewCreated(View view,Bundle savedInstancestate){
        super.onViewCreated(view,savedInstancestate);

        binding.button1.setOnClick
    }
}

*/
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn1) {

            Intent intent = new Intent(context, MainActivity3.class);
            startActivity(intent);
        }


        if (id == R.id.btn2) {
            Intent intent1 = new Intent(context, ScheduleActivity.class);
            startActivity(intent1);
        }

        if (id == R.id.btn3) {
            Intent intent2 = new Intent(context, MainActivity8.class);
            startActivity(intent2);
        }

        if (id == R.id.btn4){
            Intent intent3 = new Intent(context, MainActivity8.class);
        startActivity(intent3);

    }







        }
    }






