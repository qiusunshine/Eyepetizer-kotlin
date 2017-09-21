package com.zyqzyq.eyepetizer

import android.content.Context
import android.util.AttributeSet
import com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer

/**
 * 无任何控制ui的播放
 * copy from https://github.com/CarGuo/GSYVideoPlayer/blob/master/app/src/main/java/com/example/gsyvideoplayer/video/EmptyControlVideo.java
 */

class EmptyControlVideo : StandardGSYVideoPlayer {

    constructor(context: Context, fullFlag: Boolean?) : super(context, fullFlag!!) {}

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    override fun getLayoutId(): Int {
        return R.layout.empty_control_video
    }

    override fun touchSurfaceMoveFullLogic(absDeltaX: Float, absDeltaY: Float) {
        super.touchSurfaceMoveFullLogic(absDeltaX, absDeltaY)
        //不给触摸快进，如果需要，屏蔽下方代码即可
        mChangePosition = false

        //不给触摸音量，如果需要，屏蔽下方代码即可
        mChangeVolume = false

        //不给触摸亮度，如果需要，屏蔽下方代码即可
        mBrightness = false
    }

    override fun dismissVolumeDialog() {
        super.dismissVolumeDialog()
    }
    open class EmptyControlVideoCallBack : VideoAllCallBack {
        override fun onEnterFullscreen(url: String?, vararg objects: Any?) {

        }

        override fun onClickResume(url: String?, vararg objects: Any?) {
        }

        override fun onClickSeekbarFullscreen(url: String?, vararg objects: Any?) {
        }

        override fun onClickBlankFullscreen(url: String?, vararg objects: Any?) {
        }

        override fun onPrepared(url: String?, vararg objects: Any?) {
        }

        override fun onClickStartIcon(url: String?, vararg objects: Any?) {
        }

        override fun onAutoComplete(url: String?, vararg objects: Any?) {
        }

        override fun onQuitSmallWidget(url: String?, vararg objects: Any?) {
        }

        override fun onTouchScreenSeekVolume(url: String?, vararg objects: Any?) {
        }

        override fun onClickBlank(url: String?, vararg objects: Any?) {
        }

        override fun onClickStop(url: String?, vararg objects: Any?) {
        }

        override fun onTouchScreenSeekLight(url: String?, vararg objects: Any?) {
        }

        override fun onClickSeekbar(url: String?, vararg objects: Any?) {
        }

        override fun onQuitFullscreen(url: String?, vararg objects: Any?) {
        }

        override fun onPlayError(url: String?, vararg objects: Any?) {
        }

        override fun onClickStartThumb(url: String?, vararg objects: Any?) {
        }

        override fun onEnterSmallWidget(url: String?, vararg objects: Any?) {
        }

        override fun onClickStopFullscreen(url: String?, vararg objects: Any?) {
        }

        override fun onClickStartError(url: String?, vararg objects: Any?) {
        }

        override fun onTouchScreenSeekPosition(url: String?, vararg objects: Any?) {
        }

        override fun onClickResumeFullscreen(url: String?, vararg objects: Any?) {
        }

    }

}