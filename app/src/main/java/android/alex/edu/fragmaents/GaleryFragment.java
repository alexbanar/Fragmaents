package android.alex.edu.fragmaents;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class GaleryFragment extends Fragment implements View.OnClickListener
{
    private ImageButton imageButtonLeft;
    private ImageButton imageButtonRight;
    private ImageView imageViewGalery;


    private int count = 0;
    private int[] images = {R.mipmap.ic_launcher_flower1, R.mipmap.ic_launcher_flower2,
                            R.mipmap.ic_launcher_flower3, R.mipmap.ic_launcher_flower4};

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_galery, container, false);

        imageButtonLeft = (ImageButton) v.findViewById(R.id.ibtnLeft);
        imageButtonRight = (ImageButton) v.findViewById(R.id.ibtnRight);
        imageViewGalery = (ImageView) v.findViewById(R.id.ivGalery);


        imageButtonLeft.setOnClickListener(this);
        imageButtonRight.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view)
    {
        imageViewGalery.setImageResource(images[count]);
        if (((ImageButton) view).getId() == R.id.ibtnLeft)
        {
           if (count == (images.length - 1)) {
                count = 0;
            }
            else
            {
                count += 1;
            }
        }
        else
        {
            if (((ImageButton) view).getId() == R.id.ibtnRight)
            {
                if (count == 0) {
                    count = images.length - 1;
                }
                else
                {
                    count -= 1;
                }
            }
           else
            {
                Toast.makeText(getActivity(), "Illegal button id", Toast.LENGTH_LONG).show();
            }
        }

        imageViewGalery.setImageResource(images[count]);
    }

}
