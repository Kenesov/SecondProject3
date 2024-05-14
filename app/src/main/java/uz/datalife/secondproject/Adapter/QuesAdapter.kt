
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import uz.datalife.secondproject.Data.MenuTest
import uz.datalife.secondproject.R
import uz.datalife.secondproject.databinding.FragmentMenuTestBinding
import uz.datalife.secondproject.databinding.ItemTextMenuBinding

class QuesAdapter: Adapter<QuesAdapter.QuessViewHolder>() {



    inner class QuessViewHolder(private val binding: ItemTextMenuBinding):
   RecyclerView.ViewHolder(binding.root) {

       private lateinit var navController: NavController
       fun bind(menuTest: MenuTest){
            binding.textMenu.text = menuTest.class_name

       }
    }
    var models = listOf<MenuTest>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuessViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_text_menu, parent, false)
        val binding = ItemTextMenuBinding.bind(view)
        return QuessViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: QuessViewHolder, position: Int) {
        holder.bind(models[position])
    }
}