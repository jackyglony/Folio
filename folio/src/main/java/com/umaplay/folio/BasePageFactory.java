package com.umaplay.folio;

import com.umaplay.folio.animator.PageAnimatorFactory;

/**
 * Created by user on 2/29/2016.
 */
public abstract class BasePageFactory implements PageFactory {

    private PageAnimatorFactory mAnimatorFactory;

    @Override
    public void setAnimatorFactory(PageAnimatorFactory outPageAnimatorFactory) {
        mAnimatorFactory = outPageAnimatorFactory;
    }

    @Override
    public PageAnimatorFactory getAnimatorFactory() {
        return mAnimatorFactory;
    }
}
