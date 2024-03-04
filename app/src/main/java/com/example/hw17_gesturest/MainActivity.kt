package com.example.hw17_gesturest

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private lateinit var infoTextView: TextView
    private lateinit var gestureDetector: GestureDetectorCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView = findViewById(R.id.infoTextView)
        gestureDetector = GestureDetectorCompat(this, this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (infoTextView.text.toString().split("\n").size > 15) {
            infoTextView.text = ""
        }
        gestureDetector.onTouchEvent(event!!)
        return super.onTouchEvent(event)
    }

    override fun onDown(event: MotionEvent): Boolean {
        infoTextView.text = infoTextView.text.toString() + "onDown" + "\n"
        return true
    }

    override fun onShowPress(event: MotionEvent) {
        infoTextView.text = infoTextView.text.toString() + "onShowPress" + "\n"
    }

    override fun onSingleTapUp(event: MotionEvent): Boolean {
        infoTextView.text = infoTextView.text.toString() + "onSingleTapUp" + "\n"
        return true
    }

    override fun onScroll(
        event1: MotionEvent?,
        event2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        infoTextView.text = infoTextView.text.toString() +  "onScroll" + "\n"
        return true
    }

    override fun onLongPress(event: MotionEvent) {
        infoTextView.text = infoTextView.text.toString() + "onLongPress" + "\n"
    }


    override fun onFling(
        event1: MotionEvent?,
        event2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        infoTextView.text = infoTextView.text.toString() + "onFling" + "\n"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        infoTextView.text = infoTextView.text.toString() + "onSingleTapConfirmed" + "\n"
        return true
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        infoTextView.text = infoTextView.text.toString() + "onDoubleTap" + "\n"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        infoTextView.text = infoTextView.text.toString() + "onDoubleTapEvent" + "\n"
        return true
    }

}
