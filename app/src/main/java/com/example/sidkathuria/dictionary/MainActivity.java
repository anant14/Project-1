package com.example.sidkathuria.dictionary;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Build;
        import android.provider.Settings;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.sidkathuria.dictionary.Services.FloatingWidgetService;
        import com.example.sidkathuria.dictionary.activities.AllActivities;
        import com.example.sidkathuria.dictionary.activities.FeedBackActivity;
        import com.example.sidkathuria.dictionary.activities.Result;
        import com.example.sidkathuria.dictionary.activities.TranslateActivity;

        import retrofit2.Retrofit;
        import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private static final int DRAW_OVER_OTHER_APP_PERMISSION_REQUEST_CODE = 1222;


    Button btnWordOfTheDay,btnInput,btnFeedBack,btnAllLanguages,btnTranslate;EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


((Button)findViewById(R.id.btnStartService)).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startService(new Intent(MainActivity.this,FloatingWidgetService.class));
    }
});



        btnTranslate = (Button)findViewById(R.id.btnTranslate);
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TranslateActivity.class));
            }
        });
    btnAllLanguages =(Button) findViewById(R.id.btnAllLanguages);

        btnAllLanguages.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        startActivity(new Intent(MainActivity.this, AllActivities.class));
    }
    });

    //FEEDBACK
    btnFeedBack =(Button)

    findViewById(R.id.btnFeedBack);
        btnFeedBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v){
        startActivity(new Intent(MainActivity.this, FeedBackActivity.class));
    }
    });

etInput = (EditText)findViewById(R.id.etInput);
    btnInput =(Button) findViewById(R.id.btnInput);

    btnWordOfTheDay =(Button) findViewById(R.id.btnWordOfTheDay);

    etInput =(EditText) findViewById(R.id.etInput);

        btnInput.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
        Intent i = new Intent(MainActivity.this, Result.class);
        i.putExtra("word", etInput.getText());
        startActivity(i);
    }
    });
}
//    public void createFloatingWidget(View view) {
//        //Check if the application has draw over other apps permission or not?
//        //This permission is by default available for API<23. But for API > 23
//        //you have to ask for the permission in runtime.
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(this)) {
//            //If the draw over permission is not available open the settings screen
//            //to grant the permission.
//            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
//                    Uri.parse("package:" + getPackageName()));
//            startActivityForResult(intent, DRAW_OVER_OTHER_APP_PERMISSION_REQUEST_CODE);
//        } else
//            //If permission is granted start floating widget service
//            startFloatingWidgetService();
//
//    }
//
//    /*  Start Floating widget service and finish current activity */
//    private void startFloatingWidgetService() {
//        startService(new Intent(MainActivity.this, FloatingWidgetService.class));
//        finish();
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == DRAW_OVER_OTHER_APP_PERMISSION_REQUEST_CODE) {
//            //Check if the permission is granted or not.
//            if (resultCode == RESULT_OK)
//                //If permission granted start floating widget service
//                startFloatingWidgetService();
//            else
//                //Permission is not available then display toast
//                Toast.makeText(this,
//                        getResources().getString(R.string.draw_other_app_permission_denied),
//                        Toast.LENGTH_SHORT).show();
//
//        } else {
//            super.onActivityResult(requestCode, resultCode, data);
//        }
    }



