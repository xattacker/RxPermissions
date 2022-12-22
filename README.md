# RxPermissions
an Android RX Permissions Component

make Android Permissions callback more easily


### Setup:

minSdkVersion: 15 [ ![Download](https://api.bintray.com/packages/xattacker/maven/RxPermissions/images/download.svg?version=1.0.0) ](https://bintray.com/xattacker/maven/RxPermissions/1.0.0/link)

``` 
allprojects {
    repositories {
        ...
        jcenter()
    }
}

dependencies {
    implementation 'com.xattacker.android:RxPermissions:1.0.0'
}
``` 

### How to use:
``` 
        val rxp = RxPermissions(this) // pass FragmentActivity instance
        rxp.request(
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        ).subscribe {
                enable ->
               android.util.Log.d("aaa", "permission result: " + enable)
        }
``` 
