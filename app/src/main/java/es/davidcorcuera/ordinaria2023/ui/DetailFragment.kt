package es.davidcorcuera.ordinaria20231.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import es.davidcorcuera.ordinaria20231.R
import es.davidcorcuera.ordinaria20231.data.Datasource
import es.davidcorcuera.ordinaria20231.databinding.FragmentDetailBinding
import es.davidcorcuera.ordinaria2023.model.Movie

class DetailFragment : Fragment() {

    private lateinit var binding:FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        return binding.root}


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movie: Movie = Datasource().loadMovies()[0]
        binding.imageView.setImageResource(movie.imageResourceId)
        binding.itemTitle.text = movie.title + " (" + movie.year + ")"
        binding.itemDirector.text = movie.director
        binding.itemGenre.text = movie.genre
        binding.itemCast.text = movie.cast.joinToString(separator = "\n")


    }
}