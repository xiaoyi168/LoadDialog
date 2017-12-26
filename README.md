# LoadDialog  加载进度条
  
  

## 一.首先在项目的gradle中引用：
<pre><code>
    allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' } //此处插入
          }
      }
</code></pre>


## 二.其次在dependencies中添加：
<pre><code>
dependencies {
          compile 'com.github.lmiot:LoadDialog:V2.1'
}
</code></pre>

## 三.预览：
![](https://github.com/alijiahua/LoadDialog/blob/master/img/img.gif)

## 四.使用：
       LmiotDialog.show(MainActivity.this);//没有文字提示
       LmiotDialog.show(MainActivity.this,"加载中…");//有文字提示
       LmiotDialog.hidden(); //隐藏对话框







