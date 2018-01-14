package com.androideduio.activity_lifecycle

import android.app.Fragment
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu

class MainActivity : AppCompatActivity() {


    val ON_CREATE_TAG = "ON CREATE"
    val ON_CONTENT_CHANGED_TAG = "ON CONTENT CHANGED "
    val ON_START = "ON START"
    val ON_RESTORE_TAG ="ON RESTORE"
    val ON_POST_CREATE_TAG ="ON POST CREATE"
    val ON_RESUME_TAG ="ON RESUME"
    val ON_POST_RESUME_TAG ="ON POST RESUME"
    val ON_ATTACHED_TO_WINDOW_TAG ="ON ATTACHED TO WINDOW"
    val ON_CREATE_OPTION_MENU_TAG = "ON CREATE OPTION MENU "
    val ON_PREPARE_OPTION_MENU_TAG = "ON PREPARE OPTION MENU "
    val ON_PAUSE_TAG ="ON PAUSE"
    val ON_SAVE_INSTANCE_STATE_TAG ="ON SAVE INSTANCE STATE"
    val ON_STOP_TAG ="ON STOP"
    val ON_DESTROY_TAG ="ON DESTROY"
    val ON_USER_INTERACTION_TAG ="ON USER INTERACTION"
    val ON_USER_LEAVE_HINT_TAG ="ON USER LEAVE HINT"
    val ON_ACTIVITY_RESULT ="ON ACTIVITY RESULT"
    val ON_RESTART_TAG ="ON RESTART"
    val ON_ATTACHED_FRAGMENT_TAG ="ON ATTACHED FRAGMENT"
    val ON_CONFIGURATION_CHANGED_TAG ="ON CONFIGURATIONCHANGED"
    val ON_BACK_PRESSED_TAG ="ON BACK PRESSED"


    /* OnCrate Activity ilk oluştuğunda çağırılan metod'dur.
       Eğer içerisinde finish() metodu çağırılırsa, direkt olarak onDestroy() metoduna geçer.
       setContentView metodu sonrası onContentChanged() metodu çağırılacak. Bu nedenle loglamayı
       setContentView öncesinde yazıyoruz.*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(ON_CREATE_TAG,"onCreate")
        setContentView(R.layout.activity_main)

    }

    // Uygulamanın kullanıcı arayüzünde bir değişiklik olduğunda çalışır
    override fun onContentChanged() {
        super.onContentChanged()
        Log.e(ON_CONTENT_CHANGED_TAG,"onContentChanged")
    }

    // Oncreate metodundan hemen sonra çağırılır.
    // Activity onStop() durumuna gelirse onRestart()'dan sonra çağırılır.
    override  fun onStart() {
        super.onStart()
        Log.e(ON_START,"onStart")
    }

    //Activity yeniden yaratıldığı durumlarda kullanılır.
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e(ON_RESTORE_TAG,"onRestoreInstanceState")
    }

    //Genelde uygulama kodu çalıştırıldıktan sonra değer atamaları yapması için kullanılır.
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.e(ON_POST_CREATE_TAG,"onPostCreate")
    }

    //Activity'nin kullanıcı ile etkileşime geçtiği yerdir.
    // onRestoreInstanceState(), onRestart(), onPause() metodlarından sonra çağırılır.
    override fun onResume() {
        super.onResume()
        Log.e(ON_RESUME_TAG,"onResume")
    }

    //onResume() metodu çağırıldıktan sonra çağırılır.
    override fun onPostResume() {
        super.onPostResume()
        Log.e(ON_POST_RESUME_TAG,"onPostResume")
    }

    //Activity ile ilişkilendirilmiş ekran, ekran yöneticisine eklendiğinde çağırılır.
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e(ON_ATTACHED_TO_WINDOW_TAG,"onAttachedToWindow")
    }

    //Seçenekler menüsü ilk kez görüntülendiğinde bir kere çağırılan metoddur.
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Log.e(ON_CREATE_OPTION_MENU_TAG,"onCreateOptionsMenu")
        return super.onCreateOptionsMenu(menu)
    }

    //Seçenekler menüsü her görüntülendiğinde çağırılır.
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        Log.e(ON_PREPARE_OPTION_MENU_TAG,"onPrepareOptionsMenu")
        return super.onPrepareOptionsMenu(menu)
    }

    //Activity arka plana gönderildiğinde, ancak öldürülmediğinde çalışır.
    //onResume()'nin tersi işlemidir.
    override fun onPause() {
        super.onPause()
        Log.e(ON_PAUSE_TAG,"onPause")

    }

    //Activity ölmeden önce activity'nin durumunu kaydetmek için çağırılır.
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.e(ON_SAVE_INSTANCE_STATE_TAG,"onSaveInstanceState")

    }

    //Activity kullanıcı tarafından görüntülenmediği zaman çağırılır.
    override fun onStop() {
        super.onStop()
        Log.e(ON_STOP_TAG,"onStop")

    }

    //Activity yok olmadan önce gerekli olan tüm temizlik işlemi burada yapılır.
    override fun onDestroy() {
        super.onDestroy()
        Log.e(ON_DESTROY_TAG,"onDestroy")

    }

    //Kullanıcı ekranla iletişime geçtiğinde bu metod çağırılır.
    override fun onUserInteraction() {
        super.onUserInteraction()
        Log.e(ON_USER_INTERACTION_TAG,"onUserInteraction")

    }

    //Kullanıcı Home butonuna basarak Activity'i arka plana almak isterse çağırılır.
    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        Log.e(ON_USER_LEAVE_HINT_TAG,"onUserLeaveHint")

    }

    //Activity'i bir "requestCode" ile beraber başlatmak istemeniz durumunda çağırılır.
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e(ON_ACTIVITY_RESULT,"onActivityResult")

    }

    //Arka planda bulunan Activity, OnStop() sonrası tekrar kullanıcıya gösterileceği zaman çağırılır.
    override fun onRestart() {
        super.onRestart()
        Log.e(ON_RESTART_TAG,"onRestart")

    }

    //Activity'e bir fragment eklenmek isterse bu metod çağırılır.
    override  fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
        Log.e(ON_ATTACHED_FRAGMENT_TAG,"onAttachFragment")

    }

    //Sistem tarafından değişen ayarlardan haberdar olmak için çalışan metoddur.
    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.e(ON_CONFIGURATION_CHANGED_TAG,"onConfigurationChanged")

    }

    //;Kullanıcı geri tuşuna bastığında çalışır.
    override fun onBackPressed() {
        super.onBackPressed()
        Log.e(ON_BACK_PRESSED_TAG,"onBackPressed")

    }

}
