/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.buffer.android.buffertextinputlayout.util;

import android.support.annotation.NonNull;

import org.buffer.android.buffertextinputlayout.ValueAnimatorCompat;
import org.buffer.android.buffertextinputlayout.ValueAnimatorCompatImpl;

public class ViewUtils {

    private static final ValueAnimatorCompat.Creator DEFAULT_ANIMATOR_CREATOR
            = new ValueAnimatorCompat.Creator() {
        @NonNull
        @Override
        public ValueAnimatorCompat createAnimator() {
            return new ValueAnimatorCompat(new ValueAnimatorCompatImpl());
        }
    };

    public static ValueAnimatorCompat createAnimator() {
        return DEFAULT_ANIMATOR_CREATOR.createAnimator();
    }

}