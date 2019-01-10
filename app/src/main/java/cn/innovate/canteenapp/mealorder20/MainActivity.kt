package cn.innovate.canteenapp.mealorder20

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_login.text="hello world"
        btn_login.setOnClickListener(View.OnClickListener {
            toast("你好，拥抱kotlin世界")
        })
    }
}
