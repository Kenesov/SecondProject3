package uz.datalife.secondproject.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import uz.datalife.secondproject.R
import uz.datalife.secondproject.databinding.FragmentResaltBinding

class FragmentResalt: Fragment(R.layout.fragment_resalt) {
    private lateinit var binding: FragmentResaltBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResaltBinding.bind(view)


    }

}