package uz.datalife.secondproject.ui

import QuesAdapter
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import uz.datalife.secondproject.Data.MenuTest
import uz.datalife.secondproject.Data.Question
import uz.datalife.secondproject.R
import uz.datalife.secondproject.databinding.FragmentMenuTestBinding

class FragmentMenuTest: Fragment(R.layout.fragment_menu_test) {
    private lateinit var binding: FragmentMenuTestBinding
    private lateinit var navController: NavController
    private val adapter = QuesAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMenuTestBinding.bind(view)

        val navHostFragment = requireActivity().supportFragmentManager
            .findFragmentById(R.id.fragment_container) as NavHostFragment
        navController = navHostFragment.findNavController()

        setMockData()

        binding.apply {
            recyclerView.adapter = adapter
            recyclerView.addItemDecoration(
                DividerItemDecoration(
                    context,
                    DividerItemDecoration.VERTICAL
                )
            )
            btnBack.setOnClickListener {
                navController.navigate(R.id.action_fragmentMenuTest_to_fragmentGame)
            }
        }
    }

    private fun setMockData() {
        val data = mutableListOf<MenuTest>()
        repeat(7) {
            data.add(MenuTest(it, "${it + 5} - sinf Informatika"))
        }
        adapter.models = data
    }
}