package cn.innovate.canteenapp.baselib.http

import android.content.Context
import android.content.pm.PackageManager
import android.telecom.TelecomManager
import android.telephony.TelephonyManager
import java.util.*

class HttpHead {
    //网络请求头文件
    companion object {
        val CLIENT_TYPE = '4'
    }

    var context: Context? = null
    fun init(context: Context) {
        this.context = context
    }
    fun getVersion():String{
        var manager:PackageManager=context!!.packageManager
        var info=manager.getPackageInfo(context!!.packageName,0)
        return info.versionName
    }
//    fun getUuid():String{
//        var tm: TelephonyManager= context!!.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
//        val tmDevice: String=tm.deviceId
//        val tmSerial: String="ANDROID_ID"
//        val androidId: String=android.provider.Settings.Secure.getString(context!!.contentResolver,android.provider.Settings.Secure.ANDROID_ID).toString()
//        val deviceUuid:UUID= UUID(androidId.hashCode(), ((long) tmDevice.hashCode() << 32) | tmSerial.hashCode());
//    }

    //获取机型
    fun getDevice():String{
        var s=android.os.Build.MODEL
        var t=s.replace("","")
        return s;
    }
}
