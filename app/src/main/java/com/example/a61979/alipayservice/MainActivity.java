package com.example.a61979.alipayservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    private Button bt_connect;
//    private Button bt_disconnect;
//    private ServiceConnection conn=new ServiceConnection() {
//        @Override
//        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
//            try {
//                Mybinder = IService.Stub.asInterface(iBinder);
//                Mybinder.callSafepay("VirgilG72","123456",300,123456789);
//            } catch (RemoteException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Override
//        public void onServiceDisconnected(ComponentName componentName) {
//            Mybinder=null;
//            Log.e("1","无法连接服务");
//        }
//    };
//    private IService Mybinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        bt_connect = (Button) findViewById(R.id.button);
//        bt_disconnect = (Button) findViewById(R.id.button2);
//        bt_connect.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, AliService.class);
//                bindService(intent,conn,BIND_AUTO_CREATE);
//            }
//        });
//        bt_disconnect.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                unbindService(conn);
//                Log.e("1","成功解绑服务");
//            }
//        });
    }



}
