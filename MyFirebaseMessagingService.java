package jp.ac.jec.cm25cm0118.fcmtest;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService extends FirebaseMessagingService {
    // 通知チャンネルのID（任意の文字列でOK）
    private static final String CHANNEL_ID = "room_entry_channel";
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("FCM_TOKEN", "新しいトークン: " + token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Log.d("FCM_MESSAGE", "メッセージ受信: " + message.getData());
        showNotification("【警告】入室を検知しました！", "検知距離: " + "テスト" + " cm");
        // データメッセージを受け取った時の処理
//        if (message.getData().size() > 0) {
//            String action = message.getData().get("action");
//            String distance = message.getData().get("distance_cm");
//
//            // 通知バーに表示する関数を呼び出す
//            showNotification("【警告】入室を検知しました！", "検知距離: " + distance + " cm");
//        }
    }
    private void showNotification(String title, String body) {
        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // Android 8.0 (API 26) 以上は「通知チャンネル」の作成が必須
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "入室検知アラート", // 設定画面などに表示されるチャンネル名
                    NotificationManager.IMPORTANCE_HIGH // 高優先度（音やポップアップが出る）
            );
            channel.setDescription("M5Stickからの入室検知通知");
            notificationManager.createNotificationChannel(channel);
        }

        // 通知の中身を作成
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(android.R.drawable.ic_dialog_alert) // 通知のアイコン（標準の警告アイコン）
                .setContentTitle(title)                          // 通知のタイトル
                .setContentText(body)                            // 通知の本文
                .setPriority(NotificationCompat.PRIORITY_HIGH)   // 優先度高（音・バイブ・横取り表示）
                .setAutoCancel(true);                            // タップしたら通知が消える

        // 通知を発行 (ID: 1)
        notificationManager.notify(1, builder.build());
    }
}
