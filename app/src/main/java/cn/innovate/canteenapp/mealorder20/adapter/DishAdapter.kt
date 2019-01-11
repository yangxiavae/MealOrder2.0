package cn.innovate.canteenapp.mealorder20.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.innovate.canteenapp.mealorder20.R

/**
 *created by yang on 2019-01-10
 *
 **/
class DishAdapter(val data:List<String>) : RecyclerView.Adapter<DishAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.activity_main,parent,false)
        return ViewHolder(view);
    }

    override fun getItemCount(): Int {
        if (data==null){
            return 0;
        }
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    class ViewHolder(val v :View): RecyclerView.ViewHolder(v) {

    }


}