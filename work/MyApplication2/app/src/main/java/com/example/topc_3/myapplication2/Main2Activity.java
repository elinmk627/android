package com.example.topc_3.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

// Main2Activity는 View.OnClickListener의 구현체
public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

  private TextView textViewRed;
  private TextView textViewBlue;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    // 해당 텍스트뷰에 객체를 참조함
    textViewRed = findViewById(R.id.textViewRed);
    textViewBlue = findViewById(R.id.textViewBlue);

    textViewRed.setOnClickListener(this); //this: 이객체가 구현체이기 때문에 사용가능
    textViewBlue.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    Intent i = new Intent();

    // 어떤 텍스트뷰가 클릭했는지 구분하는 코드가 필요함
    switch (v.getId()) {
      case R.id.textViewRed:
        i.putExtra("color", "Red");
        break;
      case R.id.textViewBlue:
        i.putExtra("color", "Blue");
        break;
    }
    // 데이터를 요구한 액티비티에게 응답함
    setResult(400, i);
    // 액티비티를 코드적으로 파괴시키는 행동
    finish();
  }
}
