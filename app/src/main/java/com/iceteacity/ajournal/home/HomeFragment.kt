package com.iceteacity.ajournal.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.iceteacity.ajournal.R
import com.iceteacity.ajournal.databinding.FragmentHomeBinding
import com.iceteacity.ajournal.journal.JournalViewModel
import com.iceteacity.ajournal.utils.getViewModel


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHomeBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_home, container, false)

        val view = binding.root

        val journalViewModel: JournalViewModel = getViewModel(this)

        binding.viewmodel = getViewModel(this)





        return view
    }


}
