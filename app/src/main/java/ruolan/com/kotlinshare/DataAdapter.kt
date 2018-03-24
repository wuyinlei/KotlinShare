package ruolan.com.kotlinshare

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.user_list_item.view.*

/**
 * Created by wuyinlei on 2018/3/24.
 *
 * @function
 */
class DataAdapter(private val mData: MutableList<User>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent?.context)
                .inflate(R.layout.user_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.user_name.text = mData[position].username
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}