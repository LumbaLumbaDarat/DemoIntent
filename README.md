# DemoIntent
Sample Demo Intent

Tambah ViewBinding di build.gradle app
```Gradle
buildFeatures {
     viewBinding true
}
```

Untuk Model Class yang akan diparsing implements Parcelable
```Java
public class NamaModelClassAnda implements Parcelable
```

Parsing Parceable melalui intent cukup dengan put, didalam event Click
```Java
Intent intent = new Intent(this, ActivityTujuan.class);
intent.putExtra("Nama Mapping Put", namaModelClassAnda);
startActivity(intent);
```

Get Parsing Parceble Model di Activity tujuan, dengan melalukan getParceableExtra
```Java
NamaModelClassAnda namaModelClassAnda = null;
if (getIntent() != null)
    namaModelClassAnda = getIntent().getParcelableExtra("Nama Mapping Put");
```
