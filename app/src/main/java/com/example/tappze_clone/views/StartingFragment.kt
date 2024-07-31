package com.example.tappze_clone.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tappze_clone.R
import com.example.tappze_clone.databinding.FragmentStartingFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartingFragment : Fragment() {

    lateinit var binding: FragmentStartingFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartingFragmentBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Initialize views and set click listeners
        clickListeners()
    }

    private fun clickListeners() {
        // Find views by ID

        // Set click listeners
    binding.createAccountButton.setOnClickListener {
            // Handle create account button click

            findNavController().navigate(R.id.action_starting_fragment_to_signUpFragment2)
        }

       binding.signInText.setOnClickListener {
            findNavController().navigate(R.id.action_starting_fragment_to_logInFragment)

            // Handle sign in text click
        }
    }


    override fun onDestroy() {
        super.onDestroy()

    }
}
