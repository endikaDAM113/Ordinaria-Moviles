package es.davidcorcuera.ordinaria20231.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import es.davidcorcuera.ordinaria20231.R
import es.davidcorcuera.ordinaria20231.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding

    private var puntos = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            this.findNavController().navigate(R.id.action_titleFragment_to_listFragment)
        }

        binding.incrementButton.setOnClickListener {
            puntos++
            actualizaPuntos()
        }
        binding.decrementButton.setOnClickListener {
            puntos--
            actualizaPuntos()
        }
    }

    private fun actualizaPuntos() {
        binding.puntos.text = puntos.toString()
    }
}