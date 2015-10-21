# BlueToothC  
A console for electric fan through bluetooth  
## 效果图:  
![bluetoothc](https://github.com/lfkdsk/BlueToothC/blob/master/picture/bluetoothc.png)
## 功能介绍:  

控制与之相对应的电风扇。  
程序基础修改自sample中的BlueToothChat，并修改了相应的界面。  
修改UUID就好了，将  
`private static final UUID MY_UUID = UUID.fromString("fa87c0d0-afac-11de-8a39-0800200c9a66");`      
替换成蓝牙串口服务 (SPP) 的 UUID                        
`private static final UUID MY_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");`  

## 功能指令集:  
* 发送0：开启、关闭自然风模式；
* 发送1：开启、关闭制冷；
* 发送2：开启、关闭摆页；
* 发送3：开启强风；
* 发送4：开启弱风；
* 发送5：关闭
* 发送6：查询环境温度
* 发送7：强风百分比
* 发送8：弱风百分比
* 发送t：加设定时间可使用定时功能  
