package jp.techacademy.tsumura.takuya.taskapp

    import java.io.Serializable
    import java.util.Date
    import io.realm.RealmObject
    import io.realm.annotations.PrimaryKey

open class Task : RealmObject(), Serializable {
        var category: String=""
        var title: String = ""      // タイトル
        var contents: String = ""   // 内容
        var date: Date = Date()     // 日時

        // id をプライマリーキーとして設定
        @PrimaryKey
        var id: Int = 0

}
//タスククラスの初期設定