# ColorCircleProgressView
  自定义环形进度条
  
  

## 一.首先在项目的gradle中引用：

    allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' } //此处插入 
        }
    }



## 二.其次在dependencies中添加：
<pre><code>
dependencies {
    compile 'com.github.alijiahua:ColorCircleProgressView:V1.0'
}
</code></pre>


## 四.进度条监听接口：
<pre><code>

      ColorCircleProgressView circleProgressView= (ColorCircleProgressView) findViewById(R.id.id_color_view);
        circleProgressView.setOnProgressListener(new ColorCircleProgressView.OnProgressListener() {
            @Override
            
            public void onScrollingListener(Integer prgress, boolean isStop) {
                //prgress ，当前的百分比0-100
                //isStop ,是否已经停止滑动，true表示已经停止

            }
        });


</code></pre>

## 五.xml文件中引用

     <com.limot.mylibrary.ColorCircleProgressView
        android:id="@+id/id_color_view"
        android:layout_width="300dp"
        android:layout_height="300dp"
        android:layout_centerInParent="true"
        app:Color01="@color/home01"
        app:Color02="@color/home01"
        app:Color03="@color/home01"
        app:Color04="@color/home01"
        app:Color05="@color/home01"
        app:Color06="@color/home01"
        app:Color07="@color/home01"
        app:PointColor="@color/home01"
        app:StrokeWith="20"
        app:PointRadio="10"
        app:ViewAngle="180"
        app:StartAngle="90"
        />



*Color01到Color07表示进度条的渐变颜色*

*PointColor：表示拖动点的颜色*

*PointRadio：表示拖动点的大小*

*StartAngle：表示进度条开始的角度*

*ViewAngle：表示进度条的角度大小*

*StrokeWith：表示线条的大小*

## 五.步骤说明：

1.自定义Colorcircleprogressview继承view； 

2.在values下建立attrs文件，并定义自己的属性； 

3.在view中通过getContext().getTheme().obtainStyledAttributes（）把属性引入； 

4.重写onDraw方法 

5.重写onTouchEvent方法 

6.编写滑动监听接口

## 六.参考效果图：
![](https://github.com/alijiahua/Image/blob/master/circleCorlorBg.png)


## 七.CSDN博客地址：http://blog.csdn.net/alijiahua 

附:本人首个开源项目，如果不足之处，敬请指教！
