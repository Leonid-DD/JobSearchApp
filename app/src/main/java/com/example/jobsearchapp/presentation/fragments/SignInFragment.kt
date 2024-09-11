package com.example.jobsearchapp.presentation.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jobsearchapp.R
import com.example.jobsearchapp.databinding.SignInScreenLayoutBinding
import com.example.jobsearchapp.presentation.viewmodel.JobsViewModel

class SignInFragment : Fragment(R.layout.sign_in_screen_layout) {

    private lateinit var jobsViewModel: JobsViewModel

    private var _binding: SignInScreenLayoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SignInScreenLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnContinue.isEnabled = false

        binding.emailInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                binding.btnContinue.isEnabled = true
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.emailInput.error != null) {
                    binding.emailInput.error = null
                }
            }
        })

        binding.btnContinue.setOnClickListener(View.OnClickListener {
            val email = binding.emailInput.text
            if (!CheckIfCharSeqIsEmail(email.toString())) {
                binding.emailInput.error = "Вы ввели неверный Email"
                binding.btnContinue.isEnabled = false
            }
            else {
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.mainFragmentContainerView, Input4DigitCodeFragment())
                    .addToBackStack(null)
                    .commit()
            }
        })
    }

    fun CheckIfCharSeqIsEmail(charSeq: String): Boolean {

        val chars = charArrayOf('@', '.')

        if (!charSeq.contains(chars[0]) || !charSeq.contains(chars[1]) || charSeq.count { it == chars[0] } > 1) return false

        val emailDivided = charSeq.split("@")

        if (!emailDivided[1].contains(chars[1])) return false

        return true
    }
}