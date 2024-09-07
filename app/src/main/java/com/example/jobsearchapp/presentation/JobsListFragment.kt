package com.example.jobsearchapp.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.jobsearchapp.App
import com.example.jobsearchapp.presentation.viewmodel.JobsViewModel
import com.example.jobsearchapp.presentation.viewmodel.ViewModelFactory
import javax.inject.Inject

class JobsListFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var jobsViewModel: JobsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inject dependencies
        (requireActivity().application as App).appComponent.inject(this)

        // Initialize ViewModel
        jobsViewModel = ViewModelProvider(this, viewModelFactory).get(JobsViewModel::class.java)

        // Observe LiveData and update UI
        jobsViewModel.jobData.observe(viewLifecycleOwner, { jobList ->
            // Update RecyclerView with jobs
        })
    }
}