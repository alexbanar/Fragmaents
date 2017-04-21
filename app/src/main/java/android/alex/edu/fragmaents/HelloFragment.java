package android.alex.edu.fragmaents;


import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment implements View.OnClickListener {

    Button buttonClickMe;
    FrameLayout layoutHello;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hello, container, false);

        buttonClickMe = (Button) v.findViewById(R.id.btnClickMe);
        layoutHello = (FrameLayout) v.findViewById(R.id.layoutHello);

        buttonClickMe.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view)
    {
        Random randomGenerator = new Random();
        //int alfa = random.nextInt(256);
        int red = randomGenerator.nextInt(256);
        int green = randomGenerator.nextInt(256);
        int blue = randomGenerator.nextInt(256);
        int rbg = Color.rgb(red, blue, green);
        layoutHello.setBackgroundColor(rbg);
    }
}
