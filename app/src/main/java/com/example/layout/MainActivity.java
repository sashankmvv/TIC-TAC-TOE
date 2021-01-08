package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    static int v1 = 1; //X
    static int v2 = 0;//O
    int result[][] = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View view){
        //Button butt = (Button) view;

        ((ImageView)findViewById(R.id.imageView22)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView23)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView24)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView25)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView26)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView27)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView28)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView29)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView30)).setImageResource(0);
        System.exit(1);
        
    }
    public boolean check(int arr[][],int tagnumber) {
        if (tagnumber == 0 || tagnumber == 3 || tagnumber == 6) {
            if (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]) {
                return true;
            }
            else {
                if (tagnumber == 0) {
                    if (arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] || arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
                        return true;
                    } else {
                        return  false;
                    }
                }
                if (tagnumber == 3) {
                    if (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) {
                        return  true;
                    }
                }
                if (tagnumber == 6) {
                    if (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] || arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
                        return true;
                    }
                }
            }
        }
        else if (tagnumber == 1 || tagnumber == 4 || tagnumber == 7)
        {
            if (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) {
                return true;
            }
            else
                {
                if (tagnumber == 1) {
                    if (arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]) {
                        return  true;
                    }
                }
                if (tagnumber == 4) {
                    if (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2] || arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] || arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
                        return  true;
                    }
                }
                if (tagnumber == 7) {
                    if (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]) {
                        return  true;
                    }
                }
                }

        } else if (tagnumber == 2 || tagnumber == 5 || tagnumber == 8) {
            if (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]) {
                return  true;
            } else {
                if (tagnumber == 2) {
                    if (arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] || arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
                        return  true;
                    }
                }
                else if (tagnumber == 5) {
                    if (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) {
                        return  true;
                    }

                }
              else  if (tagnumber == 8) {
                    if (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] || arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
                        return true;
                    }
              }
            }
        }
        return false;
    }
    public void playerTap(View view) {
        System.out.println(v1);
        if (v1 == 1) {
            ImageView img = (ImageView) view;
            int tagnumber = Integer.parseInt(img.getTag().toString());
            if (tagnumber == 0 && result[0][0]==2) {
                img.setImageResource(R.drawable.x);
                img.animate().translationYBy(1000f).setDuration(300);
                img.animate().translationY(0).setDuration(300);
                result[0][0] = 1;
                 v1 = -1;
                 v2 = 0;
                 if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);
                    
               
                } else {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
            }
            else if (tagnumber == 1  && result[0][1]==2) {
//                img.animate().translationYBy(1000f).setDuration(300);

                img.setImageResource(R.drawable.x);

                result[0][1] = 1;
                 v1 = -1;
                 v2 = 0;
                 if (check(result,tagnumber))
                {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else
                {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
            }
             else if (tagnumber == 2  && result[0][2]==2) {
                img.setImageResource(R.drawable.x);

                result[0][2] = 1;
                 v1 = -1;
                 v2 = 0;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
            } else if (tagnumber == 3  && result[1][0]==2) {
                img.setImageResource(R.drawable.x);
                result[1][0] = 1;
                 v1 = -1;
                 v2 = 0;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
            } else if (tagnumber == 4  && result[1][1]==2) {
                img.setImageResource(R.drawable.x);
                result[1][1] = 1;
                 v1 = -1;
                 v2 = 0;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
            } else if (tagnumber == 5  && result[1][2]==2) {
                img.setImageResource(R.drawable.x);
                result[1][2] = 1;
                 v1 = -1;
                 v2 = 0;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
            } else if (tagnumber == 6  && result[2][0]==2) {
                img.setImageResource(R.drawable.x);
                result[2][0] = 1;
                 v1 = -1;
                 v2 = 0;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
            } else if (tagnumber == 7  && result[2][1]==2) {
                img.setImageResource(R.drawable.x);
                result[2][1] = 1;
                 v1 = -1;
                 v2 = 0;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
            } else if (tagnumber == 8  && result[2][2]==2) {
                img.setImageResource(R.drawable.x);
                result[2][2] = 1;
                 v1 = -1;
                 v2 = 0;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
                }
             }
        }
        if (v2 == 0) {
            ImageView img = (ImageView) view;
            int tagnumber = Integer.parseInt(img.getTag().toString());
            if (tagnumber == 0 && result[0][0] == 2)
            {
                img.setImageResource(R.drawable.zero);
                result[0][0] = 0;
                v1 = 1;
                v2 = -1;
                if (check(result,tagnumber))
                {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);
                } else
                    {
                    Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                    }
            }
            else if (tagnumber == 1 && result[0][1] == 2)
            {
                img.setImageResource(R.drawable.zero);
                result[0][1] = 0;
                v1 = 1;
                v2 = -1;

                if (check(result,tagnumber))
                {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);
                } else
                    {
                    Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                    }
            }


             else if (tagnumber == 2 && result[0][2] == 2)
             {
                img.setImageResource(R.drawable.zero);
                result[0][2] = 0;
            v1 = 1;
            v2 = -1;
            if (check(result,tagnumber))
            {
                Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                reset(view);

            } else {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();

                }
             }

             else if (tagnumber == 3 && result[1][0] == 2) {
                img.setImageResource(R.drawable.zero);
                result[1][0] = 0;
                v1 = 1;
                v2 = -1;
            if (check(result,tagnumber)) {
                Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                reset(view);

            } else {
                Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
            }
            }
             else if (tagnumber == 4 && result[1][1] == 2)
             {
                img.setImageResource(R.drawable.zero);
                result[1][1] = 0;
                 v1 = 1;
                 v2 = -1;
                 if (check(result,tagnumber)) {
                     Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                     reset(view);

                 } else {
                     Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                 }
            } else if (tagnumber == 5 && result[1][2] == 2) {
                img.setImageResource(R.drawable.zero);
                result[1][2] = 0;
                v1 = 1;
                v2 = -1;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                }
            } else if (tagnumber == 6 && result[2][0] == 2) {
                img.setImageResource(R.drawable.zero);
                result[2][0] = 0;
                v1 = 1;
                v2 = -1;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                }
            } else if (tagnumber == 7 && result[2][1] == 2) {
                img.setImageResource(R.drawable.zero);
                result[2][1] = 0;
                v1 = 1;
                v2 = -1;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                }

            } else if (tagnumber == 8 && result[2][2] == 2) {
                img.setImageResource(R.drawable.zero);
                result[2][2] = 0;
                v1 = 1;
                v2 = -1;
                if (check(result,tagnumber)) {
                    Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show();
                    reset(view);

                } else {
                    Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}










