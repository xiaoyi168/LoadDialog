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
     compile 'com.github.alijiahua:LoadDialog:1.7'
}
</code></pre>

## 三.预览：
![](https://github.com/alijiahua/LoadDialog/blob/master/img/img.gif)

## 四.使用：
    LoadDialog loadDialog=new LoadDialog(MainActivity.this);
                      loadDialog.ShowText(); //是否显示加载中字体（默认不显示）
                      loadDialog.SetText("努力加载中…");  //自定义字体
                      loadDialog.show();


## 五.CSDN博客地址：http://blog.csdn.net/alijiahua


