package com.decathlon.vitamin.dividers

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.divider.MaterialDivider

open class VitaminFullBleedDivider @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerFullBleed
) : MaterialDivider(context, attrs, defStyleAttr)

open class VitaminInsetDivider @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerInset
) : MaterialDivider(context, attrs, defStyleAttr)

open class VitaminMiddleDivider @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerMiddle
) : MaterialDivider(context, attrs, defStyleAttr)
