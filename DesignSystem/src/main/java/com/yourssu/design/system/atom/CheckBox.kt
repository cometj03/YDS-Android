package com.yourssu.design.system.atom

import android.content.Context
import android.graphics.PointF
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.content.withStyledAttributes
import com.yourssu.design.R
import com.yourssu.design.databinding.LayoutCheckBoxBinding
import com.yourssu.design.system.foundation.Icon
import com.yourssu.design.system.foundation.Typo
import com.yourssu.design.system.language.ComponentGroup
import com.yourssu.design.undercarriage.size.dpToPx
import kotlin.math.abs


class CheckBox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding: LayoutCheckBoxBinding =
        LayoutCheckBoxBinding.inflate(LayoutInflater.from(context), this, true)

    var size: Int = SMALL
        set(value) {
            field = value
            setSizeState()
        }

    var label: String = ""
        set(value) {
            field = value
            changeText()
        }

    var isDisabled: Boolean = false
        set(value) {
            field = value
            setState()
        }

    private val touchPoint = PointF(0f, 0f)

    init {
        context.withStyledAttributes(attrs, R.styleable.CheckBox) {
            isDisabled = getBoolean(R.styleable.CheckBox_isDisabled, false)
            isSelected = getBoolean(R.styleable.CheckBox_isSelected, false)
            size = getInt(R.styleable.CheckBox_size, SMALL)
            label = getString(R.styleable.CheckBox_label).toString()
        }
    }

    override fun setSelected(selected: Boolean) {
        super.setSelected(selected)
        setState()
    }

    private fun setState() {
        setTotalColor()
        setDrawable()
        setSizeState()
    }

    private fun setTotalColor() {
        when (isDisabled) {
            true ->
                changeTotalColor(R.color.buttonDisabled)
            false ->
                if (isSelected)
                    changeTotalColor(R.color.buttonPoint)
                else
                    changeTotalColor(R.color.buttonNormal)
        }
    }

    private fun setDrawable() {
        when (isSelected) {
            true -> changeDrawable(Icon.ic_checkcircle_filled)
            false -> changeDrawable(Icon.ic_checkcircle_line)
        }
    }

    private fun setSizeState() {
        when (size) {
            SMALL -> {
                if (isDisabled) {
                    changeTotalSize(Typo.Button4, MARGIN_SMALL, IconView.ExtraSmall)
                } else {
                    changeTotalSize(Typo.Button3, MARGIN_SMALL, IconView.ExtraSmall)
                }
            }
            MEDIUM -> changeTotalSize(Typo.Button3, MARGIN_MEDIUM, IconView.Small)
            LARGE -> changeTotalSize(Typo.Button3, MARGIN_LARGE, IconView.Medium)
            else -> changeTotalSize(Typo.Button4, MARGIN_SMALL, IconView.ExtraSmall)
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        super.onTouchEvent(event)

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (!isDisabled) {
                    touchPoint.set(event.x, event.y)
                }
            }
            MotionEvent.ACTION_UP -> {
                if (abs(touchPoint.x - event.x) < width.toFloat()
                    && abs(touchPoint.y - event.y) < height.toFloat()
                ) {
                    performClick()
                }
            }
        }

        return true
    }

    private fun toggle() {
        if (!isDisabled) {
            isSelected = !isSelected
            setState()
        }
    }

    override fun performClick(): Boolean {
        super.performClick()
        toggle()
        return true
    }

    companion object {
        const val SMALL = 1
        const val MEDIUM = 2
        const val LARGE = 3
        private const val MARGIN_SMALL = 4f
        private const val MARGIN_MEDIUM = 8f
        private const val MARGIN_LARGE = 8f

        fun Context.checkBox(block: CheckBox.() -> Unit) = CheckBox(this).run {
            block.invoke(this)
            this
        }

        fun ViewGroup.checkBox(block: CheckBox.() -> Unit) = CheckBox(this.context).run {
            block.invoke(this)
            this@checkBox.addView(this)
            this
        }

        fun ComponentGroup.checkBox(block: CheckBox.() -> Unit) =
            CheckBox(this.componentContext).run {
                block.invoke(this)
                this@checkBox.addComponent(this)
                this
            }
    }

    // change means will access to binding
    private fun changeTotalSize(typo: Int, marginSize: Float, imageSize: Int) {
        changeTypo(typo)
        changeMarginLeft(marginSize)
        changeImageSize(imageSize)
    }

    private fun changeTotalColor(color_id: Int) {
        changeDrawableColor(color_id)
        changeTextColor(color_id)
    }

    private fun changeTextColor(colorId: Int) {
        binding.text.setTextColor(ContextCompat.getColor(context, colorId))
    }

    private fun changeDrawableColor(colorId: Int) {
        binding.icon.setColorFilter(ContextCompat.getColor(context, colorId))
    }

    private fun changeTypo(typo: Int) {
        binding.text.typo = typo
    }

    private fun changeImageSize(value: Int) {
        binding.icon.setIconViewSize(value)
    }

    private fun changeMarginLeft(value: Float) {
        (binding.text.layoutParams as LayoutParams).setMargins(
            context.dpToPx(value).toInt(),
            0,
            0,
            0
        )
    }

    private fun changeText() {
        binding.text.text = label
    }

    private fun changeDrawable(value: Int) {
        binding.icon.setIconResource(value)
    }
}
