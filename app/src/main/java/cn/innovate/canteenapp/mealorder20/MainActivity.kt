package cn.innovate.canteenapp.mealorder20

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import cn.innovate.canteenapp.mealorder20.adapter.DishAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    private var layoutManager: GridLayoutManager? = null
    private var adapter: DishAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        btn_login.text = "hello world"
        btn_login.setOnClickListener(View.OnClickListener {
            toast("你好，拥抱kotlin世界")
        })
    }

    private fun init() {
        var data:List<String>?=null
        layoutManager = GridLayoutManager(this, 3)
        dish.layoutManager = layoutManager
        dish.adapter = adapter
    }
}
