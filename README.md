# RxPermissions
an Android RX Permissions Component

make Android Permissions callback more easily


### Setup:

minSdkVersion: 15

``` 
allprojects {
    repositories {
        ...
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.xattacker:RxPermissions:1.0.0'
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
