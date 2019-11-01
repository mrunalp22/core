package com.core.base.reusableBase;

import com.core.base.BaseCase;
import com.core.reusable.ReusableTescaseSteps;

public class ReusableUtilsObject {
    protected ReusableTescaseSteps reusableTescaseSteps;

    public void classInitialize() {
        reusableTescaseSteps = new ReusableTescaseSteps();
    }
}
