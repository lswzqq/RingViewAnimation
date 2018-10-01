package com.konggeek.dnine.ctrl.other;

import android.view.View;

import com.konggeek.dnine.R;
import com.konggeek.dnine.base.ClientFragment;
import com.konggeek.dnine.ctrl.other.vm.TestFmViewModel;
import com.konggeek.dnine.databinding.FmTestviewBinding;

public class TestFragment extends ClientFragment<FmTestviewBinding ,TestFmViewModel> {

    @Override
    public int initLayoutId() {
        return R.layout.fm_testview;
    }

    @Override
    protected TestFmViewModel initViewModel() {
        return new TestFmViewModel(this,bind);
    }

    @Override
    public void onCreateView(View viewRoot) {
        super.onCreateView(viewRoot);
        initTitleBar("测试");
    }
}
