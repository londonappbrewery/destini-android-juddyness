package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    final int TOP_CHOICE = 1;
    final int BOTTOM_CHOICE= 2;

    int mStoryDirection= 0; //0 for initialize; 1 for left; 2 for right


    // TODO: Steps 4 & 8 - Declare member variables here:
     TextView mStory;
     Button mtopButton;
     Button mbottomButton;
     int top = 1;

     int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = (TextView) findViewById(R.id.storyTextView);
        mtopButton = (Button) findViewById(R.id.buttonTop);
        mbottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mtopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Top button pressed");

                updateStory(TOP_CHOICE);


            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Bottom button pressed");
                 updateStory(BOTTOM_CHOICE);

            }
        });

    } //end of onCreate()


        private void updateStoryIndex() {

                mStoryIndex = mStoryIndex + 1;

        }

        private void isFinished() {
            if(mStoryIndex==4 || mStoryIndex>4) {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Game Over");
                alert.setCancelable(false);
                alert.setMessage("Thank you for playing");
                alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alert.show();
            }
        }


        private void updateStory(int choice) {
            if(choice == 1 && mStoryIndex==1 && mStoryDirection==0) { //if choice equals top button and story is at the first level
                    //show t3_story and t3_button texts
                    mStory.setText(R.string.T3_Story);
                    mtopButton.setText(R.string.T3_Ans1);
                    mbottomButton.setText(R.string.T3_Ans2);
                    mStoryDirection = 1;
            System.out.println("Choice: " + choice);
            System.out.println("mStoryIndex " + mStoryIndex);
            System.out.println("StoryDirection: " + mStoryDirection);

                } else if (choice == 2 && mStoryIndex == 1 && mStoryDirection == 0) {
                    //show t2_story and t2_button texts
                    mStory.setText(R.string.T2_Story);
                    mtopButton.setText(R.string.T2_Ans1);
                    mbottomButton.setText(R.string.T2_Ans2);
                    mStoryDirection = 2;
            System.out.println("Choice: " + choice);
            System.out.println("mStoryIndex " + mStoryIndex);
            System.out.println("StoryDirection: " + mStoryDirection);
                }


            if (choice == 1 && mStoryIndex ==2 && mStoryDirection == 1 ) {
                mStory.setText(R.string.T6_End);
                mtopButton.setText("");
                mbottomButton.setText("");
                mStoryIndex=4;
            System.out.println("Choice: " + choice);
            System.out.println("mStoryIndex " + mStoryIndex);
            System.out.println("StoryDirection: " + mStoryDirection);

            } else if (choice == 2 && mStoryIndex==2 && mStoryDirection ==1){
                mStory.setText(R.string.T5_End);
                mtopButton.setText("");
                mbottomButton.setText("");
                mStoryIndex=4;
            System.out.println("Choice: " + choice);
            System.out.println("mStoryIndex " + mStoryIndex);
            System.out.println("StoryDirection: " + mStoryDirection);
            }

            if (choice == 1 && mStoryIndex==2 && mStoryDirection ==2) {
                mStory.setText(R.string.T3_Story);
                mtopButton.setText(R.string.T3_Ans1);
                mbottomButton.setText(R.string.T3_Ans2);
                mStoryDirection = 2;
            System.out.println("Choice: " + choice);
            System.out.println("mStoryIndex " + mStoryIndex);
            System.out.println("StoryDirection: " + mStoryDirection);
            } else if (choice == 2 && mStoryIndex==2 && mStoryDirection ==2) {
                mStory.setText(R.string.T4_End);
                mtopButton.setText("");
                mbottomButton.setText("");
                mStoryIndex=4;
            System.out.println("Choice: " + choice);
            System.out.println("mStoryIndex " + mStoryIndex);
            System.out.println("StoryDirection: " + mStoryDirection);
            }

            if (choice == 1 && mStoryIndex == 3) {
                mStory.setText(R.string.T6_End);
                mtopButton.setText("");
                mbottomButton.setText("");
                mStoryIndex=4;
            System.out.println("Choice: " + choice);
            System.out.println("mStoryIndex " + mStoryIndex);
            System.out.println("StoryDirection: " + mStoryDirection);
            } else if (choice == 2 && mStoryIndex==3){
                mStory.setText(R.string.T5_End);
                mtopButton.setText("");
                mbottomButton.setText("");
                mStoryIndex=4;
            System.out.println("Choice: " + choice);
            System.out.println("mStoryIndex " + mStoryIndex);
            System.out.println("StoryDirection: " + mStoryDirection);
            }

            isFinished();
            updateStoryIndex();

        }//end of updateStory()

//        public void trace(){
//            //trace
//            System.out.println("Choice: " + choice);
//            System.out.println("mStoryIndex " + mStoryIndex);
//            System.out.println("StoryDirection: " + mStoryDirection);
//    }


}//end of clase
