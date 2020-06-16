package jp.techacademy.tsumura.takuya.taskapp
import android.app.Application
import io.realm.Realm

class TaskApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}
//Reaimの初期設定