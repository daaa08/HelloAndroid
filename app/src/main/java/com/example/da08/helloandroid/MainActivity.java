package com.example.da08.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 *  click Listener  구현하는 방법 세가지
 *  1. 위젯을 사용하는 객체가 상속받아서 구현
 *  2. 객체내에서 함수로 생성
 *  3. setOnClickListener 함수에 익명 객체로 전달
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final TextView*/ tv = (TextView)findViewById(R.id.textView);  // 더이상 변경될 가능성이 없으니
       /* Button*/ btn = (Button)findViewById(R.id.btnClick);  // findViewById는 xml 파일의 아이디를 찾기 위한 함수

        // 1번 형태 구현
        btn.setOnClickListener(this);



//        // 2번 형태 구현
//
//        View.OnClickListener listener = new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                tv.setText("안녕 안드로이드");
//            }
//        };


//        // 3번 형태 구현
//        btn.setOnClickListener(new View.OnClickListener() {  // 동기이므로 실행하기전까지는 실행x 셋만해줌
//            @Override
//            public void onClick(View view) {
//                tv.setText("안녕 안드로이드");   // final로 선언해주지 않으면 변수가 변경될 가능성이 있으므로 오류가 뜸
//            }
//        });


        }
    @Override
    public void onClick(View v){
        tv.setText("안녕 안드로이드");
    }

}

