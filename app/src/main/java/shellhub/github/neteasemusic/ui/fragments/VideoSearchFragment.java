package shellhub.github.neteasemusic.ui.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shellhub.github.neteasemusic.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoSearchFragment extends Fragment {


    public VideoSearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video_search, container, false);
    }

}
