package com.kishan.onboardingexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter

class ViewPager2Adapter(private val context:Context) : RecyclerView.Adapter<ViewPager2Adapter.ViewHolder>() {
   inner class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image : ImageView
        val titleView : TextView
        val subTitleView: TextView

        init {
            image = itemView.findViewById(R.id.img_1)
            titleView = itemView.findViewById(R.id.title_1)
            subTitleView = itemView.findViewById(R.id.subTitle1)
        }


    }

//    var layoutInflater: LayoutInflater? = null

    //array of image ,title, subtitle
    val imgArray = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
    )

    val title  = arrayOf(
        "OnBoarding Screen 1",
        "OnBoarding Screen 2",
        "OnBoarding Screen 3",
        "OnBoarding Screen 4",
    )

    val subtitle = arrayOf(
        R.string.lorem_text,
        R.string.lorem_text,
        R.string.lorem_text,
        R.string.lorem_text,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.slider, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(imgArray[position])
        holder.titleView.text = title[position]
        holder.subTitleView.text = subtitle[position].toString()
    }
//    override fun getCount(): Int {
//      return title.size
//    }
//
//    override fun isViewFromObject(view: View, `object`: Any): Boolean {
//        return view == `object` as RelativeLayout
//    }
//
//    override fun instantiateItem(container: ViewGroup, position: Int): Any {
//        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        val view = layoutInflater!!.inflate(R.layout.slider, container, false)
//
//        val img = view.findViewById<ImageView>(R.id.img_1)
//        val title_txt = view.findViewById<TextView>(R.id.title_1)
//        val subTitle_txt= view.findViewById<TextView>(R.id.subTitle1)
//
//        img.setImageResource(imgArray[position])
//        title_txt.text = title[position]
//        subTitle_txt.text = subtitle[position].toString()
//
//        container.addView(view)
//        return view
//    }
//
//    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
//        container.removeView(`object` as ConstraintLayout)
//    }
}