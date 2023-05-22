package es.davidcorcuera.ordinaria20231.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import es.davidcorcuera.ordinaria20231.R
import es.davidcorcuera.ordinaria2023.model.Movie
import es.davidcorcuera.ordinaria20231.ui.ListFragmentDirections

class MovieAdapter(val data: List<Movie>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title_tv: TextView = view.findViewById(R.id.item_title)

        val textAutor: TextView = view.findViewById(R.id.item_director)
        val ImagePeli: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MovieViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = data[position]
        holder.title_tv.text = item.director
        holder.textAutor.text = item.title
        holder.ImagePeli.setImageResource(item.imageResourceId)

        holder.ImagePeli.setOnClickListener{view ->
            view.findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment())
        }
    }

    override fun getItemCount(): Int = data.size
}