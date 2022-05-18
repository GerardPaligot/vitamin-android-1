package com.decathlon.vitamin.dividers

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.divider.MaterialDivider
import com.google.android.material.divider.MaterialDividerItemDecoration

open class VitaminFullBleedDividerItemDecoration @JvmOverloads constructor(
    context: Context,
    orientation: Int,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerFullBleed
) : MaterialDividerItemDecoration(context, attrs, defStyleAttr, orientation)

open class VitaminInsetDividerItemDecoration @JvmOverloads constructor(
    context: Context,
    orientation: Int,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerInset
) : MaterialDividerItemDecoration(context, attrs, defStyleAttr, orientation)

open class VitaminMiddleDividerItemDecoration @JvmOverloads constructor(
    context: Context,
    orientation: Int,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnDividerMiddle
) : MaterialDividerItemDecoration(context, attrs, defStyleAttr, orientation)
