package com.example.sportlandapp.ui

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sportlandapp.R
import com.example.sportlandapp.databinding.FragmentRegisterSreenBinding

class RegisterScreen : Fragment(R.layout.fragment__register_sreen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentRegisterSreenBinding.bind(view)
        val passwordEditText = binding.passwordLayout
        passwordEditText.editText?.doOnTextChanged { text, _, _, _ ->
            if (text?.length!! < 8)
                passwordEditText.error = "Пароль должен иметь не менее 8 символов"
            else
                passwordEditText.error = null

        }
        binding.nameLayout.typeface = Typeface.DEFAULT_BOLD
        binding.loginLayout.typeface = Typeface.DEFAULT_BOLD
        binding.passwordLayout.typeface = Typeface.DEFAULT_BOLD
        binding.buttonPanel.setOnClickListener {
            findNavController().navigate(R.id.action_registerScreen_to_forma)

        }
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_registerScreen_to_inputScreen)
        }

        }

}

