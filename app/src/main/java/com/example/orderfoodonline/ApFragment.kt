package com.example.orderfoodonline

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.orderfoodonline.R
import com.example.orderfoodonline.rettp


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ApFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_ap, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var qty: IntArray = intArrayOf(0, 0, 0, 0)

        getView()?.findViewById<Button>(R.id.btApIt1)?.setOnClickListener {
            qty[0] = qty[0] + 1
            rettp(qty)
        }

        getView()?.findViewById<Button>(R.id.btApIt2)?.setOnClickListener {
            qty[1] = qty[1] + 1
            rettp(qty)
        }
        getView()?.findViewById<Button>(R.id.btApIt3)?.setOnClickListener {
            qty[2] = qty[2] + 1
            rettp(qty)
        }
        getView()?.findViewById<Button>(R.id.btApIt4)?.setOnClickListener {
            qty[3] = qty[3] + 1
            rettp(qty)
        }

    }
}

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment BlankFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            BlankFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
