package com.example.a61979.alipayservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

    public class AliService extends Service {
    public AliService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    @Override
    public void onCreate() {
        System.out.println("支付宝服务被创建了");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        System.out.println("支付宝服务被销毁了");
        super.onDestroy();
    }

    private class MyBinder extends IService.Stub {
        @Override
        public int callSafepay(String username, String password, float money, long timestamp) throws RemoteException {
            return safepay(username, password,money, timestamp);
        }


    }

    /**
     * 安全支付的服务方法
     * @param username
     *          用户名
     * @param password
     *          密码
     * @param money
     *          钱
     * @param timestamp
     *          时间戳
     * @return
     */
    public int safepay(String username, String password, float money, long timestamp){
        System.out.println("加密的username");
        System.out.println("加密的password");
        System.out.println("提交数据到支付宝的服务器");
        if(money>5000){
            return 505;
        }
        if("zhangsan".equals(username)&&"123".equals(password))
        {
            return 200;

        }
        else
        {
            return 300;
        }
    }
}
