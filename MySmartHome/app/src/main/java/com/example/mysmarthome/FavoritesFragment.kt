import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mysmarthome.AddActionThingsFragment
import com.example.mysmarthome.R
import com.example.mysmarthome.SelectRoutineActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FavoritesFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorites, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Find the FloatingActionButton using its id
        val favAddButton = view.findViewById<FloatingActionButton>(R.id.favorite_addBtn)
        // Set a click listener on the FloatingActionButton
        favAddButton.setOnClickListener {
            val intent = Intent(activity, SelectRoutineActivity::class.java)
            startActivity(intent)
            // Handle the click event here

        }
    }


}

