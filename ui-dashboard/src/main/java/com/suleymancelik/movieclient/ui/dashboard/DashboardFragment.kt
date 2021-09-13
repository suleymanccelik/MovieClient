package com.suleymancelik.movieclient.ui.dashboard

import com.suleymancelik.movieclient.common.ui.BaseFragment
import com.suleymancelik.movieclient.common.ui.binding.viewBinding
import com.suleymancelik.movieclient.ui.dashboard.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment() {

    private val mDashboardLayoutBinding by viewBinding(FragmentDashboardBinding::bind)

    override fun invalidate() {

    }
}