package es.davidcorcuera.ordinaria20231.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import es.davidcorcuera.ordinaria20231.R
import es.davidcorcuera.ordinaria20231.adapter.MovieAdapter
import es.davidcorcuera.ordinaria20231.data.Datasource
import es.davidcorcuera.ordinaria20231.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false)
        return binding.root}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv = binding.recyclerView
        rv.layoutManager = LinearLayoutManager(context)
        rv.adapter = MovieAdapter(Datasource().loadMovies())
    }

}