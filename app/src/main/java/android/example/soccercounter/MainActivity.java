package android.example.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int rma_score = 0;
    int fcb_score =0;

    int rma_foul = 0;
    int fcb_foul =0;

    int rma_corner = 0;
    int fcb_corner = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForRMA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.real_score);
        scoreView.setText(String.valueOf(score));

        TextView goalView = (TextView) findViewById(R.id.rma_goal);
        goalView.setText(String.valueOf(score));
    }

    public void displayForFCB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barca_score);
        scoreView.setText(String.valueOf(score));
        TextView goalView = (TextView) findViewById(R.id.fcb_goal);
        goalView.setText(String.valueOf(score));
    }



    public void rma_goal(View view){
        rma_score = rma_score +1 ;
        displayForRMA(rma_score);

    }

    public void fcb_goal(View view){
        fcb_score = fcb_score +1 ;
        displayForFCB(fcb_score);

    }

    public void rmaFoul(View view){
        rma_foul = rma_foul +1 ;
        TextView foulView = (TextView) findViewById(R.id.rma_foul);
        foulView.setText(String.valueOf(rma_foul));

    }

    public void fcbFoul(View view){
        fcb_foul = fcb_foul +1 ;
        TextView foulView = (TextView) findViewById(R.id.fcb_foul);
        foulView.setText(String.valueOf(fcb_foul));

    }

    public void rmaCorner(View view){
        rma_corner = rma_corner +1 ;
        TextView cornerView = (TextView) findViewById(R.id.rma_corner);
        cornerView.setText(String.valueOf(rma_corner));

    }

    public void fcbCorner(View view){
        fcb_corner = fcb_corner +1 ;
        TextView cornerView = (TextView) findViewById(R.id.fcb_corner);
        cornerView.setText(String.valueOf(fcb_corner));

    }

    public void reset(View v){

        rma_score = 0;
        fcb_score =0;

        rma_foul = 0;
        fcb_foul =0;

        rma_corner = 0;
        fcb_corner = 0;

        TextView cornerView = (TextView) findViewById(R.id.fcb_corner);
        cornerView.setText(String.valueOf(fcb_corner));

        TextView cornerView1 = (TextView) findViewById(R.id.rma_corner);
        cornerView1.setText(String.valueOf(rma_corner));

        TextView foulView = (TextView) findViewById(R.id.fcb_foul);
        foulView.setText(String.valueOf(fcb_foul));

        TextView foulView1 = (TextView) findViewById(R.id.rma_foul);
        foulView1.setText(String.valueOf(rma_foul));

        displayForFCB(fcb_score);
        displayForRMA(rma_score);


    }

}
