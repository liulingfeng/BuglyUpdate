package com.llf.update;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by llf on 2016/12/9.
 */

public class App extends TinkerApplication{
    public App() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.llf.update.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
