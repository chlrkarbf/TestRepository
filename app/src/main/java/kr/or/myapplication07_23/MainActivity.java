package kr.or.myapplication07_23;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frame;
    BottomNavigationView navigation;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigation = findViewById(R.id.navigation);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();

        //프래그먼트 매니저를 이용하여FrameLayout에 Fragment화면을 설정
        //replace (부모레이아웃, 화면에 출력할 프래그먼트객체)


        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if(itemId == R.id.item_home){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment1).commit();


                }else if(itemId == R.id.item_camera){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment2).commit();


                }else if(itemId == R.id.item_news){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment3).commit();


                }else if(itemId == R.id.item_option){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment4).commit();


                }

                // true : 클릭한 메뉴 아이템에 포커싱을 주겠다
                return true;
            }
        });
    }
}