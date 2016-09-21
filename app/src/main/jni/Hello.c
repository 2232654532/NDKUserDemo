#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
/*
jstring: 返回值
Java_全类名_sayHello
JNIEnv * env 里面有很多方法
jobject obj  谁调用了次方法是谁的实例
*/

jstring Java_com_bwie_ndkuserdemo_JNI_sayHello//拷贝方法的全类名:com.bwie.ndkuserdemo.JNI.sayHello 把点改成下划线
(JNIEnv* env,jobject jobj){
    // jstring     (*NewStringUTF)(JNIEnv*, const char*);

   return (*env)->NewStringUTF(env,"I am Android");
}