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
import com.example.tappze_clone.databinding.FragmentLogInBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LogInFragment : Fragment() {
lateinit var binding: FragmentLogInBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLogInBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        clickListeners()
    }

    private fun clickListeners() {


        binding.forgotPassword.setOnClickListener{

        }

        binding.arrowBack.setOnClickListener{
            findNavController().popBackStack()
        }

      binding.siButton.setOnClickListener {
            // Handle create account button click

          //  findNavController().navigate(R.id.action_starting_fragment_to_signUpFragment2)
        }
       binding.signUp.setOnClickListener{
           findNavController().navigate(R.id.action_logInFragment_to_signUpFragment)
        }
    }


}