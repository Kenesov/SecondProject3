package uz.datalife.secondproject.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import uz.datalife.secondproject.R
import uz.datalife.secondproject.databinding.FragmentGameBinding

class FragmentGame:Fragment(R.layout.fragment_game) {
    private lateinit var binding: FragmentGameBinding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGameBinding.bind(view)
    }
}