package com.decathlon.vitamin.prices

import android.content.Context
import android.text.SpannableString
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView
import fondation.extensions.setStrikethrough

open class VitaminPriceDefaultSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceDefaultSmall
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceDefaultMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceDefaultMedium
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceDefaultLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceDefaultLarge
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAccentSmall
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAccentMedium
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAccentLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAccentLarge
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAlertSmall
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAlertMedium
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceAlertLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceAlertLarge
) : MaterialTextView(context, attrs, defStyleAttr)

open class VitaminPriceStrikethroughSmall @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceStrikethroughSmall
) : MaterialTextView(context, attrs, defStyleAttr) {
    init {
        this.text = SpannableString(this.text).setStrikethrough()
    }
}

open class VitaminPriceStrikethroughMedium @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceStrikethroughMedium
) : MaterialTextView(context, attrs, defStyleAttr) {
    init {
        this.text = SpannableString(this.text).setStrikethrough()
    }
}

open class VitaminPriceStrikethroughLarge @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.vtmnPriceStrikethroughLarge
) : MaterialTextView(context, attrs, defStyleAttr) {
    init {
        this.text = SpannableString(this.text).setStrikethrough()
    }
}
