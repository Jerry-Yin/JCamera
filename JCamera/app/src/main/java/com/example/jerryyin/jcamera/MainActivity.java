package com.example.jerryyin.jcamera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by JerryYin on 12/7/15.
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }


    public void functionChoose(View v){
        switch (v.getId()){
            case R.id.btn_take_photo:
                Intent intent = new Intent(MainActivity.this, JCameraActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_beauty:
                Intent intent1 = new Intent(MainActivity.this, JBeautyImgActivity.class);
                startActivity(intent1);
                break;

//            case R.id.btn_take_photo:
//
//                break;

            default:
                break;
        }
    }
}
