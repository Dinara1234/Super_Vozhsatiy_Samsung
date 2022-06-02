package com.example.test1.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.test1.R;
import com.example.test1.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {
    public Button viewTransactionsButton;

    private FragmentSlideshowBinding binding;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        button1 = button1.findViewById(R.id.button6);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(this, GameList.class);
//                startActivity(intent);
//
//            }
//        });
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

//        viewTransactionsButton = viewTransactionsButton.findViewById(R.id.viewTransactionsButton);


        /*viewTransactionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_slideshow_to_gameListFragment);
            }
        });*/


        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.buttonGames.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_slideshow_to_gamesListBtnFragment);
        });
        binding.buttonKvests.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_slideshow_to_kvestFragment);
        });
        binding.buttonMasterClasses.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_slideshow_to_gamesFragment);
        });
        binding.buttonSpecialDays.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_slideshow_to_gameListFragment);
        });


        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }




}