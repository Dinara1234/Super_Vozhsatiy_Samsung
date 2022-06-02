package com.example.test1.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.test1.R;
import com.example.test1.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        binding.imageButton1.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_gallery_to_lesson_1_Fragment);
        });
        binding.  imageButton2.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_gallery_to_lesson_2_Fragment);
        });
        binding.imageButton3.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_gallery_to_lesson_3_Fragment);
        });
        binding.imageButton4.setOnClickListener(view -> {
            Navigation.findNavController(getView()).navigate(R.id.action_nav_gallery_to_lesson_4_Fragment);
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}